//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.04.18 时间 02:49:32 PM CST 
//


package org.wfmc._2002.xpdl1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.wfmc.org/2002/XPDL1.0}ProcessHeader"/>
 *         &lt;element ref="{http://www.wfmc.org/2002/XPDL1.0}RedefinableHeader" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2002/XPDL1.0}FormalParameters" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2002/XPDL1.0}DataFields" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2002/XPDL1.0}Participants" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2002/XPDL1.0}Applications" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2002/XPDL1.0}ActivitySets" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2002/XPDL1.0}Activities" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2002/XPDL1.0}Transitions" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2002/XPDL1.0}ExtendedAttributes" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Id" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="AccessLevel">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="PUBLIC"/>
 *             &lt;enumeration value="PRIVATE"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "processHeader",
    "redefinableHeader",
    "formalParameters",
    "dataFields",
    "participants",
    "applications",
    "activitySets",
    "activities",
    "transitions",
    "extendedAttributes"
})
@XmlRootElement(name = "WorkflowProcess")
public class WorkflowProcess {

    @XmlElement(name = "ProcessHeader", required = true)
    protected ProcessHeader processHeader;
    @XmlElement(name = "RedefinableHeader")
    protected RedefinableHeader redefinableHeader;
    @XmlElement(name = "FormalParameters")
    protected FormalParameters formalParameters;
    @XmlElement(name = "DataFields")
    protected DataFields dataFields;
    @XmlElement(name = "Participants")
    protected Participants participants;
    @XmlElement(name = "Applications")
    protected Applications applications;
    @XmlElement(name = "ActivitySets")
    protected ActivitySets activitySets;
    @XmlElement(name = "Activities")
    protected Activities activities;
    @XmlElement(name = "Transitions")
    protected Transitions transitions;
    @XmlElement(name = "ExtendedAttributes")
    protected ExtendedAttributes extendedAttributes;
    @XmlAttribute(name = "Id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String id;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "AccessLevel")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String accessLevel;

    /**
     * 获取processHeader属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ProcessHeader }
     *     
     */
    public ProcessHeader getProcessHeader() {
        return processHeader;
    }

    /**
     * 设置processHeader属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessHeader }
     *     
     */
    public void setProcessHeader(ProcessHeader value) {
        this.processHeader = value;
    }

    /**
     * 获取redefinableHeader属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RedefinableHeader }
     *     
     */
    public RedefinableHeader getRedefinableHeader() {
        return redefinableHeader;
    }

    /**
     * 设置redefinableHeader属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RedefinableHeader }
     *     
     */
    public void setRedefinableHeader(RedefinableHeader value) {
        this.redefinableHeader = value;
    }

    /**
     * 获取formalParameters属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FormalParameters }
     *     
     */
    public FormalParameters getFormalParameters() {
        return formalParameters;
    }

    /**
     * 设置formalParameters属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FormalParameters }
     *     
     */
    public void setFormalParameters(FormalParameters value) {
        this.formalParameters = value;
    }

    /**
     * 获取dataFields属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DataFields }
     *     
     */
    public DataFields getDataFields() {
        return dataFields;
    }

    /**
     * 设置dataFields属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DataFields }
     *     
     */
    public void setDataFields(DataFields value) {
        this.dataFields = value;
    }

    /**
     * 获取participants属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Participants }
     *     
     */
    public Participants getParticipants() {
        return participants;
    }

    /**
     * 设置participants属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Participants }
     *     
     */
    public void setParticipants(Participants value) {
        this.participants = value;
    }

    /**
     * 获取applications属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Applications }
     *     
     */
    public Applications getApplications() {
        return applications;
    }

    /**
     * 设置applications属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Applications }
     *     
     */
    public void setApplications(Applications value) {
        this.applications = value;
    }

    /**
     * 获取activitySets属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ActivitySets }
     *     
     */
    public ActivitySets getActivitySets() {
        return activitySets;
    }

    /**
     * 设置activitySets属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ActivitySets }
     *     
     */
    public void setActivitySets(ActivitySets value) {
        this.activitySets = value;
    }

    /**
     * 获取activities属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Activities }
     *     
     */
    public Activities getActivities() {
        return activities;
    }

    /**
     * 设置activities属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Activities }
     *     
     */
    public void setActivities(Activities value) {
        this.activities = value;
    }

    /**
     * 获取transitions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Transitions }
     *     
     */
    public Transitions getTransitions() {
        return transitions;
    }

    /**
     * 设置transitions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Transitions }
     *     
     */
    public void setTransitions(Transitions value) {
        this.transitions = value;
    }

    /**
     * 获取extendedAttributes属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ExtendedAttributes }
     *     
     */
    public ExtendedAttributes getExtendedAttributes() {
        return extendedAttributes;
    }

    /**
     * 设置extendedAttributes属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedAttributes }
     *     
     */
    public void setExtendedAttributes(ExtendedAttributes value) {
        this.extendedAttributes = value;
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
        return accessLevel;
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

}
