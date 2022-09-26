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
 *         &lt;element ref="{}GUID" minOccurs="0"/>
 *         &lt;element ref="{}AttrDef" maxOccurs="unbounded"/>
 *         &lt;element ref="{}FilterGUID" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Prefix" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="User.ID" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="isSystem" default="false">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="true"/>
 *             &lt;enumeration value="false"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Passwd" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="External" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="ExternalID" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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
    "filterGUID",
    "prefix"
})
@XmlRootElement(name = "User")
public class User
    implements Visitable
{

    @XmlElement(name = "GUID")
    protected String guid;
    @XmlElement(name = "AttrDef", required = true)
    protected List<AttrDef> attrDef;
    @XmlElement(name = "FilterGUID")
    protected List<String> filterGUID;
    @XmlElement(name = "Prefix")
    protected Prefix prefix;
    @XmlAttribute(name = "User.ID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String userID;
    @XmlAttribute(name = "isSystem")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String isSystem;
    @XmlAttribute(name = "Passwd")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String passwd;
    @XmlAttribute(name = "External")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String external;
    @XmlAttribute(name = "ExternalID")
    @XmlSchemaType(name = "anySimpleType")
    protected String externalID;

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
     * Gets the value of the filterGUID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the filterGUID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFilterGUID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFilterGUID() {
        if (filterGUID == null) {
            filterGUID = new ArrayList<String>();
        }
        return this.filterGUID;
    }

    /**
     * 获取prefix属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Prefix }
     *     
     */
    public Prefix getPrefix() {
        return prefix;
    }

    /**
     * 设置prefix属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Prefix }
     *     
     */
    public void setPrefix(Prefix value) {
        this.prefix = value;
    }

    /**
     * 获取userID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserID() {
        return userID;
    }

    /**
     * 设置userID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserID(String value) {
        this.userID = value;
    }

    /**
     * 获取isSystem属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsSystem() {
        if (isSystem == null) {
            return "false";
        } else {
            return isSystem;
        }
    }

    /**
     * 设置isSystem属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsSystem(String value) {
        this.isSystem = value;
    }

    /**
     * 获取passwd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPasswd() {
        return passwd;
    }

    /**
     * 设置passwd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPasswd(String value) {
        this.passwd = value;
    }

    /**
     * 获取external属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternal() {
        return external;
    }

    /**
     * 设置external属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternal(String value) {
        this.external = value;
    }

    /**
     * 获取externalID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalID() {
        return externalID;
    }

    /**
     * 设置externalID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalID(String value) {
        this.externalID = value;
    }

    public void accept(Visitor aVisitor) {
        aVisitor.visit(this);
    }

}
