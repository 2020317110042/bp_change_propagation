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
 * <p>ExportFormatInputMsgType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ExportFormatInputMsgType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CanoniserParameters" type="{urn:qut-edu-au:schema:apromore:manager}PluginParameters"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Format" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ProcessId" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="ProcessName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="BranchName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="versionNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="AnnotationName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="withAnnotations" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Owner" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExportFormatInputMsgType", propOrder = {
    "canoniserParameters"
})
public class ExportFormatInputMsgType
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "CanoniserParameters", required = true)
    protected PluginParameters canoniserParameters;
    @XmlAttribute(name = "Format")
    protected String format;
    @XmlAttribute(name = "ProcessId")
    protected Integer processId;
    @XmlAttribute(name = "ProcessName")
    protected String processName;
    @XmlAttribute(name = "BranchName")
    protected String branchName;
    @XmlAttribute(name = "versionNumber")
    protected String versionNumber;
    @XmlAttribute(name = "AnnotationName")
    protected String annotationName;
    @XmlAttribute(name = "withAnnotations")
    protected Boolean withAnnotations;
    @XmlAttribute(name = "Owner")
    protected String owner;

    /**
     * 获取canoniserParameters属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PluginParameters }
     *     
     */
    public PluginParameters getCanoniserParameters() {
        return canoniserParameters;
    }

    /**
     * 设置canoniserParameters属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PluginParameters }
     *     
     */
    public void setCanoniserParameters(PluginParameters value) {
        this.canoniserParameters = value;
    }

    /**
     * 获取format属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormat() {
        return format;
    }

    /**
     * 设置format属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormat(String value) {
        this.format = value;
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
     * 获取versionNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersionNumber() {
        return versionNumber;
    }

    /**
     * 设置versionNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersionNumber(String value) {
        this.versionNumber = value;
    }

    /**
     * 获取annotationName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnnotationName() {
        return annotationName;
    }

    /**
     * 设置annotationName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnnotationName(String value) {
        this.annotationName = value;
    }

    /**
     * 获取withAnnotations属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWithAnnotations() {
        return withAnnotations;
    }

    /**
     * 设置withAnnotations属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWithAnnotations(Boolean value) {
        this.withAnnotations = value;
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
            PluginParameters theCanoniserParameters;
            theCanoniserParameters = this.getCanoniserParameters();
            strategy.appendField(locator, this, "canoniserParameters", buffer, theCanoniserParameters);
        }
        {
            String theFormat;
            theFormat = this.getFormat();
            strategy.appendField(locator, this, "format", buffer, theFormat);
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
            String theBranchName;
            theBranchName = this.getBranchName();
            strategy.appendField(locator, this, "branchName", buffer, theBranchName);
        }
        {
            String theVersionNumber;
            theVersionNumber = this.getVersionNumber();
            strategy.appendField(locator, this, "versionNumber", buffer, theVersionNumber);
        }
        {
            String theAnnotationName;
            theAnnotationName = this.getAnnotationName();
            strategy.appendField(locator, this, "annotationName", buffer, theAnnotationName);
        }
        {
            Boolean theWithAnnotations;
            theWithAnnotations = this.isWithAnnotations();
            strategy.appendField(locator, this, "withAnnotations", buffer, theWithAnnotations);
        }
        {
            String theOwner;
            theOwner = this.getOwner();
            strategy.appendField(locator, this, "owner", buffer, theOwner);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ExportFormatInputMsgType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ExportFormatInputMsgType that = ((ExportFormatInputMsgType) object);
        {
            PluginParameters lhsCanoniserParameters;
            lhsCanoniserParameters = this.getCanoniserParameters();
            PluginParameters rhsCanoniserParameters;
            rhsCanoniserParameters = that.getCanoniserParameters();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "canoniserParameters", lhsCanoniserParameters), LocatorUtils.property(thatLocator, "canoniserParameters", rhsCanoniserParameters), lhsCanoniserParameters, rhsCanoniserParameters)) {
                return false;
            }
        }
        {
            String lhsFormat;
            lhsFormat = this.getFormat();
            String rhsFormat;
            rhsFormat = that.getFormat();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "format", lhsFormat), LocatorUtils.property(thatLocator, "format", rhsFormat), lhsFormat, rhsFormat)) {
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
            String lhsBranchName;
            lhsBranchName = this.getBranchName();
            String rhsBranchName;
            rhsBranchName = that.getBranchName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "branchName", lhsBranchName), LocatorUtils.property(thatLocator, "branchName", rhsBranchName), lhsBranchName, rhsBranchName)) {
                return false;
            }
        }
        {
            String lhsVersionNumber;
            lhsVersionNumber = this.getVersionNumber();
            String rhsVersionNumber;
            rhsVersionNumber = that.getVersionNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "versionNumber", lhsVersionNumber), LocatorUtils.property(thatLocator, "versionNumber", rhsVersionNumber), lhsVersionNumber, rhsVersionNumber)) {
                return false;
            }
        }
        {
            String lhsAnnotationName;
            lhsAnnotationName = this.getAnnotationName();
            String rhsAnnotationName;
            rhsAnnotationName = that.getAnnotationName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "annotationName", lhsAnnotationName), LocatorUtils.property(thatLocator, "annotationName", rhsAnnotationName), lhsAnnotationName, rhsAnnotationName)) {
                return false;
            }
        }
        {
            Boolean lhsWithAnnotations;
            lhsWithAnnotations = this.isWithAnnotations();
            Boolean rhsWithAnnotations;
            rhsWithAnnotations = that.isWithAnnotations();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "withAnnotations", lhsWithAnnotations), LocatorUtils.property(thatLocator, "withAnnotations", rhsWithAnnotations), lhsWithAnnotations, rhsWithAnnotations)) {
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
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            PluginParameters theCanoniserParameters;
            theCanoniserParameters = this.getCanoniserParameters();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "canoniserParameters", theCanoniserParameters), currentHashCode, theCanoniserParameters);
        }
        {
            String theFormat;
            theFormat = this.getFormat();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "format", theFormat), currentHashCode, theFormat);
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
            String theBranchName;
            theBranchName = this.getBranchName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "branchName", theBranchName), currentHashCode, theBranchName);
        }
        {
            String theVersionNumber;
            theVersionNumber = this.getVersionNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "versionNumber", theVersionNumber), currentHashCode, theVersionNumber);
        }
        {
            String theAnnotationName;
            theAnnotationName = this.getAnnotationName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "annotationName", theAnnotationName), currentHashCode, theAnnotationName);
        }
        {
            Boolean theWithAnnotations;
            theWithAnnotations = this.isWithAnnotations();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "withAnnotations", theWithAnnotations), currentHashCode, theWithAnnotations);
        }
        {
            String theOwner;
            theOwner = this.getOwner();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "owner", theOwner), currentHashCode, theOwner);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
