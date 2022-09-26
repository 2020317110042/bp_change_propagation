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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>tActivity complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="tActivity">
 *   &lt;complexContent>
 *     &lt;extension base="{pnml.apromore.org}tExtensibleElements">
 *       &lt;sequence>
 *         &lt;element ref="{pnml.apromore.org}targets" minOccurs="0"/>
 *         &lt;element ref="{pnml.apromore.org}sources" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="suppressJoinFailure" type="{pnml.apromore.org}tBoolean" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tActivity", propOrder = {
    "targets",
    "sources"
})
@XmlSeeAlso({
    TWait.class,
    TInvoke.class,
    TEmpty.class,
    TReply.class,
    TReceive.class,
    TAssign.class
})
public class TActivity
    extends TExtensibleElements
{

    protected TTargets targets;
    protected TSources sources;
    @XmlAttribute(name = "name")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String name;
    @XmlAttribute(name = "suppressJoinFailure")
    protected TBoolean suppressJoinFailure;

    /**
     * 获取targets属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TTargets }
     *     
     */
    public TTargets getTargets() {
        return targets;
    }

    /**
     * 设置targets属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TTargets }
     *     
     */
    public void setTargets(TTargets value) {
        this.targets = value;
    }

    /**
     * 获取sources属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TSources }
     *     
     */
    public TSources getSources() {
        return sources;
    }

    /**
     * 设置sources属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TSources }
     *     
     */
    public void setSources(TSources value) {
        this.sources = value;
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
     * 获取suppressJoinFailure属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TBoolean }
     *     
     */
    public TBoolean getSuppressJoinFailure() {
        return suppressJoinFailure;
    }

    /**
     * 设置suppressJoinFailure属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TBoolean }
     *     
     */
    public void setSuppressJoinFailure(TBoolean value) {
        this.suppressJoinFailure = value;
    }

}
