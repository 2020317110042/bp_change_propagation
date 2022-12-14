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
 * <p>FolderType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="FolderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Folders" type="{urn:qut-edu-au:schema:apromore:manager}FolderType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Processes" type="{urn:qut-edu-au:schema:apromore:manager}ProcessSummaryType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="parentId" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="folderName" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "FolderType", propOrder = {
    "folders",
    "processes"
})
public class FolderType
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Folders")
    protected List<FolderType> folders;
    @XmlElement(name = "Processes")
    protected List<ProcessSummaryType> processes;
    @XmlAttribute(name = "id")
    protected Integer id;
    @XmlAttribute(name = "parentId")
    protected Integer parentId;
    @XmlAttribute(name = "folderName")
    protected String folderName;
    @XmlAttribute(name = "hasRead")
    protected Boolean hasRead;
    @XmlAttribute(name = "hasWrite")
    protected Boolean hasWrite;
    @XmlAttribute(name = "hasOwnership")
    protected Boolean hasOwnership;

    /**
     * Gets the value of the folders property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the folders property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFolders().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FolderType }
     * 
     * 
     */
    public List<FolderType> getFolders() {
        if (folders == null) {
            folders = new ArrayList<FolderType>();
        }
        return this.folders;
    }

    /**
     * Gets the value of the processes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the processes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProcesses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProcessSummaryType }
     * 
     * 
     */
    public List<ProcessSummaryType> getProcesses() {
        if (processes == null) {
            processes = new ArrayList<ProcessSummaryType>();
        }
        return this.processes;
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
     * 获取parentId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * 设置parentId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setParentId(Integer value) {
        this.parentId = value;
    }

    /**
     * 获取folderName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFolderName() {
        return folderName;
    }

    /**
     * 设置folderName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFolderName(String value) {
        this.folderName = value;
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
            List<FolderType> theFolders;
            theFolders = this.getFolders();
            strategy.appendField(locator, this, "folders", buffer, theFolders);
        }
        {
            List<ProcessSummaryType> theProcesses;
            theProcesses = this.getProcesses();
            strategy.appendField(locator, this, "processes", buffer, theProcesses);
        }
        {
            Integer theId;
            theId = this.getId();
            strategy.appendField(locator, this, "id", buffer, theId);
        }
        {
            Integer theParentId;
            theParentId = this.getParentId();
            strategy.appendField(locator, this, "parentId", buffer, theParentId);
        }
        {
            String theFolderName;
            theFolderName = this.getFolderName();
            strategy.appendField(locator, this, "folderName", buffer, theFolderName);
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
        if (!(object instanceof FolderType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final FolderType that = ((FolderType) object);
        {
            List<FolderType> lhsFolders;
            lhsFolders = this.getFolders();
            List<FolderType> rhsFolders;
            rhsFolders = that.getFolders();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "folders", lhsFolders), LocatorUtils.property(thatLocator, "folders", rhsFolders), lhsFolders, rhsFolders)) {
                return false;
            }
        }
        {
            List<ProcessSummaryType> lhsProcesses;
            lhsProcesses = this.getProcesses();
            List<ProcessSummaryType> rhsProcesses;
            rhsProcesses = that.getProcesses();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "processes", lhsProcesses), LocatorUtils.property(thatLocator, "processes", rhsProcesses), lhsProcesses, rhsProcesses)) {
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
            Integer lhsParentId;
            lhsParentId = this.getParentId();
            Integer rhsParentId;
            rhsParentId = that.getParentId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "parentId", lhsParentId), LocatorUtils.property(thatLocator, "parentId", rhsParentId), lhsParentId, rhsParentId)) {
                return false;
            }
        }
        {
            String lhsFolderName;
            lhsFolderName = this.getFolderName();
            String rhsFolderName;
            rhsFolderName = that.getFolderName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "folderName", lhsFolderName), LocatorUtils.property(thatLocator, "folderName", rhsFolderName), lhsFolderName, rhsFolderName)) {
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
            List<FolderType> theFolders;
            theFolders = this.getFolders();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "folders", theFolders), currentHashCode, theFolders);
        }
        {
            List<ProcessSummaryType> theProcesses;
            theProcesses = this.getProcesses();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "processes", theProcesses), currentHashCode, theProcesses);
        }
        {
            Integer theId;
            theId = this.getId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "id", theId), currentHashCode, theId);
        }
        {
            Integer theParentId;
            theParentId = this.getParentId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "parentId", theParentId), currentHashCode, theParentId);
        }
        {
            String theFolderName;
            theFolderName = this.getFolderName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "folderName", theFolderName), currentHashCode, theFolderName);
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
