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
 * <p>MembershipType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="MembershipType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="email" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="locked" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="approved" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="password" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="passwordSalt" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="passwordQuestion" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="passwordAnswer" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="failedLogins" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="failedAnswers" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MembershipType")
public class MembershipType
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 1L;
    @XmlAttribute(name = "id")
    protected String id;
    @XmlAttribute(name = "email")
    protected String email;
    @XmlAttribute(name = "locked")
    protected Boolean locked;
    @XmlAttribute(name = "approved")
    protected Boolean approved;
    @XmlAttribute(name = "password")
    protected String password;
    @XmlAttribute(name = "passwordSalt")
    protected String passwordSalt;
    @XmlAttribute(name = "passwordQuestion")
    protected String passwordQuestion;
    @XmlAttribute(name = "passwordAnswer")
    protected String passwordAnswer;
    @XmlAttribute(name = "failedLogins")
    protected Integer failedLogins;
    @XmlAttribute(name = "failedAnswers")
    protected Integer failedAnswers;

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
     * 获取email属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置email属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * 获取locked属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLocked() {
        return locked;
    }

    /**
     * 设置locked属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLocked(Boolean value) {
        this.locked = value;
    }

    /**
     * 获取approved属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isApproved() {
        return approved;
    }

    /**
     * 设置approved属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setApproved(Boolean value) {
        this.approved = value;
    }

    /**
     * 获取password属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置password属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * 获取passwordSalt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPasswordSalt() {
        return passwordSalt;
    }

    /**
     * 设置passwordSalt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPasswordSalt(String value) {
        this.passwordSalt = value;
    }

    /**
     * 获取passwordQuestion属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPasswordQuestion() {
        return passwordQuestion;
    }

    /**
     * 设置passwordQuestion属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPasswordQuestion(String value) {
        this.passwordQuestion = value;
    }

    /**
     * 获取passwordAnswer属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPasswordAnswer() {
        return passwordAnswer;
    }

    /**
     * 设置passwordAnswer属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPasswordAnswer(String value) {
        this.passwordAnswer = value;
    }

    /**
     * 获取failedLogins属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFailedLogins() {
        return failedLogins;
    }

    /**
     * 设置failedLogins属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFailedLogins(Integer value) {
        this.failedLogins = value;
    }

    /**
     * 获取failedAnswers属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFailedAnswers() {
        return failedAnswers;
    }

    /**
     * 设置failedAnswers属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFailedAnswers(Integer value) {
        this.failedAnswers = value;
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
            String theId;
            theId = this.getId();
            strategy.appendField(locator, this, "id", buffer, theId);
        }
        {
            String theEmail;
            theEmail = this.getEmail();
            strategy.appendField(locator, this, "email", buffer, theEmail);
        }
        {
            Boolean theLocked;
            theLocked = this.isLocked();
            strategy.appendField(locator, this, "locked", buffer, theLocked);
        }
        {
            Boolean theApproved;
            theApproved = this.isApproved();
            strategy.appendField(locator, this, "approved", buffer, theApproved);
        }
        {
            String thePassword;
            thePassword = this.getPassword();
            strategy.appendField(locator, this, "password", buffer, thePassword);
        }
        {
            String thePasswordSalt;
            thePasswordSalt = this.getPasswordSalt();
            strategy.appendField(locator, this, "passwordSalt", buffer, thePasswordSalt);
        }
        {
            String thePasswordQuestion;
            thePasswordQuestion = this.getPasswordQuestion();
            strategy.appendField(locator, this, "passwordQuestion", buffer, thePasswordQuestion);
        }
        {
            String thePasswordAnswer;
            thePasswordAnswer = this.getPasswordAnswer();
            strategy.appendField(locator, this, "passwordAnswer", buffer, thePasswordAnswer);
        }
        {
            Integer theFailedLogins;
            theFailedLogins = this.getFailedLogins();
            strategy.appendField(locator, this, "failedLogins", buffer, theFailedLogins);
        }
        {
            Integer theFailedAnswers;
            theFailedAnswers = this.getFailedAnswers();
            strategy.appendField(locator, this, "failedAnswers", buffer, theFailedAnswers);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof MembershipType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final MembershipType that = ((MembershipType) object);
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
            String lhsEmail;
            lhsEmail = this.getEmail();
            String rhsEmail;
            rhsEmail = that.getEmail();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "email", lhsEmail), LocatorUtils.property(thatLocator, "email", rhsEmail), lhsEmail, rhsEmail)) {
                return false;
            }
        }
        {
            Boolean lhsLocked;
            lhsLocked = this.isLocked();
            Boolean rhsLocked;
            rhsLocked = that.isLocked();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "locked", lhsLocked), LocatorUtils.property(thatLocator, "locked", rhsLocked), lhsLocked, rhsLocked)) {
                return false;
            }
        }
        {
            Boolean lhsApproved;
            lhsApproved = this.isApproved();
            Boolean rhsApproved;
            rhsApproved = that.isApproved();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "approved", lhsApproved), LocatorUtils.property(thatLocator, "approved", rhsApproved), lhsApproved, rhsApproved)) {
                return false;
            }
        }
        {
            String lhsPassword;
            lhsPassword = this.getPassword();
            String rhsPassword;
            rhsPassword = that.getPassword();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "password", lhsPassword), LocatorUtils.property(thatLocator, "password", rhsPassword), lhsPassword, rhsPassword)) {
                return false;
            }
        }
        {
            String lhsPasswordSalt;
            lhsPasswordSalt = this.getPasswordSalt();
            String rhsPasswordSalt;
            rhsPasswordSalt = that.getPasswordSalt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "passwordSalt", lhsPasswordSalt), LocatorUtils.property(thatLocator, "passwordSalt", rhsPasswordSalt), lhsPasswordSalt, rhsPasswordSalt)) {
                return false;
            }
        }
        {
            String lhsPasswordQuestion;
            lhsPasswordQuestion = this.getPasswordQuestion();
            String rhsPasswordQuestion;
            rhsPasswordQuestion = that.getPasswordQuestion();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "passwordQuestion", lhsPasswordQuestion), LocatorUtils.property(thatLocator, "passwordQuestion", rhsPasswordQuestion), lhsPasswordQuestion, rhsPasswordQuestion)) {
                return false;
            }
        }
        {
            String lhsPasswordAnswer;
            lhsPasswordAnswer = this.getPasswordAnswer();
            String rhsPasswordAnswer;
            rhsPasswordAnswer = that.getPasswordAnswer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "passwordAnswer", lhsPasswordAnswer), LocatorUtils.property(thatLocator, "passwordAnswer", rhsPasswordAnswer), lhsPasswordAnswer, rhsPasswordAnswer)) {
                return false;
            }
        }
        {
            Integer lhsFailedLogins;
            lhsFailedLogins = this.getFailedLogins();
            Integer rhsFailedLogins;
            rhsFailedLogins = that.getFailedLogins();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "failedLogins", lhsFailedLogins), LocatorUtils.property(thatLocator, "failedLogins", rhsFailedLogins), lhsFailedLogins, rhsFailedLogins)) {
                return false;
            }
        }
        {
            Integer lhsFailedAnswers;
            lhsFailedAnswers = this.getFailedAnswers();
            Integer rhsFailedAnswers;
            rhsFailedAnswers = that.getFailedAnswers();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "failedAnswers", lhsFailedAnswers), LocatorUtils.property(thatLocator, "failedAnswers", rhsFailedAnswers), lhsFailedAnswers, rhsFailedAnswers)) {
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
            String theId;
            theId = this.getId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "id", theId), currentHashCode, theId);
        }
        {
            String theEmail;
            theEmail = this.getEmail();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "email", theEmail), currentHashCode, theEmail);
        }
        {
            Boolean theLocked;
            theLocked = this.isLocked();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "locked", theLocked), currentHashCode, theLocked);
        }
        {
            Boolean theApproved;
            theApproved = this.isApproved();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "approved", theApproved), currentHashCode, theApproved);
        }
        {
            String thePassword;
            thePassword = this.getPassword();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "password", thePassword), currentHashCode, thePassword);
        }
        {
            String thePasswordSalt;
            thePasswordSalt = this.getPasswordSalt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "passwordSalt", thePasswordSalt), currentHashCode, thePasswordSalt);
        }
        {
            String thePasswordQuestion;
            thePasswordQuestion = this.getPasswordQuestion();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "passwordQuestion", thePasswordQuestion), currentHashCode, thePasswordQuestion);
        }
        {
            String thePasswordAnswer;
            thePasswordAnswer = this.getPasswordAnswer();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "passwordAnswer", thePasswordAnswer), currentHashCode, thePasswordAnswer);
        }
        {
            Integer theFailedLogins;
            theFailedLogins = this.getFailedLogins();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "failedLogins", theFailedLogins), currentHashCode, theFailedLogins);
        }
        {
            Integer theFailedAnswers;
            theFailedAnswers = this.getFailedAnswers();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "failedAnswers", theFailedAnswers), currentHashCode, theFailedAnswers);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
