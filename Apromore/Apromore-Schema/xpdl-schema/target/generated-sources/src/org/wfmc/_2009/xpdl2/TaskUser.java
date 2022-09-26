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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}Performers" minOccurs="0"/>
 *         &lt;element name="MessageIn" type="{http://www.wfmc.org/2009/XPDL2.2}MessageType" minOccurs="0"/>
 *         &lt;element name="MessageOut" type="{http://www.wfmc.org/2009/XPDL2.2}MessageType" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}WebServiceOperation" minOccurs="0"/>
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Implementation" default="WebService">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="WebService"/>
 *             &lt;enumeration value="Other"/>
 *             &lt;enumeration value="Unspecified"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
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
    "performers",
    "messageIn",
    "messageOut",
    "webServiceOperation",
    "any"
})
@XmlRootElement(name = "TaskUser")
public class TaskUser {

    @XmlElement(name = "Performers")
    protected Performers performers;
    @XmlElement(name = "MessageIn")
    protected MessageType messageIn;
    @XmlElement(name = "MessageOut")
    protected MessageType messageOut;
    @XmlElement(name = "WebServiceOperation")
    protected WebServiceOperation webServiceOperation;
    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;
    @XmlAttribute(name = "Implementation")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String implementation;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * 获取performers属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Performers }
     *     
     */
    public Performers getPerformers() {
        return performers;
    }

    /**
     * 设置performers属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Performers }
     *     
     */
    public void setPerformers(Performers value) {
        this.performers = value;
    }

    /**
     * 获取messageIn属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MessageType }
     *     
     */
    public MessageType getMessageIn() {
        return messageIn;
    }

    /**
     * 设置messageIn属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MessageType }
     *     
     */
    public void setMessageIn(MessageType value) {
        this.messageIn = value;
    }

    /**
     * 获取messageOut属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MessageType }
     *     
     */
    public MessageType getMessageOut() {
        return messageOut;
    }

    /**
     * 设置messageOut属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MessageType }
     *     
     */
    public void setMessageOut(MessageType value) {
        this.messageOut = value;
    }

    /**
     * 获取webServiceOperation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WebServiceOperation }
     *     
     */
    public WebServiceOperation getWebServiceOperation() {
        return webServiceOperation;
    }

    /**
     * 设置webServiceOperation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WebServiceOperation }
     *     
     */
    public void setWebServiceOperation(WebServiceOperation value) {
        this.webServiceOperation = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link java.lang.Object }
     * {@link Element }
     * 
     * 
     */
    public List<java.lang.Object> getAny() {
        if (any == null) {
            any = new ArrayList<java.lang.Object>();
        }
        return this.any;
    }

    /**
     * 获取implementation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImplementation() {
        if (implementation == null) {
            return "WebService";
        } else {
            return implementation;
        }
    }

    /**
     * 设置implementation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImplementation(String value) {
        this.implementation = value;
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
