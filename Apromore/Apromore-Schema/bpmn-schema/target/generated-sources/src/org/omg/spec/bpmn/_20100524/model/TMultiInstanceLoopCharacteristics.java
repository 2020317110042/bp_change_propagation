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
 * <p>tMultiInstanceLoopCharacteristics complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="tMultiInstanceLoopCharacteristics">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.omg.org/spec/BPMN/20100524/MODEL}tLoopCharacteristics">
 *       &lt;sequence>
 *         &lt;element name="loopCardinality" type="{http://www.omg.org/spec/BPMN/20100524/MODEL}tExpression" minOccurs="0"/>
 *         &lt;element name="loopDataInputRef" type="{http://www.w3.org/2001/XMLSchema}QName" minOccurs="0"/>
 *         &lt;element name="loopDataOutputRef" type="{http://www.w3.org/2001/XMLSchema}QName" minOccurs="0"/>
 *         &lt;element name="inputDataItem" type="{http://www.omg.org/spec/BPMN/20100524/MODEL}tDataInput" minOccurs="0"/>
 *         &lt;element name="outputDataItem" type="{http://www.omg.org/spec/BPMN/20100524/MODEL}tDataOutput" minOccurs="0"/>
 *         &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}complexBehaviorDefinition" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="completionCondition" type="{http://www.omg.org/spec/BPMN/20100524/MODEL}tExpression" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="isSequential" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="behavior" type="{http://www.omg.org/spec/BPMN/20100524/MODEL}tMultiInstanceFlowCondition" default="All" />
 *       &lt;attribute name="oneBehaviorEventRef" type="{http://www.w3.org/2001/XMLSchema}QName" />
 *       &lt;attribute name="noneBehaviorEventRef" type="{http://www.w3.org/2001/XMLSchema}QName" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tMultiInstanceLoopCharacteristics", propOrder = {
    "loopCardinality",
    "loopDataInputRef",
    "loopDataOutputRef",
    "inputDataItem",
    "outputDataItem",
    "complexBehaviorDefinition",
    "completionCondition"
})
public class TMultiInstanceLoopCharacteristics
    extends TLoopCharacteristics
    implements Visitable
{

    protected TExpression loopCardinality;
    protected QName loopDataInputRef;
    protected QName loopDataOutputRef;
    protected TDataInput inputDataItem;
    protected TDataOutput outputDataItem;
    protected List<TComplexBehaviorDefinition> complexBehaviorDefinition;
    protected TExpression completionCondition;
    @XmlAttribute(name = "isSequential")
    protected Boolean isSequential;
    @XmlAttribute(name = "behavior")
    protected TMultiInstanceFlowCondition behavior;
    @XmlAttribute(name = "oneBehaviorEventRef")
    protected QName oneBehaviorEventRef;
    @XmlAttribute(name = "noneBehaviorEventRef")
    protected QName noneBehaviorEventRef;

    /**
     * 获取loopCardinality属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TExpression }
     *     
     */
    public TExpression getLoopCardinality() {
        return loopCardinality;
    }

    /**
     * 设置loopCardinality属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TExpression }
     *     
     */
    public void setLoopCardinality(TExpression value) {
        this.loopCardinality = value;
    }

    /**
     * 获取loopDataInputRef属性的值。
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getLoopDataInputRef() {
        return loopDataInputRef;
    }

    /**
     * 设置loopDataInputRef属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setLoopDataInputRef(QName value) {
        this.loopDataInputRef = value;
    }

    /**
     * 获取loopDataOutputRef属性的值。
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getLoopDataOutputRef() {
        return loopDataOutputRef;
    }

    /**
     * 设置loopDataOutputRef属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setLoopDataOutputRef(QName value) {
        this.loopDataOutputRef = value;
    }

    /**
     * 获取inputDataItem属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TDataInput }
     *     
     */
    public TDataInput getInputDataItem() {
        return inputDataItem;
    }

    /**
     * 设置inputDataItem属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TDataInput }
     *     
     */
    public void setInputDataItem(TDataInput value) {
        this.inputDataItem = value;
    }

    /**
     * 获取outputDataItem属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TDataOutput }
     *     
     */
    public TDataOutput getOutputDataItem() {
        return outputDataItem;
    }

    /**
     * 设置outputDataItem属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TDataOutput }
     *     
     */
    public void setOutputDataItem(TDataOutput value) {
        this.outputDataItem = value;
    }

    /**
     * Gets the value of the complexBehaviorDefinition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the complexBehaviorDefinition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComplexBehaviorDefinition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TComplexBehaviorDefinition }
     * 
     * 
     */
    public List<TComplexBehaviorDefinition> getComplexBehaviorDefinition() {
        if (complexBehaviorDefinition == null) {
            complexBehaviorDefinition = new ArrayList<TComplexBehaviorDefinition>();
        }
        return this.complexBehaviorDefinition;
    }

    /**
     * 获取completionCondition属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TExpression }
     *     
     */
    public TExpression getCompletionCondition() {
        return completionCondition;
    }

    /**
     * 设置completionCondition属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TExpression }
     *     
     */
    public void setCompletionCondition(TExpression value) {
        this.completionCondition = value;
    }

    /**
     * 获取isSequential属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsSequential() {
        if (isSequential == null) {
            return false;
        } else {
            return isSequential;
        }
    }

    /**
     * 设置isSequential属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSequential(Boolean value) {
        this.isSequential = value;
    }

    /**
     * 获取behavior属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TMultiInstanceFlowCondition }
     *     
     */
    public TMultiInstanceFlowCondition getBehavior() {
        if (behavior == null) {
            return TMultiInstanceFlowCondition.ALL;
        } else {
            return behavior;
        }
    }

    /**
     * 设置behavior属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TMultiInstanceFlowCondition }
     *     
     */
    public void setBehavior(TMultiInstanceFlowCondition value) {
        this.behavior = value;
    }

    /**
     * 获取oneBehaviorEventRef属性的值。
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getOneBehaviorEventRef() {
        return oneBehaviorEventRef;
    }

    /**
     * 设置oneBehaviorEventRef属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setOneBehaviorEventRef(QName value) {
        this.oneBehaviorEventRef = value;
    }

    /**
     * 获取noneBehaviorEventRef属性的值。
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getNoneBehaviorEventRef() {
        return noneBehaviorEventRef;
    }

    /**
     * 设置noneBehaviorEventRef属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setNoneBehaviorEventRef(QName value) {
        this.noneBehaviorEventRef = value;
    }

    public void accept(Visitor aVisitor) {
        aVisitor.visit(this);
    }

}
