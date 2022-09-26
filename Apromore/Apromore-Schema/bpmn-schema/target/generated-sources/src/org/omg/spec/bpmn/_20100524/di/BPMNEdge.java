//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.04.18 时间 02:49:16 PM CST 
//


package org.omg.spec.bpmn._20100524.di;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.omg.spec.bpmn._20100524.model.Visitable;
import org.omg.spec.bpmn._20100524.model.Visitor;
import org.omg.spec.dd._20100524.di.LabeledEdge;


/**
 * <p>BPMNEdge complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="BPMNEdge">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.omg.org/spec/DD/20100524/DI}LabeledEdge">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/DI}BPMNLabel" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="bpmnElement" type="{http://www.w3.org/2001/XMLSchema}QName" />
 *       &lt;attribute name="sourceElement" type="{http://www.w3.org/2001/XMLSchema}QName" />
 *       &lt;attribute name="targetElement" type="{http://www.w3.org/2001/XMLSchema}QName" />
 *       &lt;attribute name="messageVisibleKind" type="{http://www.omg.org/spec/BPMN/20100524/DI}MessageVisibleKind" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BPMNEdge", propOrder = {
    "bpmnLabel"
})
public class BPMNEdge
    extends LabeledEdge
    implements Visitable
{

    @XmlElement(name = "BPMNLabel")
    protected BPMNLabel bpmnLabel;
    @XmlAttribute(name = "bpmnElement")
    protected QName bpmnElement;
    @XmlAttribute(name = "sourceElement")
    protected QName sourceElement;
    @XmlAttribute(name = "targetElement")
    protected QName targetElement;
    @XmlAttribute(name = "messageVisibleKind")
    protected MessageVisibleKind messageVisibleKind;

    /**
     * 获取bpmnLabel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BPMNLabel }
     *     
     */
    public BPMNLabel getBPMNLabel() {
        return bpmnLabel;
    }

    /**
     * 设置bpmnLabel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BPMNLabel }
     *     
     */
    public void setBPMNLabel(BPMNLabel value) {
        this.bpmnLabel = value;
    }

    /**
     * 获取bpmnElement属性的值。
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getBpmnElement() {
        return bpmnElement;
    }

    /**
     * 设置bpmnElement属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setBpmnElement(QName value) {
        this.bpmnElement = value;
    }

    /**
     * 获取sourceElement属性的值。
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getSourceElement() {
        return sourceElement;
    }

    /**
     * 设置sourceElement属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setSourceElement(QName value) {
        this.sourceElement = value;
    }

    /**
     * 获取targetElement属性的值。
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getTargetElement() {
        return targetElement;
    }

    /**
     * 设置targetElement属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setTargetElement(QName value) {
        this.targetElement = value;
    }

    /**
     * 获取messageVisibleKind属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MessageVisibleKind }
     *     
     */
    public MessageVisibleKind getMessageVisibleKind() {
        return messageVisibleKind;
    }

    /**
     * 设置messageVisibleKind属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MessageVisibleKind }
     *     
     */
    public void setMessageVisibleKind(MessageVisibleKind value) {
        this.messageVisibleKind = value;
    }

    public void accept(Visitor aVisitor) {
        aVisitor.visit(this);
    }

}
