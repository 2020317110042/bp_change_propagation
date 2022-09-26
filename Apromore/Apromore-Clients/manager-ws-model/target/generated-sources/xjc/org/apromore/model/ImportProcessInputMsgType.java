//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.04.18 时间 02:50:25 PM CST 
//


package org.apromore.model;

import java.io.Serializable;
import javax.activation.DataHandler;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlMimeType;
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
 * <p>ImportProcessInputMsgType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ImportProcessInputMsgType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProcessDescription" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;element name="EditSession" type="{urn:qut-edu-au:schema:apromore:manager}EditSessionType"/>
 *         &lt;element name="CanoniserParameters" type="{urn:qut-edu-au:schema:apromore:manager}PluginParameters"/>
 *       &lt;/sequence>
 *       &lt;attribute name="AddFakeEvents" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImportProcessInputMsgType", propOrder = {
    "processDescription",
    "editSession",
    "canoniserParameters"
})
public class ImportProcessInputMsgType
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ProcessDescription", required = true)
    @XmlMimeType("application/octet-stream")
    protected DataHandler processDescription;
    @XmlElement(name = "EditSession", required = true)
    protected EditSessionType editSession;
    @XmlElement(name = "CanoniserParameters", required = true)
    protected PluginParameters canoniserParameters;
    @XmlAttribute(name = "AddFakeEvents")
    protected Boolean addFakeEvents;

    /**
     * 获取processDescription属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DataHandler }
     *     
     */
    public DataHandler getProcessDescription() {
        return processDescription;
    }

    /**
     * 设置processDescription属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DataHandler }
     *     
     */
    public void setProcessDescription(DataHandler value) {
        this.processDescription = value;
    }

    /**
     * 获取editSession属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EditSessionType }
     *     
     */
    public EditSessionType getEditSession() {
        return editSession;
    }

    /**
     * 设置editSession属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EditSessionType }
     *     
     */
    public void setEditSession(EditSessionType value) {
        this.editSession = value;
    }

    /**
     * 获取canoniserParameters属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PluginParameters }
     *     
     */
    public PluginParameters getCanoniserParameters() {
        return canoniserParameters;
    }

    /**
     * 设置canoniserParameters属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PluginParameters }
     *     
     */
    public void setCanoniserParameters(PluginParameters value) {
        this.canoniserParameters = value;
    }

    /**
     * 获取addFakeEvents属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAddFakeEvents() {
        return addFakeEvents;
    }

    /**
     * 设置addFakeEvents属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAddFakeEvents(Boolean value) {
        this.addFakeEvents = value;
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
            DataHandler theProcessDescription;
            theProcessDescription = this.getProcessDescription();
            strategy.appendField(locator, this, "processDescription", buffer, theProcessDescription);
        }
        {
            EditSessionType theEditSession;
            theEditSession = this.getEditSession();
            strategy.appendField(locator, this, "editSession", buffer, theEditSession);
        }
        {
            PluginParameters theCanoniserParameters;
            theCanoniserParameters = this.getCanoniserParameters();
            strategy.appendField(locator, this, "canoniserParameters", buffer, theCanoniserParameters);
        }
        {
            Boolean theAddFakeEvents;
            theAddFakeEvents = this.isAddFakeEvents();
            strategy.appendField(locator, this, "addFakeEvents", buffer, theAddFakeEvents);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ImportProcessInputMsgType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ImportProcessInputMsgType that = ((ImportProcessInputMsgType) object);
        {
            DataHandler lhsProcessDescription;
            lhsProcessDescription = this.getProcessDescription();
            DataHandler rhsProcessDescription;
            rhsProcessDescription = that.getProcessDescription();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "processDescription", lhsProcessDescription), LocatorUtils.property(thatLocator, "processDescription", rhsProcessDescription), lhsProcessDescription, rhsProcessDescription)) {
                return false;
            }
        }
        {
            EditSessionType lhsEditSession;
            lhsEditSession = this.getEditSession();
            EditSessionType rhsEditSession;
            rhsEditSession = that.getEditSession();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "editSession", lhsEditSession), LocatorUtils.property(thatLocator, "editSession", rhsEditSession), lhsEditSession, rhsEditSession)) {
                return false;
            }
        }
        {
            PluginParameters lhsCanoniserParameters;
            lhsCanoniserParameters = this.getCanoniserParameters();
            PluginParameters rhsCanoniserParameters;
            rhsCanoniserParameters = that.getCanoniserParameters();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "canoniserParameters", lhsCanoniserParameters), LocatorUtils.property(thatLocator, "canoniserParameters", rhsCanoniserParameters), lhsCanoniserParameters, rhsCanoniserParameters)) {
                return false;
            }
        }
        {
            Boolean lhsAddFakeEvents;
            lhsAddFakeEvents = this.isAddFakeEvents();
            Boolean rhsAddFakeEvents;
            rhsAddFakeEvents = that.isAddFakeEvents();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "addFakeEvents", lhsAddFakeEvents), LocatorUtils.property(thatLocator, "addFakeEvents", rhsAddFakeEvents), lhsAddFakeEvents, rhsAddFakeEvents)) {
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
            DataHandler theProcessDescription;
            theProcessDescription = this.getProcessDescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "processDescription", theProcessDescription), currentHashCode, theProcessDescription);
        }
        {
            EditSessionType theEditSession;
            theEditSession = this.getEditSession();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "editSession", theEditSession), currentHashCode, theEditSession);
        }
        {
            PluginParameters theCanoniserParameters;
            theCanoniserParameters = this.getCanoniserParameters();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "canoniserParameters", theCanoniserParameters), currentHashCode, theCanoniserParameters);
        }
        {
            Boolean theAddFakeEvents;
            theAddFakeEvents = this.isAddFakeEvents();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "addFakeEvents", theAddFakeEvents), currentHashCode, theAddFakeEvents);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
