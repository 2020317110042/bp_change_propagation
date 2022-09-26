//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.04.18 时间 02:49:16 PM CST 
//


package org.omg.spec.bpmn._20100524.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * <p>tChoreographyActivity complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="tChoreographyActivity">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.omg.org/spec/BPMN/20100524/MODEL}tFlowNode">
 *       &lt;sequence>
 *         &lt;element name="participantRef" type="{http://www.w3.org/2001/XMLSchema}QName" maxOccurs="unbounded" minOccurs="2"/>
 *         &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}correlationKey" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="initiatingParticipantRef" use="required" type="{http://www.w3.org/2001/XMLSchema}QName" />
 *       &lt;attribute name="loopType" type="{http://www.omg.org/spec/BPMN/20100524/MODEL}tChoreographyLoopType" default="None" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tChoreographyActivity", propOrder = {
    "participantRef",
    "correlationKey"
})
@XmlSeeAlso({
    TCallChoreography.class,
    TSubChoreography.class,
    TChoreographyTask.class
})
public abstract class TChoreographyActivity
    extends TFlowNode
    implements Visitable
{

    @XmlElement(required = true)
    protected List<QName> participantRef;
    protected List<TCorrelationKey> correlationKey;
    @XmlAttribute(name = "initiatingParticipantRef", required = true)
    protected QName initiatingParticipantRef;
    @XmlAttribute(name = "loopType")
    protected TChoreographyLoopType loopType;

    /**
     * Gets the value of the participantRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the participantRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParticipantRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QName }
     * 
     * 
     */
    public List<QName> getParticipantRef() {
        if (participantRef == null) {
            participantRef = new ArrayList<QName>();
        }
        return this.participantRef;
    }

    /**
     * Gets the value of the correlationKey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the correlationKey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCorrelationKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TCorrelationKey }
     * 
     * 
     */
    public List<TCorrelationKey> getCorrelationKey() {
        if (correlationKey == null) {
            correlationKey = new ArrayList<TCorrelationKey>();
        }
        return this.correlationKey;
    }

    /**
     * 获取initiatingParticipantRef属性的值。
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getInitiatingParticipantRef() {
        return initiatingParticipantRef;
    }

    /**
     * 设置initiatingParticipantRef属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setInitiatingParticipantRef(QName value) {
        this.initiatingParticipantRef = value;
    }

    /**
     * 获取loopType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TChoreographyLoopType }
     *     
     */
    public TChoreographyLoopType getLoopType() {
        if (loopType == null) {
            return TChoreographyLoopType.NONE;
        } else {
            return loopType;
        }
    }

    /**
     * 设置loopType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TChoreographyLoopType }
     *     
     */
    public void setLoopType(TChoreographyLoopType value) {
        this.loopType = value;
    }

}
