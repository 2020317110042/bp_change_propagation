//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.04.18 at 02:49:38 下午 CST 
//


package org.yawlfoundation.yawlschema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResourcingAllocateFactsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResourcingAllocateFactsType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.yawlfoundation.org/yawlschema}ResourcingInteractionInitiatorType">
 *       &lt;sequence>
 *         &lt;element name="allocator" type="{http://www.yawlfoundation.org/yawlschema}ResourcingSelectorFactsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResourcingAllocateFactsType", propOrder = {
    "allocator"
})
public class ResourcingAllocateFactsType
    extends ResourcingInteractionInitiatorType
{

    protected ResourcingSelectorFactsType allocator;

    /**
     * Gets the value of the allocator property.
     * 
     * @return
     *     possible object is
     *     {@link ResourcingSelectorFactsType }
     *     
     */
    public ResourcingSelectorFactsType getAllocator() {
        return allocator;
    }

    /**
     * Sets the value of the allocator property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourcingSelectorFactsType }
     *     
     */
    public void setAllocator(ResourcingSelectorFactsType value) {
        this.allocator = value;
    }

}
