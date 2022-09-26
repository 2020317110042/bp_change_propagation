//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.04.18 时间 02:49:09 PM CST 
//


package org.apromore.anf;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GraphicsType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="GraphicsType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.apromore.org/ANF}AnnotationType">
 *       &lt;sequence>
 *         &lt;element name="position" type="{http://www.apromore.org/ANF}positionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="size" type="{http://www.apromore.org/ANF}sizeType" minOccurs="0"/>
 *         &lt;element name="fill" type="{http://www.apromore.org/ANF}fillType" minOccurs="0"/>
 *         &lt;element name="line" type="{http://www.apromore.org/ANF}lineType" minOccurs="0"/>
 *         &lt;element name="font" type="{http://www.apromore.org/ANF}fontType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GraphicsType", namespace = "http://www.apromore.org/ANF", propOrder = {
    "position",
    "size",
    "fill",
    "line",
    "font"
})
public class GraphicsType
    extends AnnotationType
    implements Visitable
{

    protected List<PositionType> position;
    protected SizeType size;
    protected FillType fill;
    protected LineType line;
    protected FontType font;

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
     * 获取size属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SizeType }
     *     
     */
    public SizeType getSize() {
        return size;
    }

    /**
     * 设置size属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SizeType }
     *     
     */
    public void setSize(SizeType value) {
        this.size = value;
    }

    /**
     * 获取fill属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FillType }
     *     
     */
    public FillType getFill() {
        return fill;
    }

    /**
     * 设置fill属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FillType }
     *     
     */
    public void setFill(FillType value) {
        this.fill = value;
    }

    /**
     * 获取line属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LineType }
     *     
     */
    public LineType getLine() {
        return line;
    }

    /**
     * 设置line属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LineType }
     *     
     */
    public void setLine(LineType value) {
        this.line = value;
    }

    /**
     * 获取font属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FontType }
     *     
     */
    public FontType getFont() {
        return font;
    }

    /**
     * 设置font属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FontType }
     *     
     */
    public void setFont(FontType value) {
        this.font = value;
    }

    public void accept(Visitor aVisitor) {
        aVisitor.visit(this);
    }

}
