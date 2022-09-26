//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.04.18 时间 02:49:28 PM CST 
//


package org.apromore.pnml;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="family" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="style" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="weight" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="size" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="decoration">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="underline"/>
 *             &lt;enumeration value="overline"/>
 *             &lt;enumeration value="line-through"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="align">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="left"/>
 *             &lt;enumeration value="center"/>
 *             &lt;enumeration value="right"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="rotation" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "font")
public class Font {

    @XmlAttribute(name = "family")
    @XmlSchemaType(name = "anySimpleType")
    protected String family;
    @XmlAttribute(name = "style")
    @XmlSchemaType(name = "anySimpleType")
    protected String style;
    @XmlAttribute(name = "weight")
    @XmlSchemaType(name = "anySimpleType")
    protected String weight;
    @XmlAttribute(name = "size")
    @XmlSchemaType(name = "anySimpleType")
    protected String size;
    @XmlAttribute(name = "decoration")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String decoration;
    @XmlAttribute(name = "align")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String align;
    @XmlAttribute(name = "rotation")
    protected BigDecimal rotation;

    /**
     * 获取family属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFamily() {
        return family;
    }

    /**
     * 设置family属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFamily(String value) {
        this.family = value;
    }

    /**
     * 获取style属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStyle() {
        return style;
    }

    /**
     * 设置style属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStyle(String value) {
        this.style = value;
    }

    /**
     * 获取weight属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeight() {
        return weight;
    }

    /**
     * 设置weight属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeight(String value) {
        this.weight = value;
    }

    /**
     * 获取size属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSize() {
        return size;
    }

    /**
     * 设置size属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSize(String value) {
        this.size = value;
    }

    /**
     * 获取decoration属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecoration() {
        return decoration;
    }

    /**
     * 设置decoration属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecoration(String value) {
        this.decoration = value;
    }

    /**
     * 获取align属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlign() {
        return align;
    }

    /**
     * 设置align属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlign(String value) {
        this.align = value;
    }

    /**
     * 获取rotation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRotation() {
        return rotation;
    }

    /**
     * 设置rotation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRotation(BigDecimal value) {
        this.rotation = value;
    }

}
