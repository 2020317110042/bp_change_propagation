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
 * <p>DeployProcessInputMsgType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="DeployProcessInputMsgType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DeploymentParameters" type="{urn:qut-edu-au:schema:apromore:manager}PluginParameters"/>
 *       &lt;/sequence>
 *       &lt;attribute name="processName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="versionName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="branchName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="nativeType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="deploymentPluginName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="deploymentPluginVersion" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeployProcessInputMsgType", propOrder = {
    "deploymentParameters"
})
public class DeployProcessInputMsgType
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "DeploymentParameters", required = true)
    protected PluginParameters deploymentParameters;
    @XmlAttribute(name = "processName")
    protected String processName;
    @XmlAttribute(name = "versionName")
    protected String versionName;
    @XmlAttribute(name = "branchName")
    protected String branchName;
    @XmlAttribute(name = "nativeType")
    protected String nativeType;
    @XmlAttribute(name = "deploymentPluginName")
    protected String deploymentPluginName;
    @XmlAttribute(name = "deploymentPluginVersion")
    protected String deploymentPluginVersion;

    /**
     * 获取deploymentParameters属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PluginParameters }
     *     
     */
    public PluginParameters getDeploymentParameters() {
        return deploymentParameters;
    }

    /**
     * 设置deploymentParameters属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PluginParameters }
     *     
     */
    public void setDeploymentParameters(PluginParameters value) {
        this.deploymentParameters = value;
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
     * 获取branchName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchName() {
        return branchName;
    }

    /**
     * 设置branchName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchName(String value) {
        this.branchName = value;
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
     * 获取deploymentPluginName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeploymentPluginName() {
        return deploymentPluginName;
    }

    /**
     * 设置deploymentPluginName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeploymentPluginName(String value) {
        this.deploymentPluginName = value;
    }

    /**
     * 获取deploymentPluginVersion属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeploymentPluginVersion() {
        return deploymentPluginVersion;
    }

    /**
     * 设置deploymentPluginVersion属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeploymentPluginVersion(String value) {
        this.deploymentPluginVersion = value;
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
            PluginParameters theDeploymentParameters;
            theDeploymentParameters = this.getDeploymentParameters();
            strategy.appendField(locator, this, "deploymentParameters", buffer, theDeploymentParameters);
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
            String theBranchName;
            theBranchName = this.getBranchName();
            strategy.appendField(locator, this, "branchName", buffer, theBranchName);
        }
        {
            String theNativeType;
            theNativeType = this.getNativeType();
            strategy.appendField(locator, this, "nativeType", buffer, theNativeType);
        }
        {
            String theDeploymentPluginName;
            theDeploymentPluginName = this.getDeploymentPluginName();
            strategy.appendField(locator, this, "deploymentPluginName", buffer, theDeploymentPluginName);
        }
        {
            String theDeploymentPluginVersion;
            theDeploymentPluginVersion = this.getDeploymentPluginVersion();
            strategy.appendField(locator, this, "deploymentPluginVersion", buffer, theDeploymentPluginVersion);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DeployProcessInputMsgType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DeployProcessInputMsgType that = ((DeployProcessInputMsgType) object);
        {
            PluginParameters lhsDeploymentParameters;
            lhsDeploymentParameters = this.getDeploymentParameters();
            PluginParameters rhsDeploymentParameters;
            rhsDeploymentParameters = that.getDeploymentParameters();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "deploymentParameters", lhsDeploymentParameters), LocatorUtils.property(thatLocator, "deploymentParameters", rhsDeploymentParameters), lhsDeploymentParameters, rhsDeploymentParameters)) {
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
            String lhsBranchName;
            lhsBranchName = this.getBranchName();
            String rhsBranchName;
            rhsBranchName = that.getBranchName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "branchName", lhsBranchName), LocatorUtils.property(thatLocator, "branchName", rhsBranchName), lhsBranchName, rhsBranchName)) {
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
            String lhsDeploymentPluginName;
            lhsDeploymentPluginName = this.getDeploymentPluginName();
            String rhsDeploymentPluginName;
            rhsDeploymentPluginName = that.getDeploymentPluginName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "deploymentPluginName", lhsDeploymentPluginName), LocatorUtils.property(thatLocator, "deploymentPluginName", rhsDeploymentPluginName), lhsDeploymentPluginName, rhsDeploymentPluginName)) {
                return false;
            }
        }
        {
            String lhsDeploymentPluginVersion;
            lhsDeploymentPluginVersion = this.getDeploymentPluginVersion();
            String rhsDeploymentPluginVersion;
            rhsDeploymentPluginVersion = that.getDeploymentPluginVersion();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "deploymentPluginVersion", lhsDeploymentPluginVersion), LocatorUtils.property(thatLocator, "deploymentPluginVersion", rhsDeploymentPluginVersion), lhsDeploymentPluginVersion, rhsDeploymentPluginVersion)) {
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
            PluginParameters theDeploymentParameters;
            theDeploymentParameters = this.getDeploymentParameters();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "deploymentParameters", theDeploymentParameters), currentHashCode, theDeploymentParameters);
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
            String theBranchName;
            theBranchName = this.getBranchName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "branchName", theBranchName), currentHashCode, theBranchName);
        }
        {
            String theNativeType;
            theNativeType = this.getNativeType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "nativeType", theNativeType), currentHashCode, theNativeType);
        }
        {
            String theDeploymentPluginName;
            theDeploymentPluginName = this.getDeploymentPluginName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "deploymentPluginName", theDeploymentPluginName), currentHashCode, theDeploymentPluginName);
        }
        {
            String theDeploymentPluginVersion;
            theDeploymentPluginVersion = this.getDeploymentPluginVersion();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "deploymentPluginVersion", theDeploymentPluginVersion), currentHashCode, theDeploymentPluginVersion);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
