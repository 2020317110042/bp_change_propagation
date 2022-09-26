//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.04.18 时间 02:49:16 PM CST 
//


package com.signavio;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.signavio package. 
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

    private final static QName _SignavioType_QNAME = new QName("http://www.signavio.com", "signavioType");
    private final static QName _SignavioLabel_QNAME = new QName("http://www.signavio.com", "signavioLabel");
    private final static QName _SignavioMessageName_QNAME = new QName("http://www.signavio.com", "signavioMessageName");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.signavio
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SignavioMetaData }
     * 
     */
    public SignavioMetaData createSignavioMetaData() {
        return new SignavioMetaData();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.signavio.com", name = "signavioType")
    public JAXBElement<Object> createSignavioType(Object value) {
        return new JAXBElement<Object>(_SignavioType_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.signavio.com", name = "signavioLabel")
    public JAXBElement<Object> createSignavioLabel(Object value) {
        return new JAXBElement<Object>(_SignavioLabel_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.signavio.com", name = "signavioMessageName")
    public JAXBElement<Object> createSignavioMessageName(Object value) {
        return new JAXBElement<Object>(_SignavioMessageName_QNAME, Object.class, null, value);
    }

}
