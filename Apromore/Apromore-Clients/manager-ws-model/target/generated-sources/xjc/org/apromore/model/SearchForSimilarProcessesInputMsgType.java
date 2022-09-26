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
 * <p>SearchForSimilarProcessesInputMsgType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SearchForSimilarProcessesInputMsgType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProcessId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="VersionName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Algorithm" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LatestVersions" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="FolderId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Parameters" type="{urn:qut-edu-au:schema:apromore:manager}ParametersType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchForSimilarProcessesInputMsgType", propOrder = {
    "processId",
    "versionName",
    "algorithm",
    "latestVersions",
    "folderId",
    "userId",
    "parameters"
})
public class SearchForSimilarProcessesInputMsgType
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ProcessId")
    protected int processId;
    @XmlElement(name = "VersionName", required = true)
    protected String versionName;
    @XmlElement(name = "Algorithm", required = true)
    protected String algorithm;
    @XmlElement(name = "LatestVersions")
    protected boolean latestVersions;
    @XmlElement(name = "FolderId")
    protected int folderId;
    @XmlElement(required = true)
    protected String userId;
    @XmlElement(name = "Parameters", required = true)
    protected ParametersType parameters;

    /**
     * 获取processId属性的值。
     * 
     */
    public int getProcessId() {
        return processId;
    }

    /**
     * 设置processId属性的值。
     * 
     */
    public void setProcessId(int value) {
        this.processId = value;
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
     * 获取latestVersions属性的值。
     * 
     */
    public boolean isLatestVersions() {
        return latestVersions;
    }

    /**
     * 设置latestVersions属性的值。
     * 
     */
    public void setLatestVersions(boolean value) {
        this.latestVersions = value;
    }

    /**
     * 获取folderId属性的值。
     * 
     */
    public int getFolderId() {
        return folderId;
    }

    /**
     * 设置folderId属性的值。
     * 
     */
    public void setFolderId(int value) {
        this.folderId = value;
    }

    /**
     * 获取userId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置userId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId(String value) {
        this.userId = value;
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
            int theProcessId;
            theProcessId = this.getProcessId();
            strategy.appendField(locator, this, "processId", buffer, theProcessId);
        }
        {
            String theVersionName;
            theVersionName = this.getVersionName();
            strategy.appendField(locator, this, "versionName", buffer, theVersionName);
        }
        {
            String theAlgorithm;
            theAlgorithm = this.getAlgorithm();
            strategy.appendField(locator, this, "algorithm", buffer, theAlgorithm);
        }
        {
            boolean theLatestVersions;
            theLatestVersions = this.isLatestVersions();
            strategy.appendField(locator, this, "latestVersions", buffer, theLatestVersions);
        }
        {
            int theFolderId;
            theFolderId = this.getFolderId();
            strategy.appendField(locator, this, "folderId", buffer, theFolderId);
        }
        {
            String theUserId;
            theUserId = this.getUserId();
            strategy.appendField(locator, this, "userId", buffer, theUserId);
        }
        {
            ParametersType theParameters;
            theParameters = this.getParameters();
            strategy.appendField(locator, this, "parameters", buffer, theParameters);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof SearchForSimilarProcessesInputMsgType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final SearchForSimilarProcessesInputMsgType that = ((SearchForSimilarProcessesInputMsgType) object);
        {
            int lhsProcessId;
            lhsProcessId = this.getProcessId();
            int rhsProcessId;
            rhsProcessId = that.getProcessId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "processId", lhsProcessId), LocatorUtils.property(thatLocator, "processId", rhsProcessId), lhsProcessId, rhsProcessId)) {
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
            String lhsAlgorithm;
            lhsAlgorithm = this.getAlgorithm();
            String rhsAlgorithm;
            rhsAlgorithm = that.getAlgorithm();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "algorithm", lhsAlgorithm), LocatorUtils.property(thatLocator, "algorithm", rhsAlgorithm), lhsAlgorithm, rhsAlgorithm)) {
                return false;
            }
        }
        {
            boolean lhsLatestVersions;
            lhsLatestVersions = this.isLatestVersions();
            boolean rhsLatestVersions;
            rhsLatestVersions = that.isLatestVersions();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "latestVersions", lhsLatestVersions), LocatorUtils.property(thatLocator, "latestVersions", rhsLatestVersions), lhsLatestVersions, rhsLatestVersions)) {
                return false;
            }
        }
        {
            int lhsFolderId;
            lhsFolderId = this.getFolderId();
            int rhsFolderId;
            rhsFolderId = that.getFolderId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "folderId", lhsFolderId), LocatorUtils.property(thatLocator, "folderId", rhsFolderId), lhsFolderId, rhsFolderId)) {
                return false;
            }
        }
        {
            String lhsUserId;
            lhsUserId = this.getUserId();
            String rhsUserId;
            rhsUserId = that.getUserId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "userId", lhsUserId), LocatorUtils.property(thatLocator, "userId", rhsUserId), lhsUserId, rhsUserId)) {
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
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            int theProcessId;
            theProcessId = this.getProcessId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "processId", theProcessId), currentHashCode, theProcessId);
        }
        {
            String theVersionName;
            theVersionName = this.getVersionName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "versionName", theVersionName), currentHashCode, theVersionName);
        }
        {
            String theAlgorithm;
            theAlgorithm = this.getAlgorithm();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "algorithm", theAlgorithm), currentHashCode, theAlgorithm);
        }
        {
            boolean theLatestVersions;
            theLatestVersions = this.isLatestVersions();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "latestVersions", theLatestVersions), currentHashCode, theLatestVersions);
        }
        {
            int theFolderId;
            theFolderId = this.getFolderId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "folderId", theFolderId), currentHashCode, theFolderId);
        }
        {
            String theUserId;
            theUserId = this.getUserId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "userId", theUserId), currentHashCode, theUserId);
        }
        {
            ParametersType theParameters;
            theParameters = this.getParameters();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "parameters", theParameters), currentHashCode, theParameters);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
