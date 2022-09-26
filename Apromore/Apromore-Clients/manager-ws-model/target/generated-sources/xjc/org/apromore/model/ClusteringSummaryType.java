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
 * <p>ClusteringSummaryType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ClusteringSummaryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numClusters" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="minClusterSize" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="maxClusterSize" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="minAvgFragmentSize" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="maxAvgFragmentSize" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="minBCR" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="maxBCR" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusteringSummaryType", propOrder = {
    "numClusters",
    "minClusterSize",
    "maxClusterSize",
    "minAvgFragmentSize",
    "maxAvgFragmentSize",
    "minBCR",
    "maxBCR"
})
public class ClusteringSummaryType
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 1L;
    protected int numClusters;
    protected int minClusterSize;
    protected int maxClusterSize;
    protected float minAvgFragmentSize;
    protected float maxAvgFragmentSize;
    protected double minBCR;
    protected double maxBCR;

    /**
     * 获取numClusters属性的值。
     * 
     */
    public int getNumClusters() {
        return numClusters;
    }

    /**
     * 设置numClusters属性的值。
     * 
     */
    public void setNumClusters(int value) {
        this.numClusters = value;
    }

    /**
     * 获取minClusterSize属性的值。
     * 
     */
    public int getMinClusterSize() {
        return minClusterSize;
    }

    /**
     * 设置minClusterSize属性的值。
     * 
     */
    public void setMinClusterSize(int value) {
        this.minClusterSize = value;
    }

    /**
     * 获取maxClusterSize属性的值。
     * 
     */
    public int getMaxClusterSize() {
        return maxClusterSize;
    }

    /**
     * 设置maxClusterSize属性的值。
     * 
     */
    public void setMaxClusterSize(int value) {
        this.maxClusterSize = value;
    }

    /**
     * 获取minAvgFragmentSize属性的值。
     * 
     */
    public float getMinAvgFragmentSize() {
        return minAvgFragmentSize;
    }

    /**
     * 设置minAvgFragmentSize属性的值。
     * 
     */
    public void setMinAvgFragmentSize(float value) {
        this.minAvgFragmentSize = value;
    }

    /**
     * 获取maxAvgFragmentSize属性的值。
     * 
     */
    public float getMaxAvgFragmentSize() {
        return maxAvgFragmentSize;
    }

    /**
     * 设置maxAvgFragmentSize属性的值。
     * 
     */
    public void setMaxAvgFragmentSize(float value) {
        this.maxAvgFragmentSize = value;
    }

    /**
     * 获取minBCR属性的值。
     * 
     */
    public double getMinBCR() {
        return minBCR;
    }

    /**
     * 设置minBCR属性的值。
     * 
     */
    public void setMinBCR(double value) {
        this.minBCR = value;
    }

    /**
     * 获取maxBCR属性的值。
     * 
     */
    public double getMaxBCR() {
        return maxBCR;
    }

    /**
     * 设置maxBCR属性的值。
     * 
     */
    public void setMaxBCR(double value) {
        this.maxBCR = value;
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
            int theNumClusters;
            theNumClusters = this.getNumClusters();
            strategy.appendField(locator, this, "numClusters", buffer, theNumClusters);
        }
        {
            int theMinClusterSize;
            theMinClusterSize = this.getMinClusterSize();
            strategy.appendField(locator, this, "minClusterSize", buffer, theMinClusterSize);
        }
        {
            int theMaxClusterSize;
            theMaxClusterSize = this.getMaxClusterSize();
            strategy.appendField(locator, this, "maxClusterSize", buffer, theMaxClusterSize);
        }
        {
            float theMinAvgFragmentSize;
            theMinAvgFragmentSize = this.getMinAvgFragmentSize();
            strategy.appendField(locator, this, "minAvgFragmentSize", buffer, theMinAvgFragmentSize);
        }
        {
            float theMaxAvgFragmentSize;
            theMaxAvgFragmentSize = this.getMaxAvgFragmentSize();
            strategy.appendField(locator, this, "maxAvgFragmentSize", buffer, theMaxAvgFragmentSize);
        }
        {
            double theMinBCR;
            theMinBCR = this.getMinBCR();
            strategy.appendField(locator, this, "minBCR", buffer, theMinBCR);
        }
        {
            double theMaxBCR;
            theMaxBCR = this.getMaxBCR();
            strategy.appendField(locator, this, "maxBCR", buffer, theMaxBCR);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ClusteringSummaryType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ClusteringSummaryType that = ((ClusteringSummaryType) object);
        {
            int lhsNumClusters;
            lhsNumClusters = this.getNumClusters();
            int rhsNumClusters;
            rhsNumClusters = that.getNumClusters();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "numClusters", lhsNumClusters), LocatorUtils.property(thatLocator, "numClusters", rhsNumClusters), lhsNumClusters, rhsNumClusters)) {
                return false;
            }
        }
        {
            int lhsMinClusterSize;
            lhsMinClusterSize = this.getMinClusterSize();
            int rhsMinClusterSize;
            rhsMinClusterSize = that.getMinClusterSize();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "minClusterSize", lhsMinClusterSize), LocatorUtils.property(thatLocator, "minClusterSize", rhsMinClusterSize), lhsMinClusterSize, rhsMinClusterSize)) {
                return false;
            }
        }
        {
            int lhsMaxClusterSize;
            lhsMaxClusterSize = this.getMaxClusterSize();
            int rhsMaxClusterSize;
            rhsMaxClusterSize = that.getMaxClusterSize();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maxClusterSize", lhsMaxClusterSize), LocatorUtils.property(thatLocator, "maxClusterSize", rhsMaxClusterSize), lhsMaxClusterSize, rhsMaxClusterSize)) {
                return false;
            }
        }
        {
            float lhsMinAvgFragmentSize;
            lhsMinAvgFragmentSize = this.getMinAvgFragmentSize();
            float rhsMinAvgFragmentSize;
            rhsMinAvgFragmentSize = that.getMinAvgFragmentSize();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "minAvgFragmentSize", lhsMinAvgFragmentSize), LocatorUtils.property(thatLocator, "minAvgFragmentSize", rhsMinAvgFragmentSize), lhsMinAvgFragmentSize, rhsMinAvgFragmentSize)) {
                return false;
            }
        }
        {
            float lhsMaxAvgFragmentSize;
            lhsMaxAvgFragmentSize = this.getMaxAvgFragmentSize();
            float rhsMaxAvgFragmentSize;
            rhsMaxAvgFragmentSize = that.getMaxAvgFragmentSize();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maxAvgFragmentSize", lhsMaxAvgFragmentSize), LocatorUtils.property(thatLocator, "maxAvgFragmentSize", rhsMaxAvgFragmentSize), lhsMaxAvgFragmentSize, rhsMaxAvgFragmentSize)) {
                return false;
            }
        }
        {
            double lhsMinBCR;
            lhsMinBCR = this.getMinBCR();
            double rhsMinBCR;
            rhsMinBCR = that.getMinBCR();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "minBCR", lhsMinBCR), LocatorUtils.property(thatLocator, "minBCR", rhsMinBCR), lhsMinBCR, rhsMinBCR)) {
                return false;
            }
        }
        {
            double lhsMaxBCR;
            lhsMaxBCR = this.getMaxBCR();
            double rhsMaxBCR;
            rhsMaxBCR = that.getMaxBCR();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maxBCR", lhsMaxBCR), LocatorUtils.property(thatLocator, "maxBCR", rhsMaxBCR), lhsMaxBCR, rhsMaxBCR)) {
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
            int theNumClusters;
            theNumClusters = this.getNumClusters();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "numClusters", theNumClusters), currentHashCode, theNumClusters);
        }
        {
            int theMinClusterSize;
            theMinClusterSize = this.getMinClusterSize();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "minClusterSize", theMinClusterSize), currentHashCode, theMinClusterSize);
        }
        {
            int theMaxClusterSize;
            theMaxClusterSize = this.getMaxClusterSize();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "maxClusterSize", theMaxClusterSize), currentHashCode, theMaxClusterSize);
        }
        {
            float theMinAvgFragmentSize;
            theMinAvgFragmentSize = this.getMinAvgFragmentSize();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "minAvgFragmentSize", theMinAvgFragmentSize), currentHashCode, theMinAvgFragmentSize);
        }
        {
            float theMaxAvgFragmentSize;
            theMaxAvgFragmentSize = this.getMaxAvgFragmentSize();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "maxAvgFragmentSize", theMaxAvgFragmentSize), currentHashCode, theMaxAvgFragmentSize);
        }
        {
            double theMinBCR;
            theMinBCR = this.getMinBCR();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "minBCR", theMinBCR), currentHashCode, theMinBCR);
        }
        {
            double theMaxBCR;
            theMaxBCR = this.getMaxBCR();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "maxBCR", theMaxBCR), currentHashCode, theMaxBCR);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
