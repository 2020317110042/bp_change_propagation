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
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{http://www.wfmc.org/2002/XPDL1.0}FormalParameter" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}FormalParameter" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;choice minOccurs="0">
 *           &lt;sequence>
 *             &lt;element name="Extensions" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *             &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "content"
})
@XmlRootElement(name = "FormalParameters")
public class FormalParameters {

    @XmlElementRefs({
        @XmlElementRef(name = "FormalParameter", namespace = "http://www.wfmc.org/2002/XPDL1.0", type = org.wfmc._2002.xpdl1.FormalParameter.class, required = false),
        @XmlElementRef(name = "Extensions", namespace = "http://www.wfmc.org/2009/XPDL2.2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "FormalParameter", namespace = "http://www.wfmc.org/2009/XPDL2.2", type = org.wfmc._2009.xpdl2.FormalParameter.class, required = false)
    })
    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> content;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * 获取内容模型的其余部分。
     * 
     * <p>
     * 由于以下原因, 您获取的是此 "catch-all" 属性: 
     * 字段名称 "FormalParameter" 由模式的两个不同部分使用。请参阅: 
     * file:/D:/Apromore/Apromore-Schema/xpdl-schema/src/main/xsd/bpmnxpdl_40a_modified.xsd的第 1357 行
     * file:/D:/Apromore/Apromore-Schema/xpdl-schema/src/main/xsd/bpmnxpdl_40a_modified.xsd的第 1356 行
     * <p>
     * 要清除此属性, 请将属性定制设置应用于以下两个声明
     * 或其中一个以更改其名称: 
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
     * {@link org.wfmc._2002.xpdl1.FormalParameter }
     * {@link JAXBElement }{@code <}{@link java.lang.Object }{@code >}
     * {@link Element }
     * {@link java.lang.Object }
     * {@link org.wfmc._2009.xpdl2.FormalParameter }
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
