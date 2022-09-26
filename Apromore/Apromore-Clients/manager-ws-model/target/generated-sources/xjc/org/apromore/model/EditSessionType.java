//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.04.18 时间 02:50:25 PM CST 
//


package org.apromore.model;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 * <p>EditSessionType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="EditSessionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="username" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="nativeType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="folderId" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="processId" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="processName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="currentVersionNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="maxVersionNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="originalVersionNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="originalBranchName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="newBranchName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="createNewBranch" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="domain" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="creationDate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="lastUpdate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="withAnnotation" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="annotation" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="publicModel" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EditSessionType")
public class EditSessionType
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 1L;
    @XmlAttribute(name = "username")
    protected String username;
    @XmlAttribute(name = "nativeType")
    protected String nativeType;
    @XmlAttribute(name = "folderId")
    protected Integer folderId;
    @XmlAttribute(name = "processId")
    protected Integer processId;
    @XmlAttribute(name = "processName")
    protected String processName;
    @XmlAttribute(name = "currentVersionNumber")
    protected String currentVersionNumber;
    @XmlAttribute(name = "maxVersionNumber")
    protected String maxVersionNumber;
    @XmlAttribute(name = "originalVersionNumber")
    protected String originalVersionNumber;
    @XmlAttribute(name = "originalBranchName")
    protected String originalBranchName;
    @XmlAttribute(name = "newBranchName")
    protected String newBranchName;
    @XmlAttribute(name = "createNewBranch")
    protected Boolean createNewBranch;
    @XmlAttribute(name = "domain")
    protected String domain;
    @XmlAttribute(name = "creationDate")
    protected String creationDate;
    @XmlAttribute(name = "lastUpdate")
    protected String lastUpdate;
    @XmlAttribute(name = "withAnnotation")
    protected Boolean withAnnotation;
    @XmlAttribute(name = "annotation")
    protected String annotation;
    @XmlAttribute(name = "publicModel")
    protected Boolean publicModel;

    /**
     * 获取username属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置username属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
    }

    /**
     * 获取nativeType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNativeType() {
        return nativeType;
    }

    /**
     * 设置nativeType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNativeType(String value) {
        this.nativeType = value;
    }

    /**
     * 获取folderId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFolderId() {
        return folderId;
    }

    /**
     * 设置folderId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFolderId(Integer value) {
        this.folderId = value;
    }

    /**
     * 获取processId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProcessId() {
        return processId;
    }

    /**
     * 设置processId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProcessId(Integer value) {
        this.processId = value;
    }

    /**
     * 获取processName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessName() {
        return processName;
    }

    /**
     * 设置processName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessName(String value) {
        this.processName = value;
    }

    /**
     * 获取currentVersionNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentVersionNumber() {
        return currentVersionNumber;
    }

    /**
     * 设置currentVersionNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentVersionNumber(String value) {
        this.currentVersionNumber = value;
    }

    /**
     * 获取maxVersionNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxVersionNumber() {
        return maxVersionNumber;
    }

    /**
     * 设置maxVersionNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxVersionNumber(String value) {
        this.maxVersionNumber = value;
    }

    /**
     * 获取originalVersionNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalVersionNumber() {
        return originalVersionNumber;
    }

    /**
     * 设置originalVersionNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalVersionNumber(String value) {
        this.originalVersionNumber = value;
    }

    /**
     * 获取originalBranchName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalBranchName() {
        return originalBranchName;
    }

    /**
     * 设置originalBranchName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalBranchName(String value) {
        this.originalBranchName = value;
    }

    /**
     * 获取newBranchName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewBranchName() {
        return newBranchName;
    }

    /**
     * 设置newBranchName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewBranchName(String value) {
        this.newBranchName = value;
    }

    /**
     * 获取createNewBranch属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCreateNewBranch() {
        return createNewBranch;
    }

    /**
     * 设置createNewBranch属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCreateNewBranch(Boolean value) {
        this.createNewBranch = value;
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
     * 获取creationDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreationDate() {
        return creationDate;
    }

    /**
     * 设置creationDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreationDate(String value) {
        this.creationDate = value;
    }

    /**
     * 获取lastUpdate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastUpdate() {
        return lastUpdate;
    }

    /**
     * 设置lastUpdate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastUpdate(String value) {
        this.lastUpdate = value;
    }

    /**
     * 获取withAnnotation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWithAnnotation() {
        return withAnnotation;
    }

    /**
     * 设置withAnnotation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWithAnnotation(Boolean value) {
        this.withAnnotation = value;
    }

    /**
     * 获取annotation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnnotation() {
        return annotation;
    }

    /**
     * 设置annotation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnnotation(String value) {
        this.annotation = value;
    }

    /**
     * 获取publicModel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPublicModel() {
        return publicModel;
    }

    /**
     * 设置publicModel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPublicModel(Boolean value) {
        this.publicModel = value;
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
            String theUsername;
            theUsername = this.getUsername();
            strategy.appendField(locator, this, "username", buffer, theUsername);
        }
        {
            String theNativeType;
            theNativeType = this.getNativeType();
            strategy.appendField(locator, this, "nativeType", buffer, theNativeType);
        }
        {
            Integer theFolderId;
            theFolderId = this.getFolderId();
            strategy.appendField(locator, this, "folderId", buffer, theFolderId);
        }
        {
            Integer theProcessId;
            theProcessId = this.getProcessId();
            strategy.appendField(locator, this, "processId", buffer, theProcessId);
        }
        {
            String theProcessName;
            theProcessName = this.getProcessName();
            strategy.appendField(locator, this, "processName", buffer, theProcessName);
        }
        {
            String theCurrentVersionNumber;
            theCurrentVersionNumber = this.getCurrentVersionNumber();
            strategy.appendField(locator, this, "currentVersionNumber", buffer, theCurrentVersionNumber);
        }
        {
            String theMaxVersionNumber;
            theMaxVersionNumber = this.getMaxVersionNumber();
            strategy.appendField(locator, this, "maxVersionNumber", buffer, theMaxVersionNumber);
        }
        {
            String theOriginalVersionNumber;
            theOriginalVersionNumber = this.getOriginalVersionNumber();
            strategy.appendField(locator, this, "originalVersionNumber", buffer, theOriginalVersionNumber);
        }
        {
            String theOriginalBranchName;
            theOriginalBranchName = this.getOriginalBranchName();
            strategy.appendField(locator, this, "originalBranchName", buffer, theOriginalBranchName);
        }
        {
            String theNewBranchName;
            theNewBranchName = this.getNewBranchName();
            strategy.appendField(locator, this, "newBranchName", buffer, theNewBranchName);
        }
        {
            Boolean theCreateNewBranch;
            theCreateNewBranch = this.isCreateNewBranch();
            strategy.appendField(locator, this, "createNewBranch", buffer, theCreateNewBranch);
        }
        {
            String theDomain;
            theDomain = this.getDomain();
            strategy.appendField(locator, this, "domain", buffer, theDomain);
        }
        {
            String theCreationDate;
            theCreationDate = this.getCreationDate();
            strategy.appendField(locator, this, "creationDate", buffer, theCreationDate);
        }
        {
            String theLastUpdate;
            theLastUpdate = this.getLastUpdate();
            strategy.appendField(locator, this, "lastUpdate", buffer, theLastUpdate);
        }
        {
            Boolean theWithAnnotation;
            theWithAnnotation = this.isWithAnnotation();
            strategy.appendField(locator, this, "withAnnotation", buffer, theWithAnnotation);
        }
        {
            String theAnnotation;
            theAnnotation = this.getAnnotation();
            strategy.appendField(locator, this, "annotation", buffer, theAnnotation);
        }
        {
            Boolean thePublicModel;
            thePublicModel = this.isPublicModel();
            strategy.appendField(locator, this, "publicModel", buffer, thePublicModel);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof EditSessionType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final EditSessionType that = ((EditSessionType) object);
        {
            String lhsUsername;
            lhsUsername = this.getUsername();
            String rhsUsername;
            rhsUsername = that.getUsername();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "username", lhsUsername), LocatorUtils.property(thatLocator, "username", rhsUsername), lhsUsername, rhsUsername)) {
                return false;
            }
        }
        {
            String lhsNativeType;
            lhsNativeType = this.getNativeType();
            String rhsNativeType;
            rhsNativeType = that.getNativeType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nativeType", lhsNativeType), LocatorUtils.property(thatLocator, "nativeType", rhsNativeType), lhsNativeType, rhsNativeType)) {
                return false;
            }
        }
        {
            Integer lhsFolderId;
            lhsFolderId = this.getFolderId();
            Integer rhsFolderId;
            rhsFolderId = that.getFolderId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "folderId", lhsFolderId), LocatorUtils.property(thatLocator, "folderId", rhsFolderId), lhsFolderId, rhsFolderId)) {
                return false;
            }
        }
        {
            Integer lhsProcessId;
            lhsProcessId = this.getProcessId();
            Integer rhsProcessId;
            rhsProcessId = that.getProcessId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "processId", lhsProcessId), LocatorUtils.property(thatLocator, "processId", rhsProcessId), lhsProcessId, rhsProcessId)) {
                return false;
            }
        }
        {
            String lhsProcessName;
            lhsProcessName = this.getProcessName();
            String rhsProcessName;
            rhsProcessName = that.getProcessName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "processName", lhsProcessName), LocatorUtils.property(thatLocator, "processName", rhsProcessName), lhsProcessName, rhsProcessName)) {
                return false;
            }
        }
        {
            String lhsCurrentVersionNumber;
            lhsCurrentVersionNumber = this.getCurrentVersionNumber();
            String rhsCurrentVersionNumber;
            rhsCurrentVersionNumber = that.getCurrentVersionNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "currentVersionNumber", lhsCurrentVersionNumber), LocatorUtils.property(thatLocator, "currentVersionNumber", rhsCurrentVersionNumber), lhsCurrentVersionNumber, rhsCurrentVersionNumber)) {
                return false;
            }
        }
        {
            String lhsMaxVersionNumber;
            lhsMaxVersionNumber = this.getMaxVersionNumber();
            String rhsMaxVersionNumber;
            rhsMaxVersionNumber = that.getMaxVersionNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maxVersionNumber", lhsMaxVersionNumber), LocatorUtils.property(thatLocator, "maxVersionNumber", rhsMaxVersionNumber), lhsMaxVersionNumber, rhsMaxVersionNumber)) {
                return false;
            }
        }
        {
            String lhsOriginalVersionNumber;
            lhsOriginalVersionNumber = this.getOriginalVersionNumber();
            String rhsOriginalVersionNumber;
            rhsOriginalVersionNumber = that.getOriginalVersionNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "originalVersionNumber", lhsOriginalVersionNumber), LocatorUtils.property(thatLocator, "originalVersionNumber", rhsOriginalVersionNumber), lhsOriginalVersionNumber, rhsOriginalVersionNumber)) {
                return false;
            }
        }
        {
            String lhsOriginalBranchName;
            lhsOriginalBranchName = this.getOriginalBranchName();
            String rhsOriginalBranchName;
            rhsOriginalBranchName = that.getOriginalBranchName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "originalBranchName", lhsOriginalBranchName), LocatorUtils.property(thatLocator, "originalBranchName", rhsOriginalBranchName), lhsOriginalBranchName, rhsOriginalBranchName)) {
                return false;
            }
        }
        {
            String lhsNewBranchName;
            lhsNewBranchName = this.getNewBranchName();
            String rhsNewBranchName;
            rhsNewBranchName = that.getNewBranchName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "newBranchName", lhsNewBranchName), LocatorUtils.property(thatLocator, "newBranchName", rhsNewBranchName), lhsNewBranchName, rhsNewBranchName)) {
                return false;
            }
        }
        {
            Boolean lhsCreateNewBranch;
            lhsCreateNewBranch = this.isCreateNewBranch();
            Boolean rhsCreateNewBranch;
            rhsCreateNewBranch = that.isCreateNewBranch();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "createNewBranch", lhsCreateNewBranch), LocatorUtils.property(thatLocator, "createNewBranch", rhsCreateNewBranch), lhsCreateNewBranch, rhsCreateNewBranch)) {
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
            String lhsCreationDate;
            lhsCreationDate = this.getCreationDate();
            String rhsCreationDate;
            rhsCreationDate = that.getCreationDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "creationDate", lhsCreationDate), LocatorUtils.property(thatLocator, "creationDate", rhsCreationDate), lhsCreationDate, rhsCreationDate)) {
                return false;
            }
        }
        {
            String lhsLastUpdate;
            lhsLastUpdate = this.getLastUpdate();
            String rhsLastUpdate;
            rhsLastUpdate = that.getLastUpdate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lastUpdate", lhsLastUpdate), LocatorUtils.property(thatLocator, "lastUpdate", rhsLastUpdate), lhsLastUpdate, rhsLastUpdate)) {
                return false;
            }
        }
        {
            Boolean lhsWithAnnotation;
            lhsWithAnnotation = this.isWithAnnotation();
            Boolean rhsWithAnnotation;
            rhsWithAnnotation = that.isWithAnnotation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "withAnnotation", lhsWithAnnotation), LocatorUtils.property(thatLocator, "withAnnotation", rhsWithAnnotation), lhsWithAnnotation, rhsWithAnnotation)) {
                return false;
            }
        }
        {
            String lhsAnnotation;
            lhsAnnotation = this.getAnnotation();
            String rhsAnnotation;
            rhsAnnotation = that.getAnnotation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "annotation", lhsAnnotation), LocatorUtils.property(thatLocator, "annotation", rhsAnnotation), lhsAnnotation, rhsAnnotation)) {
                return false;
            }
        }
        {
            Boolean lhsPublicModel;
            lhsPublicModel = this.isPublicModel();
            Boolean rhsPublicModel;
            rhsPublicModel = that.isPublicModel();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "publicModel", lhsPublicModel), LocatorUtils.property(thatLocator, "publicModel", rhsPublicModel), lhsPublicModel, rhsPublicModel)) {
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
            String theUsername;
            theUsername = this.getUsername();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "username", theUsername), currentHashCode, theUsername);
        }
        {
            String theNativeType;
            theNativeType = this.getNativeType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "nativeType", theNativeType), currentHashCode, theNativeType);
        }
        {
            Integer theFolderId;
            theFolderId = this.getFolderId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "folderId", theFolderId), currentHashCode, theFolderId);
        }
        {
            Integer theProcessId;
            theProcessId = this.getProcessId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "processId", theProcessId), currentHashCode, theProcessId);
        }
        {
            String theProcessName;
            theProcessName = this.getProcessName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "processName", theProcessName), currentHashCode, theProcessName);
        }
        {
            String theCurrentVersionNumber;
            theCurrentVersionNumber = this.getCurrentVersionNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "currentVersionNumber", theCurrentVersionNumber), currentHashCode, theCurrentVersionNumber);
        }
        {
            String theMaxVersionNumber;
            theMaxVersionNumber = this.getMaxVersionNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "maxVersionNumber", theMaxVersionNumber), currentHashCode, theMaxVersionNumber);
        }
        {
            String theOriginalVersionNumber;
            theOriginalVersionNumber = this.getOriginalVersionNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "originalVersionNumber", theOriginalVersionNumber), currentHashCode, theOriginalVersionNumber);
        }
        {
            String theOriginalBranchName;
            theOriginalBranchName = this.getOriginalBranchName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "originalBranchName", theOriginalBranchName), currentHashCode, theOriginalBranchName);
        }
        {
            String theNewBranchName;
            theNewBranchName = this.getNewBranchName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "newBranchName", theNewBranchName), currentHashCode, theNewBranchName);
        }
        {
            Boolean theCreateNewBranch;
            theCreateNewBranch = this.isCreateNewBranch();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "createNewBranch", theCreateNewBranch), currentHashCode, theCreateNewBranch);
        }
        {
            String theDomain;
            theDomain = this.getDomain();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "domain", theDomain), currentHashCode, theDomain);
        }
        {
            String theCreationDate;
            theCreationDate = this.getCreationDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "creationDate", theCreationDate), currentHashCode, theCreationDate);
        }
        {
            String theLastUpdate;
            theLastUpdate = this.getLastUpdate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lastUpdate", theLastUpdate), currentHashCode, theLastUpdate);
        }
        {
            Boolean theWithAnnotation;
            theWithAnnotation = this.isWithAnnotation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "withAnnotation", theWithAnnotation), currentHashCode, theWithAnnotation);
        }
        {
            String theAnnotation;
            theAnnotation = this.getAnnotation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "annotation", theAnnotation), currentHashCode, theAnnotation);
        }
        {
            Boolean thePublicModel;
            thePublicModel = this.isPublicModel();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "publicModel", thePublicModel), currentHashCode, thePublicModel);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
