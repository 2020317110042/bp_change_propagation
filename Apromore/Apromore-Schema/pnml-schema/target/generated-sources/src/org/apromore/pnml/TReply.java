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
 * 
 *                 XSD Authors: The child element correlations needs to be a Local Element Declaration,
 *                 because there is another correlations element defined for the invoke activity.
 *             
 * 
 * <p>tReply complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="tReply">
 *   &lt;complexContent>
 *     &lt;extension base="{pnml.apromore.org}tActivity">
 *       &lt;sequence>
 *         &lt;element name="correlations" type="{pnml.apromore.org}tCorrelations" minOccurs="0"/>
 *         &lt;element ref="{pnml.apromore.org}toParts" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="partnerLink" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="portType" type="{http://www.w3.org/2001/XMLSchema}QName" />
 *       &lt;attribute name="operation" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="variable" type="{pnml.apromore.org}BPELVariableName" />
 *       &lt;attribute name="faultName" type="{http://www.w3.org/2001/XMLSchema}QName" />
 *       &lt;attribute name="messageExchange" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tReply", propOrder = {
    "correlations",
    "toParts"
})
public class TReply
    extends TActivity
{

    protected TCorrelations correlations;
    protected TToParts toParts;
    @XmlAttribute(name = "partnerLink", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String partnerLink;
    @XmlAttribute(name = "portType")
    protected QName portType;
    @XmlAttribute(name = "operation", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String operation;
    @XmlAttribute(name = "variable")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String variable;
    @XmlAttribute(name = "faultName")
    protected QName faultName;
    @XmlAttribute(name = "messageExchange")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String messageExchange;

    /**
     * 获取correlations属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TCorrelations }
     *     
     */
    public TCorrelations getCorrelations() {
        return correlations;
    }

    /**
     * 设置correlations属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TCorrelations }
     *     
     */
    public void setCorrelations(TCorrelations value) {
        this.correlations = value;
    }

    /**
     * 获取toParts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TToParts }
     *     
     */
    public TToParts getToParts() {
        return toParts;
    }

    /**
     * 设置toParts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TToParts }
     *     
     */
    public void setToParts(TToParts value) {
        this.toParts = value;
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
     * 获取portType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getPortType() {
        return portType;
    }

    /**
     * 设置portType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setPortType(QName value) {
        this.portType = value;
    }

    /**
     * 获取operation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperation() {
        return operation;
    }

    /**
     * 设置operation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperation(String value) {
        this.operation = value;
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
     * 获取faultName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getFaultName() {
        return faultName;
    }

    /**
     * 设置faultName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setFaultName(QName value) {
        this.faultName = value;
    }

    /**
     * 获取messageExchange属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageExchange() {
        return messageExchange;
    }

    /**
     * 设置messageExchange属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageExchange(String value) {
        this.messageExchange = value;
    }

}
