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
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}Activities" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}DataObjects" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}DataStoreReferences" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}Transitions" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}DataAssociations" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}Object" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}Associations" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}Artifacts" minOccurs="0"/>
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Id" use="required" type="{http://www.wfmc.org/2009/XPDL2.2}Id" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="AdHoc" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="AdHocOrdering" default="Parallel">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="Sequential"/>
 *             &lt;enumeration value="Parallel"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="AdHocCompletionCondition" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DefaultStartActivityId" type="{http://www.wfmc.org/2009/XPDL2.2}IdRef" />
 *       &lt;attribute name="TriggeredByEvent" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
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
    "activities",
    "dataObjects",
    "dataStoreReferences",
    "transitions",
    "dataAssociations",
    "object",
    "associations",
    "artifacts",
    "any"
})
@XmlRootElement(name = "ActivitySet")
public class ActivitySet {

    @XmlElement(name = "Activities")
    protected Activities activities;
    @XmlElement(name = "DataObjects")
    protected DataObjects dataObjects;
    @XmlElement(name = "DataStoreReferences")
    protected DataStoreReferences dataStoreReferences;
    @XmlElement(name = "Transitions")
    protected Transitions transitions;
    @XmlElement(name = "DataAssociations")
    protected DataAssociations dataAssociations;
    @XmlElement(name = "Object")
    protected org.wfmc._2009.xpdl2.Object object;
    @XmlElement(name = "Associations")
    protected Associations associations;
    @XmlElement(name = "Artifacts")
    protected Artifacts artifacts;
    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;
    @XmlAttribute(name = "Id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String id;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "AdHoc")
    protected Boolean adHoc;
    @XmlAttribute(name = "AdHocOrdering")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String adHocOrdering;
    @XmlAttribute(name = "AdHocCompletionCondition")
    protected String adHocCompletionCondition;
    @XmlAttribute(name = "DefaultStartActivityId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String defaultStartActivityId;
    @XmlAttribute(name = "TriggeredByEvent")
    protected Boolean triggeredByEvent;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * 获取activities属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Activities }
     *     
     */
    public Activities getActivities() {
        return activities;
    }

    /**
     * 设置activities属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Activities }
     *     
     */
    public void setActivities(Activities value) {
        this.activities = value;
    }

    /**
     * 获取dataObjects属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DataObjects }
     *     
     */
    public DataObjects getDataObjects() {
        return dataObjects;
    }

    /**
     * 设置dataObjects属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DataObjects }
     *     
     */
    public void setDataObjects(DataObjects value) {
        this.dataObjects = value;
    }

    /**
     * 获取dataStoreReferences属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DataStoreReferences }
     *     
     */
    public DataStoreReferences getDataStoreReferences() {
        return dataStoreReferences;
    }

    /**
     * 设置dataStoreReferences属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DataStoreReferences }
     *     
     */
    public void setDataStoreReferences(DataStoreReferences value) {
        this.dataStoreReferences = value;
    }

    /**
     * 获取transitions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Transitions }
     *     
     */
    public Transitions getTransitions() {
        return transitions;
    }

    /**
     * 设置transitions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Transitions }
     *     
     */
    public void setTransitions(Transitions value) {
        this.transitions = value;
    }

    /**
     * 获取dataAssociations属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DataAssociations }
     *     
     */
    public DataAssociations getDataAssociations() {
        return dataAssociations;
    }

    /**
     * 设置dataAssociations属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DataAssociations }
     *     
     */
    public void setDataAssociations(DataAssociations value) {
        this.dataAssociations = value;
    }

    /**
     * 获取object属性的值。
     * 
     * @return
     *     possible object is
     *     {@link org.wfmc._2009.xpdl2.Object }
     *     
     */
    public org.wfmc._2009.xpdl2.Object getObject() {
        return object;
    }

    /**
     * 设置object属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link org.wfmc._2009.xpdl2.Object }
     *     
     */
    public void setObject(org.wfmc._2009.xpdl2.Object value) {
        this.object = value;
    }

    /**
     * 获取associations属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Associations }
     *     
     */
    public Associations getAssociations() {
        return associations;
    }

    /**
     * 设置associations属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Associations }
     *     
     */
    public void setAssociations(Associations value) {
        this.associations = value;
    }

    /**
     * 获取artifacts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Artifacts }
     *     
     */
    public Artifacts getArtifacts() {
        return artifacts;
    }

    /**
     * 设置artifacts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Artifacts }
     *     
     */
    public void setArtifacts(Artifacts value) {
        this.artifacts = value;
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
     * 获取adHoc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isAdHoc() {
        if (adHoc == null) {
            return false;
        } else {
            return adHoc;
        }
    }

    /**
     * 设置adHoc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdHoc(Boolean value) {
        this.adHoc = value;
    }

    /**
     * 获取adHocOrdering属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdHocOrdering() {
        if (adHocOrdering == null) {
            return "Parallel";
        } else {
            return adHocOrdering;
        }
    }

    /**
     * 设置adHocOrdering属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdHocOrdering(String value) {
        this.adHocOrdering = value;
    }

    /**
     * 获取adHocCompletionCondition属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdHocCompletionCondition() {
        return adHocCompletionCondition;
    }

    /**
     * 设置adHocCompletionCondition属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdHocCompletionCondition(String value) {
        this.adHocCompletionCondition = value;
    }

    /**
     * 获取defaultStartActivityId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultStartActivityId() {
        return defaultStartActivityId;
    }

    /**
     * 设置defaultStartActivityId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultStartActivityId(String value) {
        this.defaultStartActivityId = value;
    }

    /**
     * 获取triggeredByEvent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isTriggeredByEvent() {
        if (triggeredByEvent == null) {
            return false;
        } else {
            return triggeredByEvent;
        }
    }

    /**
     * 设置triggeredByEvent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTriggeredByEvent(Boolean value) {
        this.triggeredByEvent = value;
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
