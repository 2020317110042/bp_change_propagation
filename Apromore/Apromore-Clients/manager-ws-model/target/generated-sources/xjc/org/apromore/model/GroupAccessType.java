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
 * <p>GroupAccessType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="GroupAccessType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="groupId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="hasRead" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="hasWrite" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="hasOwnership" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroupAccessType")
public class GroupAccessType
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 1L;
    @XmlAttribute(name = "groupId")
    protected String groupId;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "hasRead")
    protected Boolean hasRead;
    @XmlAttribute(name = "hasWrite")
    protected Boolean hasWrite;
    @XmlAttribute(name = "hasOwnership")
    protected Boolean hasOwnership;

    /**
     * 获取groupId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupId() {
        return groupId;
    }

    /**
     * 设置groupId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupId(String value) {
        this.groupId = value;
    }

    /**
     * 获取name属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * 设置name属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * 获取hasRead属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasRead() {
        return hasRead;
    }

    /**
     * 设置hasRead属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasRead(Boolean value) {
        this.hasRead = value;
    }

    /**
     * 获取hasWrite属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasWrite() {
        return hasWrite;
    }

    /**
     * 设置hasWrite属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasWrite(Boolean value) {
        this.hasWrite = value;
    }

    /**
     * 获取hasOwnership属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasOwnership() {
        return hasOwnership;
    }

    /**
     * 设置hasOwnership属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasOwnership(Boolean value) {
        this.hasOwnership = value;
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
            String theGroupId;
            theGroupId = this.getGroupId();
            strategy.appendField(locator, this, "groupId", buffer, theGroupId);
        }
        {
            String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName);
        }
        {
            Boolean theHasRead;
            theHasRead = this.isHasRead();
            strategy.appendField(locator, this, "hasRead", buffer, theHasRead);
        }
        {
            Boolean theHasWrite;
            theHasWrite = this.isHasWrite();
            strategy.appendField(locator, this, "hasWrite", buffer, theHasWrite);
        }
        {
            Boolean theHasOwnership;
            theHasOwnership = this.isHasOwnership();
            strategy.appendField(locator, this, "hasOwnership", buffer, theHasOwnership);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof GroupAccessType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final GroupAccessType that = ((GroupAccessType) object);
        {
            String lhsGroupId;
            lhsGroupId = this.getGroupId();
            String rhsGroupId;
            rhsGroupId = that.getGroupId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "groupId", lhsGroupId), LocatorUtils.property(thatLocator, "groupId", rhsGroupId), lhsGroupId, rhsGroupId)) {
                return false;
            }
        }
        {
            String lhsName;
            lhsName = this.getName();
            String rhsName;
            rhsName = that.getName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsName), LocatorUtils.property(thatLocator, "name", rhsName), lhsName, rhsName)) {
                return false;
            }
        }
        {
            Boolean lhsHasRead;
            lhsHasRead = this.isHasRead();
            Boolean rhsHasRead;
            rhsHasRead = that.isHasRead();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hasRead", lhsHasRead), LocatorUtils.property(thatLocator, "hasRead", rhsHasRead), lhsHasRead, rhsHasRead)) {
                return false;
            }
        }
        {
            Boolean lhsHasWrite;
            lhsHasWrite = this.isHasWrite();
            Boolean rhsHasWrite;
            rhsHasWrite = that.isHasWrite();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hasWrite", lhsHasWrite), LocatorUtils.property(thatLocator, "hasWrite", rhsHasWrite), lhsHasWrite, rhsHasWrite)) {
                return false;
            }
        }
        {
            Boolean lhsHasOwnership;
            lhsHasOwnership = this.isHasOwnership();
            Boolean rhsHasOwnership;
            rhsHasOwnership = that.isHasOwnership();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hasOwnership", lhsHasOwnership), LocatorUtils.property(thatLocator, "hasOwnership", rhsHasOwnership), lhsHasOwnership, rhsHasOwnership)) {
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
            String theGroupId;
            theGroupId = this.getGroupId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "groupId", theGroupId), currentHashCode, theGroupId);
        }
        {
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName);
        }
        {
            Boolean theHasRead;
            theHasRead = this.isHasRead();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "hasRead", theHasRead), currentHashCode, theHasRead);
        }
        {
            Boolean theHasWrite;
            theHasWrite = this.isHasWrite();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "hasWrite", theHasWrite), currentHashCode, theHasWrite);
        }
        {
            Boolean theHasOwnership;
            theHasOwnership = this.isHasOwnership();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "hasOwnership", theHasOwnership), currentHashCode, theHasOwnership);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
