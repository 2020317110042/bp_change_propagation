//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.04.18 时间 02:49:26 PM CST 
//


package de.epml;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>tEpcElement complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="tEpcElement">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.epml.de}tExtensibleElements">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="graphics" type="{http://www.epml.de}typeGraphics"/>
 *         &lt;/choice>
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="defRef" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tEpcElement", propOrder = {
    "name",
    "description",
    "graphics",
    "any"
})
@XmlSeeAlso({
    TypeRANGE.class,
    TypeEvent.class,
    TypeObject.class,
    TypeFunction.class,
    TypeOR.class,
    TypeAND.class,
    TypeXOR.class,
    TypeProcessInterface.class,
    TypeRole.class
})
public class TEpcElement
    extends TExtensibleElements
{

    protected String name;
    protected String description;
    protected TypeGraphics graphics;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAttribute(name = "id", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger id;
    @XmlAttribute(name = "defRef")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger defRef;

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
     * 获取description属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置description属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * 获取graphics属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TypeGraphics }
     *     
     */
    public TypeGraphics getGraphics() {
        return graphics;
    }

    /**
     * 设置graphics属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeGraphics }
     *     
     */
    public void setGraphics(TypeGraphics value) {
        this.graphics = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * {@link Element }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

    /**
     * 获取id属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getId() {
        return id;
    }

    /**
     * 设置id属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setId(BigInteger value) {
        this.id = value;
    }

    /**
     * 获取defRef属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDefRef() {
        return defRef;
    }

    /**
     * 设置defRef属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDefRef(BigInteger value) {
        this.defRef = value;
    }

}
