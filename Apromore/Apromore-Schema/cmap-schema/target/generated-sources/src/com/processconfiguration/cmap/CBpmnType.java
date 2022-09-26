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
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.sun.xml.bind.Locatable;
import com.sun.xml.bind.annotation.XmlLocation;
import org.xml.sax.Locator;


/**
 * <p>c-bpmnType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="c-bpmnType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="configurable">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="configuration" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="condition" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="type" type="{http://www.processconfiguration.com/CMAP}tGatewayType" />
 *                           &lt;attribute name="sourceRefs" type="{http://www.w3.org/2001/XMLSchema}NMTOKENS" />
 *                           &lt;attribute name="targetRefs" type="{http://www.w3.org/2001/XMLSchema}NMTOKENS" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="bpmnid" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="href" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "c-bpmnType", propOrder = {
    "configurable"
})
public class CBpmnType implements Visitable, Locatable
{

    protected List<CBpmnType.Configurable> configurable;
    @XmlAttribute(name = "href")
    @XmlSchemaType(name = "anyURI")
    protected String href;
    @XmlLocation
    @XmlTransient
    protected Locator locator;

    /**
     * Gets the value of the configurable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the configurable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConfigurable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CBpmnType.Configurable }
     * 
     * 
     */
    public List<CBpmnType.Configurable> getConfigurable() {
        if (configurable == null) {
            configurable = new ArrayList<CBpmnType.Configurable>();
        }
        return this.configurable;
    }

    /**
     * 获取href属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHref() {
        return href;
    }

    /**
     * 设置href属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHref(String value) {
        this.href = value;
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
     *       &lt;sequence>
     *         &lt;element name="configuration" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="condition" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="type" type="{http://www.processconfiguration.com/CMAP}tGatewayType" />
     *                 &lt;attribute name="sourceRefs" type="{http://www.w3.org/2001/XMLSchema}NMTOKENS" />
     *                 &lt;attribute name="targetRefs" type="{http://www.w3.org/2001/XMLSchema}NMTOKENS" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="bpmnid" type="{http://www.w3.org/2001/XMLSchema}ID" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "configuration"
    })
    public static class Configurable implements Visitable, Locatable
    {

        protected List<CBpmnType.Configurable.Configuration> configuration;
        @XmlAttribute(name = "bpmnid")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        @XmlSchemaType(name = "ID")
        protected String bpmnid;
        @XmlLocation
        @XmlTransient
        protected Locator locator;

        /**
         * Gets the value of the configuration property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the configuration property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getConfiguration().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CBpmnType.Configurable.Configuration }
         * 
         * 
         */
        public List<CBpmnType.Configurable.Configuration> getConfiguration() {
            if (configuration == null) {
                configuration = new ArrayList<CBpmnType.Configurable.Configuration>();
            }
            return this.configuration;
        }

        /**
         * 获取bpmnid属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBpmnid() {
            return bpmnid;
        }

        /**
         * 设置bpmnid属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBpmnid(String value) {
            this.bpmnid = value;
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
         *       &lt;attribute name="condition" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="type" type="{http://www.processconfiguration.com/CMAP}tGatewayType" />
         *       &lt;attribute name="sourceRefs" type="{http://www.w3.org/2001/XMLSchema}NMTOKENS" />
         *       &lt;attribute name="targetRefs" type="{http://www.w3.org/2001/XMLSchema}NMTOKENS" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Configuration implements Visitable, Locatable
        {

            @XmlAttribute(name = "condition")
            protected String condition;
            @XmlAttribute(name = "type")
            protected TGatewayType type;
            @XmlAttribute(name = "sourceRefs")
            @XmlSchemaType(name = "NMTOKENS")
            protected List<String> sourceRefs;
            @XmlAttribute(name = "targetRefs")
            @XmlSchemaType(name = "NMTOKENS")
            protected List<String> targetRefs;
            @XmlLocation
            @XmlTransient
            protected Locator locator;

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

            /**
             * 获取type属性的值。
             * 
             * @return
             *     possible object is
             *     {@link TGatewayType }
             *     
             */
            public TGatewayType getType() {
                return type;
            }

            /**
             * 设置type属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link TGatewayType }
             *     
             */
            public void setType(TGatewayType value) {
                this.type = value;
            }

            /**
             * Gets the value of the sourceRefs property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the sourceRefs property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSourceRefs().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getSourceRefs() {
                if (sourceRefs == null) {
                    sourceRefs = new ArrayList<String>();
                }
                return this.sourceRefs;
            }

            /**
             * Gets the value of the targetRefs property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the targetRefs property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getTargetRefs().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getTargetRefs() {
                if (targetRefs == null) {
                    targetRefs = new ArrayList<String>();
                }
                return this.targetRefs;
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

}
