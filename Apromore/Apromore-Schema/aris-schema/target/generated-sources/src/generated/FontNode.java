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
 *       &lt;attribute name="LocaleId" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="FaceName" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="Height" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="Width" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="Escapement" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="Orientation" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="Weight" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="Italic" default="NO">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="YES"/>
 *             &lt;enumeration value="NO"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Underline" default="NO">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="YES"/>
 *             &lt;enumeration value="NO"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="StrikeOut" default="NO">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="YES"/>
 *             &lt;enumeration value="NO"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="CharSet" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="OutPrecision" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="ClipPrecision" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="Quality" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="PitchAndFamily" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="Color" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "FontNode")
public class FontNode
    implements Visitable
{

    @XmlAttribute(name = "LocaleId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String localeId;
    @XmlAttribute(name = "FaceName", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String faceName;
    @XmlAttribute(name = "Height", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String height;
    @XmlAttribute(name = "Width", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String width;
    @XmlAttribute(name = "Escapement", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String escapement;
    @XmlAttribute(name = "Orientation", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String orientation;
    @XmlAttribute(name = "Weight", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String weight;
    @XmlAttribute(name = "Italic")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String italic;
    @XmlAttribute(name = "Underline")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String underline;
    @XmlAttribute(name = "StrikeOut")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String strikeOut;
    @XmlAttribute(name = "CharSet", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String charSet;
    @XmlAttribute(name = "OutPrecision", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String outPrecision;
    @XmlAttribute(name = "ClipPrecision", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String clipPrecision;
    @XmlAttribute(name = "Quality", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String quality;
    @XmlAttribute(name = "PitchAndFamily", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String pitchAndFamily;
    @XmlAttribute(name = "Color", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String color;

    /**
     * 获取localeId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocaleId() {
        return localeId;
    }

    /**
     * 设置localeId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocaleId(String value) {
        this.localeId = value;
    }

    /**
     * 获取faceName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaceName() {
        return faceName;
    }

    /**
     * 设置faceName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaceName(String value) {
        this.faceName = value;
    }

    /**
     * 获取height属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeight() {
        return height;
    }

    /**
     * 设置height属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeight(String value) {
        this.height = value;
    }

    /**
     * 获取width属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWidth() {
        return width;
    }

    /**
     * 设置width属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWidth(String value) {
        this.width = value;
    }

    /**
     * 获取escapement属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEscapement() {
        return escapement;
    }

    /**
     * 设置escapement属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEscapement(String value) {
        this.escapement = value;
    }

    /**
     * 获取orientation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrientation() {
        return orientation;
    }

    /**
     * 设置orientation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrientation(String value) {
        this.orientation = value;
    }

    /**
     * 获取weight属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeight() {
        return weight;
    }

    /**
     * 设置weight属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeight(String value) {
        this.weight = value;
    }

    /**
     * 获取italic属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItalic() {
        if (italic == null) {
            return "NO";
        } else {
            return italic;
        }
    }

    /**
     * 设置italic属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItalic(String value) {
        this.italic = value;
    }

    /**
     * 获取underline属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnderline() {
        if (underline == null) {
            return "NO";
        } else {
            return underline;
        }
    }

    /**
     * 设置underline属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnderline(String value) {
        this.underline = value;
    }

    /**
     * 获取strikeOut属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrikeOut() {
        if (strikeOut == null) {
            return "NO";
        } else {
            return strikeOut;
        }
    }

    /**
     * 设置strikeOut属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrikeOut(String value) {
        this.strikeOut = value;
    }

    /**
     * 获取charSet属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCharSet() {
        return charSet;
    }

    /**
     * 设置charSet属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCharSet(String value) {
        this.charSet = value;
    }

    /**
     * 获取outPrecision属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutPrecision() {
        return outPrecision;
    }

    /**
     * 设置outPrecision属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutPrecision(String value) {
        this.outPrecision = value;
    }

    /**
     * 获取clipPrecision属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClipPrecision() {
        return clipPrecision;
    }

    /**
     * 设置clipPrecision属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClipPrecision(String value) {
        this.clipPrecision = value;
    }

    /**
     * 获取quality属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuality() {
        return quality;
    }

    /**
     * 设置quality属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuality(String value) {
        this.quality = value;
    }

    /**
     * 获取pitchAndFamily属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPitchAndFamily() {
        return pitchAndFamily;
    }

    /**
     * 设置pitchAndFamily属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPitchAndFamily(String value) {
        this.pitchAndFamily = value;
    }

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

    public void accept(Visitor aVisitor) {
        aVisitor.visit(this);
    }

}
