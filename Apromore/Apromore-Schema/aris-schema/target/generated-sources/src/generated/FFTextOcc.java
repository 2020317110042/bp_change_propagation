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
 *         &lt;element ref="{}Position" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="FFTextOcc.ID" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="FFTextDef.IdRef" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="FontSS.IdRef" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="SymbolFlag" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="TEXT"/>
 *             &lt;enumeration value="SYMBOL"/>
 *             &lt;enumeration value="ATTRNAME"/>
 *             &lt;enumeration value="ATTRNAME_AND_SYMBOL"/>
 *             &lt;enumeration value="POSTIT"/>
 *             &lt;enumeration value="SYMBOL_AND_POSTIT"/>
 *             &lt;enumeration value="ATTRNAME_AND_POSTIT"/>
 *             &lt;enumeration value="ATTRNAME_AND_SYMBOL_AND_POSTIT"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Alignment" default="LEFT">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="LEFT"/>
 *             &lt;enumeration value="CENTER"/>
 *             &lt;enumeration value="RIGHT"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Zorder" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "position"
})
@XmlRootElement(name = "FFTextOcc")
public class FFTextOcc
    implements Visitable
{

    @XmlElement(name = "Position")
    protected Position position;
    @XmlAttribute(name = "FFTextOcc.ID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String ffTextOccID;
    @XmlAttribute(name = "FFTextDef.IdRef", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object ffTextDefIdRef;
    @XmlAttribute(name = "FontSS.IdRef")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object fontSSIdRef;
    @XmlAttribute(name = "SymbolFlag", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String symbolFlag;
    @XmlAttribute(name = "Alignment")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String alignment;
    @XmlAttribute(name = "Zorder")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String zorder;

    /**
     * 获取position属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getPosition() {
        return position;
    }

    /**
     * 设置position属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setPosition(Position value) {
        this.position = value;
    }

    /**
     * 获取ffTextOccID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFFTextOccID() {
        return ffTextOccID;
    }

    /**
     * 设置ffTextOccID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFFTextOccID(String value) {
        this.ffTextOccID = value;
    }

    /**
     * 获取ffTextDefIdRef属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getFFTextDefIdRef() {
        return ffTextDefIdRef;
    }

    /**
     * 设置ffTextDefIdRef属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setFFTextDefIdRef(Object value) {
        this.ffTextDefIdRef = value;
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
     * 获取zorder属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZorder() {
        return zorder;
    }

    /**
     * 设置zorder属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZorder(String value) {
        this.zorder = value;
    }

    public void accept(Visitor aVisitor) {
        aVisitor.visit(this);
    }

}
