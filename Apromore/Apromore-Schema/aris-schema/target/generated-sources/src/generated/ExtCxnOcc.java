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
 *         &lt;element ref="{}Pen" minOccurs="0"/>
 *         &lt;element ref="{}Position" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}AttrOcc" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}ExtCxnOcc" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ExtCxnOcc.ID" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="ExtCxnDef.IdRef" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="ToOcc.IdRef" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="Zorder" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="Active" default="YES">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="YES"/>
 *             &lt;enumeration value="NO"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Diagonal" default="NO">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="NO"/>
 *             &lt;enumeration value="YES"/>
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
 *       &lt;attribute name="Hints" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "pen",
    "position",
    "attrOcc",
    "extCxnOcc"
})
@XmlRootElement(name = "ExtCxnOcc")
public class ExtCxnOcc
    implements Visitable
{

    @XmlElement(name = "Pen")
    protected Pen pen;
    @XmlElement(name = "Position")
    protected List<Position> position;
    @XmlElement(name = "AttrOcc")
    protected List<AttrOcc> attrOcc;
    @XmlElement(name = "ExtCxnOcc")
    protected List<ExtCxnOcc> extCxnOcc;
    @XmlAttribute(name = "ExtCxnOcc.ID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String extCxnOccID;
    @XmlAttribute(name = "ExtCxnDef.IdRef", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object extCxnDefIdRef;
    @XmlAttribute(name = "ToOcc.IdRef", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object toOccIdRef;
    @XmlAttribute(name = "Zorder")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String zorder;
    @XmlAttribute(name = "Active")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String active;
    @XmlAttribute(name = "Diagonal")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String diagonal;
    @XmlAttribute(name = "Visible")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String visible;
    @XmlAttribute(name = "Hints")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String hints;

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
     * Gets the value of the position property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the position property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPosition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Position }
     * 
     * 
     */
    public List<Position> getPosition() {
        if (position == null) {
            position = new ArrayList<Position>();
        }
        return this.position;
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
     * 获取extCxnOccID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtCxnOccID() {
        return extCxnOccID;
    }

    /**
     * 设置extCxnOccID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtCxnOccID(String value) {
        this.extCxnOccID = value;
    }

    /**
     * 获取extCxnDefIdRef属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getExtCxnDefIdRef() {
        return extCxnDefIdRef;
    }

    /**
     * 设置extCxnDefIdRef属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setExtCxnDefIdRef(Object value) {
        this.extCxnDefIdRef = value;
    }

    /**
     * 获取toOccIdRef属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getToOccIdRef() {
        return toOccIdRef;
    }

    /**
     * 设置toOccIdRef属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setToOccIdRef(Object value) {
        this.toOccIdRef = value;
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
     * 获取diagonal属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiagonal() {
        if (diagonal == null) {
            return "NO";
        } else {
            return diagonal;
        }
    }

    /**
     * 设置diagonal属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiagonal(String value) {
        this.diagonal = value;
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

    public void accept(Visitor aVisitor) {
        aVisitor.visit(this);
    }

}
