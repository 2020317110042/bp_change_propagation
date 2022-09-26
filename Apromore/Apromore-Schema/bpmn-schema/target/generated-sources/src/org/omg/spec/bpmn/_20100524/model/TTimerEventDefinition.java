//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.04.18 时间 02:49:16 PM CST 
//


package org.omg.spec.bpmn._20100524.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>tTimerEventDefinition complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="tTimerEventDefinition">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.omg.org/spec/BPMN/20100524/MODEL}tEventDefinition">
 *       &lt;choice>
 *         &lt;element name="timeDate" type="{http://www.omg.org/spec/BPMN/20100524/MODEL}tExpression" minOccurs="0"/>
 *         &lt;element name="timeDuration" type="{http://www.omg.org/spec/BPMN/20100524/MODEL}tExpression" minOccurs="0"/>
 *         &lt;element name="timeCycle" type="{http://www.omg.org/spec/BPMN/20100524/MODEL}tExpression" minOccurs="0"/>
 *       &lt;/choice>
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tTimerEventDefinition", propOrder = {
    "timeDate",
    "timeDuration",
    "timeCycle"
})
public class TTimerEventDefinition
    extends TEventDefinition
    implements Visitable
{

    protected TExpression timeDate;
    protected TExpression timeDuration;
    protected TExpression timeCycle;

    /**
     * 获取timeDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TExpression }
     *     
     */
    public TExpression getTimeDate() {
        return timeDate;
    }

    /**
     * 设置timeDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TExpression }
     *     
     */
    public void setTimeDate(TExpression value) {
        this.timeDate = value;
    }

    /**
     * 获取timeDuration属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TExpression }
     *     
     */
    public TExpression getTimeDuration() {
        return timeDuration;
    }

    /**
     * 设置timeDuration属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TExpression }
     *     
     */
    public void setTimeDuration(TExpression value) {
        this.timeDuration = value;
    }

    /**
     * 获取timeCycle属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TExpression }
     *     
     */
    public TExpression getTimeCycle() {
        return timeCycle;
    }

    /**
     * 设置timeCycle属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TExpression }
     *     
     */
    public void setTimeCycle(TExpression value) {
        this.timeCycle = value;
    }

    public void accept(Visitor aVisitor) {
        aVisitor.visit(this);
    }

}
