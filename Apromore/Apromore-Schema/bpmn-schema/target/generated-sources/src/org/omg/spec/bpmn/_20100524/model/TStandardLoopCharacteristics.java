//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.04.18 时间 02:49:16 PM CST 
//


package org.omg.spec.bpmn._20100524.model;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>tStandardLoopCharacteristics complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="tStandardLoopCharacteristics">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.omg.org/spec/BPMN/20100524/MODEL}tLoopCharacteristics">
 *       &lt;sequence>
 *         &lt;element name="loopCondition" type="{http://www.omg.org/spec/BPMN/20100524/MODEL}tExpression" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="testBefore" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="loopMaximum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tStandardLoopCharacteristics", propOrder = {
    "loopCondition"
})
public class TStandardLoopCharacteristics
    extends TLoopCharacteristics
    implements Visitable
{

    protected TExpression loopCondition;
    @XmlAttribute(name = "testBefore")
    protected Boolean testBefore;
    @XmlAttribute(name = "loopMaximum")
    protected BigInteger loopMaximum;

    /**
     * 获取loopCondition属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TExpression }
     *     
     */
    public TExpression getLoopCondition() {
        return loopCondition;
    }

    /**
     * 设置loopCondition属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TExpression }
     *     
     */
    public void setLoopCondition(TExpression value) {
        this.loopCondition = value;
    }

    /**
     * 获取testBefore属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isTestBefore() {
        if (testBefore == null) {
            return false;
        } else {
            return testBefore;
        }
    }

    /**
     * 设置testBefore属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTestBefore(Boolean value) {
        this.testBefore = value;
    }

    /**
     * 获取loopMaximum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLoopMaximum() {
        return loopMaximum;
    }

    /**
     * 设置loopMaximum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLoopMaximum(BigInteger value) {
        this.loopMaximum = value;
    }

    public void accept(Visitor aVisitor) {
        aVisitor.visit(this);
    }

}
