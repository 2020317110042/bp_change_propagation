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
 * <p>ReadPluginInfoInputMsgType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ReadPluginInfoInputMsgType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="pluginName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pluginVersion" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReadPluginInfoInputMsgType")
public class ReadPluginInfoInputMsgType
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 1L;
    @XmlAttribute(name = "pluginName")
    protected String pluginName;
    @XmlAttribute(name = "pluginVersion")
    protected String pluginVersion;

    /**
     * 获取pluginName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPluginName() {
        return pluginName;
    }

    /**
     * 设置pluginName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPluginName(String value) {
        this.pluginName = value;
    }

    /**
     * 获取pluginVersion属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPluginVersion() {
        return pluginVersion;
    }

    /**
     * 设置pluginVersion属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPluginVersion(String value) {
        this.pluginVersion = value;
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
            String thePluginName;
            thePluginName = this.getPluginName();
            strategy.appendField(locator, this, "pluginName", buffer, thePluginName);
        }
        {
            String thePluginVersion;
            thePluginVersion = this.getPluginVersion();
            strategy.appendField(locator, this, "pluginVersion", buffer, thePluginVersion);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ReadPluginInfoInputMsgType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ReadPluginInfoInputMsgType that = ((ReadPluginInfoInputMsgType) object);
        {
            String lhsPluginName;
            lhsPluginName = this.getPluginName();
            String rhsPluginName;
            rhsPluginName = that.getPluginName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pluginName", lhsPluginName), LocatorUtils.property(thatLocator, "pluginName", rhsPluginName), lhsPluginName, rhsPluginName)) {
                return false;
            }
        }
        {
            String lhsPluginVersion;
            lhsPluginVersion = this.getPluginVersion();
            String rhsPluginVersion;
            rhsPluginVersion = that.getPluginVersion();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pluginVersion", lhsPluginVersion), LocatorUtils.property(thatLocator, "pluginVersion", rhsPluginVersion), lhsPluginVersion, rhsPluginVersion)) {
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
            String thePluginName;
            thePluginName = this.getPluginName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "pluginName", thePluginName), currentHashCode, thePluginName);
        }
        {
            String thePluginVersion;
            thePluginVersion = this.getPluginVersion();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "pluginVersion", thePluginVersion), currentHashCode, thePluginVersion);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
