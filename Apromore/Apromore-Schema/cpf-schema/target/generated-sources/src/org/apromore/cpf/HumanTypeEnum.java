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
 * <p>HumanTypeEnum的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="HumanTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Organisation"/>
 *     &lt;enumeration value="Department"/>
 *     &lt;enumeration value="Unit"/>
 *     &lt;enumeration value="Team"/>
 *     &lt;enumeration value="Group"/>
 *     &lt;enumeration value="Role"/>
 *     &lt;enumeration value="Participant"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HumanTypeEnum", namespace = "http://www.apromore.org/CPF")
@XmlEnum
public enum HumanTypeEnum {

    @XmlEnumValue("Organisation")
    ORGANISATION("Organisation"),
    @XmlEnumValue("Department")
    DEPARTMENT("Department"),
    @XmlEnumValue("Unit")
    UNIT("Unit"),
    @XmlEnumValue("Team")
    TEAM("Team"),
    @XmlEnumValue("Group")
    GROUP("Group"),
    @XmlEnumValue("Role")
    ROLE("Role"),
    @XmlEnumValue("Participant")
    PARTICIPANT("Participant");
    private final String value;

    HumanTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HumanTypeEnum fromValue(String v) {
        for (HumanTypeEnum c: HumanTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
