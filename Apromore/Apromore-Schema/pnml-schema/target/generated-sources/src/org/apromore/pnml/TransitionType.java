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
import javax.xml.bind.annotation.XmlType;


/**
 * Transition Types
 * 
 * <p>transitionType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="transitionType">
 *   &lt;complexContent>
 *     &lt;extension base="{pnml.apromore.org}nodeType">
 *       &lt;sequence>
 *         &lt;element name="toolspecific" type="{pnml.apromore.org}transitionToolspecificType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transitionType", propOrder = {
    "toolspecific"
})
public class TransitionType
    extends NodeType
{

    protected List<TransitionToolspecificType> toolspecific;

    /**
     * Gets the value of the toolspecific property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the toolspecific property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getToolspecific().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransitionToolspecificType }
     * 
     * 
     */
    public List<TransitionToolspecificType> getToolspecific() {
        if (toolspecific == null) {
            toolspecific = new ArrayList<TransitionToolspecificType>();
        }
        return this.toolspecific;
    }

}
