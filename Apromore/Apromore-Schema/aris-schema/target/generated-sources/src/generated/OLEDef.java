//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.04.18 时间 02:49:13 PM CST 
//


package generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
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
 *         &lt;element ref="{}GUID" minOccurs="0"/>
 *         &lt;element ref="{}Blob"/>
 *         &lt;element ref="{}Blob"/>
 *         &lt;element ref="{}AttrDef" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="OLEDef.ID" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="Link" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="LastUpdated" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "content"
})
@XmlRootElement(name = "OLEDef")
public class OLEDef
    implements Visitable
{

    @XmlElementRefs({
        @XmlElementRef(name = "Blob", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "GUID", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "AttrDef", type = AttrDef.class, required = false)
    })
    protected List<Object> content;
    @XmlAttribute(name = "OLEDef.ID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String oleDefID;
    @XmlAttribute(name = "Link")
    @XmlSchemaType(name = "anySimpleType")
    protected String link;
    @XmlAttribute(name = "LastUpdated")
    @XmlSchemaType(name = "anySimpleType")
    protected String lastUpdated;

    /**
     * 获取内容模型的其余部分。
     * 
     * <p>
     * 由于以下原因, 您获取的是此 "catch-all" 属性: 
     * 字段名称 "Blob" 由模式的两个不同部分使用。请参阅: 
     * file:/D:/Apromore/Apromore-Schema/aris-schema/src/main/resources/xsd/ARIS-Export.xsd的第 766 行
     * file:/D:/Apromore/Apromore-Schema/aris-schema/src/main/resources/xsd/ARIS-Export.xsd的第 765 行
     * <p>
     * 要清除此属性, 请将属性定制设置应用于以下两个声明
     * 或其中一个以更改其名称: 
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link AttrDef }
     * 
     * 
     */
    public List<Object> getContent() {
        if (content == null) {
            content = new ArrayList<Object>();
        }
        return this.content;
    }

    /**
     * 获取oleDefID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOLEDefID() {
        return oleDefID;
    }

    /**
     * 设置oleDefID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOLEDefID(String value) {
        this.oleDefID = value;
    }

    /**
     * 获取link属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLink() {
        return link;
    }

    /**
     * 设置link属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLink(String value) {
        this.link = value;
    }

    /**
     * 获取lastUpdated属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastUpdated() {
        return lastUpdated;
    }

    /**
     * 设置lastUpdated属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastUpdated(String value) {
        this.lastUpdated = value;
    }

    public void accept(Visitor aVisitor) {
        aVisitor.visit(this);
    }

}
