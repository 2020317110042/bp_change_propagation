//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.04.18 时间 02:49:32 PM CST 
//


package org.wfmc._2002.xpdl1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.wfmc.org/2002/XPDL1.0}Automatic"/>
 *         &lt;element ref="{http://www.wfmc.org/2002/XPDL1.0}Manual"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "automatic",
    "manual"
})
@XmlRootElement(name = "FinishMode")
public class FinishMode {

    @XmlElement(name = "Automatic")
    protected Automatic automatic;
    @XmlElement(name = "Manual")
    protected Manual manual;

    /**
     * 获取automatic属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Automatic }
     *     
     */
    public Automatic getAutomatic() {
        return automatic;
    }

    /**
     * 设置automatic属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Automatic }
     *     
     */
    public void setAutomatic(Automatic value) {
        this.automatic = value;
    }

    /**
     * 获取manual属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Manual }
     *     
     */
    public Manual getManual() {
        return manual;
    }

    /**
     * 设置manual属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Manual }
     *     
     */
    public void setManual(Manual value) {
        this.manual = value;
    }

}
