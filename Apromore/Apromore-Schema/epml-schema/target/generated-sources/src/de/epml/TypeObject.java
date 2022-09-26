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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>typeObject complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="typeObject">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.epml.de}tEpcElement">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="configurableObject" type="{http://www.epml.de}typeCObject"/>
 *         &lt;/choice>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="attribute" type="{http://www.epml.de}typeAttribute"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="type" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="input"/>
 *             &lt;enumeration value="output"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="optional" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="consumed" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="initial" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="final" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeObject", propOrder = {
    "configurableObject",
    "attribute"
})
public class TypeObject
    extends TEpcElement
{

    protected TypeCObject configurableObject;
    protected List<TypeAttribute> attribute;
    @XmlAttribute(name = "type", required = true)
    protected String type;
    @XmlAttribute(name = "optional")
    protected Boolean optional;
    @XmlAttribute(name = "consumed")
    protected Boolean consumed;
    @XmlAttribute(name = "initial")
    protected Boolean initial;
    @XmlAttribute(name = "final")
    protected Boolean _final;

    /**
     * 获取configurableObject属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TypeCObject }
     *     
     */
    public TypeCObject getConfigurableObject() {
        return configurableObject;
    }

    /**
     * 设置configurableObject属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeCObject }
     *     
     */
    public void setConfigurableObject(TypeCObject value) {
        this.configurableObject = value;
    }

    /**
     * Gets the value of the attribute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attribute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttribute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeAttribute }
     * 
     * 
     */
    public List<TypeAttribute> getAttribute() {
        if (attribute == null) {
            attribute = new ArrayList<TypeAttribute>();
        }
        return this.attribute;
    }

    /**
     * 获取type属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * 设置type属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * 获取optional属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isOptional() {
        if (optional == null) {
            return false;
        } else {
            return optional;
        }
    }

    /**
     * 设置optional属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOptional(Boolean value) {
        this.optional = value;
    }

    /**
     * 获取consumed属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isConsumed() {
        if (consumed == null) {
            return false;
        } else {
            return consumed;
        }
    }

    /**
     * 设置consumed属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConsumed(Boolean value) {
        this.consumed = value;
    }

    /**
     * 获取initial属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isInitial() {
        if (initial == null) {
            return false;
        } else {
            return initial;
        }
    }

    /**
     * 设置initial属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInitial(Boolean value) {
        this.initial = value;
    }

    /**
     * 获取final属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isFinal() {
        if (_final == null) {
            return false;
        } else {
            return _final;
        }
    }

    /**
     * 设置final属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFinal(Boolean value) {
        this._final = value;
    }

}
