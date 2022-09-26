//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.04.18 时间 02:49:23 PM CST 
//


package org.apromore.cpf;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>InputOutputType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="InputOutputType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="input"/>
 *     &lt;enumeration value="output"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "InputOutputType", namespace = "http://www.apromore.org/CPF")
@XmlEnum
public enum InputOutputType {

    @XmlEnumValue("input")
    INPUT("input"),
    @XmlEnumValue("output")
    OUTPUT("output");
    private final String value;

    InputOutputType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InputOutputType fromValue(String v) {
        for (InputOutputType c: InputOutputType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
