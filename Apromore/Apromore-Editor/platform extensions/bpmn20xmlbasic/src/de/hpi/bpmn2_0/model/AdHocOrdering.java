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

package de.hpi.bpmn2_0.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;


/**
 * <p>Java class for tAdHocOrdering.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;simpleType name="tAdHocOrdering">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="parallel"/>
 *     &lt;enumeration value="sequential"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlEnum
public enum AdHocOrdering {

    @XmlEnumValue("Parallel")
    PARALLEL("parallel"),
    @XmlEnumValue("Sequential")
    SEQUENTIAL("sequential");
    private final String value;

    AdHocOrdering(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AdHocOrdering fromValue(String v) {
        for (AdHocOrdering c : AdHocOrdering.values()) {
            if (c.value.equalsIgnoreCase(v)) {
                return c;
            }
        }

        /* Return default value otherwise */
        return AdHocOrdering.PARALLEL;
    }

}
