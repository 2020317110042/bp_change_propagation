//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.04.18 时间 02:49:31 PM CST 
//


package org.apromore.rlf;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.apromore.rlf package. 
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

    private final static QName _Relations_QNAME = new QName("http://www.apromore.org/RLF", "Relations");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.apromore.rlf
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RelationsType }
     * 
     */
    public RelationsType createRelationsType() {
        return new RelationsType();
    }

    /**
     * Create an instance of {@link RelationType }
     * 
     */
    public RelationType createRelationType() {
        return new RelationType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RelationsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.apromore.org/RLF", name = "Relations")
    public JAXBElement<RelationsType> createRelations(RelationsType value) {
        return new JAXBElement<RelationsType>(_Relations_QNAME, RelationsType.class, null, value);
    }

}
