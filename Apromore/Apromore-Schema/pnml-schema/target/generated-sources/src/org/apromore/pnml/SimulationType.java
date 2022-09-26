//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.04.18 时间 02:49:28 PM CST 
//


package org.apromore.pnml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>simulationType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="simulationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="simulationname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="simulationdate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="transitionsequence" type="{pnml.apromore.org}transitionsequenceType"/>
 *         &lt;element name="netFingerprint" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "simulationType", propOrder = {
    "simulationname",
    "simulationdate",
    "transitionsequence",
    "netFingerprint"
})
public class SimulationType {

    @XmlElement(required = true)
    protected String simulationname;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar simulationdate;
    @XmlElement(required = true)
    protected TransitionsequenceType transitionsequence;
    @XmlElement(required = true)
    protected String netFingerprint;
    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * 获取simulationname属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSimulationname() {
        return simulationname;
    }

    /**
     * 设置simulationname属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSimulationname(String value) {
        this.simulationname = value;
    }

    /**
     * 获取simulationdate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSimulationdate() {
        return simulationdate;
    }

    /**
     * 设置simulationdate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSimulationdate(XMLGregorianCalendar value) {
        this.simulationdate = value;
    }

    /**
     * 获取transitionsequence属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TransitionsequenceType }
     *     
     */
    public TransitionsequenceType getTransitionsequence() {
        return transitionsequence;
    }

    /**
     * 设置transitionsequence属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TransitionsequenceType }
     *     
     */
    public void setTransitionsequence(TransitionsequenceType value) {
        this.transitionsequence = value;
    }

    /**
     * 获取netFingerprint属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetFingerprint() {
        return netFingerprint;
    }

    /**
     * 设置netFingerprint属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetFingerprint(String value) {
        this.netFingerprint = value;
    }

    /**
     * 获取id属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * 设置id属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
