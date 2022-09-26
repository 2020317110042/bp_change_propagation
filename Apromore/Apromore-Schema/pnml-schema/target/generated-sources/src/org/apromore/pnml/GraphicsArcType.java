//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.04.18 时间 02:49:28 PM CST 
//


package org.apromore.pnml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>graphicsArcType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="graphicsArcType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="position" type="{pnml.apromore.org}positionType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "graphicsArcType", propOrder = {
    "position",
    "line"
})
public class GraphicsArcType {

    protected List<PositionType> position;
    protected Line line;

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
     * {@link PositionType }
     * 
     * 
     */
    public List<PositionType> getPosition() {
        if (position == null) {
            position = new ArrayList<PositionType>();
        }
        return this.position;
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
