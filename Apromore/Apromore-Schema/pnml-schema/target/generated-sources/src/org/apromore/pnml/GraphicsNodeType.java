//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.04.18 时间 02:49:28 PM CST 
//


package org.apromore.pnml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>graphicsNodeType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="graphicsNodeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="position" type="{pnml.apromore.org}positionType"/>
 *         &lt;element name="dimension" type="{pnml.apromore.org}dimensionType" minOccurs="0"/>
 *         &lt;element ref="{pnml.apromore.org}fill" minOccurs="0"/>
 *         &lt;element ref="{pnml.apromore.org}line" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "graphicsNodeType", propOrder = {
    "position",
    "dimension",
    "fill",
    "line"
})
public class GraphicsNodeType {

    @XmlElement(required = true)
    protected PositionType position;
    protected DimensionType dimension;
    protected Fill fill;
    protected Line line;

    /**
     * 获取position属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PositionType }
     *     
     */
    public PositionType getPosition() {
        return position;
    }

    /**
     * 设置position属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PositionType }
     *     
     */
    public void setPosition(PositionType value) {
        this.position = value;
    }

    /**
     * 获取dimension属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DimensionType }
     *     
     */
    public DimensionType getDimension() {
        return dimension;
    }

    /**
     * 设置dimension属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DimensionType }
     *     
     */
    public void setDimension(DimensionType value) {
        this.dimension = value;
    }

    /**
     * 获取fill属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Fill }
     *     
     */
    public Fill getFill() {
        return fill;
    }

    /**
     * 设置fill属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Fill }
     *     
     */
    public void setFill(Fill value) {
        this.fill = value;
    }

    /**
     * 获取line属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Line }
     *     
     */
    public Line getLine() {
        return line;
    }

    /**
     * 设置line属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Line }
     *     
     */
    public void setLine(Line value) {
        this.line = value;
    }

}
