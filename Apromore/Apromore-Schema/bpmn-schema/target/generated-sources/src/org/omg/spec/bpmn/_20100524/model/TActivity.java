//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.04.18 时间 02:49:16 PM CST 
//


package org.omg.spec.bpmn._20100524.model;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>tActivity complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="tActivity">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.omg.org/spec/BPMN/20100524/MODEL}tFlowNode">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}ioSpecification" minOccurs="0"/>
 *         &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}property" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}dataInputAssociation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}dataOutputAssociation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}resourceRole" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}loopCharacteristics" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="isForCompensation" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="startQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" default="1" />
 *       &lt;attribute name="completionQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" default="1" />
 *       &lt;attribute name="default" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tActivity", propOrder = {
    "ioSpecification",
    "property",
    "dataInputAssociation",
    "dataOutputAssociation",
    "resourceRole",
    "loopCharacteristics"
})
@XmlSeeAlso({
    TSubProcess.class,
    TCallActivity.class,
    TTask.class
})
public abstract class TActivity
    extends TFlowNode
    implements Visitable
{

    protected TInputOutputSpecification ioSpecification;
    protected List<TProperty> property;
    protected List<TDataInputAssociation> dataInputAssociation;
    protected List<TDataOutputAssociation> dataOutputAssociation;
    @XmlElementRef(name = "resourceRole", namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", type = JAXBElement.class, required = false)
    protected List<JAXBElement<? extends TResourceRole>> resourceRole;
    @XmlElementRef(name = "loopCharacteristics", namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends TLoopCharacteristics> loopCharacteristics;
    @XmlAttribute(name = "isForCompensation")
    protected Boolean isForCompensation;
    @XmlAttribute(name = "startQuantity")
    protected BigInteger startQuantity;
    @XmlAttribute(name = "completionQuantity")
    protected BigInteger completionQuantity;
    @XmlAttribute(name = "default")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected TSequenceFlow _default;

    /**
     * 获取ioSpecification属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TInputOutputSpecification }
     *     
     */
    public TInputOutputSpecification getIoSpecification() {
        return ioSpecification;
    }

    /**
     * 设置ioSpecification属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TInputOutputSpecification }
     *     
     */
    public void setIoSpecification(TInputOutputSpecification value) {
        this.ioSpecification = value;
    }

    /**
     * Gets the value of the property property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the property property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TProperty }
     * 
     * 
     */
    public List<TProperty> getProperty() {
        if (property == null) {
            property = new ArrayList<TProperty>();
        }
        return this.property;
    }

    /**
     * Gets the value of the dataInputAssociation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataInputAssociation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataInputAssociation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TDataInputAssociation }
     * 
     * 
     */
    public List<TDataInputAssociation> getDataInputAssociation() {
        if (dataInputAssociation == null) {
            dataInputAssociation = new ArrayList<TDataInputAssociation>();
        }
        return this.dataInputAssociation;
    }

    /**
     * Gets the value of the dataOutputAssociation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataOutputAssociation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataOutputAssociation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TDataOutputAssociation }
     * 
     * 
     */
    public List<TDataOutputAssociation> getDataOutputAssociation() {
        if (dataOutputAssociation == null) {
            dataOutputAssociation = new ArrayList<TDataOutputAssociation>();
        }
        return this.dataOutputAssociation;
    }

    /**
     * Gets the value of the resourceRole property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resourceRole property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResourceRole().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link THumanPerformer }{@code >}
     * {@link JAXBElement }{@code <}{@link TResourceRole }{@code >}
     * {@link JAXBElement }{@code <}{@link TPotentialOwner }{@code >}
     * {@link JAXBElement }{@code <}{@link TPerformer }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends TResourceRole>> getResourceRole() {
        if (resourceRole == null) {
            resourceRole = new ArrayList<JAXBElement<? extends TResourceRole>>();
        }
        return this.resourceRole;
    }

    /**
     * 获取loopCharacteristics属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TMultiInstanceLoopCharacteristics }{@code >}
     *     {@link JAXBElement }{@code <}{@link TStandardLoopCharacteristics }{@code >}
     *     {@link JAXBElement }{@code <}{@link TLoopCharacteristics }{@code >}
     *     
     */
    public JAXBElement<? extends TLoopCharacteristics> getLoopCharacteristics() {
        return loopCharacteristics;
    }

    /**
     * 设置loopCharacteristics属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TMultiInstanceLoopCharacteristics }{@code >}
     *     {@link JAXBElement }{@code <}{@link TStandardLoopCharacteristics }{@code >}
     *     {@link JAXBElement }{@code <}{@link TLoopCharacteristics }{@code >}
     *     
     */
    public void setLoopCharacteristics(JAXBElement<? extends TLoopCharacteristics> value) {
        this.loopCharacteristics = value;
    }

    /**
     * 获取isForCompensation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsForCompensation() {
        if (isForCompensation == null) {
            return false;
        } else {
            return isForCompensation;
        }
    }

    /**
     * 设置isForCompensation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsForCompensation(Boolean value) {
        this.isForCompensation = value;
    }

    /**
     * 获取startQuantity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStartQuantity() {
        if (startQuantity == null) {
            return new BigInteger("1");
        } else {
            return startQuantity;
        }
    }

    /**
     * 设置startQuantity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStartQuantity(BigInteger value) {
        this.startQuantity = value;
    }

    /**
     * 获取completionQuantity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCompletionQuantity() {
        if (completionQuantity == null) {
            return new BigInteger("1");
        } else {
            return completionQuantity;
        }
    }

    /**
     * 设置completionQuantity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCompletionQuantity(BigInteger value) {
        this.completionQuantity = value;
    }

    /**
     * 获取default属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public TSequenceFlow getDefault() {
        return _default;
    }

    /**
     * 设置default属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDefault(TSequenceFlow value) {
        this._default = value;
    }

}
