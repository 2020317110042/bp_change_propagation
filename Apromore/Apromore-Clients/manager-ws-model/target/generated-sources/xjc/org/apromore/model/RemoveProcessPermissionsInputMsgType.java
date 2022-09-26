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
 * <p>RemoveProcessPermissionsInputMsgType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RemoveProcessPermissionsInputMsgType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="processId" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="userId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemoveProcessPermissionsInputMsgType")
public class RemoveProcessPermissionsInputMsgType
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 1L;
    @XmlAttribute(name = "processId")
    protected Integer processId;
    @XmlAttribute(name = "userId")
    protected String userId;

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
     * 获取userId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置userId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId(String value) {
        this.userId = value;
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
            String theUserId;
            theUserId = this.getUserId();
            strategy.appendField(locator, this, "userId", buffer, theUserId);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof RemoveProcessPermissionsInputMsgType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final RemoveProcessPermissionsInputMsgType that = ((RemoveProcessPermissionsInputMsgType) object);
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
            String lhsUserId;
            lhsUserId = this.getUserId();
            String rhsUserId;
            rhsUserId = that.getUserId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "userId", lhsUserId), LocatorUtils.property(thatLocator, "userId", rhsUserId), lhsUserId, rhsUserId)) {
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
            String theUserId;
            theUserId = this.getUserId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "userId", theUserId), currentHashCode, theUserId);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
