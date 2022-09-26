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
 * <p>ClusterSummaryType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ClusterSummaryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ClusterLabel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ClusterSize" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MedoidId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AvgFragmentSize" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="BCR" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="RefactoringGain" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="StandardizationEffort" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ClusterId" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterSummaryType", propOrder = {
    "clusterLabel",
    "clusterSize",
    "medoidId",
    "avgFragmentSize",
    "bcr",
    "refactoringGain",
    "standardizationEffort"
})
public class ClusterSummaryType
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ClusterLabel", required = true)
    protected String clusterLabel;
    @XmlElement(name = "ClusterSize")
    protected int clusterSize;
    @XmlElement(name = "MedoidId")
    protected int medoidId;
    @XmlElement(name = "AvgFragmentSize")
    protected float avgFragmentSize;
    @XmlElement(name = "BCR")
    protected double bcr;
    @XmlElement(name = "RefactoringGain")
    protected int refactoringGain;
    @XmlElement(name = "StandardizationEffort")
    protected double standardizationEffort;
    @XmlAttribute(name = "ClusterId")
    protected Integer clusterId;

    /**
     * 获取clusterLabel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClusterLabel() {
        return clusterLabel;
    }

    /**
     * 设置clusterLabel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClusterLabel(String value) {
        this.clusterLabel = value;
    }

    /**
     * 获取clusterSize属性的值。
     * 
     */
    public int getClusterSize() {
        return clusterSize;
    }

    /**
     * 设置clusterSize属性的值。
     * 
     */
    public void setClusterSize(int value) {
        this.clusterSize = value;
    }

    /**
     * 获取medoidId属性的值。
     * 
     */
    public int getMedoidId() {
        return medoidId;
    }

    /**
     * 设置medoidId属性的值。
     * 
     */
    public void setMedoidId(int value) {
        this.medoidId = value;
    }

    /**
     * 获取avgFragmentSize属性的值。
     * 
     */
    public float getAvgFragmentSize() {
        return avgFragmentSize;
    }

    /**
     * 设置avgFragmentSize属性的值。
     * 
     */
    public void setAvgFragmentSize(float value) {
        this.avgFragmentSize = value;
    }

    /**
     * 获取bcr属性的值。
     * 
     */
    public double getBCR() {
        return bcr;
    }

    /**
     * 设置bcr属性的值。
     * 
     */
    public void setBCR(double value) {
        this.bcr = value;
    }

    /**
     * 获取refactoringGain属性的值。
     * 
     */
    public int getRefactoringGain() {
        return refactoringGain;
    }

    /**
     * 设置refactoringGain属性的值。
     * 
     */
    public void setRefactoringGain(int value) {
        this.refactoringGain = value;
    }

    /**
     * 获取standardizationEffort属性的值。
     * 
     */
    public double getStandardizationEffort() {
        return standardizationEffort;
    }

    /**
     * 设置standardizationEffort属性的值。
     * 
     */
    public void setStandardizationEffort(double value) {
        this.standardizationEffort = value;
    }

    /**
     * 获取clusterId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getClusterId() {
        return clusterId;
    }

    /**
     * 设置clusterId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setClusterId(Integer value) {
        this.clusterId = value;
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
            String theClusterLabel;
            theClusterLabel = this.getClusterLabel();
            strategy.appendField(locator, this, "clusterLabel", buffer, theClusterLabel);
        }
        {
            int theClusterSize;
            theClusterSize = this.getClusterSize();
            strategy.appendField(locator, this, "clusterSize", buffer, theClusterSize);
        }
        {
            int theMedoidId;
            theMedoidId = this.getMedoidId();
            strategy.appendField(locator, this, "medoidId", buffer, theMedoidId);
        }
        {
            float theAvgFragmentSize;
            theAvgFragmentSize = this.getAvgFragmentSize();
            strategy.appendField(locator, this, "avgFragmentSize", buffer, theAvgFragmentSize);
        }
        {
            double theBCR;
            theBCR = this.getBCR();
            strategy.appendField(locator, this, "bcr", buffer, theBCR);
        }
        {
            int theRefactoringGain;
            theRefactoringGain = this.getRefactoringGain();
            strategy.appendField(locator, this, "refactoringGain", buffer, theRefactoringGain);
        }
        {
            double theStandardizationEffort;
            theStandardizationEffort = this.getStandardizationEffort();
            strategy.appendField(locator, this, "standardizationEffort", buffer, theStandardizationEffort);
        }
        {
            Integer theClusterId;
            theClusterId = this.getClusterId();
            strategy.appendField(locator, this, "clusterId", buffer, theClusterId);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ClusterSummaryType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ClusterSummaryType that = ((ClusterSummaryType) object);
        {
            String lhsClusterLabel;
            lhsClusterLabel = this.getClusterLabel();
            String rhsClusterLabel;
            rhsClusterLabel = that.getClusterLabel();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "clusterLabel", lhsClusterLabel), LocatorUtils.property(thatLocator, "clusterLabel", rhsClusterLabel), lhsClusterLabel, rhsClusterLabel)) {
                return false;
            }
        }
        {
            int lhsClusterSize;
            lhsClusterSize = this.getClusterSize();
            int rhsClusterSize;
            rhsClusterSize = that.getClusterSize();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "clusterSize", lhsClusterSize), LocatorUtils.property(thatLocator, "clusterSize", rhsClusterSize), lhsClusterSize, rhsClusterSize)) {
                return false;
            }
        }
        {
            int lhsMedoidId;
            lhsMedoidId = this.getMedoidId();
            int rhsMedoidId;
            rhsMedoidId = that.getMedoidId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "medoidId", lhsMedoidId), LocatorUtils.property(thatLocator, "medoidId", rhsMedoidId), lhsMedoidId, rhsMedoidId)) {
                return false;
            }
        }
        {
            float lhsAvgFragmentSize;
            lhsAvgFragmentSize = this.getAvgFragmentSize();
            float rhsAvgFragmentSize;
            rhsAvgFragmentSize = that.getAvgFragmentSize();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "avgFragmentSize", lhsAvgFragmentSize), LocatorUtils.property(thatLocator, "avgFragmentSize", rhsAvgFragmentSize), lhsAvgFragmentSize, rhsAvgFragmentSize)) {
                return false;
            }
        }
        {
            double lhsBCR;
            lhsBCR = this.getBCR();
            double rhsBCR;
            rhsBCR = that.getBCR();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bcr", lhsBCR), LocatorUtils.property(thatLocator, "bcr", rhsBCR), lhsBCR, rhsBCR)) {
                return false;
            }
        }
        {
            int lhsRefactoringGain;
            lhsRefactoringGain = this.getRefactoringGain();
            int rhsRefactoringGain;
            rhsRefactoringGain = that.getRefactoringGain();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "refactoringGain", lhsRefactoringGain), LocatorUtils.property(thatLocator, "refactoringGain", rhsRefactoringGain), lhsRefactoringGain, rhsRefactoringGain)) {
                return false;
            }
        }
        {
            double lhsStandardizationEffort;
            lhsStandardizationEffort = this.getStandardizationEffort();
            double rhsStandardizationEffort;
            rhsStandardizationEffort = that.getStandardizationEffort();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "standardizationEffort", lhsStandardizationEffort), LocatorUtils.property(thatLocator, "standardizationEffort", rhsStandardizationEffort), lhsStandardizationEffort, rhsStandardizationEffort)) {
                return false;
            }
        }
        {
            Integer lhsClusterId;
            lhsClusterId = this.getClusterId();
            Integer rhsClusterId;
            rhsClusterId = that.getClusterId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "clusterId", lhsClusterId), LocatorUtils.property(thatLocator, "clusterId", rhsClusterId), lhsClusterId, rhsClusterId)) {
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
            String theClusterLabel;
            theClusterLabel = this.getClusterLabel();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "clusterLabel", theClusterLabel), currentHashCode, theClusterLabel);
        }
        {
            int theClusterSize;
            theClusterSize = this.getClusterSize();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "clusterSize", theClusterSize), currentHashCode, theClusterSize);
        }
        {
            int theMedoidId;
            theMedoidId = this.getMedoidId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "medoidId", theMedoidId), currentHashCode, theMedoidId);
        }
        {
            float theAvgFragmentSize;
            theAvgFragmentSize = this.getAvgFragmentSize();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "avgFragmentSize", theAvgFragmentSize), currentHashCode, theAvgFragmentSize);
        }
        {
            double theBCR;
            theBCR = this.getBCR();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "bcr", theBCR), currentHashCode, theBCR);
        }
        {
            int theRefactoringGain;
            theRefactoringGain = this.getRefactoringGain();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "refactoringGain", theRefactoringGain), currentHashCode, theRefactoringGain);
        }
        {
            double theStandardizationEffort;
            theStandardizationEffort = this.getStandardizationEffort();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "standardizationEffort", theStandardizationEffort), currentHashCode, theStandardizationEffort);
        }
        {
            Integer theClusterId;
            theClusterId = this.getClusterId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "clusterId", theClusterId), currentHashCode, theClusterId);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
