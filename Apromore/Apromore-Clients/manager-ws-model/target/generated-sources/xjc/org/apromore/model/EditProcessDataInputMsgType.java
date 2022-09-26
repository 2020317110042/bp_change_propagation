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
 * <p>EditProcessDataInputMsgType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="EditProcessDataInputMsgType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="processName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="domain" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="owner" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ranking" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="newVersion" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="preVersion" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="makePublic" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EditProcessDataInputMsgType")
public class EditProcessDataInputMsgType
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 1L;
    @XmlAttribute(name = "processName")
    protected String processName;
    @XmlAttribute(name = "id")
    protected Integer id;
    @XmlAttribute(name = "domain")
    protected String domain;
    @XmlAttribute(name = "owner")
    protected String owner;
    @XmlAttribute(name = "ranking")
    protected String ranking;
    @XmlAttribute(name = "newVersion")
    protected String newVersion;
    @XmlAttribute(name = "preVersion")
    protected String preVersion;
    @XmlAttribute(name = "makePublic")
    protected Boolean makePublic;

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
     * 获取id属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置id属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * 获取domain属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomain() {
        return domain;
    }

    /**
     * 设置domain属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomain(String value) {
        this.domain = value;
    }

    /**
     * 获取owner属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwner() {
        return owner;
    }

    /**
     * 设置owner属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwner(String value) {
        this.owner = value;
    }

    /**
     * 获取ranking属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRanking() {
        return ranking;
    }

    /**
     * 设置ranking属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRanking(String value) {
        this.ranking = value;
    }

    /**
     * 获取newVersion属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewVersion() {
        return newVersion;
    }

    /**
     * 设置newVersion属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewVersion(String value) {
        this.newVersion = value;
    }

    /**
     * 获取preVersion属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreVersion() {
        return preVersion;
    }

    /**
     * 设置preVersion属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreVersion(String value) {
        this.preVersion = value;
    }

    /**
     * 获取makePublic属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMakePublic() {
        return makePublic;
    }

    /**
     * 设置makePublic属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMakePublic(Boolean value) {
        this.makePublic = value;
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
            Integer theId;
            theId = this.getId();
            strategy.appendField(locator, this, "id", buffer, theId);
        }
        {
            String theDomain;
            theDomain = this.getDomain();
            strategy.appendField(locator, this, "domain", buffer, theDomain);
        }
        {
            String theOwner;
            theOwner = this.getOwner();
            strategy.appendField(locator, this, "owner", buffer, theOwner);
        }
        {
            String theRanking;
            theRanking = this.getRanking();
            strategy.appendField(locator, this, "ranking", buffer, theRanking);
        }
        {
            String theNewVersion;
            theNewVersion = this.getNewVersion();
            strategy.appendField(locator, this, "newVersion", buffer, theNewVersion);
        }
        {
            String thePreVersion;
            thePreVersion = this.getPreVersion();
            strategy.appendField(locator, this, "preVersion", buffer, thePreVersion);
        }
        {
            Boolean theMakePublic;
            theMakePublic = this.isMakePublic();
            strategy.appendField(locator, this, "makePublic", buffer, theMakePublic);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof EditProcessDataInputMsgType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final EditProcessDataInputMsgType that = ((EditProcessDataInputMsgType) object);
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
            Integer lhsId;
            lhsId = this.getId();
            Integer rhsId;
            rhsId = that.getId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "id", lhsId), LocatorUtils.property(thatLocator, "id", rhsId), lhsId, rhsId)) {
                return false;
            }
        }
        {
            String lhsDomain;
            lhsDomain = this.getDomain();
            String rhsDomain;
            rhsDomain = that.getDomain();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "domain", lhsDomain), LocatorUtils.property(thatLocator, "domain", rhsDomain), lhsDomain, rhsDomain)) {
                return false;
            }
        }
        {
            String lhsOwner;
            lhsOwner = this.getOwner();
            String rhsOwner;
            rhsOwner = that.getOwner();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "owner", lhsOwner), LocatorUtils.property(thatLocator, "owner", rhsOwner), lhsOwner, rhsOwner)) {
                return false;
            }
        }
        {
            String lhsRanking;
            lhsRanking = this.getRanking();
            String rhsRanking;
            rhsRanking = that.getRanking();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ranking", lhsRanking), LocatorUtils.property(thatLocator, "ranking", rhsRanking), lhsRanking, rhsRanking)) {
                return false;
            }
        }
        {
            String lhsNewVersion;
            lhsNewVersion = this.getNewVersion();
            String rhsNewVersion;
            rhsNewVersion = that.getNewVersion();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "newVersion", lhsNewVersion), LocatorUtils.property(thatLocator, "newVersion", rhsNewVersion), lhsNewVersion, rhsNewVersion)) {
                return false;
            }
        }
        {
            String lhsPreVersion;
            lhsPreVersion = this.getPreVersion();
            String rhsPreVersion;
            rhsPreVersion = that.getPreVersion();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "preVersion", lhsPreVersion), LocatorUtils.property(thatLocator, "preVersion", rhsPreVersion), lhsPreVersion, rhsPreVersion)) {
                return false;
            }
        }
        {
            Boolean lhsMakePublic;
            lhsMakePublic = this.isMakePublic();
            Boolean rhsMakePublic;
            rhsMakePublic = that.isMakePublic();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "makePublic", lhsMakePublic), LocatorUtils.property(thatLocator, "makePublic", rhsMakePublic), lhsMakePublic, rhsMakePublic)) {
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
            Integer theId;
            theId = this.getId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "id", theId), currentHashCode, theId);
        }
        {
            String theDomain;
            theDomain = this.getDomain();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "domain", theDomain), currentHashCode, theDomain);
        }
        {
            String theOwner;
            theOwner = this.getOwner();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "owner", theOwner), currentHashCode, theOwner);
        }
        {
            String theRanking;
            theRanking = this.getRanking();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ranking", theRanking), currentHashCode, theRanking);
        }
        {
            String theNewVersion;
            theNewVersion = this.getNewVersion();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "newVersion", theNewVersion), currentHashCode, theNewVersion);
        }
        {
            String thePreVersion;
            thePreVersion = this.getPreVersion();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "preVersion", thePreVersion), currentHashCode, thePreVersion);
        }
        {
            Boolean theMakePublic;
            theMakePublic = this.isMakePublic();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "makePublic", theMakePublic), currentHashCode, theMakePublic);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
