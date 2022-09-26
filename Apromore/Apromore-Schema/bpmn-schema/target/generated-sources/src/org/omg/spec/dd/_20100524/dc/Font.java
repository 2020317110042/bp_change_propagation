//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.04.18 时间 02:49:16 PM CST 
//


package org.omg.spec.dd._20100524.dc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import com.sun.xml.bind.Locatable;
import com.sun.xml.bind.annotation.XmlLocation;
import org.omg.spec.bpmn._20100524.model.Visitable;
import org.omg.spec.bpmn._20100524.model.Visitor;
import org.xml.sax.Locator;


/**
 * <p>Font complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Font">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="size" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="isBold" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="isItalic" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="isUnderline" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="isStrikeThrough" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Font")
public class Font implements Locatable, Visitable
{

    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "size")
    protected Double size;
    @XmlAttribute(name = "isBold")
    protected Boolean isBold;
    @XmlAttribute(name = "isItalic")
    protected Boolean isItalic;
    @XmlAttribute(name = "isUnderline")
    protected Boolean isUnderline;
    @XmlAttribute(name = "isStrikeThrough")
    protected Boolean isStrikeThrough;
    @XmlLocation
    @XmlTransient
    protected Locator locator;

    /**
     * 获取name属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * 设置name属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * 获取size属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSize() {
        return size;
    }

    /**
     * 设置size属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSize(Double value) {
        this.size = value;
    }

    /**
     * 获取isBold属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsBold() {
        return isBold;
    }

    /**
     * 设置isBold属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsBold(Boolean value) {
        this.isBold = value;
    }

    /**
     * 获取isItalic属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsItalic() {
        return isItalic;
    }

    /**
     * 设置isItalic属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsItalic(Boolean value) {
        this.isItalic = value;
    }

    /**
     * 获取isUnderline属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsUnderline() {
        return isUnderline;
    }

    /**
     * 设置isUnderline属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsUnderline(Boolean value) {
        this.isUnderline = value;
    }

    /**
     * 获取isStrikeThrough属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsStrikeThrough() {
        return isStrikeThrough;
    }

    /**
     * 设置isStrikeThrough属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsStrikeThrough(Boolean value) {
        this.isStrikeThrough = value;
    }

    public Locator sourceLocation() {
        return locator;
    }

    public void setSourceLocation(Locator newLocator) {
        locator = newLocator;
    }

    public void accept(Visitor aVisitor) {
        aVisitor.visit(this);
    }

}
