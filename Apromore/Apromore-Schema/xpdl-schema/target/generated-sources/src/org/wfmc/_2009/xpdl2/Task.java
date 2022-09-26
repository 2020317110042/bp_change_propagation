//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.04.18 时间 02:49:32 PM CST 
//


package org.wfmc._2009.xpdl2;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


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
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}TaskService"/>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}TaskReceive"/>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}TaskManual"/>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}TaskReference"/>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}TaskScript"/>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}TaskSend"/>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}TaskUser"/>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}TaskApplication"/>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}TaskBusinessRule"/>
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
    "taskService",
    "taskReceive",
    "taskManual",
    "taskReference",
    "taskScript",
    "taskSend",
    "taskUser",
    "taskApplication",
    "taskBusinessRule"
})
@XmlRootElement(name = "Task")
public class Task {

    @XmlElement(name = "TaskService")
    protected TaskService taskService;
    @XmlElement(name = "TaskReceive")
    protected TaskReceive taskReceive;
    @XmlElement(name = "TaskManual")
    protected TaskManual taskManual;
    @XmlElement(name = "TaskReference")
    protected TaskReference taskReference;
    @XmlElement(name = "TaskScript")
    protected TaskScript taskScript;
    @XmlElement(name = "TaskSend")
    protected TaskSend taskSend;
    @XmlElement(name = "TaskUser")
    protected TaskUser taskUser;
    @XmlElement(name = "TaskApplication")
    protected TaskApplication taskApplication;
    @XmlElement(name = "TaskBusinessRule")
    protected TaskBusinessRule taskBusinessRule;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * BPMN: TaskType = Service.  In BPMN generally signifies any automated activity.
     * 
     * @return
     *     possible object is
     *     {@link TaskService }
     *     
     */
    public TaskService getTaskService() {
        return taskService;
    }

    /**
     * 设置taskService属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TaskService }
     *     
     */
    public void setTaskService(TaskService value) {
        this.taskService = value;
    }

    /**
     * BPMN: TaskType = Receive.  Waits for a message, then continues. Equivalent to a "catching" message event.  In BPMN, "message" generally signifies any signal from outside the process (pool).
     * 
     * @return
     *     possible object is
     *     {@link TaskReceive }
     *     
     */
    public TaskReceive getTaskReceive() {
        return taskReceive;
    }

    /**
     * 设置taskReceive属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TaskReceive }
     *     
     */
    public void setTaskReceive(TaskReceive value) {
        this.taskReceive = value;
    }

    /**
     * BPMN: TaskType = Manual.  Used for human tasks other than those accessed via workflow.
     * 
     * @return
     *     possible object is
     *     {@link TaskManual }
     *     
     */
    public TaskManual getTaskManual() {
        return taskManual;
    }

    /**
     * 设置taskManual属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TaskManual }
     *     
     */
    public void setTaskManual(TaskManual value) {
        this.taskManual = value;
    }

    /**
     * Deprecated in XPDL 2.2
     * 
     * @return
     *     possible object is
     *     {@link TaskReference }
     *     
     */
    public TaskReference getTaskReference() {
        return taskReference;
    }

    /**
     * 设置taskReference属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TaskReference }
     *     
     */
    public void setTaskReference(TaskReference value) {
        this.taskReference = value;
    }

    /**
     * BPMN: TaskType = Script.  Used for automated tasks executed by scripts on process engine, to distinguish from automated tasks performed externally (Service).
     * 
     * @return
     *     possible object is
     *     {@link TaskScript }
     *     
     */
    public TaskScript getTaskScript() {
        return taskScript;
    }

    /**
     * 设置taskScript属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TaskScript }
     *     
     */
    public void setTaskScript(TaskScript value) {
        this.taskScript = value;
    }

    /**
     * BPMN: Task Type = Send.  Equivalent to a "throwing" message event.  Sends a message immediately and continues.  In BPMN, "message" signifies any signal sent outside the process (pool).
     * 
     * @return
     *     possible object is
     *     {@link TaskSend }
     *     
     */
    public TaskSend getTaskSend() {
        return taskSend;
    }

    /**
     * 设置taskSend属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TaskSend }
     *     
     */
    public void setTaskSend(TaskSend value) {
        this.taskSend = value;
    }

    /**
     * BPMN: Task Type = User.  Generally used for human tasks.  
     * 
     * @return
     *     possible object is
     *     {@link TaskUser }
     *     
     */
    public TaskUser getTaskUser() {
        return taskUser;
    }

    /**
     * 设置taskUser属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TaskUser }
     *     
     */
    public void setTaskUser(TaskUser value) {
        this.taskUser = value;
    }

    /**
     * 获取taskApplication属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TaskApplication }
     *     
     */
    public TaskApplication getTaskApplication() {
        return taskApplication;
    }

    /**
     * 设置taskApplication属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TaskApplication }
     *     
     */
    public void setTaskApplication(TaskApplication value) {
        this.taskApplication = value;
    }

    /**
     * BPMN2 new task type.  
     * 
     * @return
     *     possible object is
     *     {@link TaskBusinessRule }
     *     
     */
    public TaskBusinessRule getTaskBusinessRule() {
        return taskBusinessRule;
    }

    /**
     * 设置taskBusinessRule属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TaskBusinessRule }
     *     
     */
    public void setTaskBusinessRule(TaskBusinessRule value) {
        this.taskBusinessRule = value;
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
