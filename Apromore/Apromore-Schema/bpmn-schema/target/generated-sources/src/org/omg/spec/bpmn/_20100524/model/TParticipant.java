//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.04.18 时间 02:49:16 PM CST 
//


package org.omg.spec.bpmn._20100524.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * <p>tParticipant complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="tParticipant">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.omg.org/spec/BPMN/20100524/MODEL}tBaseElement">
 *       &lt;sequence>
 *         &lt;element name="interfaceRef" type="{http://www.w3.org/2001/XMLSchema}QName" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="endPointRef" type="{http://www.w3.org/2001/XMLSchema}QName" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}participantMultiplicity" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="processRef" type="{http://www.w3.org/2001/XMLSchema}QName" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tParticipant", propOrder = {
    "interfaceRef",
    "endPointRef",
    "participantMultiplicity"
})
public class TParticipant
    extends TBaseElement
    implements Visitable
{

    protected List<QName> interfaceRef;
    protected List<QName> endPointRef;
    protected TParticipantMultiplicity participantMultiplicity;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "processRef")
    protected QName processRef;

    /**
     * Gets the value of the interfaceRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the interfaceRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInterfaceRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QName }
     * 
     * 
     */
    public List<QName> getInterfaceRef() {
        if (interfaceRef == null) {
            interfaceRef = new ArrayList<QName>();
        }
        return this.interfaceRef;
    }

    /**
     * Gets the value of the endPointRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the endPointRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEndPointRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QName }
     * 
     * 
     */
    public List<QName> getEndPointRef() {
        if (endPointRef == null) {
            endPointRef = new ArrayList<QName>();
        }
        return this.endPointRef;
    }

    /**
     * 获取participantMultiplicity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TParticipantMultiplicity }
     *     
     */
    public TParticipantMultiplicity getParticipantMultiplicity() {
        return participantMultiplicity;
    }

    /**
     * 设置participantMultiplicity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TParticipantMultiplicity }
     *     
     */
    public void setParticipantMultiplicity(TParticipantMultiplicity value) {
        this.participantMultiplicity = value;
    }

    /**
     * 获取name属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * 设置name属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * 获取processRef属性的值。
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getProcessRef() {
        return processRef;
    }

    /**
     * 设置processRef属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setProcessRef(QName value) {
        this.processRef = value;
    }

    public void accept(Visitor aVisitor) {
        aVisitor.visit(this);
    }

}
