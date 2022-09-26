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
 * <p>UpdateSearchHistoryInputMsgType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="UpdateSearchHistoryInputMsgType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="User" type="{urn:qut-edu-au:schema:apromore:manager}UserType"/>
 *         &lt;element name="SearchHistory" type="{urn:qut-edu-au:schema:apromore:manager}SearchHistoriesType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateSearchHistoryInputMsgType", propOrder = {
    "user",
    "searchHistory"
})
public class UpdateSearchHistoryInputMsgType
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "User", required = true)
    protected UserType user;
    @XmlElement(name = "SearchHistory")
    protected List<SearchHistoriesType> searchHistory;

    /**
     * 获取user属性的值。
     * 
     * @return
     *     possible object is
     *     {@link UserType }
     *     
     */
    public UserType getUser() {
        return user;
    }

    /**
     * 设置user属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link UserType }
     *     
     */
    public void setUser(UserType value) {
        this.user = value;
    }

    /**
     * Gets the value of the searchHistory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchHistory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchHistory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchHistoriesType }
     * 
     * 
     */
    public List<SearchHistoriesType> getSearchHistory() {
        if (searchHistory == null) {
            searchHistory = new ArrayList<SearchHistoriesType>();
        }
        return this.searchHistory;
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
            UserType theUser;
            theUser = this.getUser();
            strategy.appendField(locator, this, "user", buffer, theUser);
        }
        {
            List<SearchHistoriesType> theSearchHistory;
            theSearchHistory = this.getSearchHistory();
            strategy.appendField(locator, this, "searchHistory", buffer, theSearchHistory);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof UpdateSearchHistoryInputMsgType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final UpdateSearchHistoryInputMsgType that = ((UpdateSearchHistoryInputMsgType) object);
        {
            UserType lhsUser;
            lhsUser = this.getUser();
            UserType rhsUser;
            rhsUser = that.getUser();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "user", lhsUser), LocatorUtils.property(thatLocator, "user", rhsUser), lhsUser, rhsUser)) {
                return false;
            }
        }
        {
            List<SearchHistoriesType> lhsSearchHistory;
            lhsSearchHistory = this.getSearchHistory();
            List<SearchHistoriesType> rhsSearchHistory;
            rhsSearchHistory = that.getSearchHistory();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "searchHistory", lhsSearchHistory), LocatorUtils.property(thatLocator, "searchHistory", rhsSearchHistory), lhsSearchHistory, rhsSearchHistory)) {
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
            UserType theUser;
            theUser = this.getUser();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "user", theUser), currentHashCode, theUser);
        }
        {
            List<SearchHistoriesType> theSearchHistory;
            theSearchHistory = this.getSearchHistory();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "searchHistory", theSearchHistory), currentHashCode, theSearchHistory);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
