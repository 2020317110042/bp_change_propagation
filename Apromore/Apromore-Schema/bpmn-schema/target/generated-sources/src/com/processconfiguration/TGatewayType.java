//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.04.18 时间 02:49:16 PM CST 
//


package com.processconfiguration;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>tGatewayType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="tGatewayType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="data-based_exclusive"/>
 *     &lt;enumeration value="event-based_exclusive"/>
 *     &lt;enumeration value="inclusive"/>
 *     &lt;enumeration value="parallel"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tGatewayType")
@XmlEnum
public enum TGatewayType {

    @XmlEnumValue("data-based_exclusive")
    DATA_BASED_EXCLUSIVE("data-based_exclusive"),
    @XmlEnumValue("event-based_exclusive")
    EVENT_BASED_EXCLUSIVE("event-based_exclusive"),
    @XmlEnumValue("inclusive")
    INCLUSIVE("inclusive"),
    @XmlEnumValue("parallel")
    PARALLEL("parallel");
    private final String value;

    TGatewayType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TGatewayType fromValue(String v) {
        for (TGatewayType c: TGatewayType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
