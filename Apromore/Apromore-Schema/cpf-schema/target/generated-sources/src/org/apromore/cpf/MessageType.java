//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.04.18 时间 02:49:23 PM CST 
//


package org.apromore.cpf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>MessageType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="MessageType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.apromore.org/CPF}EventType">
 *       &lt;sequence>
 *         &lt;element name="direction" type="{http://www.apromore.org/CPF}DirectionEnum"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageType", namespace = "http://www.apromore.org/CPF", propOrder = {
    "direction"
})
public class MessageType
    extends EventType
    implements Visitable
{

    @XmlElement(required = true)
    protected DirectionEnum direction;

    /**
     * 获取direction属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DirectionEnum }
     *     
     */
    public DirectionEnum getDirection() {
        return direction;
    }

    /**
     * 设置direction属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DirectionEnum }
     *     
     */
    public void setDirection(DirectionEnum value) {
        this.direction = value;
    }

    public void accept(Visitor aVisitor) {
        aVisitor.visit(this);
    }

}
