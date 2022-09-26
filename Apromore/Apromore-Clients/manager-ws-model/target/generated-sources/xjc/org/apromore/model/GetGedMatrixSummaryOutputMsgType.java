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
 * <p>GetGedMatrixSummaryOutputMsgType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="GetGedMatrixSummaryOutputMsgType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gedMatrixSummary" type="{urn:qut-edu-au:schema:apromore:manager}GedMatrixSummaryType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetGedMatrixSummaryOutputMsgType", propOrder = {
    "gedMatrixSummary"
})
public class GetGedMatrixSummaryOutputMsgType
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected GedMatrixSummaryType gedMatrixSummary;

    /**
     * 获取gedMatrixSummary属性的值。
     * 
     * @return
     *     possible object is
     *     {@link GedMatrixSummaryType }
     *     
     */
    public GedMatrixSummaryType getGedMatrixSummary() {
        return gedMatrixSummary;
    }

    /**
     * 设置gedMatrixSummary属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link GedMatrixSummaryType }
     *     
     */
    public void setGedMatrixSummary(GedMatrixSummaryType value) {
        this.gedMatrixSummary = value;
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
            GedMatrixSummaryType theGedMatrixSummary;
            theGedMatrixSummary = this.getGedMatrixSummary();
            strategy.appendField(locator, this, "gedMatrixSummary", buffer, theGedMatrixSummary);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof GetGedMatrixSummaryOutputMsgType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final GetGedMatrixSummaryOutputMsgType that = ((GetGedMatrixSummaryOutputMsgType) object);
        {
            GedMatrixSummaryType lhsGedMatrixSummary;
            lhsGedMatrixSummary = this.getGedMatrixSummary();
            GedMatrixSummaryType rhsGedMatrixSummary;
            rhsGedMatrixSummary = that.getGedMatrixSummary();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gedMatrixSummary", lhsGedMatrixSummary), LocatorUtils.property(thatLocator, "gedMatrixSummary", rhsGedMatrixSummary), lhsGedMatrixSummary, rhsGedMatrixSummary)) {
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
            GedMatrixSummaryType theGedMatrixSummary;
            theGedMatrixSummary = this.getGedMatrixSummary();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "gedMatrixSummary", theGedMatrixSummary), currentHashCode, theGedMatrixSummary);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
