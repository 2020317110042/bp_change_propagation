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
 * <p>CreateClustersInputMsgType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CreateClustersInputMsgType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ClusterSettings" type="{urn:qut-edu-au:schema:apromore:manager}ClusterSettingsType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateClustersInputMsgType", propOrder = {
    "clusterSettings"
})
public class CreateClustersInputMsgType
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ClusterSettings", required = true)
    protected ClusterSettingsType clusterSettings;

    /**
     * 获取clusterSettings属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ClusterSettingsType }
     *     
     */
    public ClusterSettingsType getClusterSettings() {
        return clusterSettings;
    }

    /**
     * 设置clusterSettings属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ClusterSettingsType }
     *     
     */
    public void setClusterSettings(ClusterSettingsType value) {
        this.clusterSettings = value;
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
            ClusterSettingsType theClusterSettings;
            theClusterSettings = this.getClusterSettings();
            strategy.appendField(locator, this, "clusterSettings", buffer, theClusterSettings);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof CreateClustersInputMsgType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final CreateClustersInputMsgType that = ((CreateClustersInputMsgType) object);
        {
            ClusterSettingsType lhsClusterSettings;
            lhsClusterSettings = this.getClusterSettings();
            ClusterSettingsType rhsClusterSettings;
            rhsClusterSettings = that.getClusterSettings();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "clusterSettings", lhsClusterSettings), LocatorUtils.property(thatLocator, "clusterSettings", rhsClusterSettings), lhsClusterSettings, rhsClusterSettings)) {
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
            ClusterSettingsType theClusterSettings;
            theClusterSettings = this.getClusterSettings();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "clusterSettings", theClusterSettings), currentHashCode, theClusterSettings);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
