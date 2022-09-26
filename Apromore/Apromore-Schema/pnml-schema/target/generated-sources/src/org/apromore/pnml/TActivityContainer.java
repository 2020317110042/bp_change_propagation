//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.04.18 时间 02:49:28 PM CST 
//


package org.apromore.pnml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>tActivityContainer complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="tActivityContainer">
 *   &lt;complexContent>
 *     &lt;extension base="{pnml.apromore.org}tExtensibleElements">
 *       &lt;sequence>
 *         &lt;group ref="{pnml.apromore.org}activity"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tActivityContainer", propOrder = {
    "assign",
    "empty",
    "invoke",
    "receive",
    "reply",
    "wait"
})
@XmlSeeAlso({
    TCatch.class
})
public class TActivityContainer
    extends TExtensibleElements
{

    protected TAssign assign;
    protected TEmpty empty;
    protected TInvoke invoke;
    protected TReceive receive;
    protected TReply reply;
    protected TWait wait;

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

}
