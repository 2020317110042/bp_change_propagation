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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>tAssign complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="tAssign">
 *   &lt;complexContent>
 *     &lt;extension base="{pnml.apromore.org}tActivity">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded">
 *           &lt;element ref="{pnml.apromore.org}copy"/>
 *           &lt;element ref="{pnml.apromore.org}extensionAssignOperation"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="validate" type="{pnml.apromore.org}tBoolean" default="no" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tAssign", propOrder = {
    "copyOrExtensionAssignOperation"
})
public class TAssign
    extends TActivity
{

    @XmlElements({
        @XmlElement(name = "copy", type = TCopy.class),
        @XmlElement(name = "extensionAssignOperation", type = TExtensionAssignOperation.class)
    })
    protected List<TExtensibleElements> copyOrExtensionAssignOperation;
    @XmlAttribute(name = "validate")
    protected TBoolean validate;

    /**
     * Gets the value of the copyOrExtensionAssignOperation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the copyOrExtensionAssignOperation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCopyOrExtensionAssignOperation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TCopy }
     * {@link TExtensionAssignOperation }
     * 
     * 
     */
    public List<TExtensibleElements> getCopyOrExtensionAssignOperation() {
        if (copyOrExtensionAssignOperation == null) {
            copyOrExtensionAssignOperation = new ArrayList<TExtensibleElements>();
        }
        return this.copyOrExtensionAssignOperation;
    }

    /**
     * 获取validate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TBoolean }
     *     
     */
    public TBoolean getValidate() {
        if (validate == null) {
            return TBoolean.NO;
        } else {
            return validate;
        }
    }

    /**
     * 设置validate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TBoolean }
     *     
     */
    public void setValidate(TBoolean value) {
        this.validate = value;
    }

}
