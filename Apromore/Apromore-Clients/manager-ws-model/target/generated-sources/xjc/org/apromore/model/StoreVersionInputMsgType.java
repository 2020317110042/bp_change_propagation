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
 * <p>StoreVersionInputMsgType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="StoreVersionInputMsgType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Native" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;element name="Cpf" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;element name="Anf" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;element name="EditSession" type="{urn:qut-edu-au:schema:apromore:manager}EditSessionType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="EditSessionCode" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="CpfURI" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StoreVersionInputMsgType", propOrder = {
    "_native",
    "cpf",
    "anf",
    "editSession"
})
public class StoreVersionInputMsgType
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Native", required = true)
    @XmlMimeType("application/octet-stream")
    protected DataHandler _native;
    @XmlElement(name = "Cpf", required = true)
    @XmlMimeType("application/octet-stream")
    protected DataHandler cpf;
    @XmlElement(name = "Anf", required = true)
    @XmlMimeType("application/octet-stream")
    protected DataHandler anf;
    @XmlElement(name = "EditSession", required = true)
    protected EditSessionType editSession;
    @XmlAttribute(name = "EditSessionCode")
    protected Integer editSessionCode;
    @XmlAttribute(name = "CpfURI")
    protected String cpfURI;

    /**
     * 获取native属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DataHandler }
     *     
     */
    public DataHandler getNative() {
        return _native;
    }

    /**
     * 设置native属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DataHandler }
     *     
     */
    public void setNative(DataHandler value) {
        this._native = value;
    }

    /**
     * 获取cpf属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DataHandler }
     *     
     */
    public DataHandler getCpf() {
        return cpf;
    }

    /**
     * 设置cpf属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DataHandler }
     *     
     */
    public void setCpf(DataHandler value) {
        this.cpf = value;
    }

    /**
     * 获取anf属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DataHandler }
     *     
     */
    public DataHandler getAnf() {
        return anf;
    }

    /**
     * 设置anf属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DataHandler }
     *     
     */
    public void setAnf(DataHandler value) {
        this.anf = value;
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
     * 获取editSessionCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEditSessionCode() {
        return editSessionCode;
    }

    /**
     * 设置editSessionCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEditSessionCode(Integer value) {
        this.editSessionCode = value;
    }

    /**
     * 获取cpfURI属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpfURI() {
        return cpfURI;
    }

    /**
     * 设置cpfURI属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpfURI(String value) {
        this.cpfURI = value;
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
            DataHandler theNative;
            theNative = this.getNative();
            strategy.appendField(locator, this, "_native", buffer, theNative);
        }
        {
            DataHandler theCpf;
            theCpf = this.getCpf();
            strategy.appendField(locator, this, "cpf", buffer, theCpf);
        }
        {
            DataHandler theAnf;
            theAnf = this.getAnf();
            strategy.appendField(locator, this, "anf", buffer, theAnf);
        }
        {
            EditSessionType theEditSession;
            theEditSession = this.getEditSession();
            strategy.appendField(locator, this, "editSession", buffer, theEditSession);
        }
        {
            Integer theEditSessionCode;
            theEditSessionCode = this.getEditSessionCode();
            strategy.appendField(locator, this, "editSessionCode", buffer, theEditSessionCode);
        }
        {
            String theCpfURI;
            theCpfURI = this.getCpfURI();
            strategy.appendField(locator, this, "cpfURI", buffer, theCpfURI);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof StoreVersionInputMsgType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final StoreVersionInputMsgType that = ((StoreVersionInputMsgType) object);
        {
            DataHandler lhsNative;
            lhsNative = this.getNative();
            DataHandler rhsNative;
            rhsNative = that.getNative();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "_native", lhsNative), LocatorUtils.property(thatLocator, "_native", rhsNative), lhsNative, rhsNative)) {
                return false;
            }
        }
        {
            DataHandler lhsCpf;
            lhsCpf = this.getCpf();
            DataHandler rhsCpf;
            rhsCpf = that.getCpf();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cpf", lhsCpf), LocatorUtils.property(thatLocator, "cpf", rhsCpf), lhsCpf, rhsCpf)) {
                return false;
            }
        }
        {
            DataHandler lhsAnf;
            lhsAnf = this.getAnf();
            DataHandler rhsAnf;
            rhsAnf = that.getAnf();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anf", lhsAnf), LocatorUtils.property(thatLocator, "anf", rhsAnf), lhsAnf, rhsAnf)) {
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
            Integer lhsEditSessionCode;
            lhsEditSessionCode = this.getEditSessionCode();
            Integer rhsEditSessionCode;
            rhsEditSessionCode = that.getEditSessionCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "editSessionCode", lhsEditSessionCode), LocatorUtils.property(thatLocator, "editSessionCode", rhsEditSessionCode), lhsEditSessionCode, rhsEditSessionCode)) {
                return false;
            }
        }
        {
            String lhsCpfURI;
            lhsCpfURI = this.getCpfURI();
            String rhsCpfURI;
            rhsCpfURI = that.getCpfURI();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cpfURI", lhsCpfURI), LocatorUtils.property(thatLocator, "cpfURI", rhsCpfURI), lhsCpfURI, rhsCpfURI)) {
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
            DataHandler theNative;
            theNative = this.getNative();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "_native", theNative), currentHashCode, theNative);
        }
        {
            DataHandler theCpf;
            theCpf = this.getCpf();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cpf", theCpf), currentHashCode, theCpf);
        }
        {
            DataHandler theAnf;
            theAnf = this.getAnf();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "anf", theAnf), currentHashCode, theAnf);
        }
        {
            EditSessionType theEditSession;
            theEditSession = this.getEditSession();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "editSession", theEditSession), currentHashCode, theEditSession);
        }
        {
            Integer theEditSessionCode;
            theEditSessionCode = this.getEditSessionCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "editSessionCode", theEditSessionCode), currentHashCode, theEditSessionCode);
        }
        {
            String theCpfURI;
            theCpfURI = this.getCpfURI();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cpfURI", theCpfURI), currentHashCode, theCpfURI);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
