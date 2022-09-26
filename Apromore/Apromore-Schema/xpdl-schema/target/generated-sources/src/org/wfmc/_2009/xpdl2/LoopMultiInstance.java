//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.04.18 时间 02:49:32 PM CST 
//


package org.wfmc._2009.xpdl2;

import java.math.BigInteger;
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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
 *         &lt;element name="MI_Condition" type="{http://www.wfmc.org/2009/XPDL2.2}ExpressionType" minOccurs="0"/>
 *         &lt;element name="ComplexMI_FlowCondition" type="{http://www.wfmc.org/2009/XPDL2.2}ExpressionType" minOccurs="0"/>
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="MI_Condition" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="LoopCounter" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="MI_Ordering" default="Parallel">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="Sequential"/>
 *             &lt;enumeration value="Parallel"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="MI_FlowCondition" default="All">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="None"/>
 *             &lt;enumeration value="One"/>
 *             &lt;enumeration value="All"/>
 *             &lt;enumeration value="Complex"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="ComplexMI_FlowCondition" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    "miCondition",
    "complexMIFlowCondition",
    "any"
})
@XmlRootElement(name = "LoopMultiInstance")
public class LoopMultiInstance {

    @XmlElement(name = "MI_Condition")
    protected ExpressionType miCondition;
    @XmlElement(name = "ComplexMI_FlowCondition")
    protected ExpressionType complexMIFlowCondition;
    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;
    @XmlAttribute(name = "MI_Condition")
    protected String miConditionAttribute;
    @XmlAttribute(name = "LoopCounter")
    protected BigInteger loopCounter;
    @XmlAttribute(name = "MI_Ordering")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String miOrdering;
    @XmlAttribute(name = "MI_FlowCondition")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String miFlowCondition;
    @XmlAttribute(name = "ComplexMI_FlowCondition")
    protected String complexMIFlowConditionAttribute;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * 获取miCondition属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ExpressionType }
     *     
     */
    public ExpressionType getMICondition() {
        return miCondition;
    }

    /**
     * 设置miCondition属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ExpressionType }
     *     
     */
    public void setMICondition(ExpressionType value) {
        this.miCondition = value;
    }

    /**
     * 获取complexMIFlowCondition属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ExpressionType }
     *     
     */
    public ExpressionType getComplexMIFlowCondition() {
        return complexMIFlowCondition;
    }

    /**
     * 设置complexMIFlowCondition属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ExpressionType }
     *     
     */
    public void setComplexMIFlowCondition(ExpressionType value) {
        this.complexMIFlowCondition = value;
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
     * 获取miConditionAttribute属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMIConditionAttribute() {
        return miConditionAttribute;
    }

    /**
     * 设置miConditionAttribute属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMIConditionAttribute(String value) {
        this.miConditionAttribute = value;
    }

    /**
     * 获取loopCounter属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLoopCounter() {
        return loopCounter;
    }

    /**
     * 设置loopCounter属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLoopCounter(BigInteger value) {
        this.loopCounter = value;
    }

    /**
     * 获取miOrdering属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMIOrdering() {
        if (miOrdering == null) {
            return "Parallel";
        } else {
            return miOrdering;
        }
    }

    /**
     * 设置miOrdering属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMIOrdering(String value) {
        this.miOrdering = value;
    }

    /**
     * 获取miFlowCondition属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMIFlowCondition() {
        if (miFlowCondition == null) {
            return "All";
        } else {
            return miFlowCondition;
        }
    }

    /**
     * 设置miFlowCondition属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMIFlowCondition(String value) {
        this.miFlowCondition = value;
    }

    /**
     * 获取complexMIFlowConditionAttribute属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComplexMIFlowConditionAttribute() {
        return complexMIFlowConditionAttribute;
    }

    /**
     * 设置complexMIFlowConditionAttribute属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComplexMIFlowConditionAttribute(String value) {
        this.complexMIFlowConditionAttribute = value;
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
