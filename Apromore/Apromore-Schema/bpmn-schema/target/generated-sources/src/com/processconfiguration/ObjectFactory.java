//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.04.18 时间 02:49:16 PM CST 
//


package com.processconfiguration;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.processconfiguration package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.processconfiguration
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Variants }
     * 
     */
    public Variants createVariants() {
        return new Variants();
    }

    /**
     * Create an instance of {@link ConfigurationAnnotation }
     * 
     */
    public ConfigurationAnnotation createConfigurationAnnotation() {
        return new ConfigurationAnnotation();
    }

    /**
     * Create an instance of {@link Configurable }
     * 
     */
    public Configurable createConfigurable() {
        return new Configurable();
    }

    /**
     * Create an instance of {@link ConfigurationAnnotationAssociation }
     * 
     */
    public ConfigurationAnnotationAssociation createConfigurationAnnotationAssociation() {
        return new ConfigurationAnnotationAssociation();
    }

    /**
     * Create an instance of {@link ConfigurationAnnotationShape }
     * 
     */
    public ConfigurationAnnotationShape createConfigurationAnnotationShape() {
        return new ConfigurationAnnotationShape();
    }

    /**
     * Create an instance of {@link Variants.Variant }
     * 
     */
    public Variants.Variant createVariantsVariant() {
        return new Variants.Variant();
    }

    /**
     * Create an instance of {@link ConfigurationAnnotation.Configuration }
     * 
     */
    public ConfigurationAnnotation.Configuration createConfigurationAnnotationConfiguration() {
        return new ConfigurationAnnotation.Configuration();
    }

    /**
     * Create an instance of {@link Configurable.Configuration }
     * 
     */
    public Configurable.Configuration createConfigurableConfiguration() {
        return new Configurable.Configuration();
    }

    /**
     * Create an instance of {@link ConfigurationMapping }
     * 
     */
    public ConfigurationMapping createConfigurationMapping() {
        return new ConfigurationMapping();
    }

}
