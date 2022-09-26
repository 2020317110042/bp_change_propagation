//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.04.18 时间 02:49:28 PM CST 
//


package org.apromore.pnml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>arcToolspecificType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="arcToolspecificType">
 *   &lt;complexContent>
 *     &lt;extension base="{pnml.apromore.org}toolspecificType">
 *       &lt;sequence>
 *         &lt;element name="graphh" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="probability" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="displayProbabilityOn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="displayProbabilityPosition" type="{pnml.apromore.org}positionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "arcToolspecificType", propOrder = {
    "graphh",
    "probability",
    "displayProbabilityOn",
    "displayProbabilityPosition"
})
public class ArcToolspecificType
    extends ToolspecificType
{

    protected Boolean graphh;
    protected Double probability;
    protected Boolean displayProbabilityOn;
    protected PositionType displayProbabilityPosition;

    /**
     * 获取graphh属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGraphh() {
        return graphh;
    }

    /**
     * 设置graphh属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGraphh(Boolean value) {
        this.graphh = value;
    }

    /**
     * 获取probability属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getProbability() {
        return probability;
    }

    /**
     * 设置probability属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setProbability(Double value) {
        this.probability = value;
    }

    /**
     * 获取displayProbabilityOn属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisplayProbabilityOn() {
        return displayProbabilityOn;
    }

    /**
     * 设置displayProbabilityOn属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisplayProbabilityOn(Boolean value) {
        this.displayProbabilityOn = value;
    }

    /**
     * 获取displayProbabilityPosition属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PositionType }
     *     
     */
    public PositionType getDisplayProbabilityPosition() {
        return displayProbabilityPosition;
    }

    /**
     * 设置displayProbabilityPosition属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PositionType }
     *     
     */
    public void setDisplayProbabilityPosition(PositionType value) {
        this.displayProbabilityPosition = value;
    }

}
