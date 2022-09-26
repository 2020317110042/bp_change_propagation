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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.wfmc._2002.xpdl1.Tool;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice minOccurs="0">
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}No" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2002/XPDL1.0}Tool" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}Task" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}SubFlow" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}Reference" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}GlobalActivityReference" minOccurs="0"/>
 *       &lt;/choice>
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
    "no",
    "tool",
    "task",
    "subFlow",
    "reference",
    "globalActivityReference"
})
@XmlRootElement(name = "Implementation")
public class Implementation {

    @XmlElement(name = "No")
    protected No no;
    @XmlElement(name = "Tool", namespace = "http://www.wfmc.org/2002/XPDL1.0")
    protected List<Tool> tool;
    @XmlElement(name = "Task")
    protected Task task;
    @XmlElement(name = "SubFlow")
    protected SubFlow subFlow;
    @XmlElement(name = "Reference")
    protected Reference reference;
    @XmlElement(name = "GlobalActivityReference")
    protected GlobalActivityReference globalActivityReference;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * BPMN: corresponds to a task with unspecified TaskType
     * 
     * @return
     *     possible object is
     *     {@link No }
     *     
     */
    public No getNo() {
        return no;
    }

    /**
     * 设置no属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link No }
     *     
     */
    public void setNo(No value) {
        this.no = value;
    }

    /**
     * Gets the value of the tool property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tool property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTool().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tool }
     * 
     * 
     */
    public List<Tool> getTool() {
        if (tool == null) {
            tool = new ArrayList<Tool>();
        }
        return this.tool;
    }

    /**
     * BPMN: corresponds to a task with specified TaskType
     * 
     * @return
     *     possible object is
     *     {@link Task }
     *     
     */
    public Task getTask() {
        return task;
    }

    /**
     * 设置task属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Task }
     *     
     */
    public void setTask(Task value) {
        this.task = value;
    }

    /**
     * BPMN: corresponds to Reusable subprocess.  May run in different pool or same pool.
     * 
     * @return
     *     possible object is
     *     {@link SubFlow }
     *     
     */
    public SubFlow getSubFlow() {
        return subFlow;
    }

    /**
     * 设置subFlow属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SubFlow }
     *     
     */
    public void setSubFlow(SubFlow value) {
        this.subFlow = value;
    }

    /**
     * 获取reference属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getReference() {
        return reference;
    }

    /**
     * 设置reference属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setReference(Reference value) {
        this.reference = value;
    }

    /**
     * 获取globalActivityReference属性的值。
     * 
     * @return
     *     possible object is
     *     {@link GlobalActivityReference }
     *     
     */
    public GlobalActivityReference getGlobalActivityReference() {
        return globalActivityReference;
    }

    /**
     * 设置globalActivityReference属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link GlobalActivityReference }
     *     
     */
    public void setGlobalActivityReference(GlobalActivityReference value) {
        this.globalActivityReference = value;
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
