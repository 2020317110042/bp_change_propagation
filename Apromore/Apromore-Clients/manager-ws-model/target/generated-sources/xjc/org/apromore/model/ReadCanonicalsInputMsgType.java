//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.04.18 时间 02:50:25 PM CST 
//


package org.apromore.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
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
 * <p>ReadCanonicalsInputMsgType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ReadCanonicalsInputMsgType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProcessVersion" type="{urn:qut-edu-au:schema:apromore:manager}ProcessVersionType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="LatestVersions" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReadCanonicalsInputMsgType", propOrder = {
    "processVersion"
})
public class ReadCanonicalsInputMsgType
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ProcessVersion")
    protected List<ProcessVersionType> processVersion;
    @XmlAttribute(name = "LatestVersions")
    protected Boolean latestVersions;

    /**
     * Gets the value of the processVersion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the processVersion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProcessVersion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProcessVersionType }
     * 
     * 
     */
    public List<ProcessVersionType> getProcessVersion() {
        if (processVersion == null) {
            processVersion = new ArrayList<ProcessVersionType>();
        }
        return this.processVersion;
    }

    /**
     * 获取latestVersions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLatestVersions() {
        return latestVersions;
    }

    /**
     * 设置latestVersions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLatestVersions(Boolean value) {
        this.latestVersions = value;
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
            List<ProcessVersionType> theProcessVersion;
            theProcessVersion = this.getProcessVersion();
            strategy.appendField(locator, this, "processVersion", buffer, theProcessVersion);
        }
        {
            Boolean theLatestVersions;
            theLatestVersions = this.isLatestVersions();
            strategy.appendField(locator, this, "latestVersions", buffer, theLatestVersions);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ReadCanonicalsInputMsgType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ReadCanonicalsInputMsgType that = ((ReadCanonicalsInputMsgType) object);
        {
            List<ProcessVersionType> lhsProcessVersion;
            lhsProcessVersion = this.getProcessVersion();
            List<ProcessVersionType> rhsProcessVersion;
            rhsProcessVersion = that.getProcessVersion();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "processVersion", lhsProcessVersion), LocatorUtils.property(thatLocator, "processVersion", rhsProcessVersion), lhsProcessVersion, rhsProcessVersion)) {
                return false;
            }
        }
        {
            Boolean lhsLatestVersions;
            lhsLatestVersions = this.isLatestVersions();
            Boolean rhsLatestVersions;
            rhsLatestVersions = that.isLatestVersions();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "latestVersions", lhsLatestVersions), LocatorUtils.property(thatLocator, "latestVersions", rhsLatestVersions), lhsLatestVersions, rhsLatestVersions)) {
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
            List<ProcessVersionType> theProcessVersion;
            theProcessVersion = this.getProcessVersion();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "processVersion", theProcessVersion), currentHashCode, theProcessVersion);
        }
        {
            Boolean theLatestVersions;
            theLatestVersions = this.isLatestVersions();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "latestVersions", theLatestVersions), currentHashCode, theLatestVersions);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
