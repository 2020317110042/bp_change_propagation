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
 * <p>PluginInfoResult complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PluginInfoResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MandatoryParameters" type="{urn:qut-edu-au:schema:apromore:manager}PluginParameters" minOccurs="0"/>
 *         &lt;element name="OptionalParameters" type="{urn:qut-edu-au:schema:apromore:manager}PluginParameters" minOccurs="0"/>
 *         &lt;element name="PluginInfo" type="{urn:qut-edu-au:schema:apromore:manager}PluginInfo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PluginInfoResult", propOrder = {
    "mandatoryParameters",
    "optionalParameters",
    "pluginInfo"
})
public class PluginInfoResult
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "MandatoryParameters")
    protected PluginParameters mandatoryParameters;
    @XmlElement(name = "OptionalParameters")
    protected PluginParameters optionalParameters;
    @XmlElement(name = "PluginInfo", required = true)
    protected PluginInfo pluginInfo;

    /**
     * 获取mandatoryParameters属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PluginParameters }
     *     
     */
    public PluginParameters getMandatoryParameters() {
        return mandatoryParameters;
    }

    /**
     * 设置mandatoryParameters属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PluginParameters }
     *     
     */
    public void setMandatoryParameters(PluginParameters value) {
        this.mandatoryParameters = value;
    }

    /**
     * 获取optionalParameters属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PluginParameters }
     *     
     */
    public PluginParameters getOptionalParameters() {
        return optionalParameters;
    }

    /**
     * 设置optionalParameters属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PluginParameters }
     *     
     */
    public void setOptionalParameters(PluginParameters value) {
        this.optionalParameters = value;
    }

    /**
     * 获取pluginInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PluginInfo }
     *     
     */
    public PluginInfo getPluginInfo() {
        return pluginInfo;
    }

    /**
     * 设置pluginInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PluginInfo }
     *     
     */
    public void setPluginInfo(PluginInfo value) {
        this.pluginInfo = value;
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
            PluginParameters theMandatoryParameters;
            theMandatoryParameters = this.getMandatoryParameters();
            strategy.appendField(locator, this, "mandatoryParameters", buffer, theMandatoryParameters);
        }
        {
            PluginParameters theOptionalParameters;
            theOptionalParameters = this.getOptionalParameters();
            strategy.appendField(locator, this, "optionalParameters", buffer, theOptionalParameters);
        }
        {
            PluginInfo thePluginInfo;
            thePluginInfo = this.getPluginInfo();
            strategy.appendField(locator, this, "pluginInfo", buffer, thePluginInfo);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof PluginInfoResult)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final PluginInfoResult that = ((PluginInfoResult) object);
        {
            PluginParameters lhsMandatoryParameters;
            lhsMandatoryParameters = this.getMandatoryParameters();
            PluginParameters rhsMandatoryParameters;
            rhsMandatoryParameters = that.getMandatoryParameters();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mandatoryParameters", lhsMandatoryParameters), LocatorUtils.property(thatLocator, "mandatoryParameters", rhsMandatoryParameters), lhsMandatoryParameters, rhsMandatoryParameters)) {
                return false;
            }
        }
        {
            PluginParameters lhsOptionalParameters;
            lhsOptionalParameters = this.getOptionalParameters();
            PluginParameters rhsOptionalParameters;
            rhsOptionalParameters = that.getOptionalParameters();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "optionalParameters", lhsOptionalParameters), LocatorUtils.property(thatLocator, "optionalParameters", rhsOptionalParameters), lhsOptionalParameters, rhsOptionalParameters)) {
                return false;
            }
        }
        {
            PluginInfo lhsPluginInfo;
            lhsPluginInfo = this.getPluginInfo();
            PluginInfo rhsPluginInfo;
            rhsPluginInfo = that.getPluginInfo();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pluginInfo", lhsPluginInfo), LocatorUtils.property(thatLocator, "pluginInfo", rhsPluginInfo), lhsPluginInfo, rhsPluginInfo)) {
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
            PluginParameters theMandatoryParameters;
            theMandatoryParameters = this.getMandatoryParameters();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mandatoryParameters", theMandatoryParameters), currentHashCode, theMandatoryParameters);
        }
        {
            PluginParameters theOptionalParameters;
            theOptionalParameters = this.getOptionalParameters();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "optionalParameters", theOptionalParameters), currentHashCode, theOptionalParameters);
        }
        {
            PluginInfo thePluginInfo;
            thePluginInfo = this.getPluginInfo();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "pluginInfo", thePluginInfo), currentHashCode, thePluginInfo);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
