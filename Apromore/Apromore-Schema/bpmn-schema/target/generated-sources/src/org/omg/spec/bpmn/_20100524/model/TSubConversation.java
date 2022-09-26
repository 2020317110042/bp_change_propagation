//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.04.18 时间 02:49:16 PM CST 
//


package org.omg.spec.bpmn._20100524.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>tSubConversation complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="tSubConversation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.omg.org/spec/BPMN/20100524/MODEL}tConversationNode">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}conversationNode" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "tSubConversation", propOrder = {
    "conversationNode"
})
public class TSubConversation
    extends TConversationNode
    implements Visitable
{

    @XmlElementRef(name = "conversationNode", namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", type = JAXBElement.class, required = false)
    protected List<JAXBElement<? extends TConversationNode>> conversationNode;

    /**
     * Gets the value of the conversationNode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the conversationNode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConversationNode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link TConversation }{@code >}
     * {@link JAXBElement }{@code <}{@link TCallConversation }{@code >}
     * {@link JAXBElement }{@code <}{@link TConversationNode }{@code >}
     * {@link JAXBElement }{@code <}{@link TSubConversation }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends TConversationNode>> getConversationNode() {
        if (conversationNode == null) {
            conversationNode = new ArrayList<JAXBElement<? extends TConversationNode>>();
        }
        return this.conversationNode;
    }

    public void accept(Visitor aVisitor) {
        aVisitor.visit(this);
    }

}
