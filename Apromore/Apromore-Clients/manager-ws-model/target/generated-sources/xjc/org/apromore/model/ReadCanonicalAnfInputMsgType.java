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
 * <p>ReadCanonicalAnfInputMsgType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ReadCanonicalAnfInputMsgType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="processId" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="withAnnotation" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="annotationName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReadCanonicalAnfInputMsgType")
public class ReadCanonicalAnfInputMsgType
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 1L;
    @XmlAttribute(name = "processId")
    protected Integer processId;
    @XmlAttribute(name = "version")
    protected String version;
    @XmlAttribute(name = "withAnnotation")
    protected Boolean withAnnotation;
    @XmlAttribute(name = "annotationName")
    protected String annotationName;

    /**
     * 获取processId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProcessId() {
        return processId;
    }

    /**
     * 设置processId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProcessId(Integer value) {
        this.processId = value;
    }

    /**
     * 获取version属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * 设置version属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * 获取withAnnotation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWithAnnotation() {
        return withAnnotation;
    }

    /**
     * 设置withAnnotation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWithAnnotation(Boolean value) {
        this.withAnnotation = value;
    }

    /**
     * 获取annotationName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnnotationName() {
        return annotationName;
    }

    /**
     * 设置annotationName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnnotationName(String value) {
        this.annotationName = value;
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
            Integer theProcessId;
            theProcessId = this.getProcessId();
            strategy.appendField(locator, this, "processId", buffer, theProcessId);
        }
        {
            String theVersion;
            theVersion = this.getVersion();
            strategy.appendField(locator, this, "version", buffer, theVersion);
        }
        {
            Boolean theWithAnnotation;
            theWithAnnotation = this.isWithAnnotation();
            strategy.appendField(locator, this, "withAnnotation", buffer, theWithAnnotation);
        }
        {
            String theAnnotationName;
            theAnnotationName = this.getAnnotationName();
            strategy.appendField(locator, this, "annotationName", buffer, theAnnotationName);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ReadCanonicalAnfInputMsgType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ReadCanonicalAnfInputMsgType that = ((ReadCanonicalAnfInputMsgType) object);
        {
            Integer lhsProcessId;
            lhsProcessId = this.getProcessId();
            Integer rhsProcessId;
            rhsProcessId = that.getProcessId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "processId", lhsProcessId), LocatorUtils.property(thatLocator, "processId", rhsProcessId), lhsProcessId, rhsProcessId)) {
                return false;
            }
        }
        {
            String lhsVersion;
            lhsVersion = this.getVersion();
            String rhsVersion;
            rhsVersion = that.getVersion();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "version", lhsVersion), LocatorUtils.property(thatLocator, "version", rhsVersion), lhsVersion, rhsVersion)) {
                return false;
            }
        }
        {
            Boolean lhsWithAnnotation;
            lhsWithAnnotation = this.isWithAnnotation();
            Boolean rhsWithAnnotation;
            rhsWithAnnotation = that.isWithAnnotation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "withAnnotation", lhsWithAnnotation), LocatorUtils.property(thatLocator, "withAnnotation", rhsWithAnnotation), lhsWithAnnotation, rhsWithAnnotation)) {
                return false;
            }
        }
        {
            String lhsAnnotationName;
            lhsAnnotationName = this.getAnnotationName();
            String rhsAnnotationName;
            rhsAnnotationName = that.getAnnotationName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "annotationName", lhsAnnotationName), LocatorUtils.property(thatLocator, "annotationName", rhsAnnotationName), lhsAnnotationName, rhsAnnotationName)) {
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
            Integer theProcessId;
            theProcessId = this.getProcessId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "processId", theProcessId), currentHashCode, theProcessId);
        }
        {
            String theVersion;
            theVersion = this.getVersion();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "version", theVersion), currentHashCode, theVersion);
        }
        {
            Boolean theWithAnnotation;
            theWithAnnotation = this.isWithAnnotation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "withAnnotation", theWithAnnotation), currentHashCode, theWithAnnotation);
        }
        {
            String theAnnotationName;
            theAnnotationName = this.getAnnotationName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "annotationName", theAnnotationName), currentHashCode, theAnnotationName);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
