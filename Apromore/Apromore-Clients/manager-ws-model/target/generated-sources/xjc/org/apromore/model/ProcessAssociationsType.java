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
 * <p>ProcessAssociationsType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ProcessAssociationsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProcessId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ProcessName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BranchName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ProcessVersionId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ProcessVersionNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessAssociationsType", propOrder = {
    "processId",
    "processName",
    "branchName",
    "processVersionId",
    "processVersionNumber"
})
public class ProcessAssociationsType
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ProcessId")
    protected int processId;
    @XmlElement(name = "ProcessName", required = true)
    protected String processName;
    @XmlElement(name = "BranchName", required = true)
    protected String branchName;
    @XmlElement(name = "ProcessVersionId")
    protected int processVersionId;
    @XmlElement(name = "ProcessVersionNumber", required = true)
    protected String processVersionNumber;

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
     * 获取processVersionId属性的值。
     * 
     */
    public int getProcessVersionId() {
        return processVersionId;
    }

    /**
     * 设置processVersionId属性的值。
     * 
     */
    public void setProcessVersionId(int value) {
        this.processVersionId = value;
    }

    /**
     * 获取processVersionNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessVersionNumber() {
        return processVersionNumber;
    }

    /**
     * 设置processVersionNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessVersionNumber(String value) {
        this.processVersionNumber = value;
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
            int theProcessVersionId;
            theProcessVersionId = this.getProcessVersionId();
            strategy.appendField(locator, this, "processVersionId", buffer, theProcessVersionId);
        }
        {
            String theProcessVersionNumber;
            theProcessVersionNumber = this.getProcessVersionNumber();
            strategy.appendField(locator, this, "processVersionNumber", buffer, theProcessVersionNumber);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ProcessAssociationsType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ProcessAssociationsType that = ((ProcessAssociationsType) object);
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
            int lhsProcessVersionId;
            lhsProcessVersionId = this.getProcessVersionId();
            int rhsProcessVersionId;
            rhsProcessVersionId = that.getProcessVersionId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "processVersionId", lhsProcessVersionId), LocatorUtils.property(thatLocator, "processVersionId", rhsProcessVersionId), lhsProcessVersionId, rhsProcessVersionId)) {
                return false;
            }
        }
        {
            String lhsProcessVersionNumber;
            lhsProcessVersionNumber = this.getProcessVersionNumber();
            String rhsProcessVersionNumber;
            rhsProcessVersionNumber = that.getProcessVersionNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "processVersionNumber", lhsProcessVersionNumber), LocatorUtils.property(thatLocator, "processVersionNumber", rhsProcessVersionNumber), lhsProcessVersionNumber, rhsProcessVersionNumber)) {
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
            int theProcessVersionId;
            theProcessVersionId = this.getProcessVersionId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "processVersionId", theProcessVersionId), currentHashCode, theProcessVersionId);
        }
        {
            String theProcessVersionNumber;
            theProcessVersionNumber = this.getProcessVersionNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "processVersionNumber", theProcessVersionNumber), currentHashCode, theProcessVersionNumber);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
