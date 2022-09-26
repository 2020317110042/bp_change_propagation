//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.04.18 时间 02:49:16 PM CST 
//


package org.omg.spec.bpmn._20100524.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * <p>tCorrelationSubscription complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="tCorrelationSubscription">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.omg.org/spec/BPMN/20100524/MODEL}tBaseElement">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}correlationPropertyBinding" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="correlationKeyRef" use="required" type="{http://www.w3.org/2001/XMLSchema}QName" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tCorrelationSubscription", propOrder = {
    "correlationPropertyBinding"
})
public class TCorrelationSubscription
    extends TBaseElement
    implements Visitable
{

    protected List<TCorrelationPropertyBinding> correlationPropertyBinding;
    @XmlAttribute(name = "correlationKeyRef", required = true)
    protected QName correlationKeyRef;

    /**
     * Gets the value of the correlationPropertyBinding property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the correlationPropertyBinding property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCorrelationPropertyBinding().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TCorrelationPropertyBinding }
     * 
     * 
     */
    public List<TCorrelationPropertyBinding> getCorrelationPropertyBinding() {
        if (correlationPropertyBinding == null) {
            correlationPropertyBinding = new ArrayList<TCorrelationPropertyBinding>();
        }
        return this.correlationPropertyBinding;
    }

    /**
     * 获取correlationKeyRef属性的值。
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getCorrelationKeyRef() {
        return correlationKeyRef;
    }

    /**
     * 设置correlationKeyRef属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setCorrelationKeyRef(QName value) {
        this.correlationKeyRef = value;
    }

    public void accept(Visitor aVisitor) {
        aVisitor.visit(this);
    }

}
