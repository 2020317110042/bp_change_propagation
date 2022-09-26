//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.04.18 时间 02:49:28 PM CST 
//


package org.apromore.pnml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>transitionToolspecificType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="transitionToolspecificType">
 *   &lt;complexContent>
 *     &lt;extension base="{pnml.apromore.org}toolspecificType">
 *       &lt;sequence>
 *         &lt;element name="trigger" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{pnml.apromore.org}triggerType">
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="operator" type="{pnml.apromore.org}operatorType"/>
 *           &lt;element name="subprocess" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;/choice>
 *         &lt;element name="transitionResource" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{pnml.apromore.org}transitionResourceType">
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="time" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="timeUnit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="orientation" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{pnml.apromore.org}assign"/>
 *           &lt;element ref="{pnml.apromore.org}invoke"/>
 *           &lt;element ref="{pnml.apromore.org}reply"/>
 *           &lt;element ref="{pnml.apromore.org}wait"/>
 *           &lt;element ref="{pnml.apromore.org}receive"/>
 *           &lt;element ref="{pnml.apromore.org}empty"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transitionToolspecificType", propOrder = {
    "trigger",
    "operator",
    "subprocess",
    "transitionResource",
    "time",
    "timeUnit",
    "orientation",
    "assign",
    "invoke",
    "reply",
    "wait",
    "receive",
    "empty"
})
public class TransitionToolspecificType
    extends ToolspecificType
{

    protected TransitionToolspecificType.Trigger trigger;
    protected OperatorType operator;
    protected Boolean subprocess;
    protected TransitionToolspecificType.TransitionResource transitionResource;
    protected Integer time;
    protected Integer timeUnit;
    protected Integer orientation;
    protected TAssign assign;
    protected TInvoke invoke;
    protected TReply reply;
    protected TWait wait;
    protected TReceive receive;
    protected TEmpty empty;

    /**
     * 获取trigger属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TransitionToolspecificType.Trigger }
     *     
     */
    public TransitionToolspecificType.Trigger getTrigger() {
        return trigger;
    }

    /**
     * 设置trigger属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TransitionToolspecificType.Trigger }
     *     
     */
    public void setTrigger(TransitionToolspecificType.Trigger value) {
        this.trigger = value;
    }

    /**
     * 获取operator属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OperatorType }
     *     
     */
    public OperatorType getOperator() {
        return operator;
    }

    /**
     * 设置operator属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OperatorType }
     *     
     */
    public void setOperator(OperatorType value) {
        this.operator = value;
    }

    /**
     * 获取subprocess属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSubprocess() {
        return subprocess;
    }

    /**
     * 设置subprocess属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSubprocess(Boolean value) {
        this.subprocess = value;
    }

    /**
     * 获取transitionResource属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TransitionToolspecificType.TransitionResource }
     *     
     */
    public TransitionToolspecificType.TransitionResource getTransitionResource() {
        return transitionResource;
    }

    /**
     * 设置transitionResource属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TransitionToolspecificType.TransitionResource }
     *     
     */
    public void setTransitionResource(TransitionToolspecificType.TransitionResource value) {
        this.transitionResource = value;
    }

    /**
     * 获取time属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTime() {
        return time;
    }

    /**
     * 设置time属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTime(Integer value) {
        this.time = value;
    }

    /**
     * 获取timeUnit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTimeUnit() {
        return timeUnit;
    }

    /**
     * 设置timeUnit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTimeUnit(Integer value) {
        this.timeUnit = value;
    }

    /**
     * 获取orientation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOrientation() {
        return orientation;
    }

    /**
     * 设置orientation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOrientation(Integer value) {
        this.orientation = value;
    }

    /**
     * 获取assign属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TAssign }
     *     
     */
    public TAssign getAssign() {
        return assign;
    }

    /**
     * 设置assign属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TAssign }
     *     
     */
    public void setAssign(TAssign value) {
        this.assign = value;
    }

    /**
     * 获取invoke属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TInvoke }
     *     
     */
    public TInvoke getInvoke() {
        return invoke;
    }

    /**
     * 设置invoke属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TInvoke }
     *     
     */
    public void setInvoke(TInvoke value) {
        this.invoke = value;
    }

    /**
     * 获取reply属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TReply }
     *     
     */
    public TReply getReply() {
        return reply;
    }

    /**
     * 设置reply属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TReply }
     *     
     */
    public void setReply(TReply value) {
        this.reply = value;
    }

    /**
     * 获取wait属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TWait }
     *     
     */
    public TWait getWait() {
        return wait;
    }

    /**
     * 设置wait属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TWait }
     *     
     */
    public void setWait(TWait value) {
        this.wait = value;
    }

    /**
     * 获取receive属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TReceive }
     *     
     */
    public TReceive getReceive() {
        return receive;
    }

    /**
     * 设置receive属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TReceive }
     *     
     */
    public void setReceive(TReceive value) {
        this.receive = value;
    }

    /**
     * 获取empty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TEmpty }
     *     
     */
    public TEmpty getEmpty() {
        return empty;
    }

    /**
     * 设置empty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TEmpty }
     *     
     */
    public void setEmpty(TEmpty value) {
        this.empty = value;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{pnml.apromore.org}transitionResourceType">
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class TransitionResource
        extends TransitionResourceType
    {


    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{pnml.apromore.org}triggerType">
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Trigger
        extends TriggerType
    {


    }

}
