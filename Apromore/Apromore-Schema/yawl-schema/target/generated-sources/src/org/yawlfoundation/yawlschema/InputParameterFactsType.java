//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.04.18 at 02:49:38 下午 CST 
//


package org.yawlfoundation.yawlschema;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * <p>Java class for InputParameterFactsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InputParameterFactsType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.yawlfoundation.org/yawlschema}VariableBaseType">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="initialValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="mandatory" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="logPredicate" type="{http://www.yawlfoundation.org/yawlschema}LogPredicateFactsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute processContents='skip'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InputParameterFactsType", propOrder = {
    "initialValue",
    "mandatory",
    "logPredicate"
})
public class InputParameterFactsType
    extends VariableBaseType
{

    protected String initialValue;
    protected Object mandatory;
    protected LogPredicateFactsType logPredicate;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the initialValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitialValue() {
        return initialValue;
    }

    /**
     * Sets the value of the initialValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitialValue(String value) {
        this.initialValue = value;
    }

    /**
     * Gets the value of the mandatory property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getMandatory() {
        return mandatory;
    }

    /**
     * Sets the value of the mandatory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setMandatory(Object value) {
        this.mandatory = value;
    }

    /**
     * Gets the value of the logPredicate property.
     * 
     * @return
     *     possible object is
     *     {@link LogPredicateFactsType }
     *     
     */
    public LogPredicateFactsType getLogPredicate() {
        return logPredicate;
    }

    /**
     * Sets the value of the logPredicate property.
     * 
     * @param value
     *     allowed object is
     *     {@link LogPredicateFactsType }
     *     
     */
    public void setLogPredicate(LogPredicateFactsType value) {
        this.logPredicate = value;
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
