//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.04.18 时间 02:49:16 PM CST 
//


package org.omg.spec.bpmn._20100524.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * <p>tCatchEvent complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="tCatchEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.omg.org/spec/BPMN/20100524/MODEL}tEvent">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}dataOutput" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}dataOutputAssociation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}outputSet" minOccurs="0"/>
 *         &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}eventDefinition" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="eventDefinitionRef" type="{http://www.w3.org/2001/XMLSchema}QName" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="parallelMultiple" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tCatchEvent", propOrder = {
    "dataOutput",
    "dataOutputAssociation",
    "outputSet",
    "eventDefinition",
    "eventDefinitionRef"
})
@XmlSeeAlso({
    TStartEvent.class,
    TBoundaryEvent.class,
    TIntermediateCatchEvent.class
})
public abstract class TCatchEvent
    extends TEvent
    implements Visitable
{

    protected List<TDataOutput> dataOutput;
    protected List<TDataOutputAssociation> dataOutputAssociation;
    protected TOutputSet outputSet;
    @XmlElementRef(name = "eventDefinition", namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", type = JAXBElement.class, required = false)
    protected List<JAXBElement<? extends TEventDefinition>> eventDefinition;
    protected List<QName> eventDefinitionRef;
    @XmlAttribute(name = "parallelMultiple")
    protected Boolean parallelMultiple;

    /**
     * Gets the value of the dataOutput property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataOutput property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataOutput().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TDataOutput }
     * 
     * 
     */
    public List<TDataOutput> getDataOutput() {
        if (dataOutput == null) {
            dataOutput = new ArrayList<TDataOutput>();
        }
        return this.dataOutput;
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
     * 获取outputSet属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TOutputSet }
     *     
     */
    public TOutputSet getOutputSet() {
        return outputSet;
    }

    /**
     * 设置outputSet属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TOutputSet }
     *     
     */
    public void setOutputSet(TOutputSet value) {
        this.outputSet = value;
    }

    /**
     * Gets the value of the eventDefinition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eventDefinition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEventDefinition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link TCompensateEventDefinition }{@code >}
     * {@link JAXBElement }{@code <}{@link TCancelEventDefinition }{@code >}
     * {@link JAXBElement }{@code <}{@link TEscalationEventDefinition }{@code >}
     * {@link JAXBElement }{@code <}{@link TEventDefinition }{@code >}
     * {@link JAXBElement }{@code <}{@link TLinkEventDefinition }{@code >}
     * {@link JAXBElement }{@code <}{@link TErrorEventDefinition }{@code >}
     * {@link JAXBElement }{@code <}{@link TTerminateEventDefinition }{@code >}
     * {@link JAXBElement }{@code <}{@link TSignalEventDefinition }{@code >}
     * {@link JAXBElement }{@code <}{@link TTimerEventDefinition }{@code >}
     * {@link JAXBElement }{@code <}{@link TConditionalEventDefinition }{@code >}
     * {@link JAXBElement }{@code <}{@link TMessageEventDefinition }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends TEventDefinition>> getEventDefinition() {
        if (eventDefinition == null) {
            eventDefinition = new ArrayList<JAXBElement<? extends TEventDefinition>>();
        }
        return this.eventDefinition;
    }

    /**
     * Gets the value of the eventDefinitionRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eventDefinitionRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEventDefinitionRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QName }
     * 
     * 
     */
    public List<QName> getEventDefinitionRef() {
        if (eventDefinitionRef == null) {
            eventDefinitionRef = new ArrayList<QName>();
        }
        return this.eventDefinitionRef;
    }

    /**
     * 获取parallelMultiple属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isParallelMultiple() {
        if (parallelMultiple == null) {
            return false;
        } else {
            return parallelMultiple;
        }
    }

    /**
     * 设置parallelMultiple属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setParallelMultiple(Boolean value) {
        this.parallelMultiple = value;
    }

}
