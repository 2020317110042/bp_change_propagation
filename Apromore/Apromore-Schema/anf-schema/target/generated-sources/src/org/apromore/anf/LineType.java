//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.04.18 时间 02:49:09 PM CST 
//


package org.apromore.anf;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>lineType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="lineType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="shape">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="straight"/>
 *             &lt;enumeration value="orthogonal"/>
 *             &lt;enumeration value="spline"/>
 *             &lt;enumeration value="beziel"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="color" type="{http://www.apromore.org/ANF}colorType" />
 *       &lt;attribute name="gradient-color" type="{http://www.apromore.org/ANF}colorType" />
 *       &lt;attribute name="gradient-rotation">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="vertical"/>
 *             &lt;enumeration value="horizontal"/>
 *             &lt;enumeration value="diagonal"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="transparency" type="{http://www.apromore.org/ANF}transparencyType" />
 *       &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="style">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="solid"/>
 *             &lt;enumeration value="dash"/>
 *             &lt;enumeration value="dot"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lineType", namespace = "http://www.apromore.org/ANF")
public class LineType
    implements Visitable
{

    @XmlAttribute(name = "shape")
    protected String shape;
    @XmlAttribute(name = "color")
    protected String color;
    @XmlAttribute(name = "gradient-color")
    protected String gradientColor;
    @XmlAttribute(name = "gradient-rotation")
    protected String gradientRotation;
    @XmlAttribute(name = "transparency")
    protected Integer transparency;
    @XmlAttribute(name = "width")
    protected BigDecimal width;
    @XmlAttribute(name = "style")
    protected String style;

    /**
     * 获取shape属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShape() {
        return shape;
    }

    /**
     * 设置shape属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShape(String value) {
        this.shape = value;
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
     * 获取gradientColor属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGradientColor() {
        return gradientColor;
    }

    /**
     * 设置gradientColor属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGradientColor(String value) {
        this.gradientColor = value;
    }

    /**
     * 获取gradientRotation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGradientRotation() {
        return gradientRotation;
    }

    /**
     * 设置gradientRotation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGradientRotation(String value) {
        this.gradientRotation = value;
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
     * 获取width属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWidth() {
        return width;
    }

    /**
     * 设置width属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWidth(BigDecimal value) {
        this.width = value;
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

    public void accept(Visitor aVisitor) {
        aVisitor.visit(this);
    }

}
