//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.04.18 时间 02:49:26 PM CST 
//


package de.epml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>typeGraphicsDefault complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="typeGraphicsDefault">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fill" type="{http://www.epml.de}typeFill" minOccurs="0"/>
 *         &lt;element name="line" type="{http://www.epml.de}typeLine" minOccurs="0"/>
 *         &lt;element name="font" type="{http://www.epml.de}typeFont" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeGraphicsDefault", propOrder = {
    "fill",
    "line",
    "font"
})
public class TypeGraphicsDefault {

    protected TypeFill fill;
    protected TypeLine line;
    protected TypeFont font;

    /**
     * 获取fill属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TypeFill }
     *     
     */
    public TypeFill getFill() {
        return fill;
    }

    /**
     * 设置fill属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeFill }
     *     
     */
    public void setFill(TypeFill value) {
        this.fill = value;
    }

    /**
     * 获取line属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TypeLine }
     *     
     */
    public TypeLine getLine() {
        return line;
    }

    /**
     * 设置line属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeLine }
     *     
     */
    public void setLine(TypeLine value) {
        this.line = value;
    }

    /**
     * 获取font属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TypeFont }
     *     
     */
    public TypeFont getFont() {
        return font;
    }

    /**
     * 设置font属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeFont }
     *     
     */
    public void setFont(TypeFont value) {
        this.font = value;
    }

}
