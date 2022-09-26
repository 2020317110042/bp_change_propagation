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
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Arc Types
 * 
 * <p>arcType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="arcType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="inscription" type="{pnml.apromore.org}arcNameType" minOccurs="0"/>
 *         &lt;element name="type" type="{pnml.apromore.org}arcTypeType" minOccurs="0"/>
 *         &lt;element name="graphics" type="{pnml.apromore.org}graphicsArcType" minOccurs="0"/>
 *         &lt;element name="toolspecific" type="{pnml.apromore.org}arcToolspecificType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="source" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="target" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "arcType", propOrder = {
    "inscription",
    "type",
    "graphics",
    "toolspecific"
})
public class ArcType {

    protected ArcNameType inscription;
    protected ArcTypeType type;
    protected GraphicsArcType graphics;
    protected List<ArcToolspecificType> toolspecific;
    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "source", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object source;
    @XmlAttribute(name = "target", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object target;

    /**
     * 获取inscription属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArcNameType }
     *     
     */
    public ArcNameType getInscription() {
        return inscription;
    }

    /**
     * 设置inscription属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArcNameType }
     *     
     */
    public void setInscription(ArcNameType value) {
        this.inscription = value;
    }

    /**
     * 获取type属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArcTypeType }
     *     
     */
    public ArcTypeType getType() {
        return type;
    }

    /**
     * 设置type属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArcTypeType }
     *     
     */
    public void setType(ArcTypeType value) {
        this.type = value;
    }

    /**
     * 获取graphics属性的值。
     * 
     * @return
     *     possible object is
     *     {@link GraphicsArcType }
     *     
     */
    public GraphicsArcType getGraphics() {
        return graphics;
    }

    /**
     * 设置graphics属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link GraphicsArcType }
     *     
     */
    public void setGraphics(GraphicsArcType value) {
        this.graphics = value;
    }

    /**
     * Gets the value of the toolspecific property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the toolspecific property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getToolspecific().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArcToolspecificType }
     * 
     * 
     */
    public List<ArcToolspecificType> getToolspecific() {
        if (toolspecific == null) {
            toolspecific = new ArrayList<ArcToolspecificType>();
        }
        return this.toolspecific;
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
     * 获取source属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSource() {
        return source;
    }

    /**
     * 设置source属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSource(Object value) {
        this.source = value;
    }

    /**
     * 获取target属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTarget() {
        return target;
    }

    /**
     * 设置target属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTarget(Object value) {
        this.target = value;
    }

}
