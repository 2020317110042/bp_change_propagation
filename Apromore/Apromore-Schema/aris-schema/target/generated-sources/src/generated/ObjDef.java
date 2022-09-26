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
 *         &lt;element ref="{}MasterGUID" minOccurs="0"/>
 *         &lt;element ref="{}SymbolGUID" minOccurs="0"/>
 *         &lt;element ref="{}AttrDef" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}CxnDef" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}ExtCxnDef" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ObjDef.ID" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="TypeNum" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="LinkedModels.IdRefs" type="{http://www.w3.org/2001/XMLSchema}IDREFS" />
 *       &lt;attribute name="ToCxnDefs.IdRefs" type="{http://www.w3.org/2001/XMLSchema}IDREFS" />
 *       &lt;attribute name="Reorg" default="DELETE">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="DELETE"/>
 *             &lt;enumeration value="NODELETE"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="SubTypeNum" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="SymbolNum" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
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
    "masterGUID",
    "symbolGUID",
    "attrDef",
    "cxnDef",
    "extCxnDef"
})
@XmlRootElement(name = "ObjDef")
public class ObjDef implements Visitable
{

    @XmlElement(name = "GUID")
    protected String guid;
    @XmlElement(name = "MasterGUID")
    protected String masterGUID;
    @XmlElement(name = "SymbolGUID")
    protected String symbolGUID;
    @XmlElement(name = "AttrDef")
    protected List<AttrDef> attrDef;
    @XmlElement(name = "CxnDef")
    protected List<CxnDef> cxnDef;
    @XmlElement(name = "ExtCxnDef")
    protected List<ExtCxnDef> extCxnDef;
    @XmlAttribute(name = "ObjDef.ID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String objDefID;
    @XmlAttribute(name = "TypeNum", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String typeNum;
    @XmlAttribute(name = "LinkedModels.IdRefs")
    @XmlIDREF
    @XmlSchemaType(name = "IDREFS")
    protected List<Object> linkedModelsIdRefs;
    @XmlAttribute(name = "ToCxnDefs.IdRefs")
    @XmlIDREF
    @XmlSchemaType(name = "IDREFS")
    protected List<Object> toCxnDefsIdRefs;
    @XmlAttribute(name = "Reorg")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String reorg;
    @XmlAttribute(name = "SubTypeNum")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String subTypeNum;
    @XmlAttribute(name = "SymbolNum")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String symbolNum;
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
     * 获取masterGUID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMasterGUID() {
        return masterGUID;
    }

    /**
     * 设置masterGUID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMasterGUID(String value) {
        this.masterGUID = value;
    }

    /**
     * 获取symbolGUID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSymbolGUID() {
        return symbolGUID;
    }

    /**
     * 设置symbolGUID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSymbolGUID(String value) {
        this.symbolGUID = value;
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
     * Gets the value of the cxnDef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cxnDef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCxnDef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CxnDef }
     * 
     * 
     */
    public List<CxnDef> getCxnDef() {
        if (cxnDef == null) {
            cxnDef = new ArrayList<CxnDef>();
        }
        return this.cxnDef;
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
     * 获取objDefID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjDefID() {
        return objDefID;
    }

    /**
     * 设置objDefID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjDefID(String value) {
        this.objDefID = value;
    }

    /**
     * 获取typeNum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeNum() {
        return typeNum;
    }

    /**
     * 设置typeNum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeNum(String value) {
        this.typeNum = value;
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
     * Gets the value of the toCxnDefsIdRefs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the toCxnDefsIdRefs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getToCxnDefsIdRefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getToCxnDefsIdRefs() {
        if (toCxnDefsIdRefs == null) {
            toCxnDefsIdRefs = new ArrayList<Object>();
        }
        return this.toCxnDefsIdRefs;
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
     * 获取subTypeNum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubTypeNum() {
        return subTypeNum;
    }

    /**
     * 设置subTypeNum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubTypeNum(String value) {
        this.subTypeNum = value;
    }

    /**
     * 获取symbolNum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSymbolNum() {
        return symbolNum;
    }

    /**
     * 设置symbolNum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSymbolNum(String value) {
        this.symbolNum = value;
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
