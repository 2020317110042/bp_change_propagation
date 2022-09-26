//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.04.18 时间 02:49:28 PM CST 
//


package org.apromore.pnml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>resourcesType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="resourcesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resource" type="{pnml.apromore.org}resourceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="role" type="{pnml.apromore.org}roleType"/>
 *           &lt;element name="organizationUnit" type="{pnml.apromore.org}organizationUnitType"/>
 *         &lt;/choice>
 *         &lt;element name="resourceMapping" type="{pnml.apromore.org}resourceMappingType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resourcesType", propOrder = {
    "resource",
    "roleOrOrganizationUnit",
    "resourceMapping"
})
public class ResourcesType {

    protected List<ResourceType> resource;
    @XmlElements({
        @XmlElement(name = "role", type = RoleType.class),
        @XmlElement(name = "organizationUnit", type = OrganizationUnitType.class)
    })
    protected List<Object> roleOrOrganizationUnit;
    protected List<ResourceMappingType> resourceMapping;
    @XmlAttribute(name = "ID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the resource property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resource property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResource().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResourceType }
     * 
     * 
     */
    public List<ResourceType> getResource() {
        if (resource == null) {
            resource = new ArrayList<ResourceType>();
        }
        return this.resource;
    }

    /**
     * Gets the value of the roleOrOrganizationUnit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roleOrOrganizationUnit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoleOrOrganizationUnit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RoleType }
     * {@link OrganizationUnitType }
     * 
     * 
     */
    public List<Object> getRoleOrOrganizationUnit() {
        if (roleOrOrganizationUnit == null) {
            roleOrOrganizationUnit = new ArrayList<Object>();
        }
        return this.roleOrOrganizationUnit;
    }

    /**
     * Gets the value of the resourceMapping property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resourceMapping property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResourceMapping().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResourceMappingType }
     * 
     * 
     */
    public List<ResourceMappingType> getResourceMapping() {
        if (resourceMapping == null) {
            resourceMapping = new ArrayList<ResourceMappingType>();
        }
        return this.resourceMapping;
    }

    /**
     * 获取id属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
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
    public void setID(String value) {
        this.id = value;
    }

}
