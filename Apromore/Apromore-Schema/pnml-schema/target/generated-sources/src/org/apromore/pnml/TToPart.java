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


/**
 * <p>tToPart complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="tToPart">
 *   &lt;complexContent>
 *     &lt;extension base="{pnml.apromore.org}tExtensibleElements">
 *       &lt;attribute name="part" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="fromVariable" use="required" type="{pnml.apromore.org}BPELVariableName" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tToPart")
public class TToPart
    extends TExtensibleElements
{

    @XmlAttribute(name = "part", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String part;
    @XmlAttribute(name = "fromVariable", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String fromVariable;

    /**
     * 获取part属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPart() {
        return part;
    }

    /**
     * 设置part属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPart(String value) {
        this.part = value;
    }

    /**
     * 获取fromVariable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromVariable() {
        return fromVariable;
    }

    /**
     * 设置fromVariable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromVariable(String value) {
        this.fromVariable = value;
    }

}
