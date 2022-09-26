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
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>tSequenceFlow complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="tSequenceFlow">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.omg.org/spec/BPMN/20100524/MODEL}tFlowElement">
 *       &lt;sequence>
 *         &lt;element name="conditionExpression" type="{http://www.omg.org/spec/BPMN/20100524/MODEL}tExpression" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="sourceRef" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="targetRef" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="isImmediate" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tSequenceFlow", propOrder = {
    "conditionExpression"
})
public class TSequenceFlow
    extends TFlowElement
    implements Visitable
{

    protected TExpression conditionExpression;
    @XmlAttribute(name = "sourceRef", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected TFlowNode sourceRef;
    @XmlAttribute(name = "targetRef", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected TFlowNode targetRef;
    @XmlAttribute(name = "isImmediate")
    protected Boolean isImmediate;

    /**
     * 获取conditionExpression属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TExpression }
     *     
     */
    public TExpression getConditionExpression() {
        return conditionExpression;
    }

    /**
     * 设置conditionExpression属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TExpression }
     *     
     */
    public void setConditionExpression(TExpression value) {
        this.conditionExpression = value;
    }

    /**
     * 获取sourceRef属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public TFlowNode getSourceRef() {
        return sourceRef;
    }

    /**
     * 设置sourceRef属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSourceRef(TFlowNode value) {
        this.sourceRef = value;
    }

    /**
     * 获取targetRef属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public TFlowNode getTargetRef() {
        return targetRef;
    }

    /**
     * 设置targetRef属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTargetRef(TFlowNode value) {
        this.targetRef = value;
    }

    /**
     * 获取isImmediate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsImmediate() {
        return isImmediate;
    }

    /**
     * 设置isImmediate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsImmediate(Boolean value) {
        this.isImmediate = value;
    }

    public void accept(Visitor aVisitor) {
        aVisitor.visit(this);
    }

}
