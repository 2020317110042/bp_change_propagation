//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.04.18 时间 02:49:16 PM CST 
//


package org.omg.spec.dd._20100524.di;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.omg.spec.bpmn._20100524.model.Visitable;
import org.omg.spec.dd._20100524.dc.Point;


/**
 * <p>Edge complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Edge">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.omg.org/spec/DD/20100524/DI}DiagramElement">
 *       &lt;sequence>
 *         &lt;element name="waypoint" type="{http://www.omg.org/spec/DD/20100524/DC}Point" maxOccurs="unbounded" minOccurs="2"/>
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
@XmlType(name = "Edge", propOrder = {
    "waypoint"
})
@XmlSeeAlso({
    LabeledEdge.class
})
public abstract class Edge
    extends DiagramElement
    implements Visitable
{

    @XmlElement(required = true)
    protected List<Point> waypoint;

    /**
     * Gets the value of the waypoint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the waypoint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWaypoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Point }
     * 
     * 
     */
    public List<Point> getWaypoint() {
        if (waypoint == null) {
            waypoint = new ArrayList<Point>();
        }
        return this.waypoint;
    }

}
