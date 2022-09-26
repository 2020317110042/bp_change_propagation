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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>transitionResourceType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="transitionResourceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="graphics" type="{pnml.apromore.org}graphicsSimpleType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="organizationalUnitName" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="roleName" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transitionResourceType", propOrder = {
    "graphics"
})
@XmlSeeAlso({
    org.apromore.pnml.TransitionToolspecificType.TransitionResource.class
})
public class TransitionResourceType {

    @XmlElement(required = true)
    protected GraphicsSimpleType graphics;
    @XmlAttribute(name = "organizationalUnitName")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object organizationalUnitName;
    @XmlAttribute(name = "roleName")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object roleName;

    /**
     * 获取graphics属性的值。
     * 
     * @return
     *     possible object is
     *     {@link GraphicsSimpleType }
     *     
     */
    public GraphicsSimpleType getGraphics() {
        return graphics;
    }

    /**
     * 设置graphics属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link GraphicsSimpleType }
     *     
     */
    public void setGraphics(GraphicsSimpleType value) {
        this.graphics = value;
    }

    /**
     * 获取organizationalUnitName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getOrganizationalUnitName() {
        return organizationalUnitName;
    }

    /**
     * 设置organizationalUnitName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setOrganizationalUnitName(Object value) {
        this.organizationalUnitName = value;
    }

    /**
     * 获取roleName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getRoleName() {
        return roleName;
    }

    /**
     * 设置roleName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setRoleName(Object value) {
        this.roleName = value;
    }

}
