//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.04.18 时间 02:49:28 PM CST 
//


package org.apromore.pnml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>importPlaceType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="importPlaceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="graphics" type="{pnml.apromore.org}graphicsNodeType"/>
 *         &lt;element name="toolspecific" type="{pnml.apromore.org}toolspecificType"/>
 *       &lt;/choice>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="instance" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="ref" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="parameter" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "importPlaceType", propOrder = {
    "graphicsOrToolspecific"
})
public class ImportPlaceType {

    @XmlElements({
        @XmlElement(name = "graphics", type = GraphicsNodeType.class),
        @XmlElement(name = "toolspecific", type = ToolspecificType.class)
    })
    protected List<Object> graphicsOrToolspecific;
    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "instance")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object instance;
    @XmlAttribute(name = "ref", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String ref;
    @XmlAttribute(name = "parameter", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String parameter;

    /**
     * Gets the value of the graphicsOrToolspecific property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the graphicsOrToolspecific property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGraphicsOrToolspecific().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GraphicsNodeType }
     * {@link ToolspecificType }
     * 
     * 
     */
    public List<Object> getGraphicsOrToolspecific() {
        if (graphicsOrToolspecific == null) {
            graphicsOrToolspecific = new ArrayList<Object>();
        }
        return this.graphicsOrToolspecific;
    }

    /**
     * 获取id属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * 设置id属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * 获取instance属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getInstance() {
        return instance;
    }

    /**
     * 设置instance属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setInstance(Object value) {
        this.instance = value;
    }

    /**
     * 获取ref属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRef() {
        return ref;
    }

    /**
     * 设置ref属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRef(String value) {
        this.ref = value;
    }

    /**
     * 获取parameter属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParameter() {
        return parameter;
    }

    /**
     * 设置parameter属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParameter(String value) {
        this.parameter = value;
    }

}
