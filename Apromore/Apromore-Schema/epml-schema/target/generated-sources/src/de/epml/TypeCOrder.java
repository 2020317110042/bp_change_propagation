//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.04.18 时间 02:49:26 PM CST 
//


package de.epml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>typeCOrder complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="typeCOrder">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="flow" type="{http://www.epml.de}typeFlow"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeCOrder", propOrder = {
    "flow"
})
public class TypeCOrder {

    @XmlElement(required = true)
    protected TypeFlow flow;

    /**
     * 获取flow属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TypeFlow }
     *     
     */
    public TypeFlow getFlow() {
        return flow;
    }

    /**
     * 设置flow属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeFlow }
     *     
     */
    public void setFlow(TypeFlow value) {
        this.flow = value;
    }

}
