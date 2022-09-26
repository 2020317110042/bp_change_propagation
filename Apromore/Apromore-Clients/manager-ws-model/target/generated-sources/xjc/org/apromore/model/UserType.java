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
 * <p>UserType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="UserType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Roles" type="{urn:qut-edu-au:schema:apromore:manager}RoleType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Permissions" type="{urn:qut-edu-au:schema:apromore:manager}PermissionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SearchHistories" type="{urn:qut-edu-au:schema:apromore:manager}SearchHistoriesType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Membership" type="{urn:qut-edu-au:schema:apromore:manager}MembershipType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="lastActivityDate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="username" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserType", propOrder = {
    "roles",
    "permissions",
    "searchHistories",
    "membership"
})
public class UserType
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Roles")
    protected List<RoleType> roles;
    @XmlElement(name = "Permissions")
    protected List<PermissionType> permissions;
    @XmlElement(name = "SearchHistories")
    protected List<SearchHistoriesType> searchHistories;
    @XmlElement(name = "Membership")
    protected MembershipType membership;
    @XmlAttribute(name = "id")
    protected String id;
    @XmlAttribute(name = "firstName")
    protected String firstName;
    @XmlAttribute(name = "lastName")
    protected String lastName;
    @XmlAttribute(name = "lastActivityDate")
    protected String lastActivityDate;
    @XmlAttribute(name = "username")
    protected String username;

    /**
     * Gets the value of the roles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RoleType }
     * 
     * 
     */
    public List<RoleType> getRoles() {
        if (roles == null) {
            roles = new ArrayList<RoleType>();
        }
        return this.roles;
    }

    /**
     * Gets the value of the permissions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the permissions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPermissions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PermissionType }
     * 
     * 
     */
    public List<PermissionType> getPermissions() {
        if (permissions == null) {
            permissions = new ArrayList<PermissionType>();
        }
        return this.permissions;
    }

    /**
     * Gets the value of the searchHistories property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchHistories property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchHistories().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchHistoriesType }
     * 
     * 
     */
    public List<SearchHistoriesType> getSearchHistories() {
        if (searchHistories == null) {
            searchHistories = new ArrayList<SearchHistoriesType>();
        }
        return this.searchHistories;
    }

    /**
     * 获取membership属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MembershipType }
     *     
     */
    public MembershipType getMembership() {
        return membership;
    }

    /**
     * 设置membership属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MembershipType }
     *     
     */
    public void setMembership(MembershipType value) {
        this.membership = value;
    }

    /**
     * 获取id属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * 设置id属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * 获取firstName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * 设置firstName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * 获取lastName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * 设置lastName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * 获取lastActivityDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastActivityDate() {
        return lastActivityDate;
    }

    /**
     * 设置lastActivityDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastActivityDate(String value) {
        this.lastActivityDate = value;
    }

    /**
     * 获取username属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置username属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
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
            List<RoleType> theRoles;
            theRoles = this.getRoles();
            strategy.appendField(locator, this, "roles", buffer, theRoles);
        }
        {
            List<PermissionType> thePermissions;
            thePermissions = this.getPermissions();
            strategy.appendField(locator, this, "permissions", buffer, thePermissions);
        }
        {
            List<SearchHistoriesType> theSearchHistories;
            theSearchHistories = this.getSearchHistories();
            strategy.appendField(locator, this, "searchHistories", buffer, theSearchHistories);
        }
        {
            MembershipType theMembership;
            theMembership = this.getMembership();
            strategy.appendField(locator, this, "membership", buffer, theMembership);
        }
        {
            String theId;
            theId = this.getId();
            strategy.appendField(locator, this, "id", buffer, theId);
        }
        {
            String theFirstName;
            theFirstName = this.getFirstName();
            strategy.appendField(locator, this, "firstName", buffer, theFirstName);
        }
        {
            String theLastName;
            theLastName = this.getLastName();
            strategy.appendField(locator, this, "lastName", buffer, theLastName);
        }
        {
            String theLastActivityDate;
            theLastActivityDate = this.getLastActivityDate();
            strategy.appendField(locator, this, "lastActivityDate", buffer, theLastActivityDate);
        }
        {
            String theUsername;
            theUsername = this.getUsername();
            strategy.appendField(locator, this, "username", buffer, theUsername);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof UserType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final UserType that = ((UserType) object);
        {
            List<RoleType> lhsRoles;
            lhsRoles = this.getRoles();
            List<RoleType> rhsRoles;
            rhsRoles = that.getRoles();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "roles", lhsRoles), LocatorUtils.property(thatLocator, "roles", rhsRoles), lhsRoles, rhsRoles)) {
                return false;
            }
        }
        {
            List<PermissionType> lhsPermissions;
            lhsPermissions = this.getPermissions();
            List<PermissionType> rhsPermissions;
            rhsPermissions = that.getPermissions();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "permissions", lhsPermissions), LocatorUtils.property(thatLocator, "permissions", rhsPermissions), lhsPermissions, rhsPermissions)) {
                return false;
            }
        }
        {
            List<SearchHistoriesType> lhsSearchHistories;
            lhsSearchHistories = this.getSearchHistories();
            List<SearchHistoriesType> rhsSearchHistories;
            rhsSearchHistories = that.getSearchHistories();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "searchHistories", lhsSearchHistories), LocatorUtils.property(thatLocator, "searchHistories", rhsSearchHistories), lhsSearchHistories, rhsSearchHistories)) {
                return false;
            }
        }
        {
            MembershipType lhsMembership;
            lhsMembership = this.getMembership();
            MembershipType rhsMembership;
            rhsMembership = that.getMembership();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "membership", lhsMembership), LocatorUtils.property(thatLocator, "membership", rhsMembership), lhsMembership, rhsMembership)) {
                return false;
            }
        }
        {
            String lhsId;
            lhsId = this.getId();
            String rhsId;
            rhsId = that.getId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "id", lhsId), LocatorUtils.property(thatLocator, "id", rhsId), lhsId, rhsId)) {
                return false;
            }
        }
        {
            String lhsFirstName;
            lhsFirstName = this.getFirstName();
            String rhsFirstName;
            rhsFirstName = that.getFirstName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "firstName", lhsFirstName), LocatorUtils.property(thatLocator, "firstName", rhsFirstName), lhsFirstName, rhsFirstName)) {
                return false;
            }
        }
        {
            String lhsLastName;
            lhsLastName = this.getLastName();
            String rhsLastName;
            rhsLastName = that.getLastName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lastName", lhsLastName), LocatorUtils.property(thatLocator, "lastName", rhsLastName), lhsLastName, rhsLastName)) {
                return false;
            }
        }
        {
            String lhsLastActivityDate;
            lhsLastActivityDate = this.getLastActivityDate();
            String rhsLastActivityDate;
            rhsLastActivityDate = that.getLastActivityDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lastActivityDate", lhsLastActivityDate), LocatorUtils.property(thatLocator, "lastActivityDate", rhsLastActivityDate), lhsLastActivityDate, rhsLastActivityDate)) {
                return false;
            }
        }
        {
            String lhsUsername;
            lhsUsername = this.getUsername();
            String rhsUsername;
            rhsUsername = that.getUsername();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "username", lhsUsername), LocatorUtils.property(thatLocator, "username", rhsUsername), lhsUsername, rhsUsername)) {
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
            List<RoleType> theRoles;
            theRoles = this.getRoles();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "roles", theRoles), currentHashCode, theRoles);
        }
        {
            List<PermissionType> thePermissions;
            thePermissions = this.getPermissions();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "permissions", thePermissions), currentHashCode, thePermissions);
        }
        {
            List<SearchHistoriesType> theSearchHistories;
            theSearchHistories = this.getSearchHistories();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "searchHistories", theSearchHistories), currentHashCode, theSearchHistories);
        }
        {
            MembershipType theMembership;
            theMembership = this.getMembership();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "membership", theMembership), currentHashCode, theMembership);
        }
        {
            String theId;
            theId = this.getId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "id", theId), currentHashCode, theId);
        }
        {
            String theFirstName;
            theFirstName = this.getFirstName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "firstName", theFirstName), currentHashCode, theFirstName);
        }
        {
            String theLastName;
            theLastName = this.getLastName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lastName", theLastName), currentHashCode, theLastName);
        }
        {
            String theLastActivityDate;
            theLastActivityDate = this.getLastActivityDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lastActivityDate", theLastActivityDate), currentHashCode, theLastActivityDate);
        }
        {
            String theUsername;
            theUsername = this.getUsername();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "username", theUsername), currentHashCode, theUsername);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
