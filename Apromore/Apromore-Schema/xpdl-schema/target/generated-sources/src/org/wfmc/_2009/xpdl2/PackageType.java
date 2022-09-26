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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;


/**
 * <p>PackageType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PackageType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}PackageHeader"/>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}RedefinableHeader" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}ConformanceClass" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}Script" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}ExternalPackages" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}TypeDeclarations" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}Participants" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}Applications" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}DataFields" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}PartnerLinkTypes" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}Pages" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}GlobalActivities" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}DataStores" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}Pools" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}MessageFlows" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}Associations" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}Artifacts" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}WorkflowProcesses" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}ExtendedAttributes" minOccurs="0"/>
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Id" use="required" type="{http://www.wfmc.org/2009/XPDL2.2}Id" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Language" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="QueryLanguage" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PackageType", propOrder = {
    "packageHeader",
    "redefinableHeader",
    "conformanceClass",
    "script",
    "externalPackages",
    "typeDeclarations",
    "participants",
    "applications",
    "dataFields",
    "partnerLinkTypes",
    "pages",
    "globalActivities",
    "dataStores",
    "pools",
    "messageFlows",
    "associations",
    "artifacts",
    "workflowProcesses",
    "extendedAttributes",
    "any"
})
public class PackageType {

    @XmlElement(name = "PackageHeader", required = true)
    protected PackageHeader packageHeader;
    @XmlElement(name = "RedefinableHeader")
    protected RedefinableHeader redefinableHeader;
    @XmlElement(name = "ConformanceClass")
    protected ConformanceClass conformanceClass;
    @XmlElement(name = "Script")
    protected Script script;
    @XmlElement(name = "ExternalPackages")
    protected ExternalPackages externalPackages;
    @XmlElement(name = "TypeDeclarations")
    protected TypeDeclarations typeDeclarations;
    @XmlElement(name = "Participants")
    protected Participants participants;
    @XmlElement(name = "Applications")
    protected Applications applications;
    @XmlElement(name = "DataFields")
    protected DataFields dataFields;
    @XmlElement(name = "PartnerLinkTypes")
    protected PartnerLinkTypes partnerLinkTypes;
    @XmlElement(name = "Pages")
    protected Pages pages;
    @XmlElement(name = "GlobalActivities")
    protected GlobalActivities globalActivities;
    @XmlElement(name = "DataStores")
    protected DataStores dataStores;
    @XmlElement(name = "Pools")
    protected Pools pools;
    @XmlElement(name = "MessageFlows")
    protected MessageFlows messageFlows;
    @XmlElement(name = "Associations")
    protected Associations associations;
    @XmlElement(name = "Artifacts")
    protected Artifacts artifacts;
    @XmlElement(name = "WorkflowProcesses")
    protected WorkflowProcesses workflowProcesses;
    @XmlElement(name = "ExtendedAttributes")
    protected ExtendedAttributes extendedAttributes;
    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;
    @XmlAttribute(name = "Id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String id;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "Language")
    protected String language;
    @XmlAttribute(name = "QueryLanguage")
    protected String queryLanguage;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * 获取packageHeader属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PackageHeader }
     *     
     */
    public PackageHeader getPackageHeader() {
        return packageHeader;
    }

    /**
     * 设置packageHeader属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PackageHeader }
     *     
     */
    public void setPackageHeader(PackageHeader value) {
        this.packageHeader = value;
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
     * 获取conformanceClass属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ConformanceClass }
     *     
     */
    public ConformanceClass getConformanceClass() {
        return conformanceClass;
    }

    /**
     * 设置conformanceClass属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ConformanceClass }
     *     
     */
    public void setConformanceClass(ConformanceClass value) {
        this.conformanceClass = value;
    }

    /**
     * 获取script属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Script }
     *     
     */
    public Script getScript() {
        return script;
    }

    /**
     * 设置script属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Script }
     *     
     */
    public void setScript(Script value) {
        this.script = value;
    }

    /**
     * 获取externalPackages属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ExternalPackages }
     *     
     */
    public ExternalPackages getExternalPackages() {
        return externalPackages;
    }

    /**
     * 设置externalPackages属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalPackages }
     *     
     */
    public void setExternalPackages(ExternalPackages value) {
        this.externalPackages = value;
    }

    /**
     * 获取typeDeclarations属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TypeDeclarations }
     *     
     */
    public TypeDeclarations getTypeDeclarations() {
        return typeDeclarations;
    }

    /**
     * 设置typeDeclarations属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeDeclarations }
     *     
     */
    public void setTypeDeclarations(TypeDeclarations value) {
        this.typeDeclarations = value;
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
     * 获取partnerLinkTypes属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PartnerLinkTypes }
     *     
     */
    public PartnerLinkTypes getPartnerLinkTypes() {
        return partnerLinkTypes;
    }

    /**
     * 设置partnerLinkTypes属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PartnerLinkTypes }
     *     
     */
    public void setPartnerLinkTypes(PartnerLinkTypes value) {
        this.partnerLinkTypes = value;
    }

    /**
     * 获取pages属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Pages }
     *     
     */
    public Pages getPages() {
        return pages;
    }

    /**
     * 设置pages属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Pages }
     *     
     */
    public void setPages(Pages value) {
        this.pages = value;
    }

    /**
     * 获取globalActivities属性的值。
     * 
     * @return
     *     possible object is
     *     {@link GlobalActivities }
     *     
     */
    public GlobalActivities getGlobalActivities() {
        return globalActivities;
    }

    /**
     * 设置globalActivities属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link GlobalActivities }
     *     
     */
    public void setGlobalActivities(GlobalActivities value) {
        this.globalActivities = value;
    }

    /**
     * 获取dataStores属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DataStores }
     *     
     */
    public DataStores getDataStores() {
        return dataStores;
    }

    /**
     * 设置dataStores属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DataStores }
     *     
     */
    public void setDataStores(DataStores value) {
        this.dataStores = value;
    }

    /**
     * 获取pools属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Pools }
     *     
     */
    public Pools getPools() {
        return pools;
    }

    /**
     * 设置pools属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Pools }
     *     
     */
    public void setPools(Pools value) {
        this.pools = value;
    }

    /**
     * 获取messageFlows属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MessageFlows }
     *     
     */
    public MessageFlows getMessageFlows() {
        return messageFlows;
    }

    /**
     * 设置messageFlows属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MessageFlows }
     *     
     */
    public void setMessageFlows(MessageFlows value) {
        this.messageFlows = value;
    }

    /**
     * 获取associations属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Associations }
     *     
     */
    public Associations getAssociations() {
        return associations;
    }

    /**
     * 设置associations属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Associations }
     *     
     */
    public void setAssociations(Associations value) {
        this.associations = value;
    }

    /**
     * 获取artifacts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Artifacts }
     *     
     */
    public Artifacts getArtifacts() {
        return artifacts;
    }

    /**
     * 设置artifacts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Artifacts }
     *     
     */
    public void setArtifacts(Artifacts value) {
        this.artifacts = value;
    }

    /**
     * 获取workflowProcesses属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WorkflowProcesses }
     *     
     */
    public WorkflowProcesses getWorkflowProcesses() {
        return workflowProcesses;
    }

    /**
     * 设置workflowProcesses属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WorkflowProcesses }
     *     
     */
    public void setWorkflowProcesses(WorkflowProcesses value) {
        this.workflowProcesses = value;
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
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link java.lang.Object }
     * {@link Element }
     * 
     * 
     */
    public List<java.lang.Object> getAny() {
        if (any == null) {
            any = new ArrayList<java.lang.Object>();
        }
        return this.any;
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
     * 获取language属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * 设置language属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * 获取queryLanguage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueryLanguage() {
        return queryLanguage;
    }

    /**
     * 设置queryLanguage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueryLanguage(String value) {
        this.queryLanguage = value;
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
