//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.04.18 时间 02:49:32 PM CST 
//


package org.wfmc._2002.xpdl1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.wfmc.org/2002/XPDL1.0}Author" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2002/XPDL1.0}Version" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2002/XPDL1.0}Codepage" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2002/XPDL1.0}Countrykey" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2002/XPDL1.0}Responsibles" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="PublicationStatus">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="UNDER_REVISION"/>
 *             &lt;enumeration value="RELEASED"/>
 *             &lt;enumeration value="UNDER_TEST"/>
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
@XmlType(name = "", propOrder = {
    "author",
    "version",
    "codepage",
    "countrykey",
    "responsibles"
})
@XmlRootElement(name = "RedefinableHeader")
public class RedefinableHeader {

    @XmlElement(name = "Author")
    protected String author;
    @XmlElement(name = "Version")
    protected String version;
    @XmlElement(name = "Codepage")
    protected String codepage;
    @XmlElement(name = "Countrykey")
    protected String countrykey;
    @XmlElement(name = "Responsibles")
    protected Responsibles responsibles;
    @XmlAttribute(name = "PublicationStatus")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String publicationStatus;

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
     * 获取codepage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodepage() {
        return codepage;
    }

    /**
     * 设置codepage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodepage(String value) {
        this.codepage = value;
    }

    /**
     * 获取countrykey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountrykey() {
        return countrykey;
    }

    /**
     * 设置countrykey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountrykey(String value) {
        this.countrykey = value;
    }

    /**
     * 获取responsibles属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Responsibles }
     *     
     */
    public Responsibles getResponsibles() {
        return responsibles;
    }

    /**
     * 设置responsibles属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Responsibles }
     *     
     */
    public void setResponsibles(Responsibles value) {
        this.responsibles = value;
    }

    /**
     * 获取publicationStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublicationStatus() {
        return publicationStatus;
    }

    /**
     * 设置publicationStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicationStatus(String value) {
        this.publicationStatus = value;
    }

}
