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
 * <p>tFromParts complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="tFromParts">
 *   &lt;complexContent>
 *     &lt;extension base="{pnml.apromore.org}tExtensibleElements">
 *       &lt;sequence>
 *         &lt;element ref="{pnml.apromore.org}fromPart" maxOccurs="unbounded"/>
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
@XmlType(name = "tFromParts", propOrder = {
    "fromPart"
})
public class TFromParts
    extends TExtensibleElements
{

    @XmlElement(required = true)
    protected List<TFromPart> fromPart;

    /**
     * Gets the value of the fromPart property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fromPart property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFromPart().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TFromPart }
     * 
     * 
     */
    public List<TFromPart> getFromPart() {
        if (fromPart == null) {
            fromPart = new ArrayList<TFromPart>();
        }
        return this.fromPart;
    }

}
