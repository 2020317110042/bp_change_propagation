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
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * <p>tProcess complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="tProcess">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.omg.org/spec/BPMN/20100524/MODEL}tCallableElement">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}auditing" minOccurs="0"/>
 *         &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}monitoring" minOccurs="0"/>
 *         &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}property" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}laneSet" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}flowElement" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}artifact" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}resourceRole" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}correlationSubscription" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="supports" type="{http://www.w3.org/2001/XMLSchema}QName" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="processType" type="{http://www.omg.org/spec/BPMN/20100524/MODEL}tProcessType" default="None" />
 *       &lt;attribute name="isClosed" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="isExecutable" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="definitionalCollaborationRef" type="{http://www.w3.org/2001/XMLSchema}QName" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tProcess", propOrder = {
    "auditing",
    "monitoring",
    "property",
    "laneSet",
    "flowElement",
    "artifact",
    "resourceRole",
    "correlationSubscription",
    "supports"
})
public class TProcess
    extends TCallableElement
    implements Visitable
{

    protected TAuditing auditing;
    protected TMonitoring monitoring;
    protected List<TProperty> property;
    protected List<TLaneSet> laneSet;
    @XmlElementRef(name = "flowElement", namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", type = JAXBElement.class, required = false)
    protected List<JAXBElement<? extends TFlowElement>> flowElement;
    @XmlElementRef(name = "artifact", namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", type = JAXBElement.class, required = false)
    protected List<JAXBElement<? extends TArtifact>> artifact;
    @XmlElementRef(name = "resourceRole", namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", type = JAXBElement.class, required = false)
    protected List<JAXBElement<? extends TResourceRole>> resourceRole;
    protected List<TCorrelationSubscription> correlationSubscription;
    protected List<QName> supports;
    @XmlAttribute(name = "processType")
    protected TProcessType processType;
    @XmlAttribute(name = "isClosed")
    protected Boolean isClosed;
    @XmlAttribute(name = "isExecutable")
    protected Boolean isExecutable;
    @XmlAttribute(name = "definitionalCollaborationRef")
    protected QName definitionalCollaborationRef;

    /**
     * 获取auditing属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TAuditing }
     *     
     */
    public TAuditing getAuditing() {
        return auditing;
    }

    /**
     * 设置auditing属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TAuditing }
     *     
     */
    public void setAuditing(TAuditing value) {
        this.auditing = value;
    }

    /**
     * 获取monitoring属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TMonitoring }
     *     
     */
    public TMonitoring getMonitoring() {
        return monitoring;
    }

    /**
     * 设置monitoring属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TMonitoring }
     *     
     */
    public void setMonitoring(TMonitoring value) {
        this.monitoring = value;
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
     * Gets the value of the laneSet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the laneSet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLaneSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TLaneSet }
     * 
     * 
     */
    public List<TLaneSet> getLaneSet() {
        if (laneSet == null) {
            laneSet = new ArrayList<TLaneSet>();
        }
        return this.laneSet;
    }

    /**
     * Gets the value of the flowElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flowElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlowElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link TEventBasedGateway }{@code >}
     * {@link JAXBElement }{@code <}{@link TSendTask }{@code >}
     * {@link JAXBElement }{@code <}{@link TExclusiveGateway }{@code >}
     * {@link JAXBElement }{@code <}{@link TInclusiveGateway }{@code >}
     * {@link JAXBElement }{@code <}{@link TSubChoreography }{@code >}
     * {@link JAXBElement }{@code <}{@link TEvent }{@code >}
     * {@link JAXBElement }{@code <}{@link TChoreographyTask }{@code >}
     * {@link JAXBElement }{@code <}{@link TAdHocSubProcess }{@code >}
     * {@link JAXBElement }{@code <}{@link TComplexGateway }{@code >}
     * {@link JAXBElement }{@code <}{@link TUserTask }{@code >}
     * {@link JAXBElement }{@code <}{@link TIntermediateThrowEvent }{@code >}
     * {@link JAXBElement }{@code <}{@link TCallChoreography }{@code >}
     * {@link JAXBElement }{@code <}{@link TTransaction }{@code >}
     * {@link JAXBElement }{@code <}{@link TBusinessRuleTask }{@code >}
     * {@link JAXBElement }{@code <}{@link TImplicitThrowEvent }{@code >}
     * {@link JAXBElement }{@code <}{@link TTask }{@code >}
     * {@link JAXBElement }{@code <}{@link TParallelGateway }{@code >}
     * {@link JAXBElement }{@code <}{@link TEndEvent }{@code >}
     * {@link JAXBElement }{@code <}{@link TSequenceFlow }{@code >}
     * {@link JAXBElement }{@code <}{@link TCallActivity }{@code >}
     * {@link JAXBElement }{@code <}{@link TReceiveTask }{@code >}
     * {@link JAXBElement }{@code <}{@link TDataStoreReference }{@code >}
     * {@link JAXBElement }{@code <}{@link TDataObjectReference }{@code >}
     * {@link JAXBElement }{@code <}{@link TBoundaryEvent }{@code >}
     * {@link JAXBElement }{@code <}{@link TScriptTask }{@code >}
     * {@link JAXBElement }{@code <}{@link TManualTask }{@code >}
     * {@link JAXBElement }{@code <}{@link TSubProcess }{@code >}
     * {@link JAXBElement }{@code <}{@link TDataObject }{@code >}
     * {@link JAXBElement }{@code <}{@link TFlowElement }{@code >}
     * {@link JAXBElement }{@code <}{@link TServiceTask }{@code >}
     * {@link JAXBElement }{@code <}{@link TStartEvent }{@code >}
     * {@link JAXBElement }{@code <}{@link TIntermediateCatchEvent }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends TFlowElement>> getFlowElement() {
        if (flowElement == null) {
            flowElement = new ArrayList<JAXBElement<? extends TFlowElement>>();
        }
        return this.flowElement;
    }

    /**
     * Gets the value of the artifact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the artifact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArtifact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link TGroup }{@code >}
     * {@link JAXBElement }{@code <}{@link TAssociation }{@code >}
     * {@link JAXBElement }{@code <}{@link TTextAnnotation }{@code >}
     * {@link JAXBElement }{@code <}{@link TArtifact }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends TArtifact>> getArtifact() {
        if (artifact == null) {
            artifact = new ArrayList<JAXBElement<? extends TArtifact>>();
        }
        return this.artifact;
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
     * Gets the value of the correlationSubscription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the correlationSubscription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCorrelationSubscription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TCorrelationSubscription }
     * 
     * 
     */
    public List<TCorrelationSubscription> getCorrelationSubscription() {
        if (correlationSubscription == null) {
            correlationSubscription = new ArrayList<TCorrelationSubscription>();
        }
        return this.correlationSubscription;
    }

    /**
     * Gets the value of the supports property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supports property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupports().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QName }
     * 
     * 
     */
    public List<QName> getSupports() {
        if (supports == null) {
            supports = new ArrayList<QName>();
        }
        return this.supports;
    }

    /**
     * 获取processType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TProcessType }
     *     
     */
    public TProcessType getProcessType() {
        if (processType == null) {
            return TProcessType.NONE;
        } else {
            return processType;
        }
    }

    /**
     * 设置processType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TProcessType }
     *     
     */
    public void setProcessType(TProcessType value) {
        this.processType = value;
    }

    /**
     * 获取isClosed属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsClosed() {
        if (isClosed == null) {
            return false;
        } else {
            return isClosed;
        }
    }

    /**
     * 设置isClosed属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsClosed(Boolean value) {
        this.isClosed = value;
    }

    /**
     * 获取isExecutable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsExecutable() {
        return isExecutable;
    }

    /**
     * 设置isExecutable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsExecutable(Boolean value) {
        this.isExecutable = value;
    }

    /**
     * 获取definitionalCollaborationRef属性的值。
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getDefinitionalCollaborationRef() {
        return definitionalCollaborationRef;
    }

    /**
     * 设置definitionalCollaborationRef属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setDefinitionalCollaborationRef(QName value) {
        this.definitionalCollaborationRef = value;
    }

    public void accept(Visitor aVisitor) {
        aVisitor.visit(this);
    }

}
