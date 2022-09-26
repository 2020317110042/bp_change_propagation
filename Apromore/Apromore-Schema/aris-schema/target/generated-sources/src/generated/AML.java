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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element ref="{}Header-Info"/>
 *         &lt;element ref="{}Language" maxOccurs="unbounded"/>
 *         &lt;element ref="{}Prefix" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Database" minOccurs="0"/>
 *         &lt;element ref="{}LDAPSettings" minOccurs="0"/>
 *         &lt;element ref="{}User" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}UserGroup" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}FontStyleSheet" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}FFTextDef" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}OLEDef" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Group"/>
 *         &lt;element ref="{}Delete" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "headerInfo",
    "language",
    "prefix",
    "database",
    "ldapSettings",
    "user",
    "userGroup",
    "fontStyleSheet",
    "ffTextDef",
    "oleDef",
    "group",
    "delete"
})
@XmlRootElement(name = "AML")
public class AML
    implements Visitable
{

    @XmlElement(name = "Header-Info", required = true)
    protected HeaderInfo headerInfo;
    @XmlElement(name = "Language", required = true)
    protected List<Language> language;
    @XmlElement(name = "Prefix")
    protected List<Prefix> prefix;
    @XmlElement(name = "Database")
    protected Database database;
    @XmlElement(name = "LDAPSettings")
    protected LDAPSettings ldapSettings;
    @XmlElement(name = "User")
    protected List<User> user;
    @XmlElement(name = "UserGroup")
    protected List<UserGroup> userGroup;
    @XmlElement(name = "FontStyleSheet")
    protected List<FontStyleSheet> fontStyleSheet;
    @XmlElement(name = "FFTextDef")
    protected List<FFTextDef> ffTextDef;
    @XmlElement(name = "OLEDef")
    protected List<OLEDef> oleDef;
    @XmlElement(name = "Group", required = true)
    protected Group group;
    @XmlElement(name = "Delete")
    protected List<Delete> delete;

    /**
     * 获取headerInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HeaderInfo }
     *     
     */
    public HeaderInfo getHeaderInfo() {
        return headerInfo;
    }

    /**
     * 设置headerInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HeaderInfo }
     *     
     */
    public void setHeaderInfo(HeaderInfo value) {
        this.headerInfo = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the language property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLanguage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Language }
     * 
     * 
     */
    public List<Language> getLanguage() {
        if (language == null) {
            language = new ArrayList<Language>();
        }
        return this.language;
    }

    /**
     * Gets the value of the prefix property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prefix property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrefix().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Prefix }
     * 
     * 
     */
    public List<Prefix> getPrefix() {
        if (prefix == null) {
            prefix = new ArrayList<Prefix>();
        }
        return this.prefix;
    }

    /**
     * 获取database属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Database }
     *     
     */
    public Database getDatabase() {
        return database;
    }

    /**
     * 设置database属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Database }
     *     
     */
    public void setDatabase(Database value) {
        this.database = value;
    }

    /**
     * 获取ldapSettings属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LDAPSettings }
     *     
     */
    public LDAPSettings getLDAPSettings() {
        return ldapSettings;
    }

    /**
     * 设置ldapSettings属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LDAPSettings }
     *     
     */
    public void setLDAPSettings(LDAPSettings value) {
        this.ldapSettings = value;
    }

    /**
     * Gets the value of the user property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the user property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUser().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link User }
     * 
     * 
     */
    public List<User> getUser() {
        if (user == null) {
            user = new ArrayList<User>();
        }
        return this.user;
    }

    /**
     * Gets the value of the userGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserGroup }
     * 
     * 
     */
    public List<UserGroup> getUserGroup() {
        if (userGroup == null) {
            userGroup = new ArrayList<UserGroup>();
        }
        return this.userGroup;
    }

    /**
     * Gets the value of the fontStyleSheet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fontStyleSheet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFontStyleSheet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FontStyleSheet }
     * 
     * 
     */
    public List<FontStyleSheet> getFontStyleSheet() {
        if (fontStyleSheet == null) {
            fontStyleSheet = new ArrayList<FontStyleSheet>();
        }
        return this.fontStyleSheet;
    }

    /**
     * Gets the value of the ffTextDef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ffTextDef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFFTextDef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FFTextDef }
     * 
     * 
     */
    public List<FFTextDef> getFFTextDef() {
        if (ffTextDef == null) {
            ffTextDef = new ArrayList<FFTextDef>();
        }
        return this.ffTextDef;
    }

    /**
     * Gets the value of the oleDef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the oleDef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOLEDef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OLEDef }
     * 
     * 
     */
    public List<OLEDef> getOLEDef() {
        if (oleDef == null) {
            oleDef = new ArrayList<OLEDef>();
        }
        return this.oleDef;
    }

    /**
     * 获取group属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Group }
     *     
     */
    public Group getGroup() {
        return group;
    }

    /**
     * 设置group属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Group }
     *     
     */
    public void setGroup(Group value) {
        this.group = value;
    }

    /**
     * Gets the value of the delete property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the delete property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDelete().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Delete }
     * 
     * 
     */
    public List<Delete> getDelete() {
        if (delete == null) {
            delete = new ArrayList<Delete>();
        }
        return this.delete;
    }

    public void accept(Visitor aVisitor) {
        aVisitor.visit(this);
    }

}
