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
import javax.xml.bind.annotation.XmlIDREF;
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
 *         &lt;element ref="{}Union" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="OLEObjOccs.IdRefs" type="{http://www.w3.org/2001/XMLSchema}IDREFS" />
 *       &lt;attribute name="ObjOccs.IdRefs" type="{http://www.w3.org/2001/XMLSchema}IDREFS" />
 *       &lt;attribute name="Gfxs.IdRefs" type="{http://www.w3.org/2001/XMLSchema}IDREFS" />
 *       &lt;attribute name="TextOccs.IdRefs" type="{http://www.w3.org/2001/XMLSchema}IDREFS" />
 *       &lt;attribute name="Zorder" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="Flags" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "union"
})
@XmlRootElement(name = "Union")
public class Union
    implements Visitable
{

    @XmlElement(name = "Union")
    protected List<Union> union;
    @XmlAttribute(name = "OLEObjOccs.IdRefs")
    @XmlIDREF
    @XmlSchemaType(name = "IDREFS")
    protected List<Object> oleObjOccsIdRefs;
    @XmlAttribute(name = "ObjOccs.IdRefs")
    @XmlIDREF
    @XmlSchemaType(name = "IDREFS")
    protected List<Object> objOccsIdRefs;
    @XmlAttribute(name = "Gfxs.IdRefs")
    @XmlIDREF
    @XmlSchemaType(name = "IDREFS")
    protected List<Object> gfxsIdRefs;
    @XmlAttribute(name = "TextOccs.IdRefs")
    @XmlIDREF
    @XmlSchemaType(name = "IDREFS")
    protected List<Object> textOccsIdRefs;
    @XmlAttribute(name = "Zorder")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String zorder;
    @XmlAttribute(name = "Flags")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String flags;

    /**
     * Gets the value of the union property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the union property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Union }
     * 
     * 
     */
    public List<Union> getUnion() {
        if (union == null) {
            union = new ArrayList<Union>();
        }
        return this.union;
    }

    /**
     * Gets the value of the oleObjOccsIdRefs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the oleObjOccsIdRefs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOLEObjOccsIdRefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getOLEObjOccsIdRefs() {
        if (oleObjOccsIdRefs == null) {
            oleObjOccsIdRefs = new ArrayList<Object>();
        }
        return this.oleObjOccsIdRefs;
    }

    /**
     * Gets the value of the objOccsIdRefs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the objOccsIdRefs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObjOccsIdRefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getObjOccsIdRefs() {
        if (objOccsIdRefs == null) {
            objOccsIdRefs = new ArrayList<Object>();
        }
        return this.objOccsIdRefs;
    }

    /**
     * Gets the value of the gfxsIdRefs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gfxsIdRefs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGfxsIdRefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGfxsIdRefs() {
        if (gfxsIdRefs == null) {
            gfxsIdRefs = new ArrayList<Object>();
        }
        return this.gfxsIdRefs;
    }

    /**
     * Gets the value of the textOccsIdRefs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the textOccsIdRefs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTextOccsIdRefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getTextOccsIdRefs() {
        if (textOccsIdRefs == null) {
            textOccsIdRefs = new ArrayList<Object>();
        }
        return this.textOccsIdRefs;
    }

    /**
     * 获取zorder属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZorder() {
        return zorder;
    }

    /**
     * 设置zorder属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZorder(String value) {
        this.zorder = value;
    }

    /**
     * 获取flags属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlags() {
        return flags;
    }

    /**
     * 设置flags属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlags(String value) {
        this.flags = value;
    }

    public void accept(Visitor aVisitor) {
        aVisitor.visit(this);
    }

}
