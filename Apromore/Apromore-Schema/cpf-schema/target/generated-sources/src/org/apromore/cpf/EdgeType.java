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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * Edge between two Nodes {@link NodeType}. An Edge can specify a condition {@link #conditionExpr} 
 * if it is an outgoing edge of a split {@link SplitType}. It can also be marked as default {@link #default} choice in this case. 
 * 
 *             
 * 
 * <p>EdgeType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="EdgeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="conditionExpr" type="{http://www.apromore.org/CPF}ConditionExpressionType" minOccurs="0"/>
 *         &lt;element name="attribute" type="{http://www.apromore.org/CPF}typeAttribute" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="default" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="sourceId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="targetId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="originalID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EdgeType", namespace = "http://www.apromore.org/CPF", propOrder = {
    "conditionExpr",
    "attribute"
})
public class EdgeType
    implements Visitable
{

    protected ConditionExpressionType conditionExpr;
    protected List<TypeAttribute> attribute;
    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "default")
    protected Boolean _default;
    @XmlAttribute(name = "sourceId", required = true)
    protected String sourceId;
    @XmlAttribute(name = "targetId", required = true)
    protected String targetId;
    @XmlAttribute(name = "originalID")
    protected String originalID;

    /**
     * 获取conditionExpr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ConditionExpressionType }
     *     
     */
    public ConditionExpressionType getConditionExpr() {
        return conditionExpr;
    }

    /**
     * 设置conditionExpr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ConditionExpressionType }
     *     
     */
    public void setConditionExpr(ConditionExpressionType value) {
        this.conditionExpr = value;
    }

    /**
     * Gets the value of the attribute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attribute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttribute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeAttribute }
     * 
     * 
     */
    public List<TypeAttribute> getAttribute() {
        if (attribute == null) {
            attribute = new ArrayList<TypeAttribute>();
        }
        return this.attribute;
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
     * 获取default属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isDefault() {
        if (_default == null) {
            return false;
        } else {
            return _default;
        }
    }

    /**
     * 设置default属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDefault(Boolean value) {
        this._default = value;
    }

    /**
     * 获取sourceId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceId() {
        return sourceId;
    }

    /**
     * 设置sourceId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceId(String value) {
        this.sourceId = value;
    }

    /**
     * 获取targetId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetId() {
        return targetId;
    }

    /**
     * 设置targetId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetId(String value) {
        this.targetId = value;
    }

    /**
     * 获取originalID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalID() {
        return originalID;
    }

    /**
     * 设置originalID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalID(String value) {
        this.originalID = value;
    }

    public void accept(Visitor aVisitor) {
        aVisitor.visit(this);
    }

}
