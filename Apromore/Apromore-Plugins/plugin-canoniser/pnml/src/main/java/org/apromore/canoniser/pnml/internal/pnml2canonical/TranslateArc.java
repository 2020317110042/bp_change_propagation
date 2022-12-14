/*
 * Copyright © 2009-2014 The Apromore Initiative.
 *
 * This file is part of "Apromore".
 *
 * "Apromore" is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 3 of the License, or
 * (at your option) any later version.
 *
 * "Apromore" is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.
 * If not, see <http://www.gnu.org/licenses/lgpl-3.0.html>.
 */

package org.apromore.canoniser.pnml.internal.pnml2canonical;

import java.util.HashSet;
import java.util.Set;
import java.util.logging.Logger;

import org.apromore.cpf.ANDJoinType;
import org.apromore.cpf.CancellationRefType;
import org.apromore.cpf.CpfObjectFactory;
import org.apromore.cpf.EdgeType;
import org.apromore.cpf.WorkType;
import org.apromore.pnml.ArcType;
import org.apromore.pnml.ArcTypeType;
import org.apromore.pnml.NodeType;

public class TranslateArc {

    static private final Logger LOGGER = Logger.getLogger(TranslateArc.class.getCanonicalName());

    DataHandler data;
    long ids;

    public void setValues(DataHandler data, long ids) {
        this.data = data;
        this.ids = ids;
    }

    public void translateEdge(ArcType arc) {

        data.put_id_map(arc.getId(), String.valueOf(ids));

        String sourceId = ((NodeType) arc.getSource()).getId();

        // Convert sourceId from PNML to CPF
        if (data.getInputnode().equals(sourceId)) {
            sourceId = data.getInputEvent();
        } else if (data.get_andjoinmap().containsKey(sourceId)) {
            // the AND-join was inserted, so this outgoing edge ought to source from the transition/task
            sourceId = data.get_andjoinmap().get(sourceId);
        } else if (data.get_andsplitjoinmap().containsKey(sourceId)) {
            // the AND-join was inserted as was an AND-split, so this edge ought to source from the split
            sourceId = data.get_andsplitjoinmap().get(sourceId);
        } else {
            sourceId = getEdgeRealId(sourceId);
        }

        String targetId = ((NodeType) arc.getTarget()).getId();

        // Convert targetId from PNML to CPF
        if (data.getOutputnode().equals(targetId)) {
            targetId = getEdgeRealId(data.getOutputState());
        } else if (data.get_andsplitmap().containsKey(targetId)) {
            // the AND-split was inserted, so this incoming edge ought to target to the transition/task
            targetId = data.get_andsplitmap().get(targetId);
        } else {
            // even if an AND-join was inserted, its id would be the same as the original transition/task's
            targetId = getEdgeRealId(targetId);
        }

        ArcTypeType type = arc.getType();
        if (type != null && "reset".equals(type.getText())) {
            // This PNML arc corresponds to a CPF cancellation set element

            org.apromore.cpf.NodeType cancellingNode = findCpfNodeById(targetId);
            org.apromore.cpf.NodeType cancelledNode  = findCpfNodeById(sourceId);
            
            while (cancellingNode instanceof ANDJoinType) {
                // The resetted PNML transition had multiple incoming arcs, so this routing element was inserted
                // consequently we need to traverse the forward edge to find the actual cancelling node.
                Set<EdgeType> outgoingEdges = findCpfNodeOutgoingEdges(cancellingNode.getId());
                for (EdgeType outgoing: outgoingEdges) {
                    cancellingNode = findCpfNodeById(outgoing.getTargetId());
                }
            }

            if (!(cancellingNode instanceof WorkType)) {
                LOGGER.warning("Reset arc cannot be represented as cancellation set of " + cancellingNode.getName() + " class " + cancellingNode.getClass());
            }
            // Found the cancelledNode and cancellingNode, if they exist

            if (cancelledNode != null && cancellingNode != null) {
                CancellationRefType cancellationRef = CpfObjectFactory.getInstance().createCancellationRefType();
                cancellationRef.setRefId(cancelledNode.getId());
                ((WorkType) cancellingNode).getCancelNodeId().add(cancellationRef);
            }

        } else {
            // This PNML arc corresponds to a CPF edge
            EdgeType edge = new EdgeType();

            edge.setId(String.valueOf(ids++));
            edge.setOriginalID(arc.getId());
            edge.setSourceId(sourceId);
            edge.setTargetId(targetId);

            data.getNet().getEdge().add(edge);
        }
    }

    // TODO: keep track of this on the DataHandler rather than doing a linear search
    private Set<EdgeType> findCpfNodeOutgoingEdges(final String sourceId) {
        Set<EdgeType> outgoingEdgeSet = new HashSet();
        for (EdgeType edge: data.getNet().getEdge()) {
            if (edge.getSourceId().equals(sourceId)) {
                outgoingEdgeSet.add(edge);
            }
        }
        return outgoingEdgeSet;
    }

    // TODO: keep track of this on the DataHandler rather than doing a linear search
    private org.apromore.cpf.NodeType findCpfNodeById(final String cpfId) {
        for (org.apromore.cpf.NodeType node: data.getNet().getNode()) {
            if (node.getId().equals(cpfId)) {
                return node;
            }
        }
        return null;
    }

    public long getIds() {
        return ids;
    }


    private String getEdgeRealId(String originalId) {
        return data.id_map.get(originalId);
    }
}
