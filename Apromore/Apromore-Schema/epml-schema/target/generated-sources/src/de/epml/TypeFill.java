//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.04.18 时间 02:49:26 PM CST 
//


package de.epml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>typeFill complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="typeFill">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="color" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="image" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="gradient-color" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="gradient-rotation">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="vertical"/>
 *             &lt;enumeration value="horizontal"/>
 *             &lt;enumeration value="diagonal"/>
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
@XmlType(name = "typeFill")
public class TypeFill {

    @XmlAttribute(name = "color")
    protected String color;
    @XmlAttribute(name = "image")
    @XmlSchemaType(name = "anyURI")
    protected String image;
    @XmlAttribute(name = "gradient-color")
    protected String gradientColor;
    @XmlAttribute(name = "gradient-rotation")
    protected String gradientRotation;

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
     * 获取image属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImage() {
        return image;
    }

    /**
     * 设置image属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImage(String value) {
        this.image = value;
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

}
