//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.04.18 时间 02:49:31 PM CST 
//


package org.apromore.rlf;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>RelationsType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RelationsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Relation" type="{http://www.apromore.org/RLF}RelationType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="uri" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="npfUri" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="npfVersion" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="cpfUri" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="cpfVersion" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelationsType", propOrder = {
    "relation"
})
public class RelationsType {

    @XmlElement(name = "Relation", required = true)
    protected List<RelationType> relation;
    @XmlAttribute(name = "uri", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String uri;
    @XmlAttribute(name = "version", required = true)
    protected BigDecimal version;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "npfUri", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String npfUri;
    @XmlAttribute(name = "npfVersion", required = true)
    protected BigDecimal npfVersion;
    @XmlAttribute(name = "cpfUri", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String cpfUri;
    @XmlAttribute(name = "cpfVersion", required = true)
    protected BigDecimal cpfVersion;

    /**
     * Gets the value of the relation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelationType }
     * 
     * 
     */
    public List<RelationType> getRelation() {
        if (relation == null) {
            relation = new ArrayList<RelationType>();
        }
        return this.relation;
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
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVersion() {
        return version;
    }

    /**
     * 设置version属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVersion(BigDecimal value) {
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
     * 获取npfUri属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNpfUri() {
        return npfUri;
    }

    /**
     * 设置npfUri属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNpfUri(String value) {
        this.npfUri = value;
    }

    /**
     * 获取npfVersion属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNpfVersion() {
        return npfVersion;
    }

    /**
     * 设置npfVersion属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNpfVersion(BigDecimal value) {
        this.npfVersion = value;
    }

    /**
     * 获取cpfUri属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpfUri() {
        return cpfUri;
    }

    /**
     * 设置cpfUri属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpfUri(String value) {
        this.cpfUri = value;
    }

    /**
     * 获取cpfVersion属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCpfVersion() {
        return cpfVersion;
    }

    /**
     * 设置cpfVersion属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCpfVersion(BigDecimal value) {
        this.cpfVersion = value;
    }

}
