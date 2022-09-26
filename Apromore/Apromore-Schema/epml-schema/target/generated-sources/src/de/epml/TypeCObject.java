//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.04.18 时间 02:49:26 PM CST 
//


package de.epml;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>typeCObject complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="typeCObject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice minOccurs="0">
 *         &lt;element name="configuration">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="optionality">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="mnd"/>
 *                       &lt;enumeration value="off"/>
 *                       &lt;enumeration value="opt"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="specialization" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                 &lt;attribute name="usage">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="use"/>
 *                       &lt;enumeration value="cns"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeCObject", propOrder = {
    "configuration"
})
public class TypeCObject {

    protected TypeCObject.Configuration configuration;

    /**
     * 获取configuration属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TypeCObject.Configuration }
     *     
     */
    public TypeCObject.Configuration getConfiguration() {
        return configuration;
    }

    /**
     * 设置configuration属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeCObject.Configuration }
     *     
     */
    public void setConfiguration(TypeCObject.Configuration value) {
        this.configuration = value;
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
     *       &lt;attribute name="optionality">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="mnd"/>
     *             &lt;enumeration value="off"/>
     *             &lt;enumeration value="opt"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="specialization" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *       &lt;attribute name="usage">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="use"/>
     *             &lt;enumeration value="cns"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Configuration {

        @XmlAttribute(name = "optionality")
        protected String optionality;
        @XmlAttribute(name = "specialization")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger specialization;
        @XmlAttribute(name = "usage")
        protected String usage;

        /**
         * 获取optionality属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOptionality() {
            return optionality;
        }

        /**
         * 设置optionality属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOptionality(String value) {
            this.optionality = value;
        }

        /**
         * 获取specialization属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getSpecialization() {
            return specialization;
        }

        /**
         * 设置specialization属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setSpecialization(BigInteger value) {
            this.specialization = value;
        }

        /**
         * 获取usage属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUsage() {
            return usage;
        }

        /**
         * 设置usage属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUsage(String value) {
            this.usage = value;
        }

    }

}
