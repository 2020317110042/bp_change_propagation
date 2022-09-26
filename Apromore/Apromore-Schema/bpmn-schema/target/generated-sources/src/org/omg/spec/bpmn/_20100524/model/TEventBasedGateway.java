//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.04.18 时间 02:49:16 PM CST 
//


package org.omg.spec.bpmn._20100524.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>tEventBasedGateway complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="tEventBasedGateway">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.omg.org/spec/BPMN/20100524/MODEL}tGateway">
 *       &lt;attribute name="instantiate" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="eventGatewayType" type="{http://www.omg.org/spec/BPMN/20100524/MODEL}tEventBasedGatewayType" default="Exclusive" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tEventBasedGateway")
public class TEventBasedGateway
    extends TGateway
    implements Visitable
{

    @XmlAttribute(name = "instantiate")
    protected Boolean instantiate;
    @XmlAttribute(name = "eventGatewayType")
    protected TEventBasedGatewayType eventGatewayType;

    /**
     * 获取instantiate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isInstantiate() {
        if (instantiate == null) {
            return false;
        } else {
            return instantiate;
        }
    }

    /**
     * 设置instantiate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInstantiate(Boolean value) {
        this.instantiate = value;
    }

    /**
     * 获取eventGatewayType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TEventBasedGatewayType }
     *     
     */
    public TEventBasedGatewayType getEventGatewayType() {
        if (eventGatewayType == null) {
            return TEventBasedGatewayType.EXCLUSIVE;
        } else {
            return eventGatewayType;
        }
    }

    /**
     * 设置eventGatewayType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TEventBasedGatewayType }
     *     
     */
    public void setEventGatewayType(TEventBasedGatewayType value) {
        this.eventGatewayType = value;
    }

    public void accept(Visitor aVisitor) {
        aVisitor.visit(this);
    }

}
