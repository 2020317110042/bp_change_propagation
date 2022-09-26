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
 * <p>ClusterSettingsType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ClusterSettingsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Algorithm" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ClusteringParams" type="{urn:qut-edu-au:schema:apromore:manager}ClusteringParameterType" maxOccurs="unbounded"/>
 *         &lt;element name="ConstrainedProcessIds" type="{urn:qut-edu-au:schema:apromore:manager}ConstrainedProcessIdsType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterSettingsType", propOrder = {
    "algorithm",
    "clusteringParams",
    "constrainedProcessIds"
})
public class ClusterSettingsType
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Algorithm", required = true)
    protected String algorithm;
    @XmlElement(name = "ClusteringParams", required = true)
    protected List<ClusteringParameterType> clusteringParams;
    @XmlElement(name = "ConstrainedProcessIds", required = true)
    protected ConstrainedProcessIdsType constrainedProcessIds;

    /**
     * 获取algorithm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlgorithm() {
        return algorithm;
    }

    /**
     * 设置algorithm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlgorithm(String value) {
        this.algorithm = value;
    }

    /**
     * Gets the value of the clusteringParams property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clusteringParams property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClusteringParams().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClusteringParameterType }
     * 
     * 
     */
    public List<ClusteringParameterType> getClusteringParams() {
        if (clusteringParams == null) {
            clusteringParams = new ArrayList<ClusteringParameterType>();
        }
        return this.clusteringParams;
    }

    /**
     * 获取constrainedProcessIds属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ConstrainedProcessIdsType }
     *     
     */
    public ConstrainedProcessIdsType getConstrainedProcessIds() {
        return constrainedProcessIds;
    }

    /**
     * 设置constrainedProcessIds属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ConstrainedProcessIdsType }
     *     
     */
    public void setConstrainedProcessIds(ConstrainedProcessIdsType value) {
        this.constrainedProcessIds = value;
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
            String theAlgorithm;
            theAlgorithm = this.getAlgorithm();
            strategy.appendField(locator, this, "algorithm", buffer, theAlgorithm);
        }
        {
            List<ClusteringParameterType> theClusteringParams;
            theClusteringParams = this.getClusteringParams();
            strategy.appendField(locator, this, "clusteringParams", buffer, theClusteringParams);
        }
        {
            ConstrainedProcessIdsType theConstrainedProcessIds;
            theConstrainedProcessIds = this.getConstrainedProcessIds();
            strategy.appendField(locator, this, "constrainedProcessIds", buffer, theConstrainedProcessIds);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ClusterSettingsType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ClusterSettingsType that = ((ClusterSettingsType) object);
        {
            String lhsAlgorithm;
            lhsAlgorithm = this.getAlgorithm();
            String rhsAlgorithm;
            rhsAlgorithm = that.getAlgorithm();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "algorithm", lhsAlgorithm), LocatorUtils.property(thatLocator, "algorithm", rhsAlgorithm), lhsAlgorithm, rhsAlgorithm)) {
                return false;
            }
        }
        {
            List<ClusteringParameterType> lhsClusteringParams;
            lhsClusteringParams = this.getClusteringParams();
            List<ClusteringParameterType> rhsClusteringParams;
            rhsClusteringParams = that.getClusteringParams();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "clusteringParams", lhsClusteringParams), LocatorUtils.property(thatLocator, "clusteringParams", rhsClusteringParams), lhsClusteringParams, rhsClusteringParams)) {
                return false;
            }
        }
        {
            ConstrainedProcessIdsType lhsConstrainedProcessIds;
            lhsConstrainedProcessIds = this.getConstrainedProcessIds();
            ConstrainedProcessIdsType rhsConstrainedProcessIds;
            rhsConstrainedProcessIds = that.getConstrainedProcessIds();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "constrainedProcessIds", lhsConstrainedProcessIds), LocatorUtils.property(thatLocator, "constrainedProcessIds", rhsConstrainedProcessIds), lhsConstrainedProcessIds, rhsConstrainedProcessIds)) {
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
            String theAlgorithm;
            theAlgorithm = this.getAlgorithm();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "algorithm", theAlgorithm), currentHashCode, theAlgorithm);
        }
        {
            List<ClusteringParameterType> theClusteringParams;
            theClusteringParams = this.getClusteringParams();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "clusteringParams", theClusteringParams), currentHashCode, theClusteringParams);
        }
        {
            ConstrainedProcessIdsType theConstrainedProcessIds;
            theConstrainedProcessIds = this.getConstrainedProcessIds();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "constrainedProcessIds", theConstrainedProcessIds), currentHashCode, theConstrainedProcessIds);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
