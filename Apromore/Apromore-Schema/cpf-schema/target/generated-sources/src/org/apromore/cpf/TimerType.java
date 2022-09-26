//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.04.18 时间 02:49:23 PM CST 
//


package org.apromore.cpf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Timer that captures a timeout or a delay in the process model. If the source language supports specifying formal attributes for a timer, then one of the timer attributes should be used. 
 * 		<p>The attributes {@link #timeExpression}, {@link #timeDate}, {@link #timeDuration} are mutually exclusive.
 * 
 * <p>TimerType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="TimerType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.apromore.org/CPF}EventType">
 *       &lt;sequence>
 *         &lt;element name="timeExpression" type="{http://www.apromore.org/CPF}TimerExpressionType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="timeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="timeDuration" type="{http://www.w3.org/2001/XMLSchema}duration" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimerType", namespace = "http://www.apromore.org/CPF", propOrder = {
    "timeExpression"
})
public class TimerType
    extends EventType
    implements Visitable
{

    protected TimerExpressionType timeExpression;
    @XmlAttribute(name = "timeDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeDate;
    @XmlAttribute(name = "timeDuration")
    protected Duration timeDuration;

    /**
     * Uses the expression to
     *                                         query the current data of the
     *                                         Net (@link NetType#Object) to
     *                                         retrieve a dateTime or duration.
     *                                     
     * 
     * @return
     *     possible object is
     *     {@link TimerExpressionType }
     *     
     */
    public TimerExpressionType getTimeExpression() {
        return timeExpression;
    }

    /**
     * 设置timeExpression属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TimerExpressionType }
     *     
     */
    public void setTimeExpression(TimerExpressionType value) {
        this.timeExpression = value;
    }

    /**
     * Specify the timer event to
     *                                     happen at an exact date and time.
     *                                 
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeDate() {
        return timeDate;
    }

    /**
     * 设置timeDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeDate(XMLGregorianCalendar value) {
        this.timeDate = value;
    }

    /**
     * Specify the timer event to
     *                                     happen after a certain amount of
     *                                     time.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getTimeDuration() {
        return timeDuration;
    }

    /**
     * 设置timeDuration属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setTimeDuration(Duration value) {
        this.timeDuration = value;
    }

    public void accept(Visitor aVisitor) {
        aVisitor.visit(this);
    }

}
