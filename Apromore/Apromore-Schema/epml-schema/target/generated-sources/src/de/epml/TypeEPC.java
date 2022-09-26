//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.04.18 时间 02:49:26 PM CST 
//


package de.epml;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>typeEPC complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="typeEPC">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.epml.de}tExtensibleElements">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="configurationRequirement" type="{http://www.epml.de}typeCReq"/>
 *           &lt;element name="configurationGuideline" type="{http://www.epml.de}typeCReq"/>
 *           &lt;element name="configurationOrder" type="{http://www.epml.de}typeCOrder"/>
 *         &lt;/choice>
 *         &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="event" type="{http://www.epml.de}typeEvent" minOccurs="0"/>
 *           &lt;element name="function" type="{http://www.epml.de}typeFunction" minOccurs="0"/>
 *           &lt;element name="role" type="{http://www.epml.de}typeRole" minOccurs="0"/>
 *           &lt;element name="object" type="{http://www.epml.de}typeObject" minOccurs="0"/>
 *           &lt;element name="processInterface" type="{http://www.epml.de}typeProcessInterface" minOccurs="0"/>
 *           &lt;element name="and" type="{http://www.epml.de}typeAND" minOccurs="0"/>
 *           &lt;element name="or" type="{http://www.epml.de}typeOR" minOccurs="0"/>
 *           &lt;element name="xor" type="{http://www.epml.de}typeXOR" minOccurs="0"/>
 *           &lt;element name="range" type="{http://www.epml.de}typeRANGE" minOccurs="0"/>
 *           &lt;element name="arc" type="{http://www.epml.de}typeArc" minOccurs="0"/>
 *           &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="epcId" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeEPC", propOrder = {
    "configurationRequirementOrConfigurationGuidelineOrConfigurationOrder",
    "eventAndFunctionAndRole"
})
public class TypeEPC
    extends TExtensibleElements
{

    @XmlElementRefs({
        @XmlElementRef(name = "configurationRequirement", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "configurationGuideline", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "configurationOrder", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> configurationRequirementOrConfigurationGuidelineOrConfigurationOrder;
    @XmlElementRefs({
        @XmlElementRef(name = "object", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "xor", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "processInterface", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "and", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "or", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "arc", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "function", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "range", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "event", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "role", type = JAXBElement.class, required = false)
    })
    @XmlAnyElement(lax = true)
    protected List<Object> eventAndFunctionAndRole;
    @XmlAttribute(name = "epcId", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger epcId;
    @XmlAttribute(name = "name", required = true)
    protected String name;

    /**
     * Gets the value of the configurationRequirementOrConfigurationGuidelineOrConfigurationOrder property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the configurationRequirementOrConfigurationGuidelineOrConfigurationOrder property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConfigurationRequirementOrConfigurationGuidelineOrConfigurationOrder().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link TypeCReq }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeCReq }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeCOrder }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getConfigurationRequirementOrConfigurationGuidelineOrConfigurationOrder() {
        if (configurationRequirementOrConfigurationGuidelineOrConfigurationOrder == null) {
            configurationRequirementOrConfigurationGuidelineOrConfigurationOrder = new ArrayList<JAXBElement<?>>();
        }
        return this.configurationRequirementOrConfigurationGuidelineOrConfigurationOrder;
    }

    /**
     * Gets the value of the eventAndFunctionAndRole property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eventAndFunctionAndRole property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEventAndFunctionAndRole().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link TypeObject }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeXOR }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeProcessInterface }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeAND }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOR }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeArc }{@code >}
     * {@link Object }
     * {@link JAXBElement }{@code <}{@link TypeFunction }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeRANGE }{@code >}
     * {@link Element }
     * {@link JAXBElement }{@code <}{@link TypeEvent }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeRole }{@code >}
     * 
     * 
     */
    public List<Object> getEventAndFunctionAndRole() {
        if (eventAndFunctionAndRole == null) {
            eventAndFunctionAndRole = new ArrayList<Object>();
        }
        return this.eventAndFunctionAndRole;
    }

    /**
     * 获取epcId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEpcId() {
        return epcId;
    }

    /**
     * 设置epcId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEpcId(BigInteger value) {
        this.epcId = value;
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

}
