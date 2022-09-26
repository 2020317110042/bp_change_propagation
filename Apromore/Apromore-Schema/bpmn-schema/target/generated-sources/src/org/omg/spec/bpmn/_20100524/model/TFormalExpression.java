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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * <p>tFormalExpression complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="tFormalExpression">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.omg.org/spec/BPMN/20100524/MODEL}tExpression">
 *       &lt;attribute name="language" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="evaluatesToTypeRef" type="{http://www.w3.org/2001/XMLSchema}QName" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tFormalExpression")
public class TFormalExpression
    extends TExpression
    implements Visitable
{

    @XmlAttribute(name = "language")
    @XmlSchemaType(name = "anyURI")
    protected String language;
    @XmlAttribute(name = "evaluatesToTypeRef")
    protected QName evaluatesToTypeRef;

    /**
     * 获取language属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * 设置language属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * 获取evaluatesToTypeRef属性的值。
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getEvaluatesToTypeRef() {
        return evaluatesToTypeRef;
    }

    /**
     * 设置evaluatesToTypeRef属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setEvaluatesToTypeRef(QName value) {
        this.evaluatesToTypeRef = value;
    }

    public void accept(Visitor aVisitor) {
        aVisitor.visit(this);
    }

}
