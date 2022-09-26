//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.04.18 时间 02:49:28 PM CST 
//


package org.apromore.pnml;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;


/**
 * <p>tFrom complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="tFrom">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{pnml.apromore.org}documentation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{pnml.apromore.org}literal"/>
 *           &lt;element ref="{pnml.apromore.org}query"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="expressionLanguage" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="variable" type="{pnml.apromore.org}BPELVariableName" />
 *       &lt;attribute name="part" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="property" type="{http://www.w3.org/2001/XMLSchema}QName" />
 *       &lt;attribute name="partnerLink" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="endpointReference" type="{pnml.apromore.org}tRoles" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tFrom", propOrder = {
    "content"
})
public class TFrom {

    @XmlElementRefs({
        @XmlElementRef(name = "literal", namespace = "pnml.apromore.org", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "documentation", namespace = "pnml.apromore.org", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "query", namespace = "pnml.apromore.org", type = JAXBElement.class, required = false)
    })
    @XmlMixed
    @XmlAnyElement(lax = true)
    protected List<Object> content;
    @XmlAttribute(name = "expressionLanguage")
    @XmlSchemaType(name = "anyURI")
    protected String expressionLanguage;
    @XmlAttribute(name = "variable")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String variable;
    @XmlAttribute(name = "part")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String part;
    @XmlAttribute(name = "property")
    protected QName property;
    @XmlAttribute(name = "partnerLink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String partnerLink;
    @XmlAttribute(name = "endpointReference")
    protected TRoles endpointReference;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link TLiteral }{@code >}
     * {@link JAXBElement }{@code <}{@link TQuery }{@code >}
     * {@link String }
     * {@link Element }
     * {@link Object }
     * {@link JAXBElement }{@code <}{@link TDocumentation }{@code >}
     * 
     * 
     */
    public List<Object> getContent() {
        if (content == null) {
            content = new ArrayList<Object>();
        }
        return this.content;
    }

    /**
     * 获取expressionLanguage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpressionLanguage() {
        return expressionLanguage;
    }

    /**
     * 设置expressionLanguage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpressionLanguage(String value) {
        this.expressionLanguage = value;
    }

    /**
     * 获取variable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVariable() {
        return variable;
    }

    /**
     * 设置variable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVariable(String value) {
        this.variable = value;
    }

    /**
     * 获取part属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPart() {
        return part;
    }

    /**
     * 设置part属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPart(String value) {
        this.part = value;
    }

    /**
     * 获取property属性的值。
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getProperty() {
        return property;
    }

    /**
     * 设置property属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setProperty(QName value) {
        this.property = value;
    }

    /**
     * 获取partnerLink属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerLink() {
        return partnerLink;
    }

    /**
     * 设置partnerLink属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerLink(String value) {
        this.partnerLink = value;
    }

    /**
     * 获取endpointReference属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TRoles }
     *     
     */
    public TRoles getEndpointReference() {
        return endpointReference;
    }

    /**
     * 设置endpointReference属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TRoles }
     *     
     */
    public void setEndpointReference(TRoles value) {
        this.endpointReference = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
