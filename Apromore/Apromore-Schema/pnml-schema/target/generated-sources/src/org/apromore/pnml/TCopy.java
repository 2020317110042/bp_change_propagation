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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>tCopy complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="tCopy">
 *   &lt;complexContent>
 *     &lt;extension base="{pnml.apromore.org}tExtensibleElements">
 *       &lt;sequence>
 *         &lt;element ref="{pnml.apromore.org}from"/>
 *         &lt;element ref="{pnml.apromore.org}to"/>
 *       &lt;/sequence>
 *       &lt;attribute name="keepSrcElementName" type="{pnml.apromore.org}tBoolean" default="no" />
 *       &lt;attribute name="ignoreMissingFromData" type="{pnml.apromore.org}tBoolean" default="no" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tCopy", propOrder = {
    "from",
    "to"
})
public class TCopy
    extends TExtensibleElements
{

    @XmlElement(required = true)
    protected TFrom from;
    @XmlElement(required = true)
    protected TTo to;
    @XmlAttribute(name = "keepSrcElementName")
    protected TBoolean keepSrcElementName;
    @XmlAttribute(name = "ignoreMissingFromData")
    protected TBoolean ignoreMissingFromData;

    /**
     * 获取from属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TFrom }
     *     
     */
    public TFrom getFrom() {
        return from;
    }

    /**
     * 设置from属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TFrom }
     *     
     */
    public void setFrom(TFrom value) {
        this.from = value;
    }

    /**
     * 获取to属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TTo }
     *     
     */
    public TTo getTo() {
        return to;
    }

    /**
     * 设置to属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TTo }
     *     
     */
    public void setTo(TTo value) {
        this.to = value;
    }

    /**
     * 获取keepSrcElementName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TBoolean }
     *     
     */
    public TBoolean getKeepSrcElementName() {
        if (keepSrcElementName == null) {
            return TBoolean.NO;
        } else {
            return keepSrcElementName;
        }
    }

    /**
     * 设置keepSrcElementName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TBoolean }
     *     
     */
    public void setKeepSrcElementName(TBoolean value) {
        this.keepSrcElementName = value;
    }

    /**
     * 获取ignoreMissingFromData属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TBoolean }
     *     
     */
    public TBoolean getIgnoreMissingFromData() {
        if (ignoreMissingFromData == null) {
            return TBoolean.NO;
        } else {
            return ignoreMissingFromData;
        }
    }

    /**
     * 设置ignoreMissingFromData属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TBoolean }
     *     
     */
    public void setIgnoreMissingFromData(TBoolean value) {
        this.ignoreMissingFromData = value;
    }

}
