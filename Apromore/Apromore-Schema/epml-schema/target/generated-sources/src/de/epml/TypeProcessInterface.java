//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.04.18 时间 02:49:26 PM CST 
//


package de.epml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>typeProcessInterface complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="typeProcessInterface">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.epml.de}tEpcElement">
 *       &lt;sequence>
 *         &lt;element name="toProcess" type="{http://www.epml.de}typeToProcess"/>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="attribute" type="{http://www.epml.de}typeAttribute"/>
 *         &lt;/choice>
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
@XmlType(name = "typeProcessInterface", propOrder = {
    "toProcess",
    "attribute"
})
public class TypeProcessInterface
    extends TEpcElement
{

    @XmlElement(required = true)
    protected TypeToProcess toProcess;
    protected List<TypeAttribute> attribute;

    /**
     * 获取toProcess属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TypeToProcess }
     *     
     */
    public TypeToProcess getToProcess() {
        return toProcess;
    }

    /**
     * 设置toProcess属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeToProcess }
     *     
     */
    public void setToProcess(TypeToProcess value) {
        this.toProcess = value;
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

}
