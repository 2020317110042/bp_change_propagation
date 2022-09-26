//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.04.18 时间 02:49:16 PM CST 
//


package org.omg.spec.bpmn._20100524.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>tParticipantMultiplicity complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="tParticipantMultiplicity">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.omg.org/spec/BPMN/20100524/MODEL}tBaseElement">
 *       &lt;attribute name="minimum" type="{http://www.w3.org/2001/XMLSchema}int" default="0" />
 *       &lt;attribute name="maximum" type="{http://www.w3.org/2001/XMLSchema}int" default="1" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tParticipantMultiplicity")
public class TParticipantMultiplicity
    extends TBaseElement
    implements Visitable
{

    @XmlAttribute(name = "minimum")
    protected Integer minimum;
    @XmlAttribute(name = "maximum")
    protected Integer maximum;

    /**
     * 获取minimum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getMinimum() {
        if (minimum == null) {
            return  0;
        } else {
            return minimum;
        }
    }

    /**
     * 设置minimum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinimum(Integer value) {
        this.minimum = value;
    }

    /**
     * 获取maximum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getMaximum() {
        if (maximum == null) {
            return  1;
        } else {
            return maximum;
        }
    }

    /**
     * 设置maximum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaximum(Integer value) {
        this.maximum = value;
    }

    public void accept(Visitor aVisitor) {
        aVisitor.visit(this);
    }

}
