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
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * <p>tCatch complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="tCatch">
 *   &lt;complexContent>
 *     &lt;extension base="{pnml.apromore.org}tActivityContainer">
 *       &lt;attribute name="faultName" type="{http://www.w3.org/2001/XMLSchema}QName" />
 *       &lt;attribute name="faultVariable" type="{pnml.apromore.org}BPELVariableName" />
 *       &lt;attribute name="faultMessageType" type="{http://www.w3.org/2001/XMLSchema}QName" />
 *       &lt;attribute name="faultElement" type="{http://www.w3.org/2001/XMLSchema}QName" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tCatch")
public class TCatch
    extends TActivityContainer
{

    @XmlAttribute(name = "faultName")
    protected QName faultName;
    @XmlAttribute(name = "faultVariable")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String faultVariable;
    @XmlAttribute(name = "faultMessageType")
    protected QName faultMessageType;
    @XmlAttribute(name = "faultElement")
    protected QName faultElement;

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
     * 获取faultVariable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaultVariable() {
        return faultVariable;
    }

    /**
     * 设置faultVariable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaultVariable(String value) {
        this.faultVariable = value;
    }

    /**
     * 获取faultMessageType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getFaultMessageType() {
        return faultMessageType;
    }

    /**
     * 设置faultMessageType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setFaultMessageType(QName value) {
        this.faultMessageType = value;
    }

    /**
     * 获取faultElement属性的值。
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getFaultElement() {
        return faultElement;
    }

    /**
     * 设置faultElement属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setFaultElement(QName value) {
        this.faultElement = value;
    }

}
