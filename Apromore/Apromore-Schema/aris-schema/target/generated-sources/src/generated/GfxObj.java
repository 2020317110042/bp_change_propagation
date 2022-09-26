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
 *         &lt;element ref="{}Brush" minOccurs="0"/>
 *         &lt;element ref="{}Position" minOccurs="0"/>
 *         &lt;element ref="{}Size" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element ref="{}Polygon"/>
 *           &lt;element ref="{}RoundedRectangle"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="GfxObj.ID" type="{http://www.w3.org/2001/XMLSchema}ID" />
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
    "pen",
    "brush",
    "position",
    "size",
    "polygon",
    "roundedRectangle"
})
@XmlRootElement(name = "GfxObj")
public class GfxObj
    implements Visitable
{

    @XmlElement(name = "Pen")
    protected Pen pen;
    @XmlElement(name = "Brush")
    protected Brush brush;
    @XmlElement(name = "Position")
    protected Position position;
    @XmlElement(name = "Size")
    protected Size size;
    @XmlElement(name = "Polygon")
    protected Polygon polygon;
    @XmlElement(name = "RoundedRectangle")
    protected RoundedRectangle roundedRectangle;
    @XmlAttribute(name = "GfxObj.ID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String gfxObjID;
    @XmlAttribute(name = "Zorder")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String zorder;

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
     * 获取polygon属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Polygon }
     *     
     */
    public Polygon getPolygon() {
        return polygon;
    }

    /**
     * 设置polygon属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Polygon }
     *     
     */
    public void setPolygon(Polygon value) {
        this.polygon = value;
    }

    /**
     * 获取roundedRectangle属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RoundedRectangle }
     *     
     */
    public RoundedRectangle getRoundedRectangle() {
        return roundedRectangle;
    }

    /**
     * 设置roundedRectangle属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RoundedRectangle }
     *     
     */
    public void setRoundedRectangle(RoundedRectangle value) {
        this.roundedRectangle = value;
    }

    /**
     * 获取gfxObjID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGfxObjID() {
        return gfxObjID;
    }

    /**
     * 设置gfxObjID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGfxObjID(String value) {
        this.gfxObjID = value;
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
