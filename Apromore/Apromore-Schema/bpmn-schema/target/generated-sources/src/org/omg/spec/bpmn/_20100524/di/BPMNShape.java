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
import org.omg.spec.dd._20100524.di.LabeledShape;


/**
 * <p>BPMNShape complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="BPMNShape">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.omg.org/spec/DD/20100524/DI}LabeledShape">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/DI}BPMNLabel" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="bpmnElement" type="{http://www.w3.org/2001/XMLSchema}QName" />
 *       &lt;attribute name="isHorizontal" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="isExpanded" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="isMarkerVisible" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="isMessageVisible" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="participantBandKind" type="{http://www.omg.org/spec/BPMN/20100524/DI}ParticipantBandKind" />
 *       &lt;attribute name="choreographyActivityShape" type="{http://www.w3.org/2001/XMLSchema}QName" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BPMNShape", propOrder = {
    "bpmnLabel"
})
public class BPMNShape
    extends LabeledShape
    implements Visitable
{

    @XmlElement(name = "BPMNLabel")
    protected BPMNLabel bpmnLabel;
    @XmlAttribute(name = "bpmnElement")
    protected QName bpmnElement;
    @XmlAttribute(name = "isHorizontal")
    protected Boolean isHorizontal;
    @XmlAttribute(name = "isExpanded")
    protected Boolean isExpanded;
    @XmlAttribute(name = "isMarkerVisible")
    protected Boolean isMarkerVisible;
    @XmlAttribute(name = "isMessageVisible")
    protected Boolean isMessageVisible;
    @XmlAttribute(name = "participantBandKind")
    protected ParticipantBandKind participantBandKind;
    @XmlAttribute(name = "choreographyActivityShape")
    protected QName choreographyActivityShape;

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
     * 获取isHorizontal属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsHorizontal() {
        return isHorizontal;
    }

    /**
     * 设置isHorizontal属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsHorizontal(Boolean value) {
        this.isHorizontal = value;
    }

    /**
     * 获取isExpanded属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsExpanded() {
        return isExpanded;
    }

    /**
     * 设置isExpanded属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsExpanded(Boolean value) {
        this.isExpanded = value;
    }

    /**
     * 获取isMarkerVisible属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsMarkerVisible() {
        return isMarkerVisible;
    }

    /**
     * 设置isMarkerVisible属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsMarkerVisible(Boolean value) {
        this.isMarkerVisible = value;
    }

    /**
     * 获取isMessageVisible属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsMessageVisible() {
        return isMessageVisible;
    }

    /**
     * 设置isMessageVisible属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsMessageVisible(Boolean value) {
        this.isMessageVisible = value;
    }

    /**
     * 获取participantBandKind属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ParticipantBandKind }
     *     
     */
    public ParticipantBandKind getParticipantBandKind() {
        return participantBandKind;
    }

    /**
     * 设置participantBandKind属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ParticipantBandKind }
     *     
     */
    public void setParticipantBandKind(ParticipantBandKind value) {
        this.participantBandKind = value;
    }

    /**
     * 获取choreographyActivityShape属性的值。
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getChoreographyActivityShape() {
        return choreographyActivityShape;
    }

    /**
     * 设置choreographyActivityShape属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setChoreographyActivityShape(QName value) {
        this.choreographyActivityShape = value;
    }

    public void accept(Visitor aVisitor) {
        aVisitor.visit(this);
    }

}
