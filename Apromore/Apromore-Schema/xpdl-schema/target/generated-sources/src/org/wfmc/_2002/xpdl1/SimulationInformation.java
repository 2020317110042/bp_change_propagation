//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.04.18 时间 02:49:32 PM CST 
//


package org.wfmc._2002.xpdl1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 *         &lt;element ref="{http://www.wfmc.org/2002/XPDL1.0}Cost"/>
 *         &lt;element ref="{http://www.wfmc.org/2002/XPDL1.0}TimeEstimation"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Instantiation">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="ONCE"/>
 *             &lt;enumeration value="MULTIPLE"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "cost",
    "timeEstimation"
})
@XmlRootElement(name = "SimulationInformation")
public class SimulationInformation {

    @XmlElement(name = "Cost", required = true)
    protected String cost;
    @XmlElement(name = "TimeEstimation", required = true)
    protected TimeEstimation timeEstimation;
    @XmlAttribute(name = "Instantiation")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String instantiation;

    /**
     * 获取cost属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCost() {
        return cost;
    }

    /**
     * 设置cost属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCost(String value) {
        this.cost = value;
    }

    /**
     * 获取timeEstimation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TimeEstimation }
     *     
     */
    public TimeEstimation getTimeEstimation() {
        return timeEstimation;
    }

    /**
     * 设置timeEstimation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TimeEstimation }
     *     
     */
    public void setTimeEstimation(TimeEstimation value) {
        this.timeEstimation = value;
    }

    /**
     * 获取instantiation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstantiation() {
        return instantiation;
    }

    /**
     * 设置instantiation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstantiation(String value) {
        this.instantiation = value;
    }

}
