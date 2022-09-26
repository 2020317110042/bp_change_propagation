//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.04.18 at 02:49:38 下午 CST 
//


package org.yawlfoundation.yawlschema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InputPortValueType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InputPortValueType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="activated"/>
 *     &lt;enumeration value="blocked"/>
 *     &lt;enumeration value="hidden"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "InputPortValueType")
@XmlEnum
public enum InputPortValueType {

    @XmlEnumValue("activated")
    ACTIVATED("activated"),
    @XmlEnumValue("blocked")
    BLOCKED("blocked"),
    @XmlEnumValue("hidden")
    HIDDEN("hidden");
    private final String value;

    InputPortValueType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InputPortValueType fromValue(String v) {
        for (InputPortValueType c: InputPortValueType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
