//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.04.18 时间 02:49:32 PM CST 
//


package org.wfmc._2002.xpdl1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element ref="{http://www.wfmc.org/2002/XPDL1.0}Description" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2002/XPDL1.0}Limit" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element ref="{http://www.wfmc.org/2002/XPDL1.0}Route"/>
 *           &lt;element ref="{http://www.wfmc.org/2002/XPDL1.0}Implementation"/>
 *           &lt;element ref="{http://www.wfmc.org/2002/XPDL1.0}BlockActivity"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.wfmc.org/2002/XPDL1.0}Performer" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2002/XPDL1.0}StartMode" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2002/XPDL1.0}FinishMode" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2002/XPDL1.0}Priority" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2002/XPDL1.0}Deadline" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2002/XPDL1.0}SimulationInformation" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2002/XPDL1.0}Icon" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2002/XPDL1.0}Documentation" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2002/XPDL1.0}TransitionRestrictions" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2002/XPDL1.0}ExtendedAttributes" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Id" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "description",
    "limit",
    "route",
    "implementation",
    "blockActivity",
    "performer",
    "startMode",
    "finishMode",
    "priority",
    "deadline",
    "simulationInformation",
    "icon",
    "documentation",
    "transitionRestrictions",
    "extendedAttributes"
})
@XmlRootElement(name = "Activity")
public class Activity {

    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Limit")
    protected String limit;
    @XmlElement(name = "Route")
    protected Route route;
    @XmlElement(name = "Implementation")
    protected Implementation implementation;
    @XmlElement(name = "BlockActivity")
    protected BlockActivity blockActivity;
    @XmlElement(name = "Performer")
    protected String performer;
    @XmlElement(name = "StartMode")
    protected StartMode startMode;
    @XmlElement(name = "FinishMode")
    protected FinishMode finishMode;
    @XmlElement(name = "Priority")
    protected String priority;
    @XmlElement(name = "Deadline")
    protected List<Deadline> deadline;
    @XmlElement(name = "SimulationInformation")
    protected SimulationInformation simulationInformation;
    @XmlElement(name = "Icon")
    protected String icon;
    @XmlElement(name = "Documentation")
    protected String documentation;
    @XmlElement(name = "TransitionRestrictions")
    protected TransitionRestrictions transitionRestrictions;
    @XmlElement(name = "ExtendedAttributes")
    protected ExtendedAttributes extendedAttributes;
    @XmlAttribute(name = "Id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String id;
    @XmlAttribute(name = "Name")
    protected String name;

    /**
     * 获取description属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置description属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * 获取limit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLimit() {
        return limit;
    }

    /**
     * 设置limit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLimit(String value) {
        this.limit = value;
    }

    /**
     * 获取route属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Route }
     *     
     */
    public Route getRoute() {
        return route;
    }

    /**
     * 设置route属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Route }
     *     
     */
    public void setRoute(Route value) {
        this.route = value;
    }

    /**
     * 获取implementation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Implementation }
     *     
     */
    public Implementation getImplementation() {
        return implementation;
    }

    /**
     * 设置implementation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Implementation }
     *     
     */
    public void setImplementation(Implementation value) {
        this.implementation = value;
    }

    /**
     * 获取blockActivity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BlockActivity }
     *     
     */
    public BlockActivity getBlockActivity() {
        return blockActivity;
    }

    /**
     * 设置blockActivity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BlockActivity }
     *     
     */
    public void setBlockActivity(BlockActivity value) {
        this.blockActivity = value;
    }

    /**
     * 获取performer属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerformer() {
        return performer;
    }

    /**
     * 设置performer属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerformer(String value) {
        this.performer = value;
    }

    /**
     * 获取startMode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link StartMode }
     *     
     */
    public StartMode getStartMode() {
        return startMode;
    }

    /**
     * 设置startMode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link StartMode }
     *     
     */
    public void setStartMode(StartMode value) {
        this.startMode = value;
    }

    /**
     * 获取finishMode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FinishMode }
     *     
     */
    public FinishMode getFinishMode() {
        return finishMode;
    }

    /**
     * 设置finishMode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FinishMode }
     *     
     */
    public void setFinishMode(FinishMode value) {
        this.finishMode = value;
    }

    /**
     * 获取priority属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriority() {
        return priority;
    }

    /**
     * 设置priority属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriority(String value) {
        this.priority = value;
    }

    /**
     * Gets the value of the deadline property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deadline property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeadline().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Deadline }
     * 
     * 
     */
    public List<Deadline> getDeadline() {
        if (deadline == null) {
            deadline = new ArrayList<Deadline>();
        }
        return this.deadline;
    }

    /**
     * 获取simulationInformation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SimulationInformation }
     *     
     */
    public SimulationInformation getSimulationInformation() {
        return simulationInformation;
    }

    /**
     * 设置simulationInformation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SimulationInformation }
     *     
     */
    public void setSimulationInformation(SimulationInformation value) {
        this.simulationInformation = value;
    }

    /**
     * 获取icon属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIcon() {
        return icon;
    }

    /**
     * 设置icon属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIcon(String value) {
        this.icon = value;
    }

    /**
     * 获取documentation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentation() {
        return documentation;
    }

    /**
     * 设置documentation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentation(String value) {
        this.documentation = value;
    }

    /**
     * 获取transitionRestrictions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TransitionRestrictions }
     *     
     */
    public TransitionRestrictions getTransitionRestrictions() {
        return transitionRestrictions;
    }

    /**
     * 设置transitionRestrictions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TransitionRestrictions }
     *     
     */
    public void setTransitionRestrictions(TransitionRestrictions value) {
        this.transitionRestrictions = value;
    }

    /**
     * 获取extendedAttributes属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ExtendedAttributes }
     *     
     */
    public ExtendedAttributes getExtendedAttributes() {
        return extendedAttributes;
    }

    /**
     * 设置extendedAttributes属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedAttributes }
     *     
     */
    public void setExtendedAttributes(ExtendedAttributes value) {
        this.extendedAttributes = value;
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

}
