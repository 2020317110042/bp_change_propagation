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
 *         &lt;element ref="{}Flag" minOccurs="0"/>
 *         &lt;element ref="{}GUID" minOccurs="0"/>
 *         &lt;element ref="{}MasterGUID" minOccurs="0"/>
 *         &lt;element ref="{}TypeGUID" minOccurs="0"/>
 *         &lt;element ref="{}TemplateGUID" minOccurs="0"/>
 *         &lt;element ref="{}Lane" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}AttrDef" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}ObjOcc" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}FFTextOcc" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}GfxObj" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}OLEOcc" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Union" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Model.ID" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="Model.Type" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="AttrHandling">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="OVERLAP"/>
 *             &lt;enumeration value="RESIZESYM"/>
 *             &lt;enumeration value="BREAKATTR"/>
 *             &lt;enumeration value="SHORTENATTR"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="CxnMode">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="ONLYVERTICAL"/>
 *             &lt;enumeration value="ANGULAR"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="GridUse">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="NO"/>
 *             &lt;enumeration value="YES"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="GridSize" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="Scale" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="PrintScale" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="BackColor" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="CurveRadius" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="ArcRadius" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
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
    "flag",
    "guid",
    "masterGUID",
    "typeGUID",
    "templateGUID",
    "lane",
    "attrDef",
    "objOcc",
    "ffTextOcc",
    "gfxObj",
    "oleOcc",
    "union"
})
@XmlRootElement(name = "Model")
public class Model implements Visitable
{

    @XmlElement(name = "Flag")
    protected String flag;
    @XmlElement(name = "GUID")
    protected String guid;
    @XmlElement(name = "MasterGUID")
    protected String masterGUID;
    @XmlElement(name = "TypeGUID")
    protected String typeGUID;
    @XmlElement(name = "TemplateGUID")
    protected String templateGUID;
    @XmlElement(name = "Lane")
    protected List<Lane> lane;
    @XmlElement(name = "AttrDef")
    protected List<AttrDef> attrDef;
    @XmlElement(name = "ObjOcc")
    protected List<ObjOcc> objOcc;
    @XmlElement(name = "FFTextOcc")
    protected List<FFTextOcc> ffTextOcc;
    @XmlElement(name = "GfxObj")
    protected List<GfxObj> gfxObj;
    @XmlElement(name = "OLEOcc")
    protected List<OLEOcc> oleOcc;
    @XmlElement(name = "Union")
    protected List<Union> union;
    @XmlAttribute(name = "Model.ID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String modelID;
    @XmlAttribute(name = "Model.Type", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String modelType;
    @XmlAttribute(name = "AttrHandling")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String attrHandling;
    @XmlAttribute(name = "CxnMode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String cxnMode;
    @XmlAttribute(name = "GridUse")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String gridUse;
    @XmlAttribute(name = "GridSize")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String gridSize;
    @XmlAttribute(name = "Scale")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String scale;
    @XmlAttribute(name = "PrintScale")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String printScale;
    @XmlAttribute(name = "BackColor")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String backColor;
    @XmlAttribute(name = "CurveRadius")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String curveRadius;
    @XmlAttribute(name = "ArcRadius")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String arcRadius;
    @XmlAttribute(name = "LastUpdated")
    @XmlSchemaType(name = "anySimpleType")
    protected String lastUpdated;

    /**
     * 获取flag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlag() {
        return flag;
    }

    /**
     * 设置flag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlag(String value) {
        this.flag = value;
    }

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
     * 获取typeGUID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeGUID() {
        return typeGUID;
    }

    /**
     * 设置typeGUID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeGUID(String value) {
        this.typeGUID = value;
    }

    /**
     * 获取templateGUID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplateGUID() {
        return templateGUID;
    }

    /**
     * 设置templateGUID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplateGUID(String value) {
        this.templateGUID = value;
    }

    /**
     * Gets the value of the lane property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lane property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLane().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Lane }
     * 
     * 
     */
    public List<Lane> getLane() {
        if (lane == null) {
            lane = new ArrayList<Lane>();
        }
        return this.lane;
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
     * Gets the value of the objOcc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the objOcc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObjOcc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjOcc }
     * 
     * 
     */
    public List<ObjOcc> getObjOcc() {
        if (objOcc == null) {
            objOcc = new ArrayList<ObjOcc>();
        }
        return this.objOcc;
    }

    /**
     * Gets the value of the ffTextOcc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ffTextOcc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFFTextOcc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FFTextOcc }
     * 
     * 
     */
    public List<FFTextOcc> getFFTextOcc() {
        if (ffTextOcc == null) {
            ffTextOcc = new ArrayList<FFTextOcc>();
        }
        return this.ffTextOcc;
    }

    /**
     * Gets the value of the gfxObj property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gfxObj property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGfxObj().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GfxObj }
     * 
     * 
     */
    public List<GfxObj> getGfxObj() {
        if (gfxObj == null) {
            gfxObj = new ArrayList<GfxObj>();
        }
        return this.gfxObj;
    }

    /**
     * Gets the value of the oleOcc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the oleOcc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOLEOcc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OLEOcc }
     * 
     * 
     */
    public List<OLEOcc> getOLEOcc() {
        if (oleOcc == null) {
            oleOcc = new ArrayList<OLEOcc>();
        }
        return this.oleOcc;
    }

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
     * 获取modelID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelID() {
        return modelID;
    }

    /**
     * 设置modelID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelID(String value) {
        this.modelID = value;
    }

    /**
     * 获取modelType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelType() {
        return modelType;
    }

    /**
     * 设置modelType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelType(String value) {
        this.modelType = value;
    }

    /**
     * 获取attrHandling属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttrHandling() {
        return attrHandling;
    }

    /**
     * 设置attrHandling属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttrHandling(String value) {
        this.attrHandling = value;
    }

    /**
     * 获取cxnMode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCxnMode() {
        return cxnMode;
    }

    /**
     * 设置cxnMode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCxnMode(String value) {
        this.cxnMode = value;
    }

    /**
     * 获取gridUse属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGridUse() {
        return gridUse;
    }

    /**
     * 设置gridUse属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGridUse(String value) {
        this.gridUse = value;
    }

    /**
     * 获取gridSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGridSize() {
        return gridSize;
    }

    /**
     * 设置gridSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGridSize(String value) {
        this.gridSize = value;
    }

    /**
     * 获取scale属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScale() {
        return scale;
    }

    /**
     * 设置scale属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScale(String value) {
        this.scale = value;
    }

    /**
     * 获取printScale属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrintScale() {
        return printScale;
    }

    /**
     * 设置printScale属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrintScale(String value) {
        this.printScale = value;
    }

    /**
     * 获取backColor属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackColor() {
        return backColor;
    }

    /**
     * 设置backColor属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackColor(String value) {
        this.backColor = value;
    }

    /**
     * 获取curveRadius属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurveRadius() {
        return curveRadius;
    }

    /**
     * 设置curveRadius属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurveRadius(String value) {
        this.curveRadius = value;
    }

    /**
     * 获取arcRadius属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArcRadius() {
        return arcRadius;
    }

    /**
     * 设置arcRadius属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArcRadius(String value) {
        this.arcRadius = value;
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
