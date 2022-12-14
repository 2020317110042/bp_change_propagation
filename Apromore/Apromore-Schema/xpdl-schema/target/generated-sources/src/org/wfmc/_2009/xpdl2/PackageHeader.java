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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;


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
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}XPDLVersion"/>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}Vendor"/>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}Created"/>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}ModificationDate" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}Description" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}Documentation" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}PriorityUnit" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}CostUnit" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}VendorExtensions" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}LayoutInfo" minOccurs="0"/>
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
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
    "modificationDate",
    "description",
    "documentation",
    "priorityUnit",
    "costUnit",
    "vendorExtensions",
    "layoutInfo",
    "any"
})
@XmlRootElement(name = "PackageHeader")
public class PackageHeader {

    @XmlElement(name = "XPDLVersion", required = true)
    protected XPDLVersion xpdlVersion;
    @XmlElement(name = "Vendor", required = true)
    protected Vendor vendor;
    @XmlElement(name = "Created", required = true)
    protected Created created;
    @XmlElement(name = "ModificationDate")
    protected ModificationDate modificationDate;
    @XmlElement(name = "Description")
    protected Description description;
    @XmlElement(name = "Documentation")
    protected Documentation documentation;
    @XmlElement(name = "PriorityUnit")
    protected PriorityUnit priorityUnit;
    @XmlElement(name = "CostUnit")
    protected CostUnit costUnit;
    @XmlElement(name = "VendorExtensions")
    protected VendorExtensions vendorExtensions;
    @XmlElement(name = "LayoutInfo")
    protected LayoutInfo layoutInfo;
    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * 获取xpdlVersion属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XPDLVersion }
     *     
     */
    public XPDLVersion getXPDLVersion() {
        return xpdlVersion;
    }

    /**
     * 设置xpdlVersion属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XPDLVersion }
     *     
     */
    public void setXPDLVersion(XPDLVersion value) {
        this.xpdlVersion = value;
    }

    /**
     * 获取vendor属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Vendor }
     *     
     */
    public Vendor getVendor() {
        return vendor;
    }

    /**
     * 设置vendor属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Vendor }
     *     
     */
    public void setVendor(Vendor value) {
        this.vendor = value;
    }

    /**
     * 获取created属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Created }
     *     
     */
    public Created getCreated() {
        return created;
    }

    /**
     * 设置created属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Created }
     *     
     */
    public void setCreated(Created value) {
        this.created = value;
    }

    /**
     * 获取modificationDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ModificationDate }
     *     
     */
    public ModificationDate getModificationDate() {
        return modificationDate;
    }

    /**
     * 设置modificationDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ModificationDate }
     *     
     */
    public void setModificationDate(ModificationDate value) {
        this.modificationDate = value;
    }

    /**
     * 获取description属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Description }
     *     
     */
    public Description getDescription() {
        return description;
    }

    /**
     * 设置description属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Description }
     *     
     */
    public void setDescription(Description value) {
        this.description = value;
    }

    /**
     * 获取documentation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Documentation }
     *     
     */
    public Documentation getDocumentation() {
        return documentation;
    }

    /**
     * 设置documentation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Documentation }
     *     
     */
    public void setDocumentation(Documentation value) {
        this.documentation = value;
    }

    /**
     * 获取priorityUnit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PriorityUnit }
     *     
     */
    public PriorityUnit getPriorityUnit() {
        return priorityUnit;
    }

    /**
     * 设置priorityUnit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PriorityUnit }
     *     
     */
    public void setPriorityUnit(PriorityUnit value) {
        this.priorityUnit = value;
    }

    /**
     * 获取costUnit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CostUnit }
     *     
     */
    public CostUnit getCostUnit() {
        return costUnit;
    }

    /**
     * 设置costUnit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CostUnit }
     *     
     */
    public void setCostUnit(CostUnit value) {
        this.costUnit = value;
    }

    /**
     * 获取vendorExtensions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VendorExtensions }
     *     
     */
    public VendorExtensions getVendorExtensions() {
        return vendorExtensions;
    }

    /**
     * 设置vendorExtensions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VendorExtensions }
     *     
     */
    public void setVendorExtensions(VendorExtensions value) {
        this.vendorExtensions = value;
    }

    /**
     * 获取layoutInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LayoutInfo }
     *     
     */
    public LayoutInfo getLayoutInfo() {
        return layoutInfo;
    }

    /**
     * 设置layoutInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LayoutInfo }
     *     
     */
    public void setLayoutInfo(LayoutInfo value) {
        this.layoutInfo = value;
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
