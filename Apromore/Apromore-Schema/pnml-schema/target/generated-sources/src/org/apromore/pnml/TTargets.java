//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.04.18 时间 02:49:28 PM CST 
//


package org.apromore.pnml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>tTargets complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="tTargets">
 *   &lt;complexContent>
 *     &lt;extension base="{pnml.apromore.org}tExtensibleElements">
 *       &lt;sequence>
 *         &lt;element ref="{pnml.apromore.org}joinCondition" minOccurs="0"/>
 *         &lt;element ref="{pnml.apromore.org}target" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tTargets", propOrder = {
    "joinCondition",
    "target"
})
public class TTargets
    extends TExtensibleElements
{

    protected TCondition joinCondition;
    @XmlElement(required = true)
    protected List<TTarget> target;

    /**
     * 获取joinCondition属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TCondition }
     *     
     */
    public TCondition getJoinCondition() {
        return joinCondition;
    }

    /**
     * 设置joinCondition属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TCondition }
     *     
     */
    public void setJoinCondition(TCondition value) {
        this.joinCondition = value;
    }

    /**
     * Gets the value of the target property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the target property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTarget().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TTarget }
     * 
     * 
     */
    public List<TTarget> getTarget() {
        if (target == null) {
            target = new ArrayList<TTarget>();
        }
        return this.target;
    }

}
