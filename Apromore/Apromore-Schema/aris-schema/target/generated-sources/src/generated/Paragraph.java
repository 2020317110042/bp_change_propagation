//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.04.18 时间 02:49:13 PM CST 
//


package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Alignment" default="UNDEFINED">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="LEFT"/>
 *             &lt;enumeration value="CENTER"/>
 *             &lt;enumeration value="RIGHT"/>
 *             &lt;enumeration value="UNDEFINED"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Indent" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "Paragraph")
public class Paragraph implements Visitable
{

    @XmlAttribute(name = "Alignment")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String alignment;
    @XmlAttribute(name = "Indent")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String indent;

    /**
     * 获取alignment属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlignment() {
        if (alignment == null) {
            return "UNDEFINED";
        } else {
            return alignment;
        }
    }

    /**
     * 设置alignment属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlignment(String value) {
        this.alignment = value;
    }

    /**
     * 获取indent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndent() {
        return indent;
    }

    /**
     * 设置indent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndent(String value) {
        this.indent = value;
    }

    public void accept(Visitor aVisitor) {
        aVisitor.visit(this);
    }

}
