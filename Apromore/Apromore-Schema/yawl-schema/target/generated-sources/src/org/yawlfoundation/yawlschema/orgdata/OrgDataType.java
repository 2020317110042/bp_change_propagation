//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.04.18 at 02:49:38 下午 CST 
//


package org.yawlfoundation.yawlschema.orgdata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrgDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrgDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="participants" type="{http://www.yawlfoundation.org/yawlschema/orgdata}ParticipantsType" minOccurs="0"/>
 *         &lt;element name="roles" type="{http://www.yawlfoundation.org/yawlschema/orgdata}RolesType" minOccurs="0"/>
 *         &lt;element name="positions" type="{http://www.yawlfoundation.org/yawlschema/orgdata}PositionsType" minOccurs="0"/>
 *         &lt;element name="capabilities" type="{http://www.yawlfoundation.org/yawlschema/orgdata}CapabilitiesType" minOccurs="0"/>
 *         &lt;element name="orggroups" type="{http://www.yawlfoundation.org/yawlschema/orgdata}OrggroupsType" minOccurs="0"/>
 *         &lt;element name="nonhumanresources" type="{http://www.yawlfoundation.org/yawlschema/orgdata}NonHumanResourcesType" minOccurs="0"/>
 *         &lt;element name="nonhumancategories" type="{http://www.yawlfoundation.org/yawlschema/orgdata}NonHumanCategoriesType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrgDataType", propOrder = {
    "participants",
    "roles",
    "positions",
    "capabilities",
    "orggroups",
    "nonhumanresources",
    "nonhumancategories"
})
public class OrgDataType {

    protected ParticipantsType participants;
    protected RolesType roles;
    protected PositionsType positions;
    protected CapabilitiesType capabilities;
    protected OrggroupsType orggroups;
    protected NonHumanResourcesType nonhumanresources;
    protected NonHumanCategoriesType nonhumancategories;

    /**
     * Gets the value of the participants property.
     * 
     * @return
     *     possible object is
     *     {@link ParticipantsType }
     *     
     */
    public ParticipantsType getParticipants() {
        return participants;
    }

    /**
     * Sets the value of the participants property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParticipantsType }
     *     
     */
    public void setParticipants(ParticipantsType value) {
        this.participants = value;
    }

    /**
     * Gets the value of the roles property.
     * 
     * @return
     *     possible object is
     *     {@link RolesType }
     *     
     */
    public RolesType getRoles() {
        return roles;
    }

    /**
     * Sets the value of the roles property.
     * 
     * @param value
     *     allowed object is
     *     {@link RolesType }
     *     
     */
    public void setRoles(RolesType value) {
        this.roles = value;
    }

    /**
     * Gets the value of the positions property.
     * 
     * @return
     *     possible object is
     *     {@link PositionsType }
     *     
     */
    public PositionsType getPositions() {
        return positions;
    }

    /**
     * Sets the value of the positions property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionsType }
     *     
     */
    public void setPositions(PositionsType value) {
        this.positions = value;
    }

    /**
     * Gets the value of the capabilities property.
     * 
     * @return
     *     possible object is
     *     {@link CapabilitiesType }
     *     
     */
    public CapabilitiesType getCapabilities() {
        return capabilities;
    }

    /**
     * Sets the value of the capabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link CapabilitiesType }
     *     
     */
    public void setCapabilities(CapabilitiesType value) {
        this.capabilities = value;
    }

    /**
     * Gets the value of the orggroups property.
     * 
     * @return
     *     possible object is
     *     {@link OrggroupsType }
     *     
     */
    public OrggroupsType getOrggroups() {
        return orggroups;
    }

    /**
     * Sets the value of the orggroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrggroupsType }
     *     
     */
    public void setOrggroups(OrggroupsType value) {
        this.orggroups = value;
    }

    /**
     * Gets the value of the nonhumanresources property.
     * 
     * @return
     *     possible object is
     *     {@link NonHumanResourcesType }
     *     
     */
    public NonHumanResourcesType getNonhumanresources() {
        return nonhumanresources;
    }

    /**
     * Sets the value of the nonhumanresources property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonHumanResourcesType }
     *     
     */
    public void setNonhumanresources(NonHumanResourcesType value) {
        this.nonhumanresources = value;
    }

    /**
     * Gets the value of the nonhumancategories property.
     * 
     * @return
     *     possible object is
     *     {@link NonHumanCategoriesType }
     *     
     */
    public NonHumanCategoriesType getNonhumancategories() {
        return nonhumancategories;
    }

    /**
     * Sets the value of the nonhumancategories property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonHumanCategoriesType }
     *     
     */
    public void setNonhumancategories(NonHumanCategoriesType value) {
        this.nonhumancategories = value;
    }

}
