//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.04.18 时间 02:49:23 PM CST 
//


package org.apromore.cpf;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>objectRefType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="objectRefType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="attribute" type="{http://www.apromore.org/CPF}typeAttribute" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="objectId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="type" type="{http://www.apromore.org/CPF}InputOutputType" />
 *       &lt;attribute name="optional" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="consumed" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "objectRefType", namespace = "http://www.apromore.org/CPF", propOrder = {
    "attribute"
})
public class ObjectRefType
    implements Visitable
{

    protected List<TypeAttribute> attribute;
    @XmlAttribute(name = "id")
    protected String id;
    @XmlAttribute(name = "objectId")
    protected String objectId;
    @XmlAttribute(name = "type")
    protected InputOutputType type;
    @XmlAttribute(name = "optional")
    protected Boolean optional;
    @XmlAttribute(name = "consumed")
    protected Boolean consumed;

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
     * 获取id属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * 设置id属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * 获取objectId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectId() {
        return objectId;
    }

    /**
     * 设置objectId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectId(String value) {
        this.objectId = value;
    }

    /**
     * 获取type属性的值。
     * 
     * @return
     *     possible object is
     *     {@link InputOutputType }
     *     
     */
    public InputOutputType getType() {
        return type;
    }

    /**
     * 设置type属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link InputOutputType }
     *     
     */
    public void setType(InputOutputType value) {
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

    public void accept(Visitor aVisitor) {
        aVisitor.visit(this);
    }

}
