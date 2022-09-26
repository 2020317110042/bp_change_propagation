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
 * <p>ProcessSummariesType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ProcessSummariesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProcessSummary" type="{urn:qut-edu-au:schema:apromore:manager}ProcessSummaryType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="total_process_count" type="{http://www.w3.org/2001/XMLSchema}long" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessSummariesType", propOrder = {
    "processSummary"
})
public class ProcessSummariesType
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ProcessSummary")
    protected List<ProcessSummaryType> processSummary;
    @XmlAttribute(name = "total_process_count")
    protected Long totalProcessCount;

    /**
     * Gets the value of the processSummary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the processSummary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProcessSummary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProcessSummaryType }
     * 
     * 
     */
    public List<ProcessSummaryType> getProcessSummary() {
        if (processSummary == null) {
            processSummary = new ArrayList<ProcessSummaryType>();
        }
        return this.processSummary;
    }

    /**
     * 获取totalProcessCount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalProcessCount() {
        return totalProcessCount;
    }

    /**
     * 设置totalProcessCount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalProcessCount(Long value) {
        this.totalProcessCount = value;
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
            List<ProcessSummaryType> theProcessSummary;
            theProcessSummary = this.getProcessSummary();
            strategy.appendField(locator, this, "processSummary", buffer, theProcessSummary);
        }
        {
            Long theTotalProcessCount;
            theTotalProcessCount = this.getTotalProcessCount();
            strategy.appendField(locator, this, "totalProcessCount", buffer, theTotalProcessCount);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ProcessSummariesType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ProcessSummariesType that = ((ProcessSummariesType) object);
        {
            List<ProcessSummaryType> lhsProcessSummary;
            lhsProcessSummary = this.getProcessSummary();
            List<ProcessSummaryType> rhsProcessSummary;
            rhsProcessSummary = that.getProcessSummary();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "processSummary", lhsProcessSummary), LocatorUtils.property(thatLocator, "processSummary", rhsProcessSummary), lhsProcessSummary, rhsProcessSummary)) {
                return false;
            }
        }
        {
            Long lhsTotalProcessCount;
            lhsTotalProcessCount = this.getTotalProcessCount();
            Long rhsTotalProcessCount;
            rhsTotalProcessCount = that.getTotalProcessCount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "totalProcessCount", lhsTotalProcessCount), LocatorUtils.property(thatLocator, "totalProcessCount", rhsTotalProcessCount), lhsTotalProcessCount, rhsTotalProcessCount)) {
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
            List<ProcessSummaryType> theProcessSummary;
            theProcessSummary = this.getProcessSummary();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "processSummary", theProcessSummary), currentHashCode, theProcessSummary);
        }
        {
            Long theTotalProcessCount;
            theTotalProcessCount = this.getTotalProcessCount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "totalProcessCount", theTotalProcessCount), currentHashCode, theTotalProcessCount);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
