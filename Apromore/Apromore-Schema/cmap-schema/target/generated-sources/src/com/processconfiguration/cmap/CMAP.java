//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.04.18 时间 02:49:21 PM CST 
//


package com.processconfiguration.cmap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import com.sun.xml.bind.Locatable;
import com.sun.xml.bind.annotation.XmlLocation;
import org.xml.sax.Locator;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="3">
 *         &lt;element name="c-bpmn" type="{http://www.processconfiguration.com/CMAP}c-bpmnType"/>
 *         &lt;element name="c-epc" type="{http://www.processconfiguration.com/CMAP}c-epcType"/>
 *         &lt;element name="c-yawl" type="{http://www.processconfiguration.com/CMAP}c-yawlType"/>
 *       &lt;/choice>
 *       &lt;attribute name="qml" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "cBpmnOrCEpcOrCYawl"
})
@XmlRootElement(name = "CMAP")
public class CMAP
    implements Visitable, Locatable
{

    @XmlElements({
        @XmlElement(name = "c-bpmn", type = CBpmnType.class),
        @XmlElement(name = "c-epc", type = CEpcType.class),
        @XmlElement(name = "c-yawl", type = CYawlType.class)
    })
    protected List<Object> cBpmnOrCEpcOrCYawl;
    @XmlAttribute(name = "qml")
    protected String qml;
    @XmlLocation
    @XmlTransient
    protected Locator locator;

    /**
     * Gets the value of the cBpmnOrCEpcOrCYawl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cBpmnOrCEpcOrCYawl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCBpmnOrCEpcOrCYawl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CBpmnType }
     * {@link CEpcType }
     * {@link CYawlType }
     * 
     * 
     */
    public List<Object> getCBpmnOrCEpcOrCYawl() {
        if (cBpmnOrCEpcOrCYawl == null) {
            cBpmnOrCEpcOrCYawl = new ArrayList<Object>();
        }
        return this.cBpmnOrCEpcOrCYawl;
    }

    /**
     * 获取qml属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQml() {
        return qml;
    }

    /**
     * 设置qml属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQml(String value) {
        this.qml = value;
    }

    public Locator sourceLocation() {
        return locator;
    }

    public void setSourceLocation(Locator newLocator) {
        locator = newLocator;
    }

    public void accept(Visitor aVisitor) {
        aVisitor.visit(this);
    }

}
