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

package de.hpi.bpmn2_0.model.misc;

/**
 * @author Sven Wagner-Boysen
 *         <p/>
 *         Describes whether an data operation is optional or while executing. Only used
 *         in an intermediate processing step!
 */
public class IoOption {
    private boolean optional;
    private boolean whileExecuting;


    /* Getter & Setter */

    /**
     * @return the optional
     */
    public boolean isOptional() {
        return optional;
    }

    /**
     * @param optional the optional to set
     */
    public void setOptional(boolean optional) {
        this.optional = optional;
    }

    /**
     * @return the whileExecuting
     */
    public boolean isWhileExecuting() {
        return whileExecuting;
    }

    /**
     * @param whileExecuting the whileExecuting to set
     */
    public void setWhileExecuting(boolean whileExecuting) {
        this.whileExecuting = whileExecuting;
    }


}
