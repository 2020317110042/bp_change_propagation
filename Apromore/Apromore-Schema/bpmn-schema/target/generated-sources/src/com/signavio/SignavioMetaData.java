//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.04.18 时间 02:49:16 PM CST 
//


package com.signavio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import com.sun.xml.bind.Locatable;
import com.sun.xml.bind.annotation.XmlLocation;
import org.omg.spec.bpmn._20100524.model.Visitable;
import org.omg.spec.bpmn._20100524.model.Visitor;
import org.xml.sax.Locator;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="metaKey" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="metaValue" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "signavioMetaData")
public class SignavioMetaData
    implements Locatable, Visitable
{

    @XmlAttribute(name = "metaKey", required = true)
    protected String metaKey;
    @XmlAttribute(name = "metaValue", required = true)
    protected String metaValue;
    @XmlLocation
    @XmlTransient
    protected Locator locator;

    /**
     * 获取metaKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetaKey() {
        return metaKey;
    }

    /**
     * 设置metaKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetaKey(String value) {
        this.metaKey = value;
    }

    /**
     * 获取metaValue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetaValue() {
        return metaValue;
    }

    /**
     * 设置metaValue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetaValue(String value) {
        this.metaValue = value;
    }

    public Locator sourceLocation() {
        return locator;
    }

    public void setSourceLocation(Locator newLocator) {
        locator = newLocator;
    }

    public void accept(Visitor aVisitor) {
        aVisitor.visit(this);
    }

}
