//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.04.18 时间 02:49:28 PM CST 
//


package org.apromore.pnml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Extension see "http://www.informatik.hu-berlin.de/top/pntd/ptNetb"
 * 
 * <p>arcInscriptionType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="arcInscriptionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="graphics" type="{pnml.apromore.org}annotationGraphisType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "arcInscriptionType", propOrder = {
    "text",
    "graphics"
})
public class ArcInscriptionType {

    @XmlElement(required = true)
    protected String text;
    @XmlElement(required = true)
    protected AnnotationGraphisType graphics;

    /**
     * 获取text属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * 设置text属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
    }

    /**
     * 获取graphics属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AnnotationGraphisType }
     *     
     */
    public AnnotationGraphisType getGraphics() {
        return graphics;
    }

    /**
     * 设置graphics属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AnnotationGraphisType }
     *     
     */
    public void setGraphics(AnnotationGraphisType value) {
        this.graphics = value;
    }

}
