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
 * <p>ReadInitialNativeFormatInputMsgType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ReadInitialNativeFormatInputMsgType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NativeMetaData" type="{urn:qut-edu-au:schema:apromore:manager}NativeMetaData"/>
 *       &lt;/sequence>
 *       &lt;attribute name="nativeType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="canoniserName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="canoniserVersion" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReadInitialNativeFormatInputMsgType", propOrder = {
    "nativeMetaData"
})
public class ReadInitialNativeFormatInputMsgType
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "NativeMetaData", required = true)
    protected NativeMetaData nativeMetaData;
    @XmlAttribute(name = "nativeType")
    protected String nativeType;
    @XmlAttribute(name = "canoniserName")
    protected String canoniserName;
    @XmlAttribute(name = "canoniserVersion")
    protected String canoniserVersion;

    /**
     * 获取nativeMetaData属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NativeMetaData }
     *     
     */
    public NativeMetaData getNativeMetaData() {
        return nativeMetaData;
    }

    /**
     * 设置nativeMetaData属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NativeMetaData }
     *     
     */
    public void setNativeMetaData(NativeMetaData value) {
        this.nativeMetaData = value;
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
     * 获取canoniserName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCanoniserName() {
        return canoniserName;
    }

    /**
     * 设置canoniserName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCanoniserName(String value) {
        this.canoniserName = value;
    }

    /**
     * 获取canoniserVersion属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCanoniserVersion() {
        return canoniserVersion;
    }

    /**
     * 设置canoniserVersion属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCanoniserVersion(String value) {
        this.canoniserVersion = value;
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
            NativeMetaData theNativeMetaData;
            theNativeMetaData = this.getNativeMetaData();
            strategy.appendField(locator, this, "nativeMetaData", buffer, theNativeMetaData);
        }
        {
            String theNativeType;
            theNativeType = this.getNativeType();
            strategy.appendField(locator, this, "nativeType", buffer, theNativeType);
        }
        {
            String theCanoniserName;
            theCanoniserName = this.getCanoniserName();
            strategy.appendField(locator, this, "canoniserName", buffer, theCanoniserName);
        }
        {
            String theCanoniserVersion;
            theCanoniserVersion = this.getCanoniserVersion();
            strategy.appendField(locator, this, "canoniserVersion", buffer, theCanoniserVersion);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ReadInitialNativeFormatInputMsgType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ReadInitialNativeFormatInputMsgType that = ((ReadInitialNativeFormatInputMsgType) object);
        {
            NativeMetaData lhsNativeMetaData;
            lhsNativeMetaData = this.getNativeMetaData();
            NativeMetaData rhsNativeMetaData;
            rhsNativeMetaData = that.getNativeMetaData();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nativeMetaData", lhsNativeMetaData), LocatorUtils.property(thatLocator, "nativeMetaData", rhsNativeMetaData), lhsNativeMetaData, rhsNativeMetaData)) {
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
            String lhsCanoniserName;
            lhsCanoniserName = this.getCanoniserName();
            String rhsCanoniserName;
            rhsCanoniserName = that.getCanoniserName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "canoniserName", lhsCanoniserName), LocatorUtils.property(thatLocator, "canoniserName", rhsCanoniserName), lhsCanoniserName, rhsCanoniserName)) {
                return false;
            }
        }
        {
            String lhsCanoniserVersion;
            lhsCanoniserVersion = this.getCanoniserVersion();
            String rhsCanoniserVersion;
            rhsCanoniserVersion = that.getCanoniserVersion();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "canoniserVersion", lhsCanoniserVersion), LocatorUtils.property(thatLocator, "canoniserVersion", rhsCanoniserVersion), lhsCanoniserVersion, rhsCanoniserVersion)) {
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
            NativeMetaData theNativeMetaData;
            theNativeMetaData = this.getNativeMetaData();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "nativeMetaData", theNativeMetaData), currentHashCode, theNativeMetaData);
        }
        {
            String theNativeType;
            theNativeType = this.getNativeType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "nativeType", theNativeType), currentHashCode, theNativeType);
        }
        {
            String theCanoniserName;
            theCanoniserName = this.getCanoniserName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "canoniserName", theCanoniserName), currentHashCode, theCanoniserName);
        }
        {
            String theCanoniserVersion;
            theCanoniserVersion = this.getCanoniserVersion();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "canoniserVersion", theCanoniserVersion), currentHashCode, theCanoniserVersion);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
