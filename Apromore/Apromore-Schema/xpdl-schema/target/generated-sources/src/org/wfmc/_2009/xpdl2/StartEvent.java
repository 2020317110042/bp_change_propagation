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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
 *       &lt;choice minOccurs="0">
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}TriggerResultMessage" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}TriggerTimer" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}ResultError" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}TriggerEscalation" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}TriggerResultCompensation" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}TriggerConditional" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}TriggerResultSignal" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}TriggerMultiple" minOccurs="0"/>
 *       &lt;/choice>
 *       &lt;attribute name="Trigger" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="None"/>
 *             &lt;enumeration value="Message"/>
 *             &lt;enumeration value="Timer"/>
 *             &lt;enumeration value="Error"/>
 *             &lt;enumeration value="Escalation"/>
 *             &lt;enumeration value="Compensation"/>
 *             &lt;enumeration value="Conditional"/>
 *             &lt;enumeration value="Signal"/>
 *             &lt;enumeration value="Multiple"/>
 *             &lt;enumeration value="ParallelMultiple"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Implementation" default="WebService">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="WebService"/>
 *             &lt;enumeration value="Other"/>
 *             &lt;enumeration value="Unspecified"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Interrupting" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
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
    "triggerResultMessage",
    "triggerTimer",
    "resultError",
    "triggerEscalation",
    "triggerResultCompensation",
    "triggerConditional",
    "triggerResultSignal",
    "triggerMultiple"
})
@XmlRootElement(name = "StartEvent")
public class StartEvent {

    @XmlElement(name = "TriggerResultMessage")
    protected TriggerResultMessage triggerResultMessage;
    @XmlElement(name = "TriggerTimer")
    protected TriggerTimer triggerTimer;
    @XmlElement(name = "ResultError")
    protected ResultError resultError;
    @XmlElement(name = "TriggerEscalation")
    protected TriggerEscalation triggerEscalation;
    @XmlElement(name = "TriggerResultCompensation")
    protected TriggerResultCompensation triggerResultCompensation;
    @XmlElement(name = "TriggerConditional")
    protected TriggerConditional triggerConditional;
    @XmlElement(name = "TriggerResultSignal")
    protected TriggerResultSignal triggerResultSignal;
    @XmlElement(name = "TriggerMultiple")
    protected TriggerMultiple triggerMultiple;
    @XmlAttribute(name = "Trigger", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String trigger;
    @XmlAttribute(name = "Implementation")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String implementation;
    @XmlAttribute(name = "Interrupting")
    protected Boolean interrupting;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * 获取triggerResultMessage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TriggerResultMessage }
     *     
     */
    public TriggerResultMessage getTriggerResultMessage() {
        return triggerResultMessage;
    }

    /**
     * 设置triggerResultMessage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TriggerResultMessage }
     *     
     */
    public void setTriggerResultMessage(TriggerResultMessage value) {
        this.triggerResultMessage = value;
    }

    /**
     * 获取triggerTimer属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TriggerTimer }
     *     
     */
    public TriggerTimer getTriggerTimer() {
        return triggerTimer;
    }

    /**
     * 设置triggerTimer属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TriggerTimer }
     *     
     */
    public void setTriggerTimer(TriggerTimer value) {
        this.triggerTimer = value;
    }

    /**
     * 获取resultError属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ResultError }
     *     
     */
    public ResultError getResultError() {
        return resultError;
    }

    /**
     * 设置resultError属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ResultError }
     *     
     */
    public void setResultError(ResultError value) {
        this.resultError = value;
    }

    /**
     * 获取triggerEscalation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TriggerEscalation }
     *     
     */
    public TriggerEscalation getTriggerEscalation() {
        return triggerEscalation;
    }

    /**
     * 设置triggerEscalation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TriggerEscalation }
     *     
     */
    public void setTriggerEscalation(TriggerEscalation value) {
        this.triggerEscalation = value;
    }

    /**
     * 获取triggerResultCompensation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TriggerResultCompensation }
     *     
     */
    public TriggerResultCompensation getTriggerResultCompensation() {
        return triggerResultCompensation;
    }

    /**
     * 设置triggerResultCompensation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TriggerResultCompensation }
     *     
     */
    public void setTriggerResultCompensation(TriggerResultCompensation value) {
        this.triggerResultCompensation = value;
    }

    /**
     * 获取triggerConditional属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TriggerConditional }
     *     
     */
    public TriggerConditional getTriggerConditional() {
        return triggerConditional;
    }

    /**
     * 设置triggerConditional属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TriggerConditional }
     *     
     */
    public void setTriggerConditional(TriggerConditional value) {
        this.triggerConditional = value;
    }

    /**
     * 获取triggerResultSignal属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TriggerResultSignal }
     *     
     */
    public TriggerResultSignal getTriggerResultSignal() {
        return triggerResultSignal;
    }

    /**
     * 设置triggerResultSignal属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TriggerResultSignal }
     *     
     */
    public void setTriggerResultSignal(TriggerResultSignal value) {
        this.triggerResultSignal = value;
    }

    /**
     * 获取triggerMultiple属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TriggerMultiple }
     *     
     */
    public TriggerMultiple getTriggerMultiple() {
        return triggerMultiple;
    }

    /**
     * 设置triggerMultiple属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TriggerMultiple }
     *     
     */
    public void setTriggerMultiple(TriggerMultiple value) {
        this.triggerMultiple = value;
    }

    /**
     * 获取trigger属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrigger() {
        return trigger;
    }

    /**
     * 设置trigger属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrigger(String value) {
        this.trigger = value;
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
     * 获取interrupting属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isInterrupting() {
        if (interrupting == null) {
            return true;
        } else {
            return interrupting;
        }
    }

    /**
     * 设置interrupting属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInterrupting(Boolean value) {
        this.interrupting = value;
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
