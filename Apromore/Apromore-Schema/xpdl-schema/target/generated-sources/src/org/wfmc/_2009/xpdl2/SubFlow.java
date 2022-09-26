//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.04.18 时间 02:49:32 PM CST 
//


package org.wfmc._2009.xpdl2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;


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
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}ActualParameters"/>
 *           &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}DataMappings"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}EndPoint" minOccurs="0"/>
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Id" use="required" type="{http://www.wfmc.org/2009/XPDL2.2}IdRef" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Execution" default="SYNCHR">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="ASYNCHR"/>
 *             &lt;enumeration value="SYNCHR"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="View" default="COLLAPSED">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="COLLAPSED"/>
 *             &lt;enumeration value="EXPANDED"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="PackageRef" type="{http://www.wfmc.org/2009/XPDL2.2}IdRef" />
 *       &lt;attribute name="InstanceDataField" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="StartActivitySetId" type="{http://www.wfmc.org/2009/XPDL2.2}IdRef" />
 *       &lt;attribute name="StartActivityId" type="{http://www.wfmc.org/2009/XPDL2.2}IdRef" />
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
    "actualParameters",
    "dataMappings",
    "endPoint",
    "any"
})
@XmlRootElement(name = "SubFlow")
public class SubFlow {

    @XmlElement(name = "ActualParameters")
    protected ActualParameters actualParameters;
    @XmlElement(name = "DataMappings")
    protected DataMappings dataMappings;
    @XmlElement(name = "EndPoint")
    protected EndPoint endPoint;
    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;
    @XmlAttribute(name = "Id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String id;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "Execution")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String execution;
    @XmlAttribute(name = "View")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String view;
    @XmlAttribute(name = "PackageRef")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String packageRef;
    @XmlAttribute(name = "InstanceDataField")
    protected String instanceDataField;
    @XmlAttribute(name = "StartActivitySetId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String startActivitySetId;
    @XmlAttribute(name = "StartActivityId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String startActivityId;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Deprecated in XPDL 2.2, use the Actual Parameters at the Activity Level
     * 
     * @return
     *     possible object is
     *     {@link ActualParameters }
     *     
     */
    public ActualParameters getActualParameters() {
        return actualParameters;
    }

    /**
     * 设置actualParameters属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ActualParameters }
     *     
     */
    public void setActualParameters(ActualParameters value) {
        this.actualParameters = value;
    }

    /**
     * Deprecated in XPDL 2.2, use the Actual Parameters at the Activity Level
     * 
     * @return
     *     possible object is
     *     {@link DataMappings }
     *     
     */
    public DataMappings getDataMappings() {
        return dataMappings;
    }

    /**
     * 设置dataMappings属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DataMappings }
     *     
     */
    public void setDataMappings(DataMappings value) {
        this.dataMappings = value;
    }

    /**
     * 获取endPoint属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EndPoint }
     *     
     */
    public EndPoint getEndPoint() {
        return endPoint;
    }

    /**
     * 设置endPoint属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EndPoint }
     *     
     */
    public void setEndPoint(EndPoint value) {
        this.endPoint = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link java.lang.Object }
     * {@link Element }
     * 
     * 
     */
    public List<java.lang.Object> getAny() {
        if (any == null) {
            any = new ArrayList<java.lang.Object>();
        }
        return this.any;
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
     * 获取execution属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExecution() {
        if (execution == null) {
            return "SYNCHR";
        } else {
            return execution;
        }
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

    /**
     * 获取view属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getView() {
        if (view == null) {
            return "COLLAPSED";
        } else {
            return view;
        }
    }

    /**
     * 设置view属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setView(String value) {
        this.view = value;
    }

    /**
     * 获取packageRef属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackageRef() {
        return packageRef;
    }

    /**
     * 设置packageRef属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackageRef(String value) {
        this.packageRef = value;
    }

    /**
     * 获取instanceDataField属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstanceDataField() {
        return instanceDataField;
    }

    /**
     * 设置instanceDataField属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstanceDataField(String value) {
        this.instanceDataField = value;
    }

    /**
     * 获取startActivitySetId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartActivitySetId() {
        return startActivitySetId;
    }

    /**
     * 设置startActivitySetId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartActivitySetId(String value) {
        this.startActivitySetId = value;
    }

    /**
     * 获取startActivityId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartActivityId() {
        return startActivityId;
    }

    /**
     * 设置startActivityId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartActivityId(String value) {
        this.startActivityId = value;
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
