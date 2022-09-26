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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>typeDirectory complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="typeDirectory">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.epml.de}tExtensibleElements">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="epc" type="{http://www.epml.de}typeEPC"/>
 *           &lt;element name="directory" type="{http://www.epml.de}typeDirectory"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeDirectory", propOrder = {
    "epcOrDirectory"
})
public class TypeDirectory
    extends TExtensibleElements
{

    @XmlElements({
        @XmlElement(name = "epc", type = TypeEPC.class),
        @XmlElement(name = "directory", type = TypeDirectory.class)
    })
    protected List<TExtensibleElements> epcOrDirectory;
    @XmlAttribute(name = "name")
    protected String name;

    /**
     * Gets the value of the epcOrDirectory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the epcOrDirectory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEpcOrDirectory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeEPC }
     * {@link TypeDirectory }
     * 
     * 
     */
    public List<TExtensibleElements> getEpcOrDirectory() {
        if (epcOrDirectory == null) {
            epcOrDirectory = new ArrayList<TExtensibleElements>();
        }
        return this.epcOrDirectory;
    }

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

}
