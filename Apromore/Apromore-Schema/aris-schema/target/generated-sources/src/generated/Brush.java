//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.04.18 时间 02:49:13 PM CST 
//


package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Color" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="Style" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="Hatch" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="Color2" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="BrushType" default="SOLID">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="SOLID"/>
 *             &lt;enumeration value="TRANSPARENT"/>
 *             &lt;enumeration value="GRADIENT_LEFT"/>
 *             &lt;enumeration value="GRADIENT_TOP"/>
 *             &lt;enumeration value="GRADIENT_DIAGONAL_TOP_LEFT"/>
 *             &lt;enumeration value="GRADIENT_DIAGONAL_BOTTOM_LEFT"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "Brush")
public class Brush
    implements Visitable
{

    @XmlAttribute(name = "Color", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String color;
    @XmlAttribute(name = "Style")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String style;
    @XmlAttribute(name = "Hatch")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String hatch;
    @XmlAttribute(name = "Color2")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String color2;
    @XmlAttribute(name = "BrushType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String brushType;

    /**
     * 获取color属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColor() {
        return color;
    }

    /**
     * 设置color属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColor(String value) {
        this.color = value;
    }

    /**
     * 获取style属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStyle() {
        return style;
    }

    /**
     * 设置style属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStyle(String value) {
        this.style = value;
    }

    /**
     * 获取hatch属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHatch() {
        return hatch;
    }

    /**
     * 设置hatch属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHatch(String value) {
        this.hatch = value;
    }

    /**
     * 获取color2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColor2() {
        return color2;
    }

    /**
     * 设置color2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColor2(String value) {
        this.color2 = value;
    }

    /**
     * 获取brushType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrushType() {
        if (brushType == null) {
            return "SOLID";
        } else {
            return brushType;
        }
    }

    /**
     * 设置brushType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrushType(String value) {
        this.brushType = value;
    }

    public void accept(Visitor aVisitor) {
        aVisitor.visit(this);
    }

}
