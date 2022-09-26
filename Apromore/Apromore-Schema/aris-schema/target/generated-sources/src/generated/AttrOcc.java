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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
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
 *       &lt;sequence>
 *         &lt;element ref="{}Size" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="AttrOcc.ID" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="AttrTypeNum" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="Port" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="CENTER"/>
 *             &lt;enumeration value="N"/>
 *             &lt;enumeration value="NE"/>
 *             &lt;enumeration value="E"/>
 *             &lt;enumeration value="SE"/>
 *             &lt;enumeration value="S"/>
 *             &lt;enumeration value="SW"/>
 *             &lt;enumeration value="W"/>
 *             &lt;enumeration value="NW"/>
 *             &lt;enumeration value="NONE"/>
 *             &lt;enumeration value="UPPER_MIDDLE"/>
 *             &lt;enumeration value="LOWER_MIDDLE"/>
 *             &lt;enumeration value="PORT_FREE"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="OrderNum" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="Alignment" default="LEFT">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="LEFT"/>
 *             &lt;enumeration value="CENTER"/>
 *             &lt;enumeration value="RIGHT"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="SymbolFlag" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="TEXT"/>
 *             &lt;enumeration value="SYMBOL"/>
 *             &lt;enumeration value="WIDTH_ATTR_NAME"/>
 *             &lt;enumeration value="ATTR_NAME_AND_SYMBOL"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="FontSS.IdRef" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="OffsetX" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="OffsetY" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="Rotation" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "size"
})
@XmlRootElement(name = "AttrOcc")
public class AttrOcc
    implements Visitable
{

    @XmlElement(name = "Size")
    protected Size size;
    @XmlAttribute(name = "AttrOcc.ID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String attrOccID;
    @XmlAttribute(name = "AttrTypeNum", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String attrTypeNum;
    @XmlAttribute(name = "Port", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String port;
    @XmlAttribute(name = "OrderNum", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String orderNum;
    @XmlAttribute(name = "Alignment")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String alignment;
    @XmlAttribute(name = "SymbolFlag", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String symbolFlag;
    @XmlAttribute(name = "FontSS.IdRef")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object fontSSIdRef;
    @XmlAttribute(name = "OffsetX")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String offsetX;
    @XmlAttribute(name = "OffsetY")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String offsetY;
    @XmlAttribute(name = "Rotation")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String rotation;

    /**
     * 获取size属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Size }
     *     
     */
    public Size getSize() {
        return size;
    }

    /**
     * 设置size属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Size }
     *     
     */
    public void setSize(Size value) {
        this.size = value;
    }

    /**
     * 获取attrOccID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttrOccID() {
        return attrOccID;
    }

    /**
     * 设置attrOccID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttrOccID(String value) {
        this.attrOccID = value;
    }

    /**
     * 获取attrTypeNum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttrTypeNum() {
        return attrTypeNum;
    }

    /**
     * 设置attrTypeNum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttrTypeNum(String value) {
        this.attrTypeNum = value;
    }

    /**
     * 获取port属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPort() {
        return port;
    }

    /**
     * 设置port属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPort(String value) {
        this.port = value;
    }

    /**
     * 获取orderNum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderNum() {
        return orderNum;
    }

    /**
     * 设置orderNum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderNum(String value) {
        this.orderNum = value;
    }

    /**
     * 获取alignment属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlignment() {
        if (alignment == null) {
            return "LEFT";
        } else {
            return alignment;
        }
    }

    /**
     * 设置alignment属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlignment(String value) {
        this.alignment = value;
    }

    /**
     * 获取symbolFlag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSymbolFlag() {
        return symbolFlag;
    }

    /**
     * 设置symbolFlag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSymbolFlag(String value) {
        this.symbolFlag = value;
    }

    /**
     * 获取fontSSIdRef属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getFontSSIdRef() {
        return fontSSIdRef;
    }

    /**
     * 设置fontSSIdRef属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setFontSSIdRef(Object value) {
        this.fontSSIdRef = value;
    }

    /**
     * 获取offsetX属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffsetX() {
        return offsetX;
    }

    /**
     * 设置offsetX属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffsetX(String value) {
        this.offsetX = value;
    }

    /**
     * 获取offsetY属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffsetY() {
        return offsetY;
    }

    /**
     * 设置offsetY属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffsetY(String value) {
        this.offsetY = value;
    }

    /**
     * 获取rotation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRotation() {
        return rotation;
    }

    /**
     * 设置rotation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRotation(String value) {
        this.rotation = value;
    }

    public void accept(Visitor aVisitor) {
        aVisitor.visit(this);
    }

}
