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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 *       &lt;sequence>
 *         &lt;element ref="{}Position"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Shaded" default="NO">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="YES"/>
 *             &lt;enumeration value="NO"/>
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
@XmlType(name = "", propOrder = {
    "position"
})
@XmlRootElement(name = "RoundedRectangle")
public class RoundedRectangle
    implements Visitable
{

    @XmlElement(name = "Position", required = true)
    protected Position position;
    @XmlAttribute(name = "Shaded")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String shaded;

    /**
     * 获取position属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getPosition() {
        return position;
    }

    /**
     * 设置position属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setPosition(Position value) {
        this.position = value;
    }

    /**
     * 获取shaded属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShaded() {
        if (shaded == null) {
            return "NO";
        } else {
            return shaded;
        }
    }

    /**
     * 设置shaded属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShaded(String value) {
        this.shaded = value;
    }

    public void accept(Visitor aVisitor) {
        aVisitor.visit(this);
    }

}
