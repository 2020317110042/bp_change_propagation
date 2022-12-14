//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.04.18 时间 02:49:26 PM CST 
//


package de.epml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>typeDefinitions complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="typeDefinitions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="definition" type="{http://www.epml.de}typeDefinition"/>
 *           &lt;element name="specialization" type="{http://www.epml.de}typeSpecialization"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeDefinitions", propOrder = {
    "definitionOrSpecialization"
})
public class TypeDefinitions {

    @XmlElements({
        @XmlElement(name = "definition", type = TypeDefinition.class),
        @XmlElement(name = "specialization", type = TypeSpecialization.class)
    })
    protected List<TExtensibleElements> definitionOrSpecialization;

    /**
     * Gets the value of the definitionOrSpecialization property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the definitionOrSpecialization property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDefinitionOrSpecialization().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeDefinition }
     * {@link TypeSpecialization }
     * 
     * 
     */
    public List<TExtensibleElements> getDefinitionOrSpecialization() {
        if (definitionOrSpecialization == null) {
            definitionOrSpecialization = new ArrayList<TExtensibleElements>();
        }
        return this.definitionOrSpecialization;
    }

}
