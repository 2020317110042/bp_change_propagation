//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.04.18 时间 02:49:13 PM CST 
//


package generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}AttrValue" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="AttrDef.ID" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="AttrDef.Type" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "attrValue"
})
@XmlRootElement(name = "AttrDef")
public class AttrDef implements Visitable
{

    @XmlElement(name = "AttrValue", required = true)
    protected List<AttrValue> attrValue;
    @XmlAttribute(name = "AttrDef.ID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String attrDefID;
    @XmlAttribute(name = "AttrDef.Type", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String attrDefType;

    /**
     * Gets the value of the attrValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attrValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttrValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttrValue }
     * 
     * 
     */
    public List<AttrValue> getAttrValue() {
        if (attrValue == null) {
            attrValue = new ArrayList<AttrValue>();
        }
        return this.attrValue;
    }

    /**
     * 获取attrDefID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttrDefID() {
        return attrDefID;
    }

    /**
     * 设置attrDefID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttrDefID(String value) {
        this.attrDefID = value;
    }

    /**
     * 获取attrDefType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttrDefType() {
        return attrDefType;
    }

    /**
     * 设置attrDefType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttrDefType(String value) {
        this.attrDefType = value;
    }

    public void accept(Visitor aVisitor) {
        aVisitor.visit(this);
    }

}
