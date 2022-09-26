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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
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
 * <p>GedMatrixSummaryType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="GedMatrixSummaryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Result" type="{urn:qut-edu-au:schema:apromore:manager}ResultType"/>
 *         &lt;element name="built" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="buildDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GedMatrixSummaryType", propOrder = {
    "result",
    "built",
    "buildDate"
})
public class GedMatrixSummaryType
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Result", required = true)
    protected ResultType result;
    protected boolean built;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar buildDate;

    /**
     * 获取result属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ResultType }
     *     
     */
    public ResultType getResult() {
        return result;
    }

    /**
     * 设置result属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ResultType }
     *     
     */
    public void setResult(ResultType value) {
        this.result = value;
    }

    /**
     * 获取built属性的值。
     * 
     */
    public boolean isBuilt() {
        return built;
    }

    /**
     * 设置built属性的值。
     * 
     */
    public void setBuilt(boolean value) {
        this.built = value;
    }

    /**
     * 获取buildDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBuildDate() {
        return buildDate;
    }

    /**
     * 设置buildDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBuildDate(XMLGregorianCalendar value) {
        this.buildDate = value;
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
            ResultType theResult;
            theResult = this.getResult();
            strategy.appendField(locator, this, "result", buffer, theResult);
        }
        {
            boolean theBuilt;
            theBuilt = this.isBuilt();
            strategy.appendField(locator, this, "built", buffer, theBuilt);
        }
        {
            XMLGregorianCalendar theBuildDate;
            theBuildDate = this.getBuildDate();
            strategy.appendField(locator, this, "buildDate", buffer, theBuildDate);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof GedMatrixSummaryType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final GedMatrixSummaryType that = ((GedMatrixSummaryType) object);
        {
            ResultType lhsResult;
            lhsResult = this.getResult();
            ResultType rhsResult;
            rhsResult = that.getResult();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "result", lhsResult), LocatorUtils.property(thatLocator, "result", rhsResult), lhsResult, rhsResult)) {
                return false;
            }
        }
        {
            boolean lhsBuilt;
            lhsBuilt = this.isBuilt();
            boolean rhsBuilt;
            rhsBuilt = that.isBuilt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "built", lhsBuilt), LocatorUtils.property(thatLocator, "built", rhsBuilt), lhsBuilt, rhsBuilt)) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsBuildDate;
            lhsBuildDate = this.getBuildDate();
            XMLGregorianCalendar rhsBuildDate;
            rhsBuildDate = that.getBuildDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "buildDate", lhsBuildDate), LocatorUtils.property(thatLocator, "buildDate", rhsBuildDate), lhsBuildDate, rhsBuildDate)) {
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
            ResultType theResult;
            theResult = this.getResult();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "result", theResult), currentHashCode, theResult);
        }
        {
            boolean theBuilt;
            theBuilt = this.isBuilt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "built", theBuilt), currentHashCode, theBuilt);
        }
        {
            XMLGregorianCalendar theBuildDate;
            theBuildDate = this.getBuildDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "buildDate", theBuildDate), currentHashCode, theBuildDate);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
