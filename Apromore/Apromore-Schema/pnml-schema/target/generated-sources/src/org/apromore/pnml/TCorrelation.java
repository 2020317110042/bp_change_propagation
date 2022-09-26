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
 * <p>tCorrelation complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="tCorrelation">
 *   &lt;complexContent>
 *     &lt;extension base="{pnml.apromore.org}tExtensibleElements">
 *       &lt;attribute name="set" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="initiate" type="{pnml.apromore.org}tInitiate" default="no" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tCorrelation")
@XmlSeeAlso({
    TCorrelationWithPattern.class
})
public class TCorrelation
    extends TExtensibleElements
{

    @XmlAttribute(name = "set", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String set;
    @XmlAttribute(name = "initiate")
    protected TInitiate initiate;

    /**
     * 获取set属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSet() {
        return set;
    }

    /**
     * 设置set属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSet(String value) {
        this.set = value;
    }

    /**
     * 获取initiate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TInitiate }
     *     
     */
    public TInitiate getInitiate() {
        if (initiate == null) {
            return TInitiate.NO;
        } else {
            return initiate;
        }
    }

    /**
     * 设置initiate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TInitiate }
     *     
     */
    public void setInitiate(TInitiate value) {
        this.initiate = value;
    }

}
