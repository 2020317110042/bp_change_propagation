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
 * <p>tFlowElement complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="tFlowElement">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.omg.org/spec/BPMN/20100524/MODEL}tBaseElement">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}auditing" minOccurs="0"/>
 *         &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}monitoring" minOccurs="0"/>
 *         &lt;element name="categoryValueRef" type="{http://www.w3.org/2001/XMLSchema}QName" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
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
@XmlType(name = "tFlowElement", propOrder = {
    "auditing",
    "monitoring",
    "categoryValueRef"
})
@XmlSeeAlso({
    TSequenceFlow.class,
    TDataStoreReference.class,
    TDataObject.class,
    TDataObjectReference.class,
    TFlowNode.class
})
public abstract class TFlowElement
    extends TBaseElement
    implements Visitable
{

    protected TAuditing auditing;
    protected TMonitoring monitoring;
    protected List<QName> categoryValueRef;
    @XmlAttribute(name = "name")
    protected String name;

    /**
     * 获取auditing属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TAuditing }
     *     
     */
    public TAuditing getAuditing() {
        return auditing;
    }

    /**
     * 设置auditing属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TAuditing }
     *     
     */
    public void setAuditing(TAuditing value) {
        this.auditing = value;
    }

    /**
     * 获取monitoring属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TMonitoring }
     *     
     */
    public TMonitoring getMonitoring() {
        return monitoring;
    }

    /**
     * 设置monitoring属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TMonitoring }
     *     
     */
    public void setMonitoring(TMonitoring value) {
        this.monitoring = value;
    }

    /**
     * Gets the value of the categoryValueRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the categoryValueRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCategoryValueRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QName }
     * 
     * 
     */
    public List<QName> getCategoryValueRef() {
        if (categoryValueRef == null) {
            categoryValueRef = new ArrayList<QName>();
        }
        return this.categoryValueRef;
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

}
