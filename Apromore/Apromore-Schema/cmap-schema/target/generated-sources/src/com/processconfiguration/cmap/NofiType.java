//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.04.18 时间 02:49:21 PM CST 
//


package com.processconfiguration.cmap;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import com.sun.xml.bind.Locatable;
import com.sun.xml.bind.annotation.XmlLocation;
import org.xml.sax.Locator;


/**
 * <p>nofiType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="nofiType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded">
 *         &lt;element name="value">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="minIncrease" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                 &lt;attribute name="maxDecrease" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                 &lt;attribute name="thresIncrease" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                 &lt;attribute name="creationMode" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="restict"/>
 *                       &lt;enumeration value="keep"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="condition" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="taskId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "nofiType", propOrder = {
    "value"
})
public class NofiType implements Visitable, Locatable
{

    @XmlElement(required = true)
    protected List<NofiType.Value> value;
    @XmlAttribute(name = "taskId", required = true)
    protected String taskId;
    @XmlLocation
    @XmlTransient
    protected Locator locator;

    /**
     * Gets the value of the value property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the value property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NofiType.Value }
     * 
     * 
     */
    public List<NofiType.Value> getValue() {
        if (value == null) {
            value = new ArrayList<NofiType.Value>();
        }
        return this.value;
    }

    /**
     * 获取taskId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskId() {
        return taskId;
    }

    /**
     * 设置taskId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskId(String value) {
        this.taskId = value;
    }

    public Locator sourceLocation() {
        return locator;
    }

    public void setSourceLocation(Locator newLocator) {
        locator = newLocator;
    }

    public void accept(Visitor aVisitor) {
        aVisitor.visit(this);
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="minIncrease" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *       &lt;attribute name="maxDecrease" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *       &lt;attribute name="thresIncrease" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *       &lt;attribute name="creationMode" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="restict"/>
     *             &lt;enumeration value="keep"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="condition" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Value implements Visitable, Locatable
    {

        @XmlAttribute(name = "minIncrease", required = true)
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger minIncrease;
        @XmlAttribute(name = "maxDecrease", required = true)
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger maxDecrease;
        @XmlAttribute(name = "thresIncrease", required = true)
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger thresIncrease;
        @XmlAttribute(name = "creationMode", required = true)
        protected String creationMode;
        @XmlAttribute(name = "condition", required = true)
        protected String condition;
        @XmlLocation
        @XmlTransient
        protected Locator locator;

        /**
         * 获取minIncrease属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMinIncrease() {
            return minIncrease;
        }

        /**
         * 设置minIncrease属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMinIncrease(BigInteger value) {
            this.minIncrease = value;
        }

        /**
         * 获取maxDecrease属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMaxDecrease() {
            return maxDecrease;
        }

        /**
         * 设置maxDecrease属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMaxDecrease(BigInteger value) {
            this.maxDecrease = value;
        }

        /**
         * 获取thresIncrease属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getThresIncrease() {
            return thresIncrease;
        }

        /**
         * 设置thresIncrease属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setThresIncrease(BigInteger value) {
            this.thresIncrease = value;
        }

        /**
         * 获取creationMode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCreationMode() {
            return creationMode;
        }

        /**
         * 设置creationMode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCreationMode(String value) {
            this.creationMode = value;
        }

        /**
         * 获取condition属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCondition() {
            return condition;
        }

        /**
         * 设置condition属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCondition(String value) {
            this.condition = value;
        }

        public Locator sourceLocation() {
            return locator;
        }

        public void setSourceLocation(Locator newLocator) {
            locator = newLocator;
        }

        public void accept(Visitor aVisitor) {
            aVisitor.visit(this);
        }

    }

}
