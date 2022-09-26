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
 * <p>WorkspaceType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="WorkspaceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Folders" type="{urn:qut-edu-au:schema:apromore:manager}FolderType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Processes" type="{urn:qut-edu-au:schema:apromore:manager}ProcessSummaryType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="workspaceName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkspaceType", propOrder = {
    "folders",
    "processes"
})
public class WorkspaceType
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Folders")
    protected List<FolderType> folders;
    @XmlElement(name = "Processes")
    protected List<ProcessSummaryType> processes;
    @XmlAttribute(name = "id")
    protected Integer id;
    @XmlAttribute(name = "workspaceName")
    protected String workspaceName;

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
     * 获取workspaceName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkspaceName() {
        return workspaceName;
    }

    /**
     * 设置workspaceName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkspaceName(String value) {
        this.workspaceName = value;
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
            String theWorkspaceName;
            theWorkspaceName = this.getWorkspaceName();
            strategy.appendField(locator, this, "workspaceName", buffer, theWorkspaceName);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof WorkspaceType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final WorkspaceType that = ((WorkspaceType) object);
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
            String lhsWorkspaceName;
            lhsWorkspaceName = this.getWorkspaceName();
            String rhsWorkspaceName;
            rhsWorkspaceName = that.getWorkspaceName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "workspaceName", lhsWorkspaceName), LocatorUtils.property(thatLocator, "workspaceName", rhsWorkspaceName), lhsWorkspaceName, rhsWorkspaceName)) {
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
            String theWorkspaceName;
            theWorkspaceName = this.getWorkspaceName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "workspaceName", theWorkspaceName), currentHashCode, theWorkspaceName);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
