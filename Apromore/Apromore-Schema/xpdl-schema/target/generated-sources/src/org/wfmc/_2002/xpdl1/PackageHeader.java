//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.04.18 时间 02:49:32 PM CST 
//


package org.wfmc._2002.xpdl1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element ref="{http://www.wfmc.org/2002/XPDL1.0}XPDLVersion"/>
 *         &lt;element ref="{http://www.wfmc.org/2002/XPDL1.0}Vendor"/>
 *         &lt;element ref="{http://www.wfmc.org/2002/XPDL1.0}Created"/>
 *         &lt;element ref="{http://www.wfmc.org/2002/XPDL1.0}Description" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2002/XPDL1.0}Documentation" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2002/XPDL1.0}PriorityUnit" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2002/XPDL1.0}CostUnit" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "xpdlVersion",
    "vendor",
    "created",
    "description",
    "documentation",
    "priorityUnit",
    "costUnit"
})
@XmlRootElement(name = "PackageHeader")
public class PackageHeader {

    @XmlElement(name = "XPDLVersion", required = true)
    protected String xpdlVersion;
    @XmlElement(name = "Vendor", required = true)
    protected String vendor;
    @XmlElement(name = "Created", required = true)
    protected String created;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Documentation")
    protected String documentation;
    @XmlElement(name = "PriorityUnit")
    protected String priorityUnit;
    @XmlElement(name = "CostUnit")
    protected String costUnit;

    /**
     * 获取xpdlVersion属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXPDLVersion() {
        return xpdlVersion;
    }

    /**
     * 设置xpdlVersion属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXPDLVersion(String value) {
        this.xpdlVersion = value;
    }

    /**
     * 获取vendor属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendor() {
        return vendor;
    }

    /**
     * 设置vendor属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendor(String value) {
        this.vendor = value;
    }

    /**
     * 获取created属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreated() {
        return created;
    }

    /**
     * 设置created属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreated(String value) {
        this.created = value;
    }

    /**
     * 获取description属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置description属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * 获取documentation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentation() {
        return documentation;
    }

    /**
     * 设置documentation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentation(String value) {
        this.documentation = value;
    }

    /**
     * 获取priorityUnit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriorityUnit() {
        return priorityUnit;
    }

    /**
     * 设置priorityUnit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriorityUnit(String value) {
        this.priorityUnit = value;
    }

    /**
     * 获取costUnit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCostUnit() {
        return costUnit;
    }

    /**
     * 设置costUnit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCostUnit(String value) {
        this.costUnit = value;
    }

}
