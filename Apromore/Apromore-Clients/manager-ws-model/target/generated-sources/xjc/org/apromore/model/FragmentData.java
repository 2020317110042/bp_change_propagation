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
 * <p>FragmentData complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="FragmentData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FragmentId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FragmentLabel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Distance" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="FragmentSize" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ProcessAssociations" type="{urn:qut-edu-au:schema:apromore:manager}ProcessAssociationsType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FragmentData", propOrder = {
    "fragmentId",
    "fragmentLabel",
    "distance",
    "fragmentSize",
    "processAssociations"
})
public class FragmentData
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "FragmentId")
    protected int fragmentId;
    @XmlElement(name = "FragmentLabel", required = true)
    protected String fragmentLabel;
    @XmlElement(name = "Distance")
    protected double distance;
    @XmlElement(name = "FragmentSize")
    protected int fragmentSize;
    @XmlElement(name = "ProcessAssociations")
    protected List<ProcessAssociationsType> processAssociations;

    /**
     * 获取fragmentId属性的值。
     * 
     */
    public int getFragmentId() {
        return fragmentId;
    }

    /**
     * 设置fragmentId属性的值。
     * 
     */
    public void setFragmentId(int value) {
        this.fragmentId = value;
    }

    /**
     * 获取fragmentLabel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFragmentLabel() {
        return fragmentLabel;
    }

    /**
     * 设置fragmentLabel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFragmentLabel(String value) {
        this.fragmentLabel = value;
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

    /**
     * 获取fragmentSize属性的值。
     * 
     */
    public int getFragmentSize() {
        return fragmentSize;
    }

    /**
     * 设置fragmentSize属性的值。
     * 
     */
    public void setFragmentSize(int value) {
        this.fragmentSize = value;
    }

    /**
     * Gets the value of the processAssociations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the processAssociations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProcessAssociations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProcessAssociationsType }
     * 
     * 
     */
    public List<ProcessAssociationsType> getProcessAssociations() {
        if (processAssociations == null) {
            processAssociations = new ArrayList<ProcessAssociationsType>();
        }
        return this.processAssociations;
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
            int theFragmentId;
            theFragmentId = this.getFragmentId();
            strategy.appendField(locator, this, "fragmentId", buffer, theFragmentId);
        }
        {
            String theFragmentLabel;
            theFragmentLabel = this.getFragmentLabel();
            strategy.appendField(locator, this, "fragmentLabel", buffer, theFragmentLabel);
        }
        {
            double theDistance;
            theDistance = this.getDistance();
            strategy.appendField(locator, this, "distance", buffer, theDistance);
        }
        {
            int theFragmentSize;
            theFragmentSize = this.getFragmentSize();
            strategy.appendField(locator, this, "fragmentSize", buffer, theFragmentSize);
        }
        {
            List<ProcessAssociationsType> theProcessAssociations;
            theProcessAssociations = this.getProcessAssociations();
            strategy.appendField(locator, this, "processAssociations", buffer, theProcessAssociations);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof FragmentData)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final FragmentData that = ((FragmentData) object);
        {
            int lhsFragmentId;
            lhsFragmentId = this.getFragmentId();
            int rhsFragmentId;
            rhsFragmentId = that.getFragmentId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fragmentId", lhsFragmentId), LocatorUtils.property(thatLocator, "fragmentId", rhsFragmentId), lhsFragmentId, rhsFragmentId)) {
                return false;
            }
        }
        {
            String lhsFragmentLabel;
            lhsFragmentLabel = this.getFragmentLabel();
            String rhsFragmentLabel;
            rhsFragmentLabel = that.getFragmentLabel();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fragmentLabel", lhsFragmentLabel), LocatorUtils.property(thatLocator, "fragmentLabel", rhsFragmentLabel), lhsFragmentLabel, rhsFragmentLabel)) {
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
        {
            int lhsFragmentSize;
            lhsFragmentSize = this.getFragmentSize();
            int rhsFragmentSize;
            rhsFragmentSize = that.getFragmentSize();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fragmentSize", lhsFragmentSize), LocatorUtils.property(thatLocator, "fragmentSize", rhsFragmentSize), lhsFragmentSize, rhsFragmentSize)) {
                return false;
            }
        }
        {
            List<ProcessAssociationsType> lhsProcessAssociations;
            lhsProcessAssociations = this.getProcessAssociations();
            List<ProcessAssociationsType> rhsProcessAssociations;
            rhsProcessAssociations = that.getProcessAssociations();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "processAssociations", lhsProcessAssociations), LocatorUtils.property(thatLocator, "processAssociations", rhsProcessAssociations), lhsProcessAssociations, rhsProcessAssociations)) {
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
            int theFragmentId;
            theFragmentId = this.getFragmentId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fragmentId", theFragmentId), currentHashCode, theFragmentId);
        }
        {
            String theFragmentLabel;
            theFragmentLabel = this.getFragmentLabel();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fragmentLabel", theFragmentLabel), currentHashCode, theFragmentLabel);
        }
        {
            double theDistance;
            theDistance = this.getDistance();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "distance", theDistance), currentHashCode, theDistance);
        }
        {
            int theFragmentSize;
            theFragmentSize = this.getFragmentSize();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fragmentSize", theFragmentSize), currentHashCode, theFragmentSize);
        }
        {
            List<ProcessAssociationsType> theProcessAssociations;
            theProcessAssociations = this.getProcessAssociations();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "processAssociations", theProcessAssociations), currentHashCode, theProcessAssociations);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
