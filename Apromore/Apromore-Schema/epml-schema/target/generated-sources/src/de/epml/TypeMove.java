//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.04.18 时间 02:49:26 PM CST 
//


package de.epml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>typeMove complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="typeMove">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="position" type="{http://www.epml.de}typeMove2" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "typeMove", propOrder = {
    "position",
    "line",
    "font"
})
public class TypeMove {

    protected List<TypeMove2> position;
    protected TypeLine line;
    protected TypeFont font;

    /**
     * Gets the value of the position property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the position property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPosition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeMove2 }
     * 
     * 
     */
    public List<TypeMove2> getPosition() {
        if (position == null) {
            position = new ArrayList<TypeMove2>();
        }
        return this.position;
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
