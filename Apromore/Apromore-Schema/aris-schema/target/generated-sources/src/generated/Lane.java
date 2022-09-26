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
 *         &lt;element ref="{}GUID" minOccurs="0"/>
 *         &lt;element ref="{}Pen" minOccurs="0"/>
 *         &lt;element ref="{}Brush" minOccurs="0"/>
 *         &lt;element ref="{}AttrDef" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Lane.ID" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="Lane.Type" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="Orientation" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="VERTICAL"/>
 *             &lt;enumeration value="HORIZONTAL"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="StartBorder" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="EndBorder" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "guid",
    "pen",
    "brush",
    "attrDef"
})
@XmlRootElement(name = "Lane")
public class Lane
    implements Visitable
{

    @XmlElement(name = "GUID")
    protected String guid;
    @XmlElement(name = "Pen")
    protected Pen pen;
    @XmlElement(name = "Brush")
    protected Brush brush;
    @XmlElement(name = "AttrDef")
    protected List<AttrDef> attrDef;
    @XmlAttribute(name = "Lane.ID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String laneID;
    @XmlAttribute(name = "Lane.Type", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String laneType;
    @XmlAttribute(name = "Orientation", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String orientation;
    @XmlAttribute(name = "StartBorder", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String startBorder;
    @XmlAttribute(name = "EndBorder", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String endBorder;

    /**
     * 获取guid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGUID() {
        return guid;
    }

    /**
     * 设置guid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGUID(String value) {
        this.guid = value;
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
     * Gets the value of the attrDef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attrDef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttrDef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttrDef }
     * 
     * 
     */
    public List<AttrDef> getAttrDef() {
        if (attrDef == null) {
            attrDef = new ArrayList<AttrDef>();
        }
        return this.attrDef;
    }

    /**
     * 获取laneID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLaneID() {
        return laneID;
    }

    /**
     * 设置laneID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLaneID(String value) {
        this.laneID = value;
    }

    /**
     * 获取laneType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLaneType() {
        return laneType;
    }

    /**
     * 设置laneType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLaneType(String value) {
        this.laneType = value;
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
     * 获取startBorder属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartBorder() {
        return startBorder;
    }

    /**
     * 设置startBorder属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartBorder(String value) {
        this.startBorder = value;
    }

    /**
     * 获取endBorder属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndBorder() {
        return endBorder;
    }

    /**
     * 设置endBorder属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndBorder(String value) {
        this.endBorder = value;
    }

    public void accept(Visitor aVisitor) {
        aVisitor.visit(this);
    }

}
