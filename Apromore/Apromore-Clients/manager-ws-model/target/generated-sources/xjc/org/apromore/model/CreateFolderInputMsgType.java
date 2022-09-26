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
 * <p>CreateFolderInputMsgType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CreateFolderInputMsgType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="userId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="folderName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="parentFolderId" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateFolderInputMsgType")
public class CreateFolderInputMsgType
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 1L;
    @XmlAttribute(name = "userId")
    protected String userId;
    @XmlAttribute(name = "folderName")
    protected String folderName;
    @XmlAttribute(name = "parentFolderId")
    protected Integer parentFolderId;

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

    /**
     * 获取folderName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFolderName() {
        return folderName;
    }

    /**
     * 设置folderName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFolderName(String value) {
        this.folderName = value;
    }

    /**
     * 获取parentFolderId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getParentFolderId() {
        return parentFolderId;
    }

    /**
     * 设置parentFolderId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setParentFolderId(Integer value) {
        this.parentFolderId = value;
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
            String theUserId;
            theUserId = this.getUserId();
            strategy.appendField(locator, this, "userId", buffer, theUserId);
        }
        {
            String theFolderName;
            theFolderName = this.getFolderName();
            strategy.appendField(locator, this, "folderName", buffer, theFolderName);
        }
        {
            Integer theParentFolderId;
            theParentFolderId = this.getParentFolderId();
            strategy.appendField(locator, this, "parentFolderId", buffer, theParentFolderId);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof CreateFolderInputMsgType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final CreateFolderInputMsgType that = ((CreateFolderInputMsgType) object);
        {
            String lhsUserId;
            lhsUserId = this.getUserId();
            String rhsUserId;
            rhsUserId = that.getUserId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "userId", lhsUserId), LocatorUtils.property(thatLocator, "userId", rhsUserId), lhsUserId, rhsUserId)) {
                return false;
            }
        }
        {
            String lhsFolderName;
            lhsFolderName = this.getFolderName();
            String rhsFolderName;
            rhsFolderName = that.getFolderName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "folderName", lhsFolderName), LocatorUtils.property(thatLocator, "folderName", rhsFolderName), lhsFolderName, rhsFolderName)) {
                return false;
            }
        }
        {
            Integer lhsParentFolderId;
            lhsParentFolderId = this.getParentFolderId();
            Integer rhsParentFolderId;
            rhsParentFolderId = that.getParentFolderId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "parentFolderId", lhsParentFolderId), LocatorUtils.property(thatLocator, "parentFolderId", rhsParentFolderId), lhsParentFolderId, rhsParentFolderId)) {
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
            String theUserId;
            theUserId = this.getUserId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "userId", theUserId), currentHashCode, theUserId);
        }
        {
            String theFolderName;
            theFolderName = this.getFolderName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "folderName", theFolderName), currentHashCode, theFolderName);
        }
        {
            Integer theParentFolderId;
            theParentFolderId = this.getParentFolderId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "parentFolderId", theParentFolderId), currentHashCode, theParentFolderId);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
