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
 * <p>ReadCanonicalAnfOutputMsgType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ReadCanonicalAnfOutputMsgType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Result" type="{urn:qut-edu-au:schema:apromore:manager}ResultType"/>
 *         &lt;element name="cpf" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;element name="anf" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReadCanonicalAnfOutputMsgType", propOrder = {
    "result",
    "cpf",
    "anf"
})
public class ReadCanonicalAnfOutputMsgType
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Result", required = true)
    protected ResultType result;
    @XmlElement(required = true)
    @XmlMimeType("application/octet-stream")
    protected DataHandler cpf;
    @XmlMimeType("application/octet-stream")
    protected DataHandler anf;

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
            DataHandler theCpf;
            theCpf = this.getCpf();
            strategy.appendField(locator, this, "cpf", buffer, theCpf);
        }
        {
            DataHandler theAnf;
            theAnf = this.getAnf();
            strategy.appendField(locator, this, "anf", buffer, theAnf);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ReadCanonicalAnfOutputMsgType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ReadCanonicalAnfOutputMsgType that = ((ReadCanonicalAnfOutputMsgType) object);
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
            DataHandler theCpf;
            theCpf = this.getCpf();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cpf", theCpf), currentHashCode, theCpf);
        }
        {
            DataHandler theAnf;
            theAnf = this.getAnf();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "anf", theAnf), currentHashCode, theAnf);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
