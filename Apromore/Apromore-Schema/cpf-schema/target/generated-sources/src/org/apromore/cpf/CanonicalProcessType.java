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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 			
 * A Canonical Process is the container for a set of Nets, ResourceTypes and Objects.
 * 
 *             
 * 
 * <p>CanonicalProcessType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CanonicalProcessType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Net" type="{http://www.apromore.org/CPF}NetType" maxOccurs="unbounded"/>
 *         &lt;element name="ResourceType" type="{http://www.apromore.org/CPF}ResourceTypeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="dataTypes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="attribute" type="{http://www.apromore.org/CPF}typeAttribute" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="uri" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="author" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="creationDate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="modificationDate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="rootIds" type="{http://www.apromore.org/CPF}IdListType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CanonicalProcessType", namespace = "http://www.apromore.org/CPF", propOrder = {
    "net",
    "resourceType",
    "dataTypes",
    "attribute"
})
public class CanonicalProcessType
    implements Visitable
{

    @XmlElement(name = "Net", required = true)
    protected List<NetType> net;
    @XmlElement(name = "ResourceType")
    protected List<ResourceTypeType> resourceType;
    protected String dataTypes;
    protected List<TypeAttribute> attribute;
    @XmlAttribute(name = "uri", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String uri;
    @XmlAttribute(name = "version", required = true)
    protected String version;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "author")
    protected String author;
    @XmlAttribute(name = "creationDate")
    protected String creationDate;
    @XmlAttribute(name = "modificationDate")
    protected String modificationDate;
    @XmlAttribute(name = "rootIds")
    protected List<String> rootIds;

    /**
     * Gets the value of the net property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the net property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NetType }
     * 
     * 
     */
    public List<NetType> getNet() {
        if (net == null) {
            net = new ArrayList<NetType>();
        }
        return this.net;
    }

    /**
     * Gets the value of the resourceType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resourceType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResourceType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResourceTypeType }
     * 
     * 
     */
    public List<ResourceTypeType> getResourceType() {
        if (resourceType == null) {
            resourceType = new ArrayList<ResourceTypeType>();
        }
        return this.resourceType;
    }

    /**
     * 获取dataTypes属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataTypes() {
        return dataTypes;
    }

    /**
     * 设置dataTypes属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataTypes(String value) {
        this.dataTypes = value;
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
     * 获取uri属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUri() {
        return uri;
    }

    /**
     * 设置uri属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUri(String value) {
        this.uri = value;
    }

    /**
     * 获取version属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * 设置version属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

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
     * 获取author属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthor() {
        return author;
    }

    /**
     * 设置author属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthor(String value) {
        this.author = value;
    }

    /**
     * 获取creationDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreationDate() {
        return creationDate;
    }

    /**
     * 设置creationDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreationDate(String value) {
        this.creationDate = value;
    }

    /**
     * 获取modificationDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModificationDate() {
        return modificationDate;
    }

    /**
     * 设置modificationDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModificationDate(String value) {
        this.modificationDate = value;
    }

    /**
     * Gets the value of the rootIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rootIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRootIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRootIds() {
        if (rootIds == null) {
            rootIds = new ArrayList<String>();
        }
        return this.rootIds;
    }

    public void accept(Visitor aVisitor) {
        aVisitor.visit(this);
    }

}
