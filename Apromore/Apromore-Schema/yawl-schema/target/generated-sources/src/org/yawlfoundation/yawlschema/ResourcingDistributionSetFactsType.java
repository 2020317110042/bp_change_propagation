//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.04.18 at 02:49:38 下午 CST 
//


package org.yawlfoundation.yawlschema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResourcingDistributionSetFactsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResourcingDistributionSetFactsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="initialSet">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.yawlfoundation.org/yawlschema}ResourcingSetFactsType">
 *                 &lt;sequence>
 *                   &lt;element name="param" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="name" type="{http://www.yawlfoundation.org/yawlschema}NameType"/>
 *                             &lt;element name="refers" type="{http://www.yawlfoundation.org/yawlschema}ResourcingResourceType"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="filters" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="filter" type="{http://www.yawlfoundation.org/yawlschema}ResourcingSelectorFactsType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="constraints" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="constraint" type="{http://www.yawlfoundation.org/yawlschema}ResourcingSelectorFactsType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResourcingDistributionSetFactsType", propOrder = {
    "initialSet",
    "filters",
    "constraints"
})
public class ResourcingDistributionSetFactsType {

    @XmlElement(required = true)
    protected ResourcingDistributionSetFactsType.InitialSet initialSet;
    protected ResourcingDistributionSetFactsType.Filters filters;
    protected ResourcingDistributionSetFactsType.Constraints constraints;

    /**
     * Gets the value of the initialSet property.
     * 
     * @return
     *     possible object is
     *     {@link ResourcingDistributionSetFactsType.InitialSet }
     *     
     */
    public ResourcingDistributionSetFactsType.InitialSet getInitialSet() {
        return initialSet;
    }

    /**
     * Sets the value of the initialSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourcingDistributionSetFactsType.InitialSet }
     *     
     */
    public void setInitialSet(ResourcingDistributionSetFactsType.InitialSet value) {
        this.initialSet = value;
    }

    /**
     * Gets the value of the filters property.
     * 
     * @return
     *     possible object is
     *     {@link ResourcingDistributionSetFactsType.Filters }
     *     
     */
    public ResourcingDistributionSetFactsType.Filters getFilters() {
        return filters;
    }

    /**
     * Sets the value of the filters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourcingDistributionSetFactsType.Filters }
     *     
     */
    public void setFilters(ResourcingDistributionSetFactsType.Filters value) {
        this.filters = value;
    }

    /**
     * Gets the value of the constraints property.
     * 
     * @return
     *     possible object is
     *     {@link ResourcingDistributionSetFactsType.Constraints }
     *     
     */
    public ResourcingDistributionSetFactsType.Constraints getConstraints() {
        return constraints;
    }

    /**
     * Sets the value of the constraints property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourcingDistributionSetFactsType.Constraints }
     *     
     */
    public void setConstraints(ResourcingDistributionSetFactsType.Constraints value) {
        this.constraints = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="constraint" type="{http://www.yawlfoundation.org/yawlschema}ResourcingSelectorFactsType" maxOccurs="unbounded" minOccurs="0"/>
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
        "constraint"
    })
    public static class Constraints {

        protected List<ResourcingSelectorFactsType> constraint;

        /**
         * Gets the value of the constraint property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the constraint property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getConstraint().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ResourcingSelectorFactsType }
         * 
         * 
         */
        public List<ResourcingSelectorFactsType> getConstraint() {
            if (constraint == null) {
                constraint = new ArrayList<ResourcingSelectorFactsType>();
            }
            return this.constraint;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="filter" type="{http://www.yawlfoundation.org/yawlschema}ResourcingSelectorFactsType" maxOccurs="unbounded" minOccurs="0"/>
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
        "filter"
    })
    public static class Filters {

        protected List<ResourcingSelectorFactsType> filter;

        /**
         * Gets the value of the filter property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the filter property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFilter().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ResourcingSelectorFactsType }
         * 
         * 
         */
        public List<ResourcingSelectorFactsType> getFilter() {
            if (filter == null) {
                filter = new ArrayList<ResourcingSelectorFactsType>();
            }
            return this.filter;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.yawlfoundation.org/yawlschema}ResourcingSetFactsType">
     *       &lt;sequence>
     *         &lt;element name="param" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="name" type="{http://www.yawlfoundation.org/yawlschema}NameType"/>
     *                   &lt;element name="refers" type="{http://www.yawlfoundation.org/yawlschema}ResourcingResourceType"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "param"
    })
    public static class InitialSet
        extends ResourcingSetFactsType
    {

        protected List<ResourcingDistributionSetFactsType.InitialSet.Param> param;

        /**
         * Gets the value of the param property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the param property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getParam().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ResourcingDistributionSetFactsType.InitialSet.Param }
         * 
         * 
         */
        public List<ResourcingDistributionSetFactsType.InitialSet.Param> getParam() {
            if (param == null) {
                param = new ArrayList<ResourcingDistributionSetFactsType.InitialSet.Param>();
            }
            return this.param;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="name" type="{http://www.yawlfoundation.org/yawlschema}NameType"/>
         *         &lt;element name="refers" type="{http://www.yawlfoundation.org/yawlschema}ResourcingResourceType"/>
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
            "name",
            "refers"
        })
        public static class Param {

            @XmlElement(required = true)
            protected String name;
            @XmlElement(required = true)
            protected ResourcingResourceType refers;

            /**
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getName() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setName(String value) {
                this.name = value;
            }

            /**
             * Gets the value of the refers property.
             * 
             * @return
             *     possible object is
             *     {@link ResourcingResourceType }
             *     
             */
            public ResourcingResourceType getRefers() {
                return refers;
            }

            /**
             * Sets the value of the refers property.
             * 
             * @param value
             *     allowed object is
             *     {@link ResourcingResourceType }
             *     
             */
            public void setRefers(ResourcingResourceType value) {
                this.refers = value;
            }

        }

    }

}