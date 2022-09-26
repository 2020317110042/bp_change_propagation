//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.04.18 时间 02:49:09 PM CST 
//


package org.apromore.anf;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>fontType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="fontType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="family" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="style">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="normal"/>
 *             &lt;enumeration value="italic"/>
 *             &lt;enumeration value="bold"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="weight" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="size" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="decoration">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="none"/>
 *             &lt;enumeration value="underline"/>
 *             &lt;enumeration value="overline"/>
 *             &lt;enumeration value="line-through"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="color" type="{http://www.apromore.org/ANF}colorType" />
 *       &lt;attribute name="transparency" type="{http://www.apromore.org/ANF}transparencyType" />
 *       &lt;attribute name="x_position" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="y_position" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="verticalAlign">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="top"/>
 *             &lt;enumeration value="middle"/>
 *             &lt;enumeration value="bottom"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="horizontalAlign">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="left"/>
 *             &lt;enumeration value="center"/>
 *             &lt;enumeration value="right"/>
 *             &lt;enumeration value="justify"/>
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
@XmlType(name = "fontType", namespace = "http://www.apromore.org/ANF")
public class FontType
    implements Visitable
{

    @XmlAttribute(name = "family")
    protected String family;
    @XmlAttribute(name = "style")
    protected String style;
    @XmlAttribute(name = "weight")
    protected String weight;
    @XmlAttribute(name = "size")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger size;
    @XmlAttribute(name = "decoration")
    protected String decoration;
    @XmlAttribute(name = "color")
    protected String color;
    @XmlAttribute(name = "transparency")
    protected Integer transparency;
    @XmlAttribute(name = "x_position")
    protected BigDecimal xPosition;
    @XmlAttribute(name = "y_position")
    protected BigDecimal yPosition;
    @XmlAttribute(name = "verticalAlign")
    protected String verticalAlign;
    @XmlAttribute(name = "horizontalAlign")
    protected String horizontalAlign;
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
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSize() {
        return size;
    }

    /**
     * 设置size属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSize(BigInteger value) {
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
     * 获取color属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColor() {
        return color;
    }

    /**
     * 设置color属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColor(String value) {
        this.color = value;
    }

    /**
     * 获取transparency属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTransparency() {
        return transparency;
    }

    /**
     * 设置transparency属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTransparency(Integer value) {
        this.transparency = value;
    }

    /**
     * 获取xPosition属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getXPosition() {
        return xPosition;
    }

    /**
     * 设置xPosition属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setXPosition(BigDecimal value) {
        this.xPosition = value;
    }

    /**
     * 获取yPosition属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getYPosition() {
        return yPosition;
    }

    /**
     * 设置yPosition属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setYPosition(BigDecimal value) {
        this.yPosition = value;
    }

    /**
     * 获取verticalAlign属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerticalAlign() {
        return verticalAlign;
    }

    /**
     * 设置verticalAlign属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerticalAlign(String value) {
        this.verticalAlign = value;
    }

    /**
     * 获取horizontalAlign属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHorizontalAlign() {
        return horizontalAlign;
    }

    /**
     * 设置horizontalAlign属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHorizontalAlign(String value) {
        this.horizontalAlign = value;
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

    public void accept(Visitor aVisitor) {
        aVisitor.visit(this);
    }

}
