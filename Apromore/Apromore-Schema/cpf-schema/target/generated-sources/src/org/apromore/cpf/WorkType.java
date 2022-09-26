//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.04.18 时间 02:49:23 PM CST 
//


package org.apromore.cpf;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * Base type of all Nodes that represent some Work
 * 
 *             
 * 
 * <p>WorkType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="WorkType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.apromore.org/CPF}NodeType">
 *       &lt;sequence>
 *         &lt;element name="resourceTypeRef" type="{http://www.apromore.org/CPF}resourceTypeRefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="objectRef" type="{http://www.apromore.org/CPF}objectRefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="cancelNodeId" type="{http://www.apromore.org/CPF}cancellationRefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="cancelEdgeId" type="{http://www.apromore.org/CPF}cancellationRefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="inputExpr" type="{http://www.apromore.org/CPF}InputExpressionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="outputExpr" type="{http://www.apromore.org/CPF}OutputExpressionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="teamWork" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="filterByDataExpr" type="{http://www.apromore.org/CPF}ResourceDataFilterExpressionType" minOccurs="0"/>
 *         &lt;element name="filterByRuntimeExpr" type="{http://www.apromore.org/CPF}ResourceRuntimeFilterExpressionType" minOccurs="0"/>
 *         &lt;element name="allocationStrategy" type="{http://www.apromore.org/CPF}AllocationStrategyEnum" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkType", namespace = "http://www.apromore.org/CPF", propOrder = {
    "resourceTypeRef",
    "objectRef",
    "cancelNodeId",
    "cancelEdgeId",
    "inputExpr",
    "outputExpr",
    "teamWork",
    "filterByDataExpr",
    "filterByRuntimeExpr",
    "allocationStrategy"
})
@XmlSeeAlso({
    TaskType.class,
    EventType.class
})
public class WorkType
    extends NodeType
    implements Visitable
{

    protected List<ResourceTypeRefType> resourceTypeRef;
    protected List<ObjectRefType> objectRef;
    protected List<CancellationRefType> cancelNodeId;
    protected List<CancellationRefType> cancelEdgeId;
    protected List<InputExpressionType> inputExpr;
    protected List<OutputExpressionType> outputExpr;
    protected Boolean teamWork;
    protected ResourceDataFilterExpressionType filterByDataExpr;
    protected ResourceRuntimeFilterExpressionType filterByRuntimeExpr;
    protected AllocationStrategyEnum allocationStrategy;

    /**
     * Reference to a
     *                                         ResourceType, depending on the
     *                                         property {@link #teamWork} all
     *                                         or one of the referenced
     *                                         resources are needed for
     *                                         execution.Gets the value of the resourceTypeRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resourceTypeRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResourceTypeRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResourceTypeRefType }
     * 
     * 
     */
    public List<ResourceTypeRefType> getResourceTypeRef() {
        if (resourceTypeRef == null) {
            resourceTypeRef = new ArrayList<ResourceTypeRefType>();
        }
        return this.resourceTypeRef;
    }

    /**
     * Reference to data
     *                                         objects of a Net.Gets the value of the objectRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the objectRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObjectRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectRefType }
     * 
     * 
     */
    public List<ObjectRefType> getObjectRef() {
        if (objectRef == null) {
            objectRef = new ArrayList<ObjectRefType>();
        }
        return this.objectRef;
    }

    /**
     * Canceling the following
     *                                         Nodes.Gets the value of the cancelNodeId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cancelNodeId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCancelNodeId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CancellationRefType }
     * 
     * 
     */
    public List<CancellationRefType> getCancelNodeId() {
        if (cancelNodeId == null) {
            cancelNodeId = new ArrayList<CancellationRefType>();
        }
        return this.cancelNodeId;
    }

    /**
     * Canceling the following
     *                                         Edges.Gets the value of the cancelEdgeId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cancelEdgeId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCancelEdgeId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CancellationRefType }
     * 
     * 
     */
    public List<CancellationRefType> getCancelEdgeId() {
        if (cancelEdgeId == null) {
            cancelEdgeId = new ArrayList<CancellationRefType>();
        }
        return this.cancelEdgeId;
    }

    /**
     * Input expressions
     *                                         referring to [0..*] Objects of
     *                                         the Net.Gets the value of the inputExpr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inputExpr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInputExpr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InputExpressionType }
     * 
     * 
     */
    public List<InputExpressionType> getInputExpr() {
        if (inputExpr == null) {
            inputExpr = new ArrayList<InputExpressionType>();
        }
        return this.inputExpr;
    }

    /**
     * Output expressions
     *                                         referring to [1] Object of the
     *                                         Net.Gets the value of the outputExpr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outputExpr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutputExpr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OutputExpressionType }
     * 
     * 
     */
    public List<OutputExpressionType> getOutputExpr() {
        if (outputExpr == null) {
            outputExpr = new ArrayList<OutputExpressionType>();
        }
        return this.outputExpr;
    }

    /**
     * 获取teamWork属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTeamWork() {
        return teamWork;
    }

    /**
     * 设置teamWork属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTeamWork(Boolean value) {
        this.teamWork = value;
    }

    /**
     * 获取filterByDataExpr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ResourceDataFilterExpressionType }
     *     
     */
    public ResourceDataFilterExpressionType getFilterByDataExpr() {
        return filterByDataExpr;
    }

    /**
     * 设置filterByDataExpr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceDataFilterExpressionType }
     *     
     */
    public void setFilterByDataExpr(ResourceDataFilterExpressionType value) {
        this.filterByDataExpr = value;
    }

    /**
     * 获取filterByRuntimeExpr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ResourceRuntimeFilterExpressionType }
     *     
     */
    public ResourceRuntimeFilterExpressionType getFilterByRuntimeExpr() {
        return filterByRuntimeExpr;
    }

    /**
     * 设置filterByRuntimeExpr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceRuntimeFilterExpressionType }
     *     
     */
    public void setFilterByRuntimeExpr(ResourceRuntimeFilterExpressionType value) {
        this.filterByRuntimeExpr = value;
    }

    /**
     * 获取allocationStrategy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AllocationStrategyEnum }
     *     
     */
    public AllocationStrategyEnum getAllocationStrategy() {
        return allocationStrategy;
    }

    /**
     * 设置allocationStrategy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AllocationStrategyEnum }
     *     
     */
    public void setAllocationStrategy(AllocationStrategyEnum value) {
        this.allocationStrategy = value;
    }

    public void accept(Visitor aVisitor) {
        aVisitor.visit(this);
    }

}
