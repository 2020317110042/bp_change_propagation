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
 *         &lt;element ref="{http://www.wfmc.org/2002/XPDL1.0}Created" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2002/XPDL1.0}Description" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2002/XPDL1.0}Priority" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2002/XPDL1.0}Limit" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2002/XPDL1.0}ValidFrom" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2002/XPDL1.0}ValidTo" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2002/XPDL1.0}TimeEstimation" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="DurationUnit">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="Y"/>
 *             &lt;enumeration value="M"/>
 *             &lt;enumeration value="D"/>
 *             &lt;enumeration value="h"/>
 *             &lt;enumeration value="m"/>
 *             &lt;enumeration value="s"/>
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
    "created",
    "description",
    "priority",
    "limit",
    "validFrom",
    "validTo",
    "timeEstimation"
})
@XmlRootElement(name = "ProcessHeader")
public class ProcessHeader {

    @XmlElement(name = "Created")
    protected String created;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Priority")
    protected String priority;
    @XmlElement(name = "Limit")
    protected String limit;
    @XmlElement(name = "ValidFrom")
    protected String validFrom;
    @XmlElement(name = "ValidTo")
    protected String validTo;
    @XmlElement(name = "TimeEstimation")
    protected TimeEstimation timeEstimation;
    @XmlAttribute(name = "DurationUnit")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String durationUnit;

    /**
     * 获取created属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreated() {
        return created;
    }

    /**
     * 设置created属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreated(String value) {
        this.created = value;
    }

    /**
     * 获取description属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置description属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * 获取priority属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriority() {
        return priority;
    }

    /**
     * 设置priority属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriority(String value) {
        this.priority = value;
    }

    /**
     * 获取limit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLimit() {
        return limit;
    }

    /**
     * 设置limit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLimit(String value) {
        this.limit = value;
    }

    /**
     * 获取validFrom属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidFrom() {
        return validFrom;
    }

    /**
     * 设置validFrom属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidFrom(String value) {
        this.validFrom = value;
    }

    /**
     * 获取validTo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidTo() {
        return validTo;
    }

    /**
     * 设置validTo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidTo(String value) {
        this.validTo = value;
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
     * 获取durationUnit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDurationUnit() {
        return durationUnit;
    }

    /**
     * 设置durationUnit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDurationUnit(String value) {
        this.durationUnit = value;
    }

}
