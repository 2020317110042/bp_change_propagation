//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.04.18 时间 02:49:13 PM CST 
//


package generated;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element ref="{}SymbolGUID" minOccurs="0"/>
 *         &lt;element ref="{}Pen" minOccurs="0"/>
 *         &lt;element ref="{}Brush" minOccurs="0"/>
 *         &lt;element ref="{}Position" minOccurs="0"/>
 *         &lt;element ref="{}Size" minOccurs="0"/>
 *         &lt;element ref="{}ExternalGUID" minOccurs="0"/>
 *         &lt;element ref="{}CxnOcc" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}AttrOcc" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}ExtCxnOcc" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ObjOcc.ID" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="ObjDef.IdRef" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="ToCxnOccs.IdRefs" type="{http://www.w3.org/2001/XMLSchema}IDREFS" />
 *       &lt;attribute name="Zorder" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="SymbolNum" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="Active" default="YES">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="YES"/>
 *             &lt;enumeration value="NO"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Shadow" default="NO">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="YES"/>
 *             &lt;enumeration value="NO"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Visible" default="YES">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="YES"/>
 *             &lt;enumeration value="NO"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Expanded" default="NO">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="YES"/>
 *             &lt;enumeration value="NO"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="EmbeddingContainer" default="NO">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="YES"/>
 *             &lt;enumeration value="NO"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Hints" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="SequenceNumber" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "symbolGUID",
    "pen",
    "brush",
    "position",
    "size",
    "externalGUID",
    "cxnOcc",
    "attrOcc",
    "extCxnOcc"
})
@XmlRootElement(name = "ObjOcc")
public class ObjOcc
    implements Visitable
{

    @XmlElement(name = "SymbolGUID")
    protected String symbolGUID;
    @XmlElement(name = "Pen")
    protected Pen pen;
    @XmlElement(name = "Brush")
    protected Brush brush;
    @XmlElement(name = "Position")
    protected Position position;
    @XmlElement(name = "Size")
    protected Size size;
    @XmlElement(name = "ExternalGUID")
    protected String externalGUID;
    @XmlElement(name = "CxnOcc")
    protected List<CxnOcc> cxnOcc;
    @XmlElement(name = "AttrOcc")
    protected List<AttrOcc> attrOcc;
    @XmlElement(name = "ExtCxnOcc")
    protected List<ExtCxnOcc> extCxnOcc;
    @XmlAttribute(name = "ObjOcc.ID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String objOccID;
    @XmlAttribute(name = "ObjDef.IdRef", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object objDefIdRef;
    @XmlAttribute(name = "ToCxnOccs.IdRefs")
    @XmlIDREF
    @XmlSchemaType(name = "IDREFS")
    protected List<Object> toCxnOccsIdRefs;
    @XmlAttribute(name = "Zorder")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String zorder;
    @XmlAttribute(name = "SymbolNum", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String symbolNum;
    @XmlAttribute(name = "Active")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String active;
    @XmlAttribute(name = "Shadow")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String shadow;
    @XmlAttribute(name = "Visible")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String visible;
    @XmlAttribute(name = "Expanded")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String expanded;
    @XmlAttribute(name = "EmbeddingContainer")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String embeddingContainer;
    @XmlAttribute(name = "Hints")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String hints;
    @XmlAttribute(name = "SequenceNumber")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String sequenceNumber;

    /**
     * 获取symbolGUID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSymbolGUID() {
        return symbolGUID;
    }

    /**
     * 设置symbolGUID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSymbolGUID(String value) {
        this.symbolGUID = value;
    }

    /**
     * 获取pen属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Pen }
     *     
     */
    public Pen getPen() {
        return pen;
    }

    /**
     * 设置pen属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Pen }
     *     
     */
    public void setPen(Pen value) {
        this.pen = value;
    }

    /**
     * 获取brush属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Brush }
     *     
     */
    public Brush getBrush() {
        return brush;
    }

    /**
     * 设置brush属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Brush }
     *     
     */
    public void setBrush(Brush value) {
        this.brush = value;
    }

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
     * 获取externalGUID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalGUID() {
        return externalGUID;
    }

    /**
     * 设置externalGUID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalGUID(String value) {
        this.externalGUID = value;
    }

    /**
     * Gets the value of the cxnOcc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cxnOcc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCxnOcc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CxnOcc }
     * 
     * 
     */
    public List<CxnOcc> getCxnOcc() {
        if (cxnOcc == null) {
            cxnOcc = new ArrayList<CxnOcc>();
        }
        return this.cxnOcc;
    }

    /**
     * Gets the value of the attrOcc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attrOcc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttrOcc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttrOcc }
     * 
     * 
     */
    public List<AttrOcc> getAttrOcc() {
        if (attrOcc == null) {
            attrOcc = new ArrayList<AttrOcc>();
        }
        return this.attrOcc;
    }

    /**
     * Gets the value of the extCxnOcc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extCxnOcc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtCxnOcc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtCxnOcc }
     * 
     * 
     */
    public List<ExtCxnOcc> getExtCxnOcc() {
        if (extCxnOcc == null) {
            extCxnOcc = new ArrayList<ExtCxnOcc>();
        }
        return this.extCxnOcc;
    }

    /**
     * 获取objOccID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjOccID() {
        return objOccID;
    }

    /**
     * 设置objOccID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjOccID(String value) {
        this.objOccID = value;
    }

    /**
     * 获取objDefIdRef属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getObjDefIdRef() {
        return objDefIdRef;
    }

    /**
     * 设置objDefIdRef属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setObjDefIdRef(Object value) {
        this.objDefIdRef = value;
    }

    /**
     * Gets the value of the toCxnOccsIdRefs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the toCxnOccsIdRefs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getToCxnOccsIdRefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getToCxnOccsIdRefs() {
        if (toCxnOccsIdRefs == null) {
            toCxnOccsIdRefs = new ArrayList<Object>();
        }
        return this.toCxnOccsIdRefs;
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

    /**
     * 获取symbolNum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSymbolNum() {
        return symbolNum;
    }

    /**
     * 设置symbolNum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSymbolNum(String value) {
        this.symbolNum = value;
    }

    /**
     * 获取active属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActive() {
        if (active == null) {
            return "YES";
        } else {
            return active;
        }
    }

    /**
     * 设置active属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActive(String value) {
        this.active = value;
    }

    /**
     * 获取shadow属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShadow() {
        if (shadow == null) {
            return "NO";
        } else {
            return shadow;
        }
    }

    /**
     * 设置shadow属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShadow(String value) {
        this.shadow = value;
    }

    /**
     * 获取visible属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisible() {
        if (visible == null) {
            return "YES";
        } else {
            return visible;
        }
    }

    /**
     * 设置visible属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisible(String value) {
        this.visible = value;
    }

    /**
     * 获取expanded属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpanded() {
        if (expanded == null) {
            return "NO";
        } else {
            return expanded;
        }
    }

    /**
     * 设置expanded属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpanded(String value) {
        this.expanded = value;
    }

    /**
     * 获取embeddingContainer属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmbeddingContainer() {
        if (embeddingContainer == null) {
            return "NO";
        } else {
            return embeddingContainer;
        }
    }

    /**
     * 设置embeddingContainer属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmbeddingContainer(String value) {
        this.embeddingContainer = value;
    }

    /**
     * 获取hints属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHints() {
        return hints;
    }

    /**
     * 设置hints属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHints(String value) {
        this.hints = value;
    }

    /**
     * 获取sequenceNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * 设置sequenceNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSequenceNumber(String value) {
        this.sequenceNumber = value;
    }

    public void accept(Visitor aVisitor) {
        aVisitor.visit(this);
    }

}
