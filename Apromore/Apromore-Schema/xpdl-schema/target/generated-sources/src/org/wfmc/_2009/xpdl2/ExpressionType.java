//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.04.18 时间 02:49:32 PM CST 
//


package org.wfmc._2009.xpdl2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;


/**
 * <p>ExpressionType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ExpressionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/choice>
 *       &lt;attribute name="ScriptType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ScriptVersion" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ScriptGrammar" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExpressionType", propOrder = {
    "content"
})
public class ExpressionType {

    @XmlMixed
    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> content;
    @XmlAttribute(name = "ScriptType")
    protected String scriptType;
    @XmlAttribute(name = "ScriptVersion")
    protected String scriptVersion;
    @XmlAttribute(name = "ScriptGrammar")
    @XmlSchemaType(name = "anyURI")
    protected String scriptGrammar;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link java.lang.Object }
     * {@link String }
     * {@link Element }
     * 
     * 
     */
    public List<java.lang.Object> getContent() {
        if (content == null) {
            content = new ArrayList<java.lang.Object>();
        }
        return this.content;
    }

    /**
     * 获取scriptType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScriptType() {
        return scriptType;
    }

    /**
     * 设置scriptType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScriptType(String value) {
        this.scriptType = value;
    }

    /**
     * 获取scriptVersion属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScriptVersion() {
        return scriptVersion;
    }

    /**
     * 设置scriptVersion属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScriptVersion(String value) {
        this.scriptVersion = value;
    }

    /**
     * 获取scriptGrammar属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScriptGrammar() {
        return scriptGrammar;
    }

    /**
     * 设置scriptGrammar属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScriptGrammar(String value) {
        this.scriptGrammar = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
