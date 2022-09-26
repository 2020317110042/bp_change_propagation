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
 *         &lt;element name="LoopCondition" type="{http://www.wfmc.org/2009/XPDL2.2}ExpressionType" minOccurs="0"/>
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="LoopCondition" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="LoopCounter" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="LoopMaximum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="TestTime" default="After">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="Before"/>
 *             &lt;enumeration value="After"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
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
    "loopCondition",
    "any"
})
@XmlRootElement(name = "LoopStandard")
public class LoopStandard {

    @XmlElement(name = "LoopCondition")
    protected ExpressionType loopCondition;
    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;
    @XmlAttribute(name = "LoopCondition")
    protected String loopConditionAttribute;
    @XmlAttribute(name = "LoopCounter")
    protected BigInteger loopCounter;
    @XmlAttribute(name = "LoopMaximum")
    protected BigInteger loopMaximum;
    @XmlAttribute(name = "TestTime")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String testTime;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * 获取loopCondition属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ExpressionType }
     *     
     */
    public ExpressionType getLoopCondition() {
        return loopCondition;
    }

    /**
     * 设置loopCondition属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ExpressionType }
     *     
     */
    public void setLoopCondition(ExpressionType value) {
        this.loopCondition = value;
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
     * 获取loopConditionAttribute属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoopConditionAttribute() {
        return loopConditionAttribute;
    }

    /**
     * 设置loopConditionAttribute属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoopConditionAttribute(String value) {
        this.loopConditionAttribute = value;
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
     * 获取loopMaximum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLoopMaximum() {
        return loopMaximum;
    }

    /**
     * 设置loopMaximum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLoopMaximum(BigInteger value) {
        this.loopMaximum = value;
    }

    /**
     * 获取testTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestTime() {
        if (testTime == null) {
            return "After";
        } else {
            return testTime;
        }
    }

    /**
     * 设置testTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestTime(String value) {
        this.testTime = value;
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
