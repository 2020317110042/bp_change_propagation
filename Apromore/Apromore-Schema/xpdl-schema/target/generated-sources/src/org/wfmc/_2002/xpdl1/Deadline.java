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
 *         &lt;element name="DeadlineCondition" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="ExceptionName" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Execution">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="ASYNCHR"/>
 *             &lt;enumeration value="SYNCHR"/>
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
    "deadlineCondition",
    "exceptionName"
})
@XmlRootElement(name = "Deadline")
public class Deadline {

    @XmlElement(name = "DeadlineCondition", required = true)
    protected Object deadlineCondition;
    @XmlElement(name = "ExceptionName", required = true)
    protected Object exceptionName;
    @XmlAttribute(name = "Execution")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String execution;

    /**
     * 获取deadlineCondition属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDeadlineCondition() {
        return deadlineCondition;
    }

    /**
     * 设置deadlineCondition属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDeadlineCondition(Object value) {
        this.deadlineCondition = value;
    }

    /**
     * 获取exceptionName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getExceptionName() {
        return exceptionName;
    }

    /**
     * 设置exceptionName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setExceptionName(Object value) {
        this.exceptionName = value;
    }

    /**
     * 获取execution属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExecution() {
        return execution;
    }

    /**
     * 设置execution属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExecution(String value) {
        this.execution = value;
    }

}
