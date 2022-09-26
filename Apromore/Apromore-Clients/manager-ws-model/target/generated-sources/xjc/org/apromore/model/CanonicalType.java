//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.04.18 时间 02:50:25 PM CST 
//


package org.apromore.model;

import java.io.Serializable;
import javax.activation.DataHandler;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlMimeType;
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
 * <p>CanonicalType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CanonicalType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProcessId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="VersionName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Cpf" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CanonicalType", propOrder = {
    "processId",
    "versionName",
    "cpf"
})
public class CanonicalType
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ProcessId")
    protected int processId;
    @XmlElement(name = "VersionName", required = true)
    protected String versionName;
    @XmlElement(name = "Cpf", required = true)
    @XmlMimeType("application/octet-stream")
    protected DataHandler cpf;

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
     * 获取cpf属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DataHandler }
     *     
     */
    public DataHandler getCpf() {
        return cpf;
    }

    /**
     * 设置cpf属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DataHandler }
     *     
     */
    public void setCpf(DataHandler value) {
        this.cpf = value;
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
            DataHandler theCpf;
            theCpf = this.getCpf();
            strategy.appendField(locator, this, "cpf", buffer, theCpf);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof CanonicalType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final CanonicalType that = ((CanonicalType) object);
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
            DataHandler lhsCpf;
            lhsCpf = this.getCpf();
            DataHandler rhsCpf;
            rhsCpf = that.getCpf();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cpf", lhsCpf), LocatorUtils.property(thatLocator, "cpf", rhsCpf), lhsCpf, rhsCpf)) {
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
            DataHandler theCpf;
            theCpf = this.getCpf();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cpf", theCpf), currentHashCode, theCpf);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
