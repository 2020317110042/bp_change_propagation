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
import javax.xml.bind.annotation.XmlSchemaType;
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
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="Message" type="{http://www.wfmc.org/2009/XPDL2.2}MessageType" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}Object" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}ConnectorGraphicsInfos" minOccurs="0"/>
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Id" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Source" use="required" type="{http://www.wfmc.org/2009/XPDL2.2}IdRef" />
 *       &lt;attribute name="Target" use="required" type="{http://www.wfmc.org/2009/XPDL2.2}IdRef" />
 *       &lt;attribute name="MarkerVisible">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="INITIATING"/>
 *             &lt;enumeration value="NON_INITIATING"/>
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
    "message",
    "object",
    "connectorGraphicsInfos",
    "any"
})
@XmlRootElement(name = "MessageFlow")
public class MessageFlow {

    @XmlElement(name = "Message")
    protected MessageType message;
    @XmlElement(name = "Object")
    protected org.wfmc._2009.xpdl2.Object object;
    @XmlElement(name = "ConnectorGraphicsInfos")
    protected ConnectorGraphicsInfos connectorGraphicsInfos;
    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;
    @XmlAttribute(name = "Id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String id;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "Source", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String source;
    @XmlAttribute(name = "Target", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String target;
    @XmlAttribute(name = "MarkerVisible")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String markerVisible;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * 获取message属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MessageType }
     *     
     */
    public MessageType getMessage() {
        return message;
    }

    /**
     * 设置message属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MessageType }
     *     
     */
    public void setMessage(MessageType value) {
        this.message = value;
    }

    /**
     * 获取object属性的值。
     * 
     * @return
     *     possible object is
     *     {@link org.wfmc._2009.xpdl2.Object }
     *     
     */
    public org.wfmc._2009.xpdl2.Object getObject() {
        return object;
    }

    /**
     * 设置object属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link org.wfmc._2009.xpdl2.Object }
     *     
     */
    public void setObject(org.wfmc._2009.xpdl2.Object value) {
        this.object = value;
    }

    /**
     * 获取connectorGraphicsInfos属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ConnectorGraphicsInfos }
     *     
     */
    public ConnectorGraphicsInfos getConnectorGraphicsInfos() {
        return connectorGraphicsInfos;
    }

    /**
     * 设置connectorGraphicsInfos属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectorGraphicsInfos }
     *     
     */
    public void setConnectorGraphicsInfos(ConnectorGraphicsInfos value) {
        this.connectorGraphicsInfos = value;
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
     * 获取id属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * 设置id属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
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
     * 获取source属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * 设置source属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * 获取target属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTarget() {
        return target;
    }

    /**
     * 设置target属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTarget(String value) {
        this.target = value;
    }

    /**
     * 获取markerVisible属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarkerVisible() {
        return markerVisible;
    }

    /**
     * 设置markerVisible属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarkerVisible(String value) {
        this.markerVisible = value;
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
