//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.04.18 时间 02:49:16 PM CST 
//


package org.omg.spec.bpmn._20100524.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>tAdHocSubProcess complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="tAdHocSubProcess">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.omg.org/spec/BPMN/20100524/MODEL}tSubProcess">
 *       &lt;sequence>
 *         &lt;element name="completionCondition" type="{http://www.omg.org/spec/BPMN/20100524/MODEL}tExpression" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="cancelRemainingInstances" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *       &lt;attribute name="ordering" type="{http://www.omg.org/spec/BPMN/20100524/MODEL}tAdHocOrdering" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tAdHocSubProcess", propOrder = {
    "completionCondition"
})
public class TAdHocSubProcess
    extends TSubProcess
    implements Visitable
{

    protected TExpression completionCondition;
    @XmlAttribute(name = "cancelRemainingInstances")
    protected Boolean cancelRemainingInstances;
    @XmlAttribute(name = "ordering")
    protected TAdHocOrdering ordering;

    /**
     * 获取completionCondition属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TExpression }
     *     
     */
    public TExpression getCompletionCondition() {
        return completionCondition;
    }

    /**
     * 设置completionCondition属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TExpression }
     *     
     */
    public void setCompletionCondition(TExpression value) {
        this.completionCondition = value;
    }

    /**
     * 获取cancelRemainingInstances属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isCancelRemainingInstances() {
        if (cancelRemainingInstances == null) {
            return true;
        } else {
            return cancelRemainingInstances;
        }
    }

    /**
     * 设置cancelRemainingInstances属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCancelRemainingInstances(Boolean value) {
        this.cancelRemainingInstances = value;
    }

    /**
     * 获取ordering属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TAdHocOrdering }
     *     
     */
    public TAdHocOrdering getOrdering() {
        return ordering;
    }

    /**
     * 设置ordering属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TAdHocOrdering }
     *     
     */
    public void setOrdering(TAdHocOrdering value) {
        this.ordering = value;
    }

    public void accept(Visitor aVisitor) {
        aVisitor.visit(this);
    }

}
