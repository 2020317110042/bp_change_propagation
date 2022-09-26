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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * <p>tResourceRole complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="tResourceRole">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.omg.org/spec/BPMN/20100524/MODEL}tBaseElement">
 *       &lt;choice>
 *         &lt;sequence>
 *           &lt;element name="resourceRef" type="{http://www.w3.org/2001/XMLSchema}QName"/>
 *           &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}resourceParameterBinding" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}resourceAssignmentExpression" minOccurs="0"/>
 *       &lt;/choice>
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tResourceRole", propOrder = {
    "resourceRef",
    "resourceParameterBinding",
    "resourceAssignmentExpression"
})
@XmlSeeAlso({
    TPerformer.class
})
public class TResourceRole
    extends TBaseElement
    implements Visitable
{

    protected QName resourceRef;
    protected List<TResourceParameterBinding> resourceParameterBinding;
    protected TResourceAssignmentExpression resourceAssignmentExpression;
    @XmlAttribute(name = "name")
    protected String name;

    /**
     * 获取resourceRef属性的值。
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getResourceRef() {
        return resourceRef;
    }

    /**
     * 设置resourceRef属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setResourceRef(QName value) {
        this.resourceRef = value;
    }

    /**
     * Gets the value of the resourceParameterBinding property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resourceParameterBinding property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResourceParameterBinding().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TResourceParameterBinding }
     * 
     * 
     */
    public List<TResourceParameterBinding> getResourceParameterBinding() {
        if (resourceParameterBinding == null) {
            resourceParameterBinding = new ArrayList<TResourceParameterBinding>();
        }
        return this.resourceParameterBinding;
    }

    /**
     * 获取resourceAssignmentExpression属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TResourceAssignmentExpression }
     *     
     */
    public TResourceAssignmentExpression getResourceAssignmentExpression() {
        return resourceAssignmentExpression;
    }

    /**
     * 设置resourceAssignmentExpression属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TResourceAssignmentExpression }
     *     
     */
    public void setResourceAssignmentExpression(TResourceAssignmentExpression value) {
        this.resourceAssignmentExpression = value;
    }

    /**
     * 获取name属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * 设置name属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    public void accept(Visitor aVisitor) {
        aVisitor.visit(this);
    }

}
