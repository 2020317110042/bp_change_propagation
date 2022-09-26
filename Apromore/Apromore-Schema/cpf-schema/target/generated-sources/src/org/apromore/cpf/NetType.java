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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * A Net is a directed, attributed graph made up of Nodes {@link NodeType} and Edges {@link EdgeType}. It represents a process or a sub-process. All top processes are added to the root ids list of the Canonical Process.
 * {@link CanonicalProcessType#rootIds}
 * 
 *             
 * 
 * <p>NetType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="NetType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Node" type="{http://www.apromore.org/CPF}NodeType" maxOccurs="unbounded"/>
 *         &lt;element name="Edge" type="{http://www.apromore.org/CPF}EdgeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Object" type="{http://www.apromore.org/CPF}ObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="attribute" type="{http://www.apromore.org/CPF}typeAttribute" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="originalID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetType", namespace = "http://www.apromore.org/CPF", propOrder = {
    "name",
    "node",
    "edge",
    "object",
    "attribute"
})
public class NetType
    implements Visitable
{

    protected String name;
    @XmlElement(name = "Node", required = true)
    protected List<NodeType> node;
    @XmlElement(name = "Edge")
    protected List<EdgeType> edge;
    @XmlElement(name = "Object")
    protected List<ObjectType> object;
    protected List<TypeAttribute> attribute;
    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "originalID")
    protected String originalID;

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
     * Gets the value of the node property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the node property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NodeType }
     * 
     * 
     */
    public List<NodeType> getNode() {
        if (node == null) {
            node = new ArrayList<NodeType>();
        }
        return this.node;
    }

    /**
     * Gets the value of the edge property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the edge property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEdge().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EdgeType }
     * 
     * 
     */
    public List<EdgeType> getEdge() {
        if (edge == null) {
            edge = new ArrayList<EdgeType>();
        }
        return this.edge;
    }

    /**
     * Gets the value of the object property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the object property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObject().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectType }
     * 
     * 
     */
    public List<ObjectType> getObject() {
        if (object == null) {
            object = new ArrayList<ObjectType>();
        }
        return this.object;
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
