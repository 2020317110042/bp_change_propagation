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
 * <p>typeCRange complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="typeCRange">
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
 *                 &lt;attribute name="range">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="node"/>
 *                       &lt;enumeration value="reducedRange"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="goto" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                 &lt;attribute name="increment">
 *                   &lt;simpleType>
 *                     &lt;union memberTypes=" {http://www.w3.org/2001/XMLSchema}nonNegativeInteger">
 *                       &lt;simpleType>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                           &lt;enumeration value="k"/>
 *                         &lt;/restriction>
 *                       &lt;/simpleType>
 *                     &lt;/union>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="decrement">
 *                   &lt;simpleType>
 *                     &lt;union memberTypes=" {http://www.w3.org/2001/XMLSchema}nonNegativeInteger">
 *                       &lt;simpleType>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                           &lt;enumeration value="k"/>
 *                         &lt;/restriction>
 *                       &lt;/simpleType>
 *                     &lt;/union>
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
@XmlType(name = "typeCRange", propOrder = {
    "configuration"
})
public class TypeCRange {

    protected TypeCRange.Configuration configuration;

    /**
     * 获取configuration属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TypeCRange.Configuration }
     *     
     */
    public TypeCRange.Configuration getConfiguration() {
        return configuration;
    }

    /**
     * 设置configuration属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TypeCRange.Configuration }
     *     
     */
    public void setConfiguration(TypeCRange.Configuration value) {
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
     *       &lt;attribute name="range">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="node"/>
     *             &lt;enumeration value="reducedRange"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="goto" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *       &lt;attribute name="increment">
     *         &lt;simpleType>
     *           &lt;union memberTypes=" {http://www.w3.org/2001/XMLSchema}nonNegativeInteger">
     *             &lt;simpleType>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                 &lt;enumeration value="k"/>
     *               &lt;/restriction>
     *             &lt;/simpleType>
     *           &lt;/union>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="decrement">
     *         &lt;simpleType>
     *           &lt;union memberTypes=" {http://www.w3.org/2001/XMLSchema}nonNegativeInteger">
     *             &lt;simpleType>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                 &lt;enumeration value="k"/>
     *               &lt;/restriction>
     *             &lt;/simpleType>
     *           &lt;/union>
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
        @XmlAttribute(name = "range")
        protected String range;
        @XmlAttribute(name = "goto")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger _goto;
        @XmlAttribute(name = "increment")
        protected String increment;
        @XmlAttribute(name = "decrement")
        protected String decrement;

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
         * 获取range属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRange() {
            return range;
        }

        /**
         * 设置range属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRange(String value) {
            this.range = value;
        }

        /**
         * 获取goto属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getGoto() {
            return _goto;
        }

        /**
         * 设置goto属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setGoto(BigInteger value) {
            this._goto = value;
        }

        /**
         * 获取increment属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIncrement() {
            return increment;
        }

        /**
         * 设置increment属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIncrement(String value) {
            this.increment = value;
        }

        /**
         * 获取decrement属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDecrement() {
            return decrement;
        }

        /**
         * 设置decrement属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDecrement(String value) {
            this.decrement = value;
        }

    }

}
