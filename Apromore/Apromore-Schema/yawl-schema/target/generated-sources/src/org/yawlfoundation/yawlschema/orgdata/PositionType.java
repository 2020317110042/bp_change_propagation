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
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PositionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PositionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.yawlfoundation.org/yawlschema/orgdata}BaseOrgDataElement">
 *       &lt;sequence>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="positionid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="orggroupid" type="{http://www.w3.org/2001/XMLSchema}IDREF" minOccurs="0"/>
 *         &lt;element name="reportstoid" type="{http://www.w3.org/2001/XMLSchema}IDREF" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PositionType", propOrder = {
    "title",
    "positionid",
    "orggroupid",
    "reportstoid"
})
public class PositionType
    extends BaseOrgDataElement
{

    @XmlElement(required = true)
    protected String title;
    @XmlElement(required = true)
    protected String positionid;
    @XmlElement(type = Object.class)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected OrggroupType orggroupid;
    @XmlElement(type = Object.class)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected PositionType reportstoid;

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the positionid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPositionid() {
        return positionid;
    }

    /**
     * Sets the value of the positionid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPositionid(String value) {
        this.positionid = value;
    }

    /**
     * Gets the value of the orggroupid property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public OrggroupType getOrggroupid() {
        return orggroupid;
    }

    /**
     * Sets the value of the orggroupid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setOrggroupid(OrggroupType value) {
        this.orggroupid = value;
    }

    /**
     * Gets the value of the reportstoid property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public PositionType getReportstoid() {
        return reportstoid;
    }

    /**
     * Sets the value of the reportstoid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setReportstoid(PositionType value) {
        this.reportstoid = value;
    }

}