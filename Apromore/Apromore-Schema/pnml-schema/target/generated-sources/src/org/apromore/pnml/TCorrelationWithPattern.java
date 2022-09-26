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


/**
 * <p>tCorrelationWithPattern complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="tCorrelationWithPattern">
 *   &lt;complexContent>
 *     &lt;extension base="{pnml.apromore.org}tCorrelation">
 *       &lt;attribute name="pattern" type="{pnml.apromore.org}tPattern" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tCorrelationWithPattern")
public class TCorrelationWithPattern
    extends TCorrelation
{

    @XmlAttribute(name = "pattern")
    protected TPattern pattern;

    /**
     * 获取pattern属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TPattern }
     *     
     */
    public TPattern getPattern() {
        return pattern;
    }

    /**
     * 设置pattern属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TPattern }
     *     
     */
    public void setPattern(TPattern value) {
        this.pattern = value;
    }

}
