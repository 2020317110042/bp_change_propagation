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
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * Extension see "http://www.informatik.hu-berlin.de/top/pntd/ptNetb"
 * 
 * <p>annotationGraphisType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="annotationGraphisType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="offset" type="{pnml.apromore.org}positionType"/>
 *         &lt;element ref="{pnml.apromore.org}fill" minOccurs="0"/>
 *         &lt;element ref="{pnml.apromore.org}line" minOccurs="0"/>
 *         &lt;element ref="{pnml.apromore.org}font" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "annotationGraphisType", propOrder = {
    "offsetAndFillAndLine"
})
public class AnnotationGraphisType {

    @XmlElements({
        @XmlElement(name = "offset", type = PositionType.class),
        @XmlElement(name = "fill", type = Fill.class),
        @XmlElement(name = "line", type = Line.class),
        @XmlElement(name = "font", type = Font.class)
    })
    protected List<Object> offsetAndFillAndLine;

    /**
     * Gets the value of the offsetAndFillAndLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the offsetAndFillAndLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOffsetAndFillAndLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PositionType }
     * {@link Fill }
     * {@link Line }
     * {@link Font }
     * 
     * 
     */
    public List<Object> getOffsetAndFillAndLine() {
        if (offsetAndFillAndLine == null) {
            offsetAndFillAndLine = new ArrayList<Object>();
        }
        return this.offsetAndFillAndLine;
    }

}
