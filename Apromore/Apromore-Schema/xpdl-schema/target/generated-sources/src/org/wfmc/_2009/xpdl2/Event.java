//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.04.18 时间 02:49:32 PM CST 
//


package org.wfmc._2009.xpdl2;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}StartEvent" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}IntermediateEvent" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}EndEvent" minOccurs="0"/>
 *       &lt;/choice>
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
    "startEvent",
    "intermediateEvent",
    "endEvent"
})
@XmlRootElement(name = "Event")
public class Event {

    @XmlElement(name = "StartEvent")
    protected StartEvent startEvent;
    @XmlElement(name = "IntermediateEvent")
    protected IntermediateEvent intermediateEvent;
    @XmlElement(name = "EndEvent")
    protected EndEvent endEvent;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * 获取startEvent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link StartEvent }
     *     
     */
    public StartEvent getStartEvent() {
        return startEvent;
    }

    /**
     * 设置startEvent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link StartEvent }
     *     
     */
    public void setStartEvent(StartEvent value) {
        this.startEvent = value;
    }

    /**
     * 获取intermediateEvent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link IntermediateEvent }
     *     
     */
    public IntermediateEvent getIntermediateEvent() {
        return intermediateEvent;
    }

    /**
     * 设置intermediateEvent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link IntermediateEvent }
     *     
     */
    public void setIntermediateEvent(IntermediateEvent value) {
        this.intermediateEvent = value;
    }

    /**
     * 获取endEvent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EndEvent }
     *     
     */
    public EndEvent getEndEvent() {
        return endEvent;
    }

    /**
     * 设置endEvent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EndEvent }
     *     
     */
    public void setEndEvent(EndEvent value) {
        this.endEvent = value;
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
