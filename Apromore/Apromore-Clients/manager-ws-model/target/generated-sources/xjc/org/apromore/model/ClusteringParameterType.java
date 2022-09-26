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
 * <p>ClusteringParameterType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ClusteringParameterType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ParamName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ParmaValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusteringParameterType", propOrder = {
    "paramName",
    "parmaValue"
})
public class ClusteringParameterType
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ParamName", required = true)
    protected String paramName;
    @XmlElement(name = "ParmaValue", required = true)
    protected String parmaValue;

    /**
     * 获取paramName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParamName() {
        return paramName;
    }

    /**
     * 设置paramName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParamName(String value) {
        this.paramName = value;
    }

    /**
     * 获取parmaValue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParmaValue() {
        return parmaValue;
    }

    /**
     * 设置parmaValue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParmaValue(String value) {
        this.parmaValue = value;
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
            String theParamName;
            theParamName = this.getParamName();
            strategy.appendField(locator, this, "paramName", buffer, theParamName);
        }
        {
            String theParmaValue;
            theParmaValue = this.getParmaValue();
            strategy.appendField(locator, this, "parmaValue", buffer, theParmaValue);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ClusteringParameterType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ClusteringParameterType that = ((ClusteringParameterType) object);
        {
            String lhsParamName;
            lhsParamName = this.getParamName();
            String rhsParamName;
            rhsParamName = that.getParamName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "paramName", lhsParamName), LocatorUtils.property(thatLocator, "paramName", rhsParamName), lhsParamName, rhsParamName)) {
                return false;
            }
        }
        {
            String lhsParmaValue;
            lhsParmaValue = this.getParmaValue();
            String rhsParmaValue;
            rhsParmaValue = that.getParmaValue();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "parmaValue", lhsParmaValue), LocatorUtils.property(thatLocator, "parmaValue", rhsParmaValue), lhsParmaValue, rhsParmaValue)) {
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
            String theParamName;
            theParamName = this.getParamName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "paramName", theParamName), currentHashCode, theParamName);
        }
        {
            String theParmaValue;
            theParmaValue = this.getParmaValue();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "parmaValue", theParmaValue), currentHashCode, theParmaValue);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
