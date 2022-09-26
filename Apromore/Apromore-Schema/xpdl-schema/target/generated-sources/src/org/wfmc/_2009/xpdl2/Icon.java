//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.04.18 时间 02:49:32 PM CST 
//


package org.wfmc._2009.xpdl2;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="XCOORD" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="YCOORD" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="WIDTH" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="HEIGHT" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="SHAPE" default="RoundRectangle">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="RoundRectangle"/>
 *             &lt;enumeration value="Rectangle"/>
 *             &lt;enumeration value="Ellipse"/>
 *             &lt;enumeration value="Diamond"/>
 *             &lt;enumeration value="UpTriangle"/>
 *             &lt;enumeration value="DownTriangle"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "value"
})
@XmlRootElement(name = "Icon")
public class Icon {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "XCOORD")
    protected BigInteger xcoord;
    @XmlAttribute(name = "YCOORD")
    protected BigInteger ycoord;
    @XmlAttribute(name = "WIDTH")
    protected BigInteger width;
    @XmlAttribute(name = "HEIGHT")
    protected BigInteger height;
    @XmlAttribute(name = "SHAPE")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String shape;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * 获取value属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * 设置value属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * 获取xcoord属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getXCOORD() {
        return xcoord;
    }

    /**
     * 设置xcoord属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setXCOORD(BigInteger value) {
        this.xcoord = value;
    }

    /**
     * 获取ycoord属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getYCOORD() {
        return ycoord;
    }

    /**
     * 设置ycoord属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setYCOORD(BigInteger value) {
        this.ycoord = value;
    }

    /**
     * 获取width属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWIDTH() {
        return width;
    }

    /**
     * 设置width属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWIDTH(BigInteger value) {
        this.width = value;
    }

    /**
     * 获取height属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getHEIGHT() {
        return height;
    }

    /**
     * 设置height属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setHEIGHT(BigInteger value) {
        this.height = value;
    }

    /**
     * 获取shape属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSHAPE() {
        if (shape == null) {
            return "RoundRectangle";
        } else {
            return shape;
        }
    }

    /**
     * 设置shape属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSHAPE(String value) {
        this.shape = value;
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
