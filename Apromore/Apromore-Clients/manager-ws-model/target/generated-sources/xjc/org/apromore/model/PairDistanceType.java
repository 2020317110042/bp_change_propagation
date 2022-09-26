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
 * <p>PairDistanceType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PairDistanceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FragmentId1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FragmentId2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Distance" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PairDistanceType", propOrder = {
    "fragmentId1",
    "fragmentId2",
    "distance"
})
public class PairDistanceType
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "FragmentId1")
    protected int fragmentId1;
    @XmlElement(name = "FragmentId2")
    protected int fragmentId2;
    @XmlElement(name = "Distance")
    protected double distance;

    /**
     * 获取fragmentId1属性的值。
     * 
     */
    public int getFragmentId1() {
        return fragmentId1;
    }

    /**
     * 设置fragmentId1属性的值。
     * 
     */
    public void setFragmentId1(int value) {
        this.fragmentId1 = value;
    }

    /**
     * 获取fragmentId2属性的值。
     * 
     */
    public int getFragmentId2() {
        return fragmentId2;
    }

    /**
     * 设置fragmentId2属性的值。
     * 
     */
    public void setFragmentId2(int value) {
        this.fragmentId2 = value;
    }

    /**
     * 获取distance属性的值。
     * 
     */
    public double getDistance() {
        return distance;
    }

    /**
     * 设置distance属性的值。
     * 
     */
    public void setDistance(double value) {
        this.distance = value;
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
            int theFragmentId1;
            theFragmentId1 = this.getFragmentId1();
            strategy.appendField(locator, this, "fragmentId1", buffer, theFragmentId1);
        }
        {
            int theFragmentId2;
            theFragmentId2 = this.getFragmentId2();
            strategy.appendField(locator, this, "fragmentId2", buffer, theFragmentId2);
        }
        {
            double theDistance;
            theDistance = this.getDistance();
            strategy.appendField(locator, this, "distance", buffer, theDistance);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof PairDistanceType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final PairDistanceType that = ((PairDistanceType) object);
        {
            int lhsFragmentId1;
            lhsFragmentId1 = this.getFragmentId1();
            int rhsFragmentId1;
            rhsFragmentId1 = that.getFragmentId1();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fragmentId1", lhsFragmentId1), LocatorUtils.property(thatLocator, "fragmentId1", rhsFragmentId1), lhsFragmentId1, rhsFragmentId1)) {
                return false;
            }
        }
        {
            int lhsFragmentId2;
            lhsFragmentId2 = this.getFragmentId2();
            int rhsFragmentId2;
            rhsFragmentId2 = that.getFragmentId2();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fragmentId2", lhsFragmentId2), LocatorUtils.property(thatLocator, "fragmentId2", rhsFragmentId2), lhsFragmentId2, rhsFragmentId2)) {
                return false;
            }
        }
        {
            double lhsDistance;
            lhsDistance = this.getDistance();
            double rhsDistance;
            rhsDistance = that.getDistance();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "distance", lhsDistance), LocatorUtils.property(thatLocator, "distance", rhsDistance), lhsDistance, rhsDistance)) {
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
            int theFragmentId1;
            theFragmentId1 = this.getFragmentId1();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fragmentId1", theFragmentId1), currentHashCode, theFragmentId1);
        }
        {
            int theFragmentId2;
            theFragmentId2 = this.getFragmentId2();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fragmentId2", theFragmentId2), currentHashCode, theFragmentId2);
        }
        {
            double theDistance;
            theDistance = this.getDistance();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "distance", theDistance), currentHashCode, theDistance);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
