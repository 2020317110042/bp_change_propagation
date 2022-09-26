//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.04.18 时间 02:49:32 PM CST 
//


package org.wfmc._2009.xpdl2;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="ResourceCostName">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="100"/>
 *               &lt;minLength value="0"/>
 *               &lt;whiteSpace value="preserve"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ResourceCost">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CostUnitOfTime">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *               &lt;enumeration value="second"/>
 *               &lt;enumeration value="minute"/>
 *               &lt;enumeration value="hour"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "resourceCostName",
    "resourceCost",
    "costUnitOfTime"
})
@XmlRootElement(name = "ResourceCosts")
public class ResourceCosts {

    @XmlElement(name = "ResourceCostName", required = true)
    protected String resourceCostName;
    @XmlElement(name = "ResourceCost", required = true)
    protected BigDecimal resourceCost;
    @XmlElement(name = "CostUnitOfTime", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String costUnitOfTime;

    /**
     * 获取resourceCostName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResourceCostName() {
        return resourceCostName;
    }

    /**
     * 设置resourceCostName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResourceCostName(String value) {
        this.resourceCostName = value;
    }

    /**
     * 获取resourceCost属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getResourceCost() {
        return resourceCost;
    }

    /**
     * 设置resourceCost属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setResourceCost(BigDecimal value) {
        this.resourceCost = value;
    }

    /**
     * 获取costUnitOfTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCostUnitOfTime() {
        return costUnitOfTime;
    }

    /**
     * 设置costUnitOfTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCostUnitOfTime(String value) {
        this.costUnitOfTime = value;
    }

}
