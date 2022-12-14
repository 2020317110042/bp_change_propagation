package org.apromore.canoniser.yawl.yawl2cpf.patterns.controlflow;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.util.List;

import org.apromore.canoniser.yawl.utils.TestUtils;
import org.apromore.canoniser.yawl.yawl2cpf.patterns.BasePatternUnitTest;
import org.apromore.cpf.EdgeType;
import org.apromore.cpf.EventType;
import org.apromore.cpf.NetType;
import org.apromore.cpf.NodeType;
import org.apromore.cpf.TaskType;
import org.apromore.cpf.XORJoinType;
import org.apromore.cpf.XORSplitType;
import org.junit.Test;

public class StructuredLoop extends BasePatternUnitTest {

    /*
     * (non-Javadoc)
     * 
     * @see org.apromore.canoniser.yawl.BaseYAWL2CPFUnitTest#getYAWLFile()
     */
    @Override
    protected File getYAWLFile() {
        return new File(TestUtils.TEST_RESOURCES_DIRECTORY + "YAWL/Patterns/ControlFlow/WPC21StructuredLoop.yawl");
    }

    @Test
    public void testStructuredLoop() {
        final NetType rootNet = yawl2Canonical.getCpf().getNet().get(0);
        assertEquals(6, rootNet.getEdge().size());
        assertEquals(6, rootNet.getNode().size());

        final NodeType nodeIN = checkNode(rootNet, "IN", EventType.class, 0, 1);

        final List<EdgeType> inEdges = getOutgoingEdges(rootNet, nodeIN.getId());
        assertEquals(1, inEdges.size());
        final NodeType joiningNode = getNodeByID(rootNet, inEdges.get(0).getTargetId());
        checkNode(rootNet, joiningNode, XORJoinType.class, 2, 1);

        checkNode(rootNet, "A", TaskType.class, 1, 1);

        final NodeType nodeB = checkNode(rootNet, "B", TaskType.class, 1, 1);

        final List<EdgeType> edges = getOutgoingEdges(rootNet, nodeB.getId());
        assertEquals(1, edges.size());
        final NodeType routingNode = getNodeByID(rootNet, edges.get(0).getTargetId());
        checkNode(rootNet, routingNode, XORSplitType.class, 1, 2);
    }
}
