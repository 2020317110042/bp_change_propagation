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
import javax.xml.bind.annotation.XmlAttribute;
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
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="GatewayType" default="Exclusive">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="XOR"/>
 *             &lt;enumeration value="OR"/>
 *             &lt;enumeration value="AND"/>
 *             &lt;enumeration value="Exclusive"/>
 *             &lt;enumeration value="Inclusive"/>
 *             &lt;enumeration value="Parallel"/>
 *             &lt;enumeration value="Complex"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="XORType" default="Data">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="Data"/>
 *             &lt;enumeration value="Event"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="ExclusiveType" default="Data">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="Data"/>
 *             &lt;enumeration value="Event"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Instantiate" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="ParallelEventBased" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="MarkerVisible" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="IncomingCondition" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="OutgoingCondition" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="GatewayDirection" default="Unspecified">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="Unspecified"/>
 *             &lt;enumeration value="Converging"/>
 *             &lt;enumeration value="Diverging"/>
 *             &lt;enumeration value="Mixed"/>
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
    "any"
})
@XmlRootElement(name = "Route")
public class Route {

    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;
    @XmlAttribute(name = "GatewayType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String gatewayType;
    @XmlAttribute(name = "XORType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String xorType;
    @XmlAttribute(name = "ExclusiveType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String exclusiveType;
    @XmlAttribute(name = "Instantiate")
    protected Boolean instantiate;
    @XmlAttribute(name = "ParallelEventBased")
    protected Boolean parallelEventBased;
    @XmlAttribute(name = "MarkerVisible")
    protected Boolean markerVisible;
    @XmlAttribute(name = "IncomingCondition")
    protected String incomingCondition;
    @XmlAttribute(name = "OutgoingCondition")
    protected String outgoingCondition;
    @XmlAttribute(name = "GatewayDirection")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String gatewayDirection;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

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
     * 获取gatewayType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGatewayType() {
        if (gatewayType == null) {
            return "Exclusive";
        } else {
            return gatewayType;
        }
    }

    /**
     * 设置gatewayType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGatewayType(String value) {
        this.gatewayType = value;
    }

    /**
     * 获取xorType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXORType() {
        if (xorType == null) {
            return "Data";
        } else {
            return xorType;
        }
    }

    /**
     * 设置xorType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXORType(String value) {
        this.xorType = value;
    }

    /**
     * 获取exclusiveType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExclusiveType() {
        if (exclusiveType == null) {
            return "Data";
        } else {
            return exclusiveType;
        }
    }

    /**
     * 设置exclusiveType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExclusiveType(String value) {
        this.exclusiveType = value;
    }

    /**
     * 获取instantiate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isInstantiate() {
        if (instantiate == null) {
            return false;
        } else {
            return instantiate;
        }
    }

    /**
     * 设置instantiate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInstantiate(Boolean value) {
        this.instantiate = value;
    }

    /**
     * 获取parallelEventBased属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isParallelEventBased() {
        if (parallelEventBased == null) {
            return false;
        } else {
            return parallelEventBased;
        }
    }

    /**
     * 设置parallelEventBased属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setParallelEventBased(Boolean value) {
        this.parallelEventBased = value;
    }

    /**
     * 获取markerVisible属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isMarkerVisible() {
        if (markerVisible == null) {
            return false;
        } else {
            return markerVisible;
        }
    }

    /**
     * 设置markerVisible属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMarkerVisible(Boolean value) {
        this.markerVisible = value;
    }

    /**
     * 获取incomingCondition属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncomingCondition() {
        return incomingCondition;
    }

    /**
     * 设置incomingCondition属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncomingCondition(String value) {
        this.incomingCondition = value;
    }

    /**
     * 获取outgoingCondition属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutgoingCondition() {
        return outgoingCondition;
    }

    /**
     * 设置outgoingCondition属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutgoingCondition(String value) {
        this.outgoingCondition = value;
    }

    /**
     * 获取gatewayDirection属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGatewayDirection() {
        if (gatewayDirection == null) {
            return "Unspecified";
        } else {
            return gatewayDirection;
        }
    }

    /**
     * 设置gatewayDirection属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGatewayDirection(String value) {
        this.gatewayDirection = value;
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
