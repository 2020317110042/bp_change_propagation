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
 *         &lt;element ref="{http://www.wfmc.org/2002/XPDL1.0}PackageHeader"/>
 *         &lt;element ref="{http://www.wfmc.org/2002/XPDL1.0}RedefinableHeader" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2002/XPDL1.0}ConformanceClass" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2002/XPDL1.0}Script" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2002/XPDL1.0}ExternalPackages" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2002/XPDL1.0}TypeDeclarations" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2002/XPDL1.0}Participants" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2002/XPDL1.0}Applications" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2002/XPDL1.0}DataFields" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2002/XPDL1.0}WorkflowProcesses" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2002/XPDL1.0}ExtendedAttributes" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Id" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "packageHeader",
    "redefinableHeader",
    "conformanceClass",
    "script",
    "externalPackages",
    "typeDeclarations",
    "participants",
    "applications",
    "dataFields",
    "workflowProcesses",
    "extendedAttributes"
})
@XmlRootElement(name = "Package")
public class Package {

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
    @XmlElement(name = "WorkflowProcesses")
    protected WorkflowProcesses workflowProcesses;
    @XmlElement(name = "ExtendedAttributes")
    protected ExtendedAttributes extendedAttributes;
    @XmlAttribute(name = "Id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String id;
    @XmlAttribute(name = "Name")
    protected String name;

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

}
