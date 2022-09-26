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
 *         &lt;element ref="{}GUID" minOccurs="0"/>
 *         &lt;element ref="{}AttrDef" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}ExtCxnDef" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="CxnDef.ID" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="CxnDef.Type" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="ToObjDef.IdRef" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="LinkedModels.IdRefs" type="{http://www.w3.org/2001/XMLSchema}IDREFS" />
 *       &lt;attribute name="Reorg" default="DELETE">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="DELETE"/>
 *             &lt;enumeration value="NODELETE"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
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
    "guid",
    "attrDef",
    "extCxnDef"
})
@XmlRootElement(name = "CxnDef")
public class CxnDef
    implements Visitable
{

    @XmlElement(name = "GUID")
    protected String guid;
    @XmlElement(name = "AttrDef")
    protected List<AttrDef> attrDef;
    @XmlElement(name = "ExtCxnDef")
    protected List<ExtCxnDef> extCxnDef;
    @XmlAttribute(name = "CxnDef.ID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String cxnDefID;
    @XmlAttribute(name = "CxnDef.Type", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String cxnDefType;
    @XmlAttribute(name = "ToObjDef.IdRef", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object toObjDefIdRef;
    @XmlAttribute(name = "LinkedModels.IdRefs")
    @XmlIDREF
    @XmlSchemaType(name = "IDREFS")
    protected List<Object> linkedModelsIdRefs;
    @XmlAttribute(name = "Reorg")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String reorg;
    @XmlAttribute(name = "LastUpdated")
    @XmlSchemaType(name = "anySimpleType")
    protected String lastUpdated;

    /**
     * 获取guid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGUID() {
        return guid;
    }

    /**
     * 设置guid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGUID(String value) {
        this.guid = value;
    }

    /**
     * Gets the value of the attrDef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attrDef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttrDef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttrDef }
     * 
     * 
     */
    public List<AttrDef> getAttrDef() {
        if (attrDef == null) {
            attrDef = new ArrayList<AttrDef>();
        }
        return this.attrDef;
    }

    /**
     * Gets the value of the extCxnDef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extCxnDef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtCxnDef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtCxnDef }
     * 
     * 
     */
    public List<ExtCxnDef> getExtCxnDef() {
        if (extCxnDef == null) {
            extCxnDef = new ArrayList<ExtCxnDef>();
        }
        return this.extCxnDef;
    }

    /**
     * 获取cxnDefID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCxnDefID() {
        return cxnDefID;
    }

    /**
     * 设置cxnDefID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCxnDefID(String value) {
        this.cxnDefID = value;
    }

    /**
     * 获取cxnDefType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCxnDefType() {
        return cxnDefType;
    }

    /**
     * 设置cxnDefType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCxnDefType(String value) {
        this.cxnDefType = value;
    }

    /**
     * 获取toObjDefIdRef属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getToObjDefIdRef() {
        return toObjDefIdRef;
    }

    /**
     * 设置toObjDefIdRef属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setToObjDefIdRef(Object value) {
        this.toObjDefIdRef = value;
    }

    /**
     * Gets the value of the linkedModelsIdRefs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the linkedModelsIdRefs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLinkedModelsIdRefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getLinkedModelsIdRefs() {
        if (linkedModelsIdRefs == null) {
            linkedModelsIdRefs = new ArrayList<Object>();
        }
        return this.linkedModelsIdRefs;
    }

    /**
     * 获取reorg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReorg() {
        if (reorg == null) {
            return "DELETE";
        } else {
            return reorg;
        }
    }

    /**
     * 设置reorg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReorg(String value) {
        this.reorg = value;
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
