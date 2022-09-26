//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.04.18 at 02:49:38 下午 CST 
//


package org.yawlfoundation.yawlschema.orgdata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NonHumanCategoryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NonHumanCategoryType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.yawlfoundation.org/yawlschema/orgdata}BaseOrgDataElement">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="subcategories" type="{http://www.yawlfoundation.org/yawlschema/orgdata}SubcategoriesType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NonHumanCategoryType", propOrder = {
    "name",
    "subcategories"
})
public class NonHumanCategoryType
    extends BaseOrgDataElement
{

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected SubcategoriesType subcategories;

    /**
     * Gets the value of the name property.
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
     * Sets the value of the name property.
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
     * Gets the value of the subcategories property.
     * 
     * @return
     *     possible object is
     *     {@link SubcategoriesType }
     *     
     */
    public SubcategoriesType getSubcategories() {
        return subcategories;
    }

    /**
     * Sets the value of the subcategories property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubcategoriesType }
     *     
     */
    public void setSubcategories(SubcategoriesType value) {
        this.subcategories = value;
    }

}
