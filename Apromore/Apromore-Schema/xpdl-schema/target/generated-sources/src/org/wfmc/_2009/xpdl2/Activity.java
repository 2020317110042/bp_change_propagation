//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.04.18 时间 02:49:32 PM CST 
//


package org.wfmc._2009.xpdl2;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;
import org.wfmc._2002.xpdl1.FinishMode;
import org.wfmc._2002.xpdl1.StartMode;


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
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}Description" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}Limit" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}Route"/>
 *           &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}Implementation"/>
 *           &lt;choice minOccurs="0">
 *             &lt;element ref="{http://www.wfmc.org/2002/XPDL1.0}BlockActivity"/>
 *             &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}BlockActivity"/>
 *           &lt;/choice>
 *           &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}Event"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}Transaction" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}Performers" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}Performer" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2002/XPDL1.0}StartMode" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2002/XPDL1.0}FinishMode" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}Priority" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{http://www.wfmc.org/2002/XPDL1.0}Deadline" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}Deadline" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}SimulationInformation" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}Icon" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}Documentation" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}TransitionRestrictions" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}ExtendedAttributes" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}DataFields" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}FormalParameters" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}ActualParameters" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}InputSets" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}OutputSets" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}IORules" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}Loop" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}Assignments" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}Object" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}NodeGraphicsInfos" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;sequence>
 *             &lt;element name="Extensions" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *             &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="Id" use="required" type="{http://www.wfmc.org/2009/XPDL2.2}Id" />
 *       &lt;attribute name="IsForCompensation" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="StartActivity" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Status" default="None">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="None"/>
 *             &lt;enumeration value="Ready"/>
 *             &lt;enumeration value="Active"/>
 *             &lt;enumeration value="Cancelled"/>
 *             &lt;enumeration value="Aborting"/>
 *             &lt;enumeration value="Aborted"/>
 *             &lt;enumeration value="Completing"/>
 *             &lt;enumeration value="Completed"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="StartMode">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="Automatic"/>
 *             &lt;enumeration value="Manual"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="FinishMode">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="Automatic"/>
 *             &lt;enumeration value="Manual"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="StartQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" default="1" />
 *       &lt;attribute name="CompletionQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" default="1" />
 *       &lt;attribute name="IsATransaction" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "content"
})
@XmlRootElement(name = "Activity")
public class Activity {

    @XmlElementRefs({
        @XmlElementRef(name = "Description", namespace = "http://www.wfmc.org/2009/XPDL2.2", type = Description.class, required = false),
        @XmlElementRef(name = "OutputSets", namespace = "http://www.wfmc.org/2009/XPDL2.2", type = OutputSets.class, required = false),
        @XmlElementRef(name = "ActualParameters", namespace = "http://www.wfmc.org/2009/XPDL2.2", type = ActualParameters.class, required = false),
        @XmlElementRef(name = "Object", namespace = "http://www.wfmc.org/2009/XPDL2.2", type = org.wfmc._2009.xpdl2.Object.class, required = false),
        @XmlElementRef(name = "Priority", namespace = "http://www.wfmc.org/2009/XPDL2.2", type = Priority.class, required = false),
        @XmlElementRef(name = "Documentation", namespace = "http://www.wfmc.org/2009/XPDL2.2", type = Documentation.class, required = false),
        @XmlElementRef(name = "TransitionRestrictions", namespace = "http://www.wfmc.org/2009/XPDL2.2", type = TransitionRestrictions.class, required = false),
        @XmlElementRef(name = "Event", namespace = "http://www.wfmc.org/2009/XPDL2.2", type = Event.class, required = false),
        @XmlElementRef(name = "BlockActivity", namespace = "http://www.wfmc.org/2002/XPDL1.0", type = org.wfmc._2002.xpdl1.BlockActivity.class, required = false),
        @XmlElementRef(name = "DataFields", namespace = "http://www.wfmc.org/2009/XPDL2.2", type = DataFields.class, required = false),
        @XmlElementRef(name = "InputSets", namespace = "http://www.wfmc.org/2009/XPDL2.2", type = InputSets.class, required = false),
        @XmlElementRef(name = "Deadline", namespace = "http://www.wfmc.org/2002/XPDL1.0", type = org.wfmc._2002.xpdl1.Deadline.class, required = false),
        @XmlElementRef(name = "Deadline", namespace = "http://www.wfmc.org/2009/XPDL2.2", type = org.wfmc._2009.xpdl2.Deadline.class, required = false),
        @XmlElementRef(name = "FinishMode", namespace = "http://www.wfmc.org/2002/XPDL1.0", type = FinishMode.class, required = false),
        @XmlElementRef(name = "FormalParameters", namespace = "http://www.wfmc.org/2009/XPDL2.2", type = FormalParameters.class, required = false),
        @XmlElementRef(name = "Performers", namespace = "http://www.wfmc.org/2009/XPDL2.2", type = Performers.class, required = false),
        @XmlElementRef(name = "SimulationInformation", namespace = "http://www.wfmc.org/2009/XPDL2.2", type = SimulationInformation.class, required = false),
        @XmlElementRef(name = "Limit", namespace = "http://www.wfmc.org/2009/XPDL2.2", type = Limit.class, required = false),
        @XmlElementRef(name = "Extensions", namespace = "http://www.wfmc.org/2009/XPDL2.2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Implementation", namespace = "http://www.wfmc.org/2009/XPDL2.2", type = Implementation.class, required = false),
        @XmlElementRef(name = "NodeGraphicsInfos", namespace = "http://www.wfmc.org/2009/XPDL2.2", type = NodeGraphicsInfos.class, required = false),
        @XmlElementRef(name = "IORules", namespace = "http://www.wfmc.org/2009/XPDL2.2", type = IORules.class, required = false),
        @XmlElementRef(name = "ExtendedAttributes", namespace = "http://www.wfmc.org/2009/XPDL2.2", type = ExtendedAttributes.class, required = false),
        @XmlElementRef(name = "StartMode", namespace = "http://www.wfmc.org/2002/XPDL1.0", type = StartMode.class, required = false),
        @XmlElementRef(name = "Loop", namespace = "http://www.wfmc.org/2009/XPDL2.2", type = Loop.class, required = false),
        @XmlElementRef(name = "Icon", namespace = "http://www.wfmc.org/2009/XPDL2.2", type = Icon.class, required = false),
        @XmlElementRef(name = "BlockActivity", namespace = "http://www.wfmc.org/2009/XPDL2.2", type = org.wfmc._2009.xpdl2.BlockActivity.class, required = false),
        @XmlElementRef(name = "Assignments", namespace = "http://www.wfmc.org/2009/XPDL2.2", type = Assignments.class, required = false),
        @XmlElementRef(name = "Route", namespace = "http://www.wfmc.org/2009/XPDL2.2", type = Route.class, required = false),
        @XmlElementRef(name = "Performer", namespace = "http://www.wfmc.org/2009/XPDL2.2", type = Performer.class, required = false),
        @XmlElementRef(name = "Transaction", namespace = "http://www.wfmc.org/2009/XPDL2.2", type = Transaction.class, required = false)
    })
    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> content;
    @XmlAttribute(name = "Id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String id;
    @XmlAttribute(name = "IsForCompensation")
    protected Boolean isForCompensation;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "StartActivity")
    protected Boolean startActivity;
    @XmlAttribute(name = "Status")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String status;
    @XmlAttribute(name = "StartMode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String startMode;
    @XmlAttribute(name = "FinishMode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String finishMode;
    @XmlAttribute(name = "StartQuantity")
    protected BigInteger startQuantity;
    @XmlAttribute(name = "CompletionQuantity")
    protected BigInteger completionQuantity;
    @XmlAttribute(name = "IsATransaction")
    protected Boolean isATransaction;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * 获取内容模型的其余部分。
     * 
     * <p>
     * 由于以下原因, 您获取的是此 "catch-all" 属性: 
     * 字段名称 "BlockActivity" 由模式的两个不同部分使用。请参阅: 
     * file:/D:/Apromore/Apromore-Schema/xpdl-schema/src/main/xsd/bpmnxpdl_40a_modified.xsd的第 40 行
     * file:/D:/Apromore/Apromore-Schema/xpdl-schema/src/main/xsd/bpmnxpdl_40a_modified.xsd的第 39 行
     * <p>
     * 要清除此属性, 请将属性定制设置应用于以下两个声明
     * 或其中一个以更改其名称: 
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description }
     * {@link OutputSets }
     * {@link java.lang.Object }
     * {@link ActualParameters }
     * {@link org.wfmc._2009.xpdl2.Object }
     * {@link Priority }
     * {@link Documentation }
     * {@link TransitionRestrictions }
     * {@link Element }
     * {@link Event }
     * {@link org.wfmc._2002.xpdl1.BlockActivity }
     * {@link DataFields }
     * {@link InputSets }
     * {@link org.wfmc._2002.xpdl1.Deadline }
     * {@link org.wfmc._2009.xpdl2.Deadline }
     * {@link FinishMode }
     * {@link FormalParameters }
     * {@link Performers }
     * {@link SimulationInformation }
     * {@link Limit }
     * {@link JAXBElement }{@code <}{@link java.lang.Object }{@code >}
     * {@link Implementation }
     * {@link NodeGraphicsInfos }
     * {@link IORules }
     * {@link ExtendedAttributes }
     * {@link StartMode }
     * {@link Loop }
     * {@link Icon }
     * {@link org.wfmc._2009.xpdl2.BlockActivity }
     * {@link Assignments }
     * {@link Route }
     * {@link Performer }
     * {@link Transaction }
     * 
     * 
     */
    public List<java.lang.Object> getContent() {
        if (content == null) {
            content = new ArrayList<java.lang.Object>();
        }
        return this.content;
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

    /**
     * 获取isForCompensation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsForCompensation() {
        if (isForCompensation == null) {
            return false;
        } else {
            return isForCompensation;
        }
    }

    /**
     * 设置isForCompensation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsForCompensation(Boolean value) {
        this.isForCompensation = value;
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
     * 获取startActivity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStartActivity() {
        return startActivity;
    }

    /**
     * 设置startActivity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStartActivity(Boolean value) {
        this.startActivity = value;
    }

    /**
     * 获取status属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        if (status == null) {
            return "None";
        } else {
            return status;
        }
    }

    /**
     * 设置status属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * 获取startMode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartMode() {
        return startMode;
    }

    /**
     * 设置startMode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartMode(String value) {
        this.startMode = value;
    }

    /**
     * 获取finishMode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinishMode() {
        return finishMode;
    }

    /**
     * 设置finishMode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinishMode(String value) {
        this.finishMode = value;
    }

    /**
     * 获取startQuantity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStartQuantity() {
        if (startQuantity == null) {
            return new BigInteger("1");
        } else {
            return startQuantity;
        }
    }

    /**
     * 设置startQuantity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStartQuantity(BigInteger value) {
        this.startQuantity = value;
    }

    /**
     * 获取completionQuantity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCompletionQuantity() {
        if (completionQuantity == null) {
            return new BigInteger("1");
        } else {
            return completionQuantity;
        }
    }

    /**
     * 设置completionQuantity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCompletionQuantity(BigInteger value) {
        this.completionQuantity = value;
    }

    /**
     * 获取isATransaction属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsATransaction() {
        if (isATransaction == null) {
            return false;
        } else {
            return isATransaction;
        }
    }

    /**
     * 设置isATransaction属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsATransaction(Boolean value) {
        this.isATransaction = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
