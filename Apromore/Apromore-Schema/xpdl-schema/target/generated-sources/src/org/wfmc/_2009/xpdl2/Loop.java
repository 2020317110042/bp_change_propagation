//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.04.18 时间 02:49:32 PM CST 
//


package org.wfmc._2009.xpdl2;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}LoopStandard"/>
 *         &lt;element ref="{http://www.wfmc.org/2009/XPDL2.2}LoopMultiInstance"/>
 *       &lt;/choice>
 *       &lt;attribute name="LoopType" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="Standard"/>
 *             &lt;enumeration value="MultiInstance"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "loopStandard",
    "loopMultiInstance"
})
@XmlRootElement(name = "Loop")
public class Loop {

    @XmlElement(name = "LoopStandard")
    protected LoopStandard loopStandard;
    @XmlElement(name = "LoopMultiInstance")
    protected LoopMultiInstance loopMultiInstance;
    @XmlAttribute(name = "LoopType", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String loopType;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * 获取loopStandard属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LoopStandard }
     *     
     */
    public LoopStandard getLoopStandard() {
        return loopStandard;
    }

    /**
     * 设置loopStandard属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LoopStandard }
     *     
     */
    public void setLoopStandard(LoopStandard value) {
        this.loopStandard = value;
    }

    /**
     * 获取loopMultiInstance属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LoopMultiInstance }
     *     
     */
    public LoopMultiInstance getLoopMultiInstance() {
        return loopMultiInstance;
    }

    /**
     * 设置loopMultiInstance属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LoopMultiInstance }
     *     
     */
    public void setLoopMultiInstance(LoopMultiInstance value) {
        this.loopMultiInstance = value;
    }

    /**
     * 获取loopType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoopType() {
        return loopType;
    }

    /**
     * 设置loopType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoopType(String value) {
        this.loopType = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
