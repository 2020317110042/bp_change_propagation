//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.04.18 时间 02:49:28 PM CST 
//


package org.apromore.pnml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>resourceMappingType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="resourceMappingType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="resourceID" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="resourceClass" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resourceMappingType")
public class ResourceMappingType {

    @XmlAttribute(name = "resourceID")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object resourceID;
    @XmlAttribute(name = "resourceClass")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object resourceClass;

    /**
     * 获取resourceID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getResourceID() {
        return resourceID;
    }

    /**
     * 设置resourceID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setResourceID(Object value) {
        this.resourceID = value;
    }

    /**
     * 获取resourceClass属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getResourceClass() {
        return resourceClass;
    }

    /**
     * 设置resourceClass属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setResourceClass(Object value) {
        this.resourceClass = value;
    }

}
