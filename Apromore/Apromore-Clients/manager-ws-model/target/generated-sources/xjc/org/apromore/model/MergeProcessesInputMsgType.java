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
 * <p>MergeProcessesInputMsgType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="MergeProcessesInputMsgType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProcessVersion_ids" type="{urn:qut-edu-au:schema:apromore:manager}ProcessVersion_idsType"/>
 *         &lt;element name="Parameters" type="{urn:qut-edu-au:schema:apromore:manager}ParametersType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ProcessName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="VersionName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Domain" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Username" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Cpf_uri" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ProcessId" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="FolderId" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="Algorithm" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="MakePublic" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MergeProcessesInputMsgType", propOrder = {
    "processVersionIds",
    "parameters"
})
public class MergeProcessesInputMsgType
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ProcessVersion_ids", required = true)
    protected ProcessVersionIdsType processVersionIds;
    @XmlElement(name = "Parameters", required = true)
    protected ParametersType parameters;
    @XmlAttribute(name = "ProcessName")
    protected String processName;
    @XmlAttribute(name = "VersionName")
    protected String versionName;
    @XmlAttribute(name = "Domain")
    protected String domain;
    @XmlAttribute(name = "Username")
    protected String username;
    @XmlAttribute(name = "Cpf_uri")
    protected String cpfUri;
    @XmlAttribute(name = "ProcessId")
    protected Integer processId;
    @XmlAttribute(name = "FolderId")
    protected Integer folderId;
    @XmlAttribute(name = "Algorithm")
    protected String algorithm;
    @XmlAttribute(name = "MakePublic")
    protected Boolean makePublic;

    /**
     * 获取processVersionIds属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ProcessVersionIdsType }
     *     
     */
    public ProcessVersionIdsType getProcessVersionIds() {
        return processVersionIds;
    }

    /**
     * 设置processVersionIds属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessVersionIdsType }
     *     
     */
    public void setProcessVersionIds(ProcessVersionIdsType value) {
        this.processVersionIds = value;
    }

    /**
     * 获取parameters属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ParametersType }
     *     
     */
    public ParametersType getParameters() {
        return parameters;
    }

    /**
     * 设置parameters属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ParametersType }
     *     
     */
    public void setParameters(ParametersType value) {
        this.parameters = value;
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
     * 获取versionName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersionName() {
        return versionName;
    }

    /**
     * 设置versionName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersionName(String value) {
        this.versionName = value;
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
     * 获取cpfUri属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpfUri() {
        return cpfUri;
    }

    /**
     * 设置cpfUri属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpfUri(String value) {
        this.cpfUri = value;
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
     * 获取algorithm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlgorithm() {
        return algorithm;
    }

    /**
     * 设置algorithm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlgorithm(String value) {
        this.algorithm = value;
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
            ProcessVersionIdsType theProcessVersionIds;
            theProcessVersionIds = this.getProcessVersionIds();
            strategy.appendField(locator, this, "processVersionIds", buffer, theProcessVersionIds);
        }
        {
            ParametersType theParameters;
            theParameters = this.getParameters();
            strategy.appendField(locator, this, "parameters", buffer, theParameters);
        }
        {
            String theProcessName;
            theProcessName = this.getProcessName();
            strategy.appendField(locator, this, "processName", buffer, theProcessName);
        }
        {
            String theVersionName;
            theVersionName = this.getVersionName();
            strategy.appendField(locator, this, "versionName", buffer, theVersionName);
        }
        {
            String theDomain;
            theDomain = this.getDomain();
            strategy.appendField(locator, this, "domain", buffer, theDomain);
        }
        {
            String theUsername;
            theUsername = this.getUsername();
            strategy.appendField(locator, this, "username", buffer, theUsername);
        }
        {
            String theCpfUri;
            theCpfUri = this.getCpfUri();
            strategy.appendField(locator, this, "cpfUri", buffer, theCpfUri);
        }
        {
            Integer theProcessId;
            theProcessId = this.getProcessId();
            strategy.appendField(locator, this, "processId", buffer, theProcessId);
        }
        {
            Integer theFolderId;
            theFolderId = this.getFolderId();
            strategy.appendField(locator, this, "folderId", buffer, theFolderId);
        }
        {
            String theAlgorithm;
            theAlgorithm = this.getAlgorithm();
            strategy.appendField(locator, this, "algorithm", buffer, theAlgorithm);
        }
        {
            Boolean theMakePublic;
            theMakePublic = this.isMakePublic();
            strategy.appendField(locator, this, "makePublic", buffer, theMakePublic);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof MergeProcessesInputMsgType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final MergeProcessesInputMsgType that = ((MergeProcessesInputMsgType) object);
        {
            ProcessVersionIdsType lhsProcessVersionIds;
            lhsProcessVersionIds = this.getProcessVersionIds();
            ProcessVersionIdsType rhsProcessVersionIds;
            rhsProcessVersionIds = that.getProcessVersionIds();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "processVersionIds", lhsProcessVersionIds), LocatorUtils.property(thatLocator, "processVersionIds", rhsProcessVersionIds), lhsProcessVersionIds, rhsProcessVersionIds)) {
                return false;
            }
        }
        {
            ParametersType lhsParameters;
            lhsParameters = this.getParameters();
            ParametersType rhsParameters;
            rhsParameters = that.getParameters();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "parameters", lhsParameters), LocatorUtils.property(thatLocator, "parameters", rhsParameters), lhsParameters, rhsParameters)) {
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
            String lhsVersionName;
            lhsVersionName = this.getVersionName();
            String rhsVersionName;
            rhsVersionName = that.getVersionName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "versionName", lhsVersionName), LocatorUtils.property(thatLocator, "versionName", rhsVersionName), lhsVersionName, rhsVersionName)) {
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
            String lhsUsername;
            lhsUsername = this.getUsername();
            String rhsUsername;
            rhsUsername = that.getUsername();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "username", lhsUsername), LocatorUtils.property(thatLocator, "username", rhsUsername), lhsUsername, rhsUsername)) {
                return false;
            }
        }
        {
            String lhsCpfUri;
            lhsCpfUri = this.getCpfUri();
            String rhsCpfUri;
            rhsCpfUri = that.getCpfUri();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cpfUri", lhsCpfUri), LocatorUtils.property(thatLocator, "cpfUri", rhsCpfUri), lhsCpfUri, rhsCpfUri)) {
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
            Integer lhsFolderId;
            lhsFolderId = this.getFolderId();
            Integer rhsFolderId;
            rhsFolderId = that.getFolderId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "folderId", lhsFolderId), LocatorUtils.property(thatLocator, "folderId", rhsFolderId), lhsFolderId, rhsFolderId)) {
                return false;
            }
        }
        {
            String lhsAlgorithm;
            lhsAlgorithm = this.getAlgorithm();
            String rhsAlgorithm;
            rhsAlgorithm = that.getAlgorithm();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "algorithm", lhsAlgorithm), LocatorUtils.property(thatLocator, "algorithm", rhsAlgorithm), lhsAlgorithm, rhsAlgorithm)) {
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
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            ProcessVersionIdsType theProcessVersionIds;
            theProcessVersionIds = this.getProcessVersionIds();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "processVersionIds", theProcessVersionIds), currentHashCode, theProcessVersionIds);
        }
        {
            ParametersType theParameters;
            theParameters = this.getParameters();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "parameters", theParameters), currentHashCode, theParameters);
        }
        {
            String theProcessName;
            theProcessName = this.getProcessName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "processName", theProcessName), currentHashCode, theProcessName);
        }
        {
            String theVersionName;
            theVersionName = this.getVersionName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "versionName", theVersionName), currentHashCode, theVersionName);
        }
        {
            String theDomain;
            theDomain = this.getDomain();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "domain", theDomain), currentHashCode, theDomain);
        }
        {
            String theUsername;
            theUsername = this.getUsername();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "username", theUsername), currentHashCode, theUsername);
        }
        {
            String theCpfUri;
            theCpfUri = this.getCpfUri();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cpfUri", theCpfUri), currentHashCode, theCpfUri);
        }
        {
            Integer theProcessId;
            theProcessId = this.getProcessId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "processId", theProcessId), currentHashCode, theProcessId);
        }
        {
            Integer theFolderId;
            theFolderId = this.getFolderId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "folderId", theFolderId), currentHashCode, theFolderId);
        }
        {
            String theAlgorithm;
            theAlgorithm = this.getAlgorithm();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "algorithm", theAlgorithm), currentHashCode, theAlgorithm);
        }
        {
            Boolean theMakePublic;
            theMakePublic = this.isMakePublic();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "makePublic", theMakePublic), currentHashCode, theMakePublic);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
