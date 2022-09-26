//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.04.18 时间 02:49:28 PM CST 
//


package org.apromore.pnml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * <p>tPartnerLink complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="tPartnerLink">
 *   &lt;complexContent>
 *     &lt;extension base="{pnml.apromore.org}tExtensibleElements">
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="partnerLinkType" use="required" type="{http://www.w3.org/2001/XMLSchema}QName" />
 *       &lt;attribute name="myRole" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="partnerRole" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="initializePartnerRole" type="{pnml.apromore.org}tBoolean" />
 *       &lt;attribute name="WSDL" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tPartnerLink")
public class TPartnerLink
    extends TExtensibleElements
{

    @XmlAttribute(name = "name", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String name;
    @XmlAttribute(name = "partnerLinkType", required = true)
    protected QName partnerLinkType;
    @XmlAttribute(name = "myRole")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String myRole;
    @XmlAttribute(name = "partnerRole")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String partnerRole;
    @XmlAttribute(name = "initializePartnerRole")
    protected TBoolean initializePartnerRole;
    @XmlAttribute(name = "WSDL")
    protected String wsdl;

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
     * 获取partnerLinkType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getPartnerLinkType() {
        return partnerLinkType;
    }

    /**
     * 设置partnerLinkType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setPartnerLinkType(QName value) {
        this.partnerLinkType = value;
    }

    /**
     * 获取myRole属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMyRole() {
        return myRole;
    }

    /**
     * 设置myRole属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMyRole(String value) {
        this.myRole = value;
    }

    /**
     * 获取partnerRole属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerRole() {
        return partnerRole;
    }

    /**
     * 设置partnerRole属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerRole(String value) {
        this.partnerRole = value;
    }

    /**
     * 获取initializePartnerRole属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TBoolean }
     *     
     */
    public TBoolean getInitializePartnerRole() {
        return initializePartnerRole;
    }

    /**
     * 设置initializePartnerRole属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TBoolean }
     *     
     */
    public void setInitializePartnerRole(TBoolean value) {
        this.initializePartnerRole = value;
    }

    /**
     * 获取wsdl属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWSDL() {
        return wsdl;
    }

    /**
     * 设置wsdl属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWSDL(String value) {
        this.wsdl = value;
    }

}
