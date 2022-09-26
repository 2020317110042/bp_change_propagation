//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.04.18 时间 02:49:16 PM CST 
//


package org.omg.spec.bpmn._20100524.di;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.omg.spec.bpmn._20100524.model.Visitable;
import org.omg.spec.bpmn._20100524.model.Visitor;
import org.omg.spec.dd._20100524.di.Label;


/**
 * <p>BPMNLabel complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="BPMNLabel">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.omg.org/spec/DD/20100524/DI}Label">
 *       &lt;attribute name="labelStyle" type="{http://www.w3.org/2001/XMLSchema}QName" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BPMNLabel")
public class BPMNLabel
    extends Label
    implements Visitable
{

    @XmlAttribute(name = "labelStyle")
    protected QName labelStyle;

    /**
     * 获取labelStyle属性的值。
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getLabelStyle() {
        return labelStyle;
    }

    /**
     * 设置labelStyle属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setLabelStyle(QName value) {
        this.labelStyle = value;
    }

    public void accept(Visitor aVisitor) {
        aVisitor.visit(this);
    }

}
