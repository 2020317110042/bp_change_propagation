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
 * <p>NativeMetaData complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="NativeMetaData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="processName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="processAuthor" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="processVersion" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="processDocumentation" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="processCreated" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="processLastUpdate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NativeMetaData")
public class NativeMetaData
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 1L;
    @XmlAttribute(name = "processName")
    protected String processName;
    @XmlAttribute(name = "processAuthor")
    protected String processAuthor;
    @XmlAttribute(name = "processVersion")
    protected String processVersion;
    @XmlAttribute(name = "processDocumentation")
    protected String processDocumentation;
    @XmlAttribute(name = "processCreated")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar processCreated;
    @XmlAttribute(name = "processLastUpdate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar processLastUpdate;

    /**
     * 获取processName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessName() {
        return processName;
    }

    /**
     * 设置processName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessName(String value) {
        this.processName = value;
    }

    /**
     * 获取processAuthor属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessAuthor() {
        return processAuthor;
    }

    /**
     * 设置processAuthor属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessAuthor(String value) {
        this.processAuthor = value;
    }

    /**
     * 获取processVersion属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessVersion() {
        return processVersion;
    }

    /**
     * 设置processVersion属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessVersion(String value) {
        this.processVersion = value;
    }

    /**
     * 获取processDocumentation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessDocumentation() {
        return processDocumentation;
    }

    /**
     * 设置processDocumentation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessDocumentation(String value) {
        this.processDocumentation = value;
    }

    /**
     * 获取processCreated属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProcessCreated() {
        return processCreated;
    }

    /**
     * 设置processCreated属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProcessCreated(XMLGregorianCalendar value) {
        this.processCreated = value;
    }

    /**
     * 获取processLastUpdate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProcessLastUpdate() {
        return processLastUpdate;
    }

    /**
     * 设置processLastUpdate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProcessLastUpdate(XMLGregorianCalendar value) {
        this.processLastUpdate = value;
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
            String theProcessName;
            theProcessName = this.getProcessName();
            strategy.appendField(locator, this, "processName", buffer, theProcessName);
        }
        {
            String theProcessAuthor;
            theProcessAuthor = this.getProcessAuthor();
            strategy.appendField(locator, this, "processAuthor", buffer, theProcessAuthor);
        }
        {
            String theProcessVersion;
            theProcessVersion = this.getProcessVersion();
            strategy.appendField(locator, this, "processVersion", buffer, theProcessVersion);
        }
        {
            String theProcessDocumentation;
            theProcessDocumentation = this.getProcessDocumentation();
            strategy.appendField(locator, this, "processDocumentation", buffer, theProcessDocumentation);
        }
        {
            XMLGregorianCalendar theProcessCreated;
            theProcessCreated = this.getProcessCreated();
            strategy.appendField(locator, this, "processCreated", buffer, theProcessCreated);
        }
        {
            XMLGregorianCalendar theProcessLastUpdate;
            theProcessLastUpdate = this.getProcessLastUpdate();
            strategy.appendField(locator, this, "processLastUpdate", buffer, theProcessLastUpdate);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof NativeMetaData)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final NativeMetaData that = ((NativeMetaData) object);
        {
            String lhsProcessName;
            lhsProcessName = this.getProcessName();
            String rhsProcessName;
            rhsProcessName = that.getProcessName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "processName", lhsProcessName), LocatorUtils.property(thatLocator, "processName", rhsProcessName), lhsProcessName, rhsProcessName)) {
                return false;
            }
        }
        {
            String lhsProcessAuthor;
            lhsProcessAuthor = this.getProcessAuthor();
            String rhsProcessAuthor;
            rhsProcessAuthor = that.getProcessAuthor();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "processAuthor", lhsProcessAuthor), LocatorUtils.property(thatLocator, "processAuthor", rhsProcessAuthor), lhsProcessAuthor, rhsProcessAuthor)) {
                return false;
            }
        }
        {
            String lhsProcessVersion;
            lhsProcessVersion = this.getProcessVersion();
            String rhsProcessVersion;
            rhsProcessVersion = that.getProcessVersion();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "processVersion", lhsProcessVersion), LocatorUtils.property(thatLocator, "processVersion", rhsProcessVersion), lhsProcessVersion, rhsProcessVersion)) {
                return false;
            }
        }
        {
            String lhsProcessDocumentation;
            lhsProcessDocumentation = this.getProcessDocumentation();
            String rhsProcessDocumentation;
            rhsProcessDocumentation = that.getProcessDocumentation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "processDocumentation", lhsProcessDocumentation), LocatorUtils.property(thatLocator, "processDocumentation", rhsProcessDocumentation), lhsProcessDocumentation, rhsProcessDocumentation)) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsProcessCreated;
            lhsProcessCreated = this.getProcessCreated();
            XMLGregorianCalendar rhsProcessCreated;
            rhsProcessCreated = that.getProcessCreated();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "processCreated", lhsProcessCreated), LocatorUtils.property(thatLocator, "processCreated", rhsProcessCreated), lhsProcessCreated, rhsProcessCreated)) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsProcessLastUpdate;
            lhsProcessLastUpdate = this.getProcessLastUpdate();
            XMLGregorianCalendar rhsProcessLastUpdate;
            rhsProcessLastUpdate = that.getProcessLastUpdate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "processLastUpdate", lhsProcessLastUpdate), LocatorUtils.property(thatLocator, "processLastUpdate", rhsProcessLastUpdate), lhsProcessLastUpdate, rhsProcessLastUpdate)) {
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
            String theProcessName;
            theProcessName = this.getProcessName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "processName", theProcessName), currentHashCode, theProcessName);
        }
        {
            String theProcessAuthor;
            theProcessAuthor = this.getProcessAuthor();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "processAuthor", theProcessAuthor), currentHashCode, theProcessAuthor);
        }
        {
            String theProcessVersion;
            theProcessVersion = this.getProcessVersion();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "processVersion", theProcessVersion), currentHashCode, theProcessVersion);
        }
        {
            String theProcessDocumentation;
            theProcessDocumentation = this.getProcessDocumentation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "processDocumentation", theProcessDocumentation), currentHashCode, theProcessDocumentation);
        }
        {
            XMLGregorianCalendar theProcessCreated;
            theProcessCreated = this.getProcessCreated();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "processCreated", theProcessCreated), currentHashCode, theProcessCreated);
        }
        {
            XMLGregorianCalendar theProcessLastUpdate;
            theProcessLastUpdate = this.getProcessLastUpdate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "processLastUpdate", theProcessLastUpdate), currentHashCode, theProcessLastUpdate);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
