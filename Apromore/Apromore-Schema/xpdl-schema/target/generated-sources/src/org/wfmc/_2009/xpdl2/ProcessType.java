//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.04.18 时间 02:49:32 PM CST 
//


package org.wfmc._2009.xpdl2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;


/**
 * <p>ProcessType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ProcessType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}ProcessHeader"/>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}RedefinableHeader" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}FormalParameters" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}InputSets" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}OutputSets" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;sequence minOccurs="0">
 *             &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}Participants" minOccurs="0"/>
 *             &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}Applications" minOccurs="0"/>
 *             &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}DataFields" minOccurs="0"/>
 *           &lt;/sequence>
 *           &lt;sequence minOccurs="0">
 *             &lt;element ref="{http://www.wfmc.org/2002/XPDL1.0}DataFields" minOccurs="0"/>
 *             &lt;element ref="{http://www.wfmc.org/2002/XPDL1.0}Participants" minOccurs="0"/>
 *             &lt;element ref="{http://www.wfmc.org/2002/XPDL1.0}Applications" minOccurs="0"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}ActivitySets" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}Activities" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}DataObjects" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}DataInputOutputs" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}DataStoreReferences" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}Transitions" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}DataAssociations" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}ExtendedAttributes" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}Assignments" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}PartnerLinks" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}Object" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;sequence>
 *             &lt;element name="Extensions" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *             &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="Id" use="required" type="{http://www.wfmc.org/2009/XPDL2.2}Id" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="AccessLevel" default="PUBLIC">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="PUBLIC"/>
 *             &lt;enumeration value="PRIVATE"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="ProcessType" default="None">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="None"/>
 *             &lt;enumeration value="Private"/>
 *             &lt;enumeration value="Abstract"/>
 *             &lt;enumeration value="Collaboration"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Status" default="None">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="None"/>
 *             &lt;enumeration value="Ready"/>
 *             &lt;enumeration value="Active"/>
 *             &lt;enumeration value="Cancelled"/>
 *             &lt;enumeration value="Aborting"/>
 *             &lt;enumeration value="Aborted"/>
 *             &lt;enumeration value="Completing"/>
 *             &lt;enumeration value="Completed"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="SuppressJoinFailure" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="EnableInstanceCompensation" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="AdHoc" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="AdHocOrdering" default="Parallel">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="Sequential"/>
 *             &lt;enumeration value="Parallel"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="AdHocCompletionCondition" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DefaultStartActivitySetId" type="{http://www.wfmc.org/2009/XPDL2.2}IdRef" />
 *       &lt;attribute name="DefaultStartActivityId" type="{http://www.wfmc.org/2009/XPDL2.2}IdRef" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessType", propOrder = {
    "content"
})
public class ProcessType {

    @XmlElementRefs({
        @XmlElementRef(name = "Participants", namespace = "http://www.wfmc.org/2009/XPDL2.2", type = org.wfmc._2009.xpdl2.Participants.class, required = false),
        @XmlElementRef(name = "OutputSets", namespace = "http://www.wfmc.org/2009/XPDL2.2", type = OutputSets.class, required = false),
        @XmlElementRef(name = "DataFields", namespace = "http://www.wfmc.org/2002/XPDL1.0", type = org.wfmc._2002.xpdl1.DataFields.class, required = false),
        @XmlElementRef(name = "Participants", namespace = "http://www.wfmc.org/2002/XPDL1.0", type = org.wfmc._2002.xpdl1.Participants.class, required = false),
        @XmlElementRef(name = "Extensions", namespace = "http://www.wfmc.org/2009/XPDL2.2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Object", namespace = "http://www.wfmc.org/2009/XPDL2.2", type = org.wfmc._2009.xpdl2.Object.class, required = false),
        @XmlElementRef(name = "ActivitySets", namespace = "http://www.wfmc.org/2009/XPDL2.2", type = ActivitySets.class, required = false),
        @XmlElementRef(name = "DataObjects", namespace = "http://www.wfmc.org/2009/XPDL2.2", type = DataObjects.class, required = false),
        @XmlElementRef(name = "DataInputOutputs", namespace = "http://www.wfmc.org/2009/XPDL2.2", type = DataInputOutputs.class, required = false),
        @XmlElementRef(name = "Transitions", namespace = "http://www.wfmc.org/2009/XPDL2.2", type = Transitions.class, required = false),
        @XmlElementRef(name = "Applications", namespace = "http://www.wfmc.org/2002/XPDL1.0", type = org.wfmc._2002.xpdl1.Applications.class, required = false),
        @XmlElementRef(name = "DataAssociations", namespace = "http://www.wfmc.org/2009/XPDL2.2", type = DataAssociations.class, required = false),
        @XmlElementRef(name = "ExtendedAttributes", namespace = "http://www.wfmc.org/2009/XPDL2.2", type = ExtendedAttributes.class, required = false),
        @XmlElementRef(name = "RedefinableHeader", namespace = "http://www.wfmc.org/2009/XPDL2.2", type = RedefinableHeader.class, required = false),
        @XmlElementRef(name = "Applications", namespace = "http://www.wfmc.org/2009/XPDL2.2", type = org.wfmc._2009.xpdl2.Applications.class, required = false),
        @XmlElementRef(name = "InputSets", namespace = "http://www.wfmc.org/2009/XPDL2.2", type = InputSets.class, required = false),
        @XmlElementRef(name = "DataFields", namespace = "http://www.wfmc.org/2009/XPDL2.2", type = org.wfmc._2009.xpdl2.DataFields.class, required = false),
        @XmlElementRef(name = "PartnerLinks", namespace = "http://www.wfmc.org/2009/XPDL2.2", type = PartnerLinks.class, required = false),
        @XmlElementRef(name = "FormalParameters", namespace = "http://www.wfmc.org/2009/XPDL2.2", type = FormalParameters.class, required = false),
        @XmlElementRef(name = "Assignments", namespace = "http://www.wfmc.org/2009/XPDL2.2", type = Assignments.class, required = false),
        @XmlElementRef(name = "DataStoreReferences", namespace = "http://www.wfmc.org/2009/XPDL2.2", type = DataStoreReferences.class, required = false),
        @XmlElementRef(name = "ProcessHeader", namespace = "http://www.wfmc.org/2009/XPDL2.2", type = ProcessHeader.class, required = false),
        @XmlElementRef(name = "Activities", namespace = "http://www.wfmc.org/2009/XPDL2.2", type = Activities.class, required = false)
    })
    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> content;
    @XmlAttribute(name = "Id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String id;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "AccessLevel")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String accessLevel;
    @XmlAttribute(name = "ProcessType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String processType;
    @XmlAttribute(name = "Status")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String status;
    @XmlAttribute(name = "SuppressJoinFailure")
    protected Boolean suppressJoinFailure;
    @XmlAttribute(name = "EnableInstanceCompensation")
    protected Boolean enableInstanceCompensation;
    @XmlAttribute(name = "AdHoc")
    protected Boolean adHoc;
    @XmlAttribute(name = "AdHocOrdering")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String adHocOrdering;
    @XmlAttribute(name = "AdHocCompletionCondition")
    protected String adHocCompletionCondition;
    @XmlAttribute(name = "DefaultStartActivitySetId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String defaultStartActivitySetId;
    @XmlAttribute(name = "DefaultStartActivityId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String defaultStartActivityId;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * 获取内容模型的其余部分。
     * 
     * <p>
     * 由于以下原因, 您获取的是此 "catch-all" 属性: 
     * 字段名称 "DataFields" 由模式的两个不同部分使用。请参阅: 
     * file:/D:/Apromore/Apromore-Schema/xpdl-schema/src/main/xsd/bpmnxpdl_40a_modified.xsd的第 2480 行
     * file:/D:/Apromore/Apromore-Schema/xpdl-schema/src/main/xsd/bpmnxpdl_40a_modified.xsd的第 2477 行
     * <p>
     * 要清除此属性, 请将属性定制设置应用于以下两个声明
     * 或其中一个以更改其名称: 
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OutputSets }
     * {@link org.wfmc._2002.xpdl1.DataFields }
     * {@link java.lang.Object }
     * {@link org.wfmc._2009.xpdl2.Object }
     * {@link ActivitySets }
     * {@link DataObjects }
     * {@link Element }
     * {@link RedefinableHeader }
     * {@link org.wfmc._2009.xpdl2.Applications }
     * {@link InputSets }
     * {@link org.wfmc._2009.xpdl2.DataFields }
     * {@link PartnerLinks }
     * {@link FormalParameters }
     * {@link DataStoreReferences }
     * {@link Activities }
     * {@link org.wfmc._2009.xpdl2.Participants }
     * {@link org.wfmc._2002.xpdl1.Participants }
     * {@link JAXBElement }{@code <}{@link java.lang.Object }{@code >}
     * {@link DataInputOutputs }
     * {@link Transitions }
     * {@link org.wfmc._2002.xpdl1.Applications }
     * {@link DataAssociations }
     * {@link ExtendedAttributes }
     * {@link Assignments }
     * {@link ProcessHeader }
     * 
     * 
     */
    public List<java.lang.Object> getContent() {
        if (content == null) {
            content = new ArrayList<java.lang.Object>();
        }
        return this.content;
    }

    /**
     * 获取id属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * 设置id属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * 获取name属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * 设置name属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * 获取accessLevel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessLevel() {
        if (accessLevel == null) {
            return "PUBLIC";
        } else {
            return accessLevel;
        }
    }

    /**
     * 设置accessLevel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessLevel(String value) {
        this.accessLevel = value;
    }

    /**
     * 获取processType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessType() {
        if (processType == null) {
            return "None";
        } else {
            return processType;
        }
    }

    /**
     * 设置processType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessType(String value) {
        this.processType = value;
    }

    /**
     * 获取status属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        if (status == null) {
            return "None";
        } else {
            return status;
        }
    }

    /**
     * 设置status属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * 获取suppressJoinFailure属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSuppressJoinFailure() {
        if (suppressJoinFailure == null) {
            return false;
        } else {
            return suppressJoinFailure;
        }
    }

    /**
     * 设置suppressJoinFailure属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSuppressJoinFailure(Boolean value) {
        this.suppressJoinFailure = value;
    }

    /**
     * 获取enableInstanceCompensation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isEnableInstanceCompensation() {
        if (enableInstanceCompensation == null) {
            return false;
        } else {
            return enableInstanceCompensation;
        }
    }

    /**
     * 设置enableInstanceCompensation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableInstanceCompensation(Boolean value) {
        this.enableInstanceCompensation = value;
    }

    /**
     * 获取adHoc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isAdHoc() {
        if (adHoc == null) {
            return false;
        } else {
            return adHoc;
        }
    }

    /**
     * 设置adHoc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdHoc(Boolean value) {
        this.adHoc = value;
    }

    /**
     * 获取adHocOrdering属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdHocOrdering() {
        if (adHocOrdering == null) {
            return "Parallel";
        } else {
            return adHocOrdering;
        }
    }

    /**
     * 设置adHocOrdering属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdHocOrdering(String value) {
        this.adHocOrdering = value;
    }

    /**
     * 获取adHocCompletionCondition属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdHocCompletionCondition() {
        return adHocCompletionCondition;
    }

    /**
     * 设置adHocCompletionCondition属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdHocCompletionCondition(String value) {
        this.adHocCompletionCondition = value;
    }

    /**
     * 获取defaultStartActivitySetId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultStartActivitySetId() {
        return defaultStartActivitySetId;
    }

    /**
     * 设置defaultStartActivitySetId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultStartActivitySetId(String value) {
        this.defaultStartActivitySetId = value;
    }

    /**
     * 获取defaultStartActivityId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultStartActivityId() {
        return defaultStartActivityId;
    }

    /**
     * 设置defaultStartActivityId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultStartActivityId(String value) {
        this.defaultStartActivityId = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
