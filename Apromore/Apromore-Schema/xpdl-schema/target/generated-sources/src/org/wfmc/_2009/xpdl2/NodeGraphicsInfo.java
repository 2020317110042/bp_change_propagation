//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.04.18 时间 02:49:32 PM CST 
//


package org.wfmc._2009.xpdl2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;


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
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}Coordinates" minOccurs="0"/>
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ToolId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="IsVisible" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *       &lt;attribute name="Page" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="PageId" type="{http://www.wfmc.org/2009/XPDL2.2}IdRef" />
 *       &lt;attribute name="LaneId" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="Height" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="Width" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="BorderColor" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="FillColor" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Shape" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "coordinates",
    "any"
})
@XmlRootElement(name = "NodeGraphicsInfo")
public class NodeGraphicsInfo {

    @XmlElement(name = "Coordinates")
    protected Coordinates coordinates;
    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;
    @XmlAttribute(name = "ToolId")
    protected String toolId;
    @XmlAttribute(name = "IsVisible")
    protected Boolean isVisible;
    @XmlAttribute(name = "Page")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String page;
    @XmlAttribute(name = "PageId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String pageId;
    @XmlAttribute(name = "LaneId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String laneId;
    @XmlAttribute(name = "Height")
    protected Double height;
    @XmlAttribute(name = "Width")
    protected Double width;
    @XmlAttribute(name = "BorderColor")
    protected String borderColor;
    @XmlAttribute(name = "FillColor")
    protected String fillColor;
    @XmlAttribute(name = "Shape")
    protected String shape;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * 获取coordinates属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Coordinates }
     *     
     */
    public Coordinates getCoordinates() {
        return coordinates;
    }

    /**
     * 设置coordinates属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Coordinates }
     *     
     */
    public void setCoordinates(Coordinates value) {
        this.coordinates = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link java.lang.Object }
     * {@link Element }
     * 
     * 
     */
    public List<java.lang.Object> getAny() {
        if (any == null) {
            any = new ArrayList<java.lang.Object>();
        }
        return this.any;
    }

    /**
     * 获取toolId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToolId() {
        return toolId;
    }

    /**
     * 设置toolId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToolId(String value) {
        this.toolId = value;
    }

    /**
     * 获取isVisible属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsVisible() {
        if (isVisible == null) {
            return true;
        } else {
            return isVisible;
        }
    }

    /**
     * 设置isVisible属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsVisible(Boolean value) {
        this.isVisible = value;
    }

    /**
     * 获取page属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPage() {
        return page;
    }

    /**
     * 设置page属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPage(String value) {
        this.page = value;
    }

    /**
     * 获取pageId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPageId() {
        return pageId;
    }

    /**
     * 设置pageId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPageId(String value) {
        this.pageId = value;
    }

    /**
     * 获取laneId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLaneId() {
        return laneId;
    }

    /**
     * 设置laneId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLaneId(String value) {
        this.laneId = value;
    }

    /**
     * 获取height属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getHeight() {
        return height;
    }

    /**
     * 设置height属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setHeight(Double value) {
        this.height = value;
    }

    /**
     * 获取width属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getWidth() {
        return width;
    }

    /**
     * 设置width属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWidth(Double value) {
        this.width = value;
    }

    /**
     * 获取borderColor属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBorderColor() {
        return borderColor;
    }

    /**
     * 设置borderColor属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBorderColor(String value) {
        this.borderColor = value;
    }

    /**
     * 获取fillColor属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFillColor() {
        return fillColor;
    }

    /**
     * 设置fillColor属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFillColor(String value) {
        this.fillColor = value;
    }

    /**
     * 获取shape属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShape() {
        return shape;
    }

    /**
     * 设置shape属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShape(String value) {
        this.shape = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
