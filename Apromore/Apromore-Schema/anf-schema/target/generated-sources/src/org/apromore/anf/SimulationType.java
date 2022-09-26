//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.04.18 时间 02:49:09 PM CST 
//


package org.apromore.anf;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SimulationType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SimulationType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.apromore.org/ANF}AnnotationType">
 *       &lt;attribute name="cpfType" type="{http://www.apromore.org/ANF}cpfTypeEnum" />
 *       &lt;attribute name="probability" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="time" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="timeUnit" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="InitialMarking" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SimulationType", namespace = "http://www.apromore.org/ANF")
public class SimulationType
    extends AnnotationType
    implements Visitable
{

    @XmlAttribute(name = "cpfType")
    protected CpfTypeEnum cpfType;
    @XmlAttribute(name = "probability")
    protected Double probability;
    @XmlAttribute(name = "time")
    protected BigInteger time;
    @XmlAttribute(name = "timeUnit")
    protected BigInteger timeUnit;
    @XmlAttribute(name = "InitialMarking")
    protected String initialMarking;

    /**
     * 获取cpfType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CpfTypeEnum }
     *     
     */
    public CpfTypeEnum getCpfType() {
        return cpfType;
    }

    /**
     * 设置cpfType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CpfTypeEnum }
     *     
     */
    public void setCpfType(CpfTypeEnum value) {
        this.cpfType = value;
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
     * 获取time属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTime() {
        return time;
    }

    /**
     * 设置time属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTime(BigInteger value) {
        this.time = value;
    }

    /**
     * 获取timeUnit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTimeUnit() {
        return timeUnit;
    }

    /**
     * 设置timeUnit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTimeUnit(BigInteger value) {
        this.timeUnit = value;
    }

    /**
     * 获取initialMarking属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitialMarking() {
        return initialMarking;
    }

    /**
     * 设置initialMarking属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitialMarking(String value) {
        this.initialMarking = value;
    }

    public void accept(Visitor aVisitor) {
        aVisitor.visit(this);
    }

}
