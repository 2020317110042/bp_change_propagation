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
 * <p>SearchUserOutputMsgType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SearchUserOutputMsgType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Result" type="{urn:qut-edu-au:schema:apromore:manager}ResultType"/>
 *         &lt;element name="Users" type="{urn:qut-edu-au:schema:apromore:manager}UserType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchUserOutputMsgType", propOrder = {
    "result",
    "users"
})
public class SearchUserOutputMsgType
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Result", required = true)
    protected ResultType result;
    @XmlElement(name = "Users")
    protected List<UserType> users;

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
     * Gets the value of the users property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the users property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUsers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserType }
     * 
     * 
     */
    public List<UserType> getUsers() {
        if (users == null) {
            users = new ArrayList<UserType>();
        }
        return this.users;
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
            List<UserType> theUsers;
            theUsers = this.getUsers();
            strategy.appendField(locator, this, "users", buffer, theUsers);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof SearchUserOutputMsgType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final SearchUserOutputMsgType that = ((SearchUserOutputMsgType) object);
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
            List<UserType> lhsUsers;
            lhsUsers = this.getUsers();
            List<UserType> rhsUsers;
            rhsUsers = that.getUsers();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "users", lhsUsers), LocatorUtils.property(thatLocator, "users", rhsUsers), lhsUsers, rhsUsers)) {
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
            List<UserType> theUsers;
            theUsers = this.getUsers();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "users", theUsers), currentHashCode, theUsers);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
