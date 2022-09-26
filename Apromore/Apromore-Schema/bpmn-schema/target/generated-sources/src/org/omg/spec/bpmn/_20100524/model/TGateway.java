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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>tGateway complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="tGateway">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.omg.org/spec/BPMN/20100524/MODEL}tFlowNode">
 *       &lt;attribute name="gatewayDirection" type="{http://www.omg.org/spec/BPMN/20100524/MODEL}tGatewayDirection" default="Unspecified" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tGateway")
@XmlSeeAlso({
    TExclusiveGateway.class,
    TEventBasedGateway.class,
    TParallelGateway.class,
    TInclusiveGateway.class,
    TComplexGateway.class
})
public class TGateway
    extends TFlowNode
    implements Visitable
{

    @XmlAttribute(name = "gatewayDirection")
    protected TGatewayDirection gatewayDirection;

    /**
     * 获取gatewayDirection属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TGatewayDirection }
     *     
     */
    public TGatewayDirection getGatewayDirection() {
        if (gatewayDirection == null) {
            return TGatewayDirection.UNSPECIFIED;
        } else {
            return gatewayDirection;
        }
    }

    /**
     * 设置gatewayDirection属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TGatewayDirection }
     *     
     */
    public void setGatewayDirection(TGatewayDirection value) {
        this.gatewayDirection = value;
    }

    public void accept(Visitor aVisitor) {
        aVisitor.visit(this);
    }

}
