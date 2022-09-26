//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.04.18 时间 02:49:16 PM CST 
//


package org.omg.spec.bpmn._20100524.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>tResourceAssignmentExpression complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="tResourceAssignmentExpression">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.omg.org/spec/BPMN/20100524/MODEL}tBaseElement">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}expression"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tResourceAssignmentExpression", propOrder = {
    "expression"
})
public class TResourceAssignmentExpression
    extends TBaseElement
    implements Visitable
{

    @XmlElementRef(name = "expression", namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", type = JAXBElement.class)
    protected JAXBElement<? extends TExpression> expression;

    /**
     * 获取expression属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TExpression }{@code >}
     *     {@link JAXBElement }{@code <}{@link TFormalExpression }{@code >}
     *     
     */
    public JAXBElement<? extends TExpression> getExpression() {
        return expression;
    }

    /**
     * 设置expression属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TExpression }{@code >}
     *     {@link JAXBElement }{@code <}{@link TFormalExpression }{@code >}
     *     
     */
    public void setExpression(JAXBElement<? extends TExpression> value) {
        this.expression = value;
    }

    public void accept(Visitor aVisitor) {
        aVisitor.visit(this);
    }

}
