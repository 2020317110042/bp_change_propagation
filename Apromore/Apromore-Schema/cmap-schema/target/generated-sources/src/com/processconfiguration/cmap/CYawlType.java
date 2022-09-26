//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.04.18 时间 02:49:21 PM CST 
//


package com.processconfiguration.cmap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import com.sun.xml.bind.Locatable;
import com.sun.xml.bind.annotation.XmlLocation;
import org.xml.sax.Locator;


/**
 * <p>c-yawlType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="c-yawlType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="splits">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element name="port" type="{http://www.processconfiguration.com/CMAP}splitPortType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="joins">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element name="port" type="{http://www.processconfiguration.com/CMAP}joinPortType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="rems">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element name="rem" type="{http://www.processconfiguration.com/CMAP}remType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="nofis">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element name="nofi" type="{http://www.processconfiguration.com/CMAP}nofiType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="yawl" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "c-yawlType", propOrder = {
    "splits",
    "joins",
    "rems",
    "nofis"
})
public class CYawlType implements Visitable, Locatable
{

    @XmlElement(required = true)
    protected CYawlType.Splits splits;
    @XmlElement(required = true)
    protected CYawlType.Joins joins;
    @XmlElement(required = true)
    protected CYawlType.Rems rems;
    @XmlElement(required = true)
    protected CYawlType.Nofis nofis;
    @XmlAttribute(name = "yawl")
    protected String yawl;
    @XmlLocation
    @XmlTransient
    protected Locator locator;

    /**
     * 获取splits属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CYawlType.Splits }
     *     
     */
    public CYawlType.Splits getSplits() {
        return splits;
    }

    /**
     * 设置splits属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CYawlType.Splits }
     *     
     */
    public void setSplits(CYawlType.Splits value) {
        this.splits = value;
    }

    /**
     * 获取joins属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CYawlType.Joins }
     *     
     */
    public CYawlType.Joins getJoins() {
        return joins;
    }

    /**
     * 设置joins属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CYawlType.Joins }
     *     
     */
    public void setJoins(CYawlType.Joins value) {
        this.joins = value;
    }

    /**
     * 获取rems属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CYawlType.Rems }
     *     
     */
    public CYawlType.Rems getRems() {
        return rems;
    }

    /**
     * 设置rems属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CYawlType.Rems }
     *     
     */
    public void setRems(CYawlType.Rems value) {
        this.rems = value;
    }

    /**
     * 获取nofis属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CYawlType.Nofis }
     *     
     */
    public CYawlType.Nofis getNofis() {
        return nofis;
    }

    /**
     * 设置nofis属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CYawlType.Nofis }
     *     
     */
    public void setNofis(CYawlType.Nofis value) {
        this.nofis = value;
    }

    /**
     * 获取yawl属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYawl() {
        return yawl;
    }

    /**
     * 设置yawl属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYawl(String value) {
        this.yawl = value;
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
     *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
     *         &lt;element name="port" type="{http://www.processconfiguration.com/CMAP}joinPortType"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "port"
    })
    public static class Joins implements Visitable, Locatable
    {

        protected List<JoinPortType> port;
        @XmlLocation
        @XmlTransient
        protected Locator locator;

        /**
         * Gets the value of the port property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the port property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPort().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link JoinPortType }
         * 
         * 
         */
        public List<JoinPortType> getPort() {
            if (port == null) {
                port = new ArrayList<JoinPortType>();
            }
            return this.port;
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


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
     *         &lt;element name="nofi" type="{http://www.processconfiguration.com/CMAP}nofiType"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "nofi"
    })
    public static class Nofis implements Visitable, Locatable
    {

        protected List<NofiType> nofi;
        @XmlLocation
        @XmlTransient
        protected Locator locator;

        /**
         * Gets the value of the nofi property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the nofi property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNofi().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link NofiType }
         * 
         * 
         */
        public List<NofiType> getNofi() {
            if (nofi == null) {
                nofi = new ArrayList<NofiType>();
            }
            return this.nofi;
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


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
     *         &lt;element name="rem" type="{http://www.processconfiguration.com/CMAP}remType"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "rem"
    })
    public static class Rems implements Visitable, Locatable
    {

        protected List<RemType> rem;
        @XmlLocation
        @XmlTransient
        protected Locator locator;

        /**
         * Gets the value of the rem property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the rem property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RemType }
         * 
         * 
         */
        public List<RemType> getRem() {
            if (rem == null) {
                rem = new ArrayList<RemType>();
            }
            return this.rem;
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


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
     *         &lt;element name="port" type="{http://www.processconfiguration.com/CMAP}splitPortType"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "port"
    })
    public static class Splits implements Visitable, Locatable
    {

        protected List<SplitPortType> port;
        @XmlLocation
        @XmlTransient
        protected Locator locator;

        /**
         * Gets the value of the port property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the port property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPort().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SplitPortType }
         * 
         * 
         */
        public List<SplitPortType> getPort() {
            if (port == null) {
                port = new ArrayList<SplitPortType>();
            }
            return this.port;
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
