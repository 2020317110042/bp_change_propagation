//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.04.18 时间 02:50:25 PM CST 
//


package org.apromore.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>ProcessSummaryType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ProcessSummaryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VersionSummaries" type="{urn:qut-edu-au:schema:apromore:manager}VersionSummaryType" maxOccurs="unbounded"/>
 *         &lt;element name="Folder" type="{urn:qut-edu-au:schema:apromore:manager}FolderType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="original_native_type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="domain" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ranking" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="makePublic" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="last_version" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="owner" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="hasRead" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="hasWrite" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="hasOwnership" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessSummaryType", propOrder = {
    "versionSummaries",
    "folder"
})
public class ProcessSummaryType
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "VersionSummaries", required = true)
    protected List<VersionSummaryType> versionSummaries;
    @XmlElement(name = "Folder")
    protected FolderType folder;
    @XmlAttribute(name = "original_native_type")
    protected String originalNativeType;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "id")
    protected Integer id;
    @XmlAttribute(name = "domain")
    protected String domain;
    @XmlAttribute(name = "ranking")
    protected String ranking;
    @XmlAttribute(name = "makePublic")
    protected Boolean makePublic;
    @XmlAttribute(name = "last_version")
    protected String lastVersion;
    @XmlAttribute(name = "owner")
    protected String owner;
    @XmlAttribute(name = "hasRead")
    protected Boolean hasRead;
    @XmlAttribute(name = "hasWrite")
    protected Boolean hasWrite;
    @XmlAttribute(name = "hasOwnership")
    protected Boolean hasOwnership;

    /**
     * Gets the value of the versionSummaries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the versionSummaries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVersionSummaries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VersionSummaryType }
     * 
     * 
     */
    public List<VersionSummaryType> getVersionSummaries() {
        if (versionSummaries == null) {
            versionSummaries = new ArrayList<VersionSummaryType>();
        }
        return this.versionSummaries;
    }

    /**
     * 获取folder属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FolderType }
     *     
     */
    public FolderType getFolder() {
        return folder;
    }

    /**
     * 设置folder属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FolderType }
     *     
     */
    public void setFolder(FolderType value) {
        this.folder = value;
    }

    /**
     * 获取originalNativeType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalNativeType() {
        return originalNativeType;
    }

    /**
     * 设置originalNativeType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalNativeType(String value) {
        this.originalNativeType = value;
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

    /**
     * 获取id属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置id属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * 获取domain属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomain() {
        return domain;
    }

    /**
     * 设置domain属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomain(String value) {
        this.domain = value;
    }

    /**
     * 获取ranking属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRanking() {
        return ranking;
    }

    /**
     * 设置ranking属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRanking(String value) {
        this.ranking = value;
    }

    /**
     * 获取makePublic属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMakePublic() {
        return makePublic;
    }

    /**
     * 设置makePublic属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMakePublic(Boolean value) {
        this.makePublic = value;
    }

    /**
     * 获取lastVersion属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastVersion() {
        return lastVersion;
    }

    /**
     * 设置lastVersion属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastVersion(String value) {
        this.lastVersion = value;
    }

    /**
     * 获取owner属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwner() {
        return owner;
    }

    /**
     * 设置owner属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwner(String value) {
        this.owner = value;
    }

    /**
     * 获取hasRead属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasRead() {
        return hasRead;
    }

    /**
     * 设置hasRead属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasRead(Boolean value) {
        this.hasRead = value;
    }

    /**
     * 获取hasWrite属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasWrite() {
        return hasWrite;
    }

    /**
     * 设置hasWrite属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasWrite(Boolean value) {
        this.hasWrite = value;
    }

    /**
     * 获取hasOwnership属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasOwnership() {
        return hasOwnership;
    }

    /**
     * 设置hasOwnership属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasOwnership(Boolean value) {
        this.hasOwnership = value;
    }

    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        {
            List<VersionSummaryType> theVersionSummaries;
            theVersionSummaries = this.getVersionSummaries();
            strategy.appendField(locator, this, "versionSummaries", buffer, theVersionSummaries);
        }
        {
            FolderType theFolder;
            theFolder = this.getFolder();
            strategy.appendField(locator, this, "folder", buffer, theFolder);
        }
        {
            String theOriginalNativeType;
            theOriginalNativeType = this.getOriginalNativeType();
            strategy.appendField(locator, this, "originalNativeType", buffer, theOriginalNativeType);
        }
        {
            String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName);
        }
        {
            Integer theId;
            theId = this.getId();
            strategy.appendField(locator, this, "id", buffer, theId);
        }
        {
            String theDomain;
            theDomain = this.getDomain();
            strategy.appendField(locator, this, "domain", buffer, theDomain);
        }
        {
            String theRanking;
            theRanking = this.getRanking();
            strategy.appendField(locator, this, "ranking", buffer, theRanking);
        }
        {
            Boolean theMakePublic;
            theMakePublic = this.isMakePublic();
            strategy.appendField(locator, this, "makePublic", buffer, theMakePublic);
        }
        {
            String theLastVersion;
            theLastVersion = this.getLastVersion();
            strategy.appendField(locator, this, "lastVersion", buffer, theLastVersion);
        }
        {
            String theOwner;
            theOwner = this.getOwner();
            strategy.appendField(locator, this, "owner", buffer, theOwner);
        }
        {
            Boolean theHasRead;
            theHasRead = this.isHasRead();
            strategy.appendField(locator, this, "hasRead", buffer, theHasRead);
        }
        {
            Boolean theHasWrite;
            theHasWrite = this.isHasWrite();
            strategy.appendField(locator, this, "hasWrite", buffer, theHasWrite);
        }
        {
            Boolean theHasOwnership;
            theHasOwnership = this.isHasOwnership();
            strategy.appendField(locator, this, "hasOwnership", buffer, theHasOwnership);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ProcessSummaryType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ProcessSummaryType that = ((ProcessSummaryType) object);
        {
            List<VersionSummaryType> lhsVersionSummaries;
            lhsVersionSummaries = this.getVersionSummaries();
            List<VersionSummaryType> rhsVersionSummaries;
            rhsVersionSummaries = that.getVersionSummaries();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "versionSummaries", lhsVersionSummaries), LocatorUtils.property(thatLocator, "versionSummaries", rhsVersionSummaries), lhsVersionSummaries, rhsVersionSummaries)) {
                return false;
            }
        }
        {
            FolderType lhsFolder;
            lhsFolder = this.getFolder();
            FolderType rhsFolder;
            rhsFolder = that.getFolder();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "folder", lhsFolder), LocatorUtils.property(thatLocator, "folder", rhsFolder), lhsFolder, rhsFolder)) {
                return false;
            }
        }
        {
            String lhsOriginalNativeType;
            lhsOriginalNativeType = this.getOriginalNativeType();
            String rhsOriginalNativeType;
            rhsOriginalNativeType = that.getOriginalNativeType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "originalNativeType", lhsOriginalNativeType), LocatorUtils.property(thatLocator, "originalNativeType", rhsOriginalNativeType), lhsOriginalNativeType, rhsOriginalNativeType)) {
                return false;
            }
        }
        {
            String lhsName;
            lhsName = this.getName();
            String rhsName;
            rhsName = that.getName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsName), LocatorUtils.property(thatLocator, "name", rhsName), lhsName, rhsName)) {
                return false;
            }
        }
        {
            Integer lhsId;
            lhsId = this.getId();
            Integer rhsId;
            rhsId = that.getId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "id", lhsId), LocatorUtils.property(thatLocator, "id", rhsId), lhsId, rhsId)) {
                return false;
            }
        }
        {
            String lhsDomain;
            lhsDomain = this.getDomain();
            String rhsDomain;
            rhsDomain = that.getDomain();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "domain", lhsDomain), LocatorUtils.property(thatLocator, "domain", rhsDomain), lhsDomain, rhsDomain)) {
                return false;
            }
        }
        {
            String lhsRanking;
            lhsRanking = this.getRanking();
            String rhsRanking;
            rhsRanking = that.getRanking();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ranking", lhsRanking), LocatorUtils.property(thatLocator, "ranking", rhsRanking), lhsRanking, rhsRanking)) {
                return false;
            }
        }
        {
            Boolean lhsMakePublic;
            lhsMakePublic = this.isMakePublic();
            Boolean rhsMakePublic;
            rhsMakePublic = that.isMakePublic();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "makePublic", lhsMakePublic), LocatorUtils.property(thatLocator, "makePublic", rhsMakePublic), lhsMakePublic, rhsMakePublic)) {
                return false;
            }
        }
        {
            String lhsLastVersion;
            lhsLastVersion = this.getLastVersion();
            String rhsLastVersion;
            rhsLastVersion = that.getLastVersion();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lastVersion", lhsLastVersion), LocatorUtils.property(thatLocator, "lastVersion", rhsLastVersion), lhsLastVersion, rhsLastVersion)) {
                return false;
            }
        }
        {
            String lhsOwner;
            lhsOwner = this.getOwner();
            String rhsOwner;
            rhsOwner = that.getOwner();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "owner", lhsOwner), LocatorUtils.property(thatLocator, "owner", rhsOwner), lhsOwner, rhsOwner)) {
                return false;
            }
        }
        {
            Boolean lhsHasRead;
            lhsHasRead = this.isHasRead();
            Boolean rhsHasRead;
            rhsHasRead = that.isHasRead();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hasRead", lhsHasRead), LocatorUtils.property(thatLocator, "hasRead", rhsHasRead), lhsHasRead, rhsHasRead)) {
                return false;
            }
        }
        {
            Boolean lhsHasWrite;
            lhsHasWrite = this.isHasWrite();
            Boolean rhsHasWrite;
            rhsHasWrite = that.isHasWrite();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hasWrite", lhsHasWrite), LocatorUtils.property(thatLocator, "hasWrite", rhsHasWrite), lhsHasWrite, rhsHasWrite)) {
                return false;
            }
        }
        {
            Boolean lhsHasOwnership;
            lhsHasOwnership = this.isHasOwnership();
            Boolean rhsHasOwnership;
            rhsHasOwnership = that.isHasOwnership();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hasOwnership", lhsHasOwnership), LocatorUtils.property(thatLocator, "hasOwnership", rhsHasOwnership), lhsHasOwnership, rhsHasOwnership)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            List<VersionSummaryType> theVersionSummaries;
            theVersionSummaries = this.getVersionSummaries();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "versionSummaries", theVersionSummaries), currentHashCode, theVersionSummaries);
        }
        {
            FolderType theFolder;
            theFolder = this.getFolder();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "folder", theFolder), currentHashCode, theFolder);
        }
        {
            String theOriginalNativeType;
            theOriginalNativeType = this.getOriginalNativeType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "originalNativeType", theOriginalNativeType), currentHashCode, theOriginalNativeType);
        }
        {
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName);
        }
        {
            Integer theId;
            theId = this.getId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "id", theId), currentHashCode, theId);
        }
        {
            String theDomain;
            theDomain = this.getDomain();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "domain", theDomain), currentHashCode, theDomain);
        }
        {
            String theRanking;
            theRanking = this.getRanking();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ranking", theRanking), currentHashCode, theRanking);
        }
        {
            Boolean theMakePublic;
            theMakePublic = this.isMakePublic();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "makePublic", theMakePublic), currentHashCode, theMakePublic);
        }
        {
            String theLastVersion;
            theLastVersion = this.getLastVersion();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lastVersion", theLastVersion), currentHashCode, theLastVersion);
        }
        {
            String theOwner;
            theOwner = this.getOwner();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "owner", theOwner), currentHashCode, theOwner);
        }
        {
            Boolean theHasRead;
            theHasRead = this.isHasRead();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "hasRead", theHasRead), currentHashCode, theHasRead);
        }
        {
            Boolean theHasWrite;
            theHasWrite = this.isHasWrite();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "hasWrite", theHasWrite), currentHashCode, theHasWrite);
        }
        {
            Boolean theHasOwnership;
            theHasOwnership = this.isHasOwnership();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "hasOwnership", theHasOwnership), currentHashCode, theHasOwnership);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
