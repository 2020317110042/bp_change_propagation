//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.04.18 时间 02:49:13 PM CST 
//


package generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;sequence>
 *           &lt;element ref="{}BackGroundColor"/>
 *           &lt;element ref="{}StyledElement" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;sequence>
 *           &lt;element ref="{}Bold"/>
 *           &lt;element ref="{}StyledElement" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;sequence>
 *           &lt;element ref="{}Container"/>
 *           &lt;element ref="{}StyledElement" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;sequence>
 *           &lt;element ref="{}Enumeration"/>
 *           &lt;element ref="{}StyledElement" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;sequence>
 *           &lt;element ref="{}Font"/>
 *           &lt;element ref="{}StyledElement" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;sequence>
 *           &lt;element ref="{}Italic"/>
 *           &lt;element ref="{}StyledElement" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;element ref="{}SoftHyphen"/>
 *         &lt;element ref="{}LineBreak"/>
 *         &lt;sequence>
 *           &lt;element ref="{}Paragraph"/>
 *           &lt;element ref="{}StyledElement" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;element ref="{}PlainText"/>
 *         &lt;sequence>
 *           &lt;element ref="{}SizeElement"/>
 *           &lt;element ref="{}StyledElement" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;sequence>
 *           &lt;element ref="{}StrikeThrough"/>
 *           &lt;element ref="{}StyledElement" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;sequence>
 *           &lt;element ref="{}TextColor"/>
 *           &lt;element ref="{}StyledElement" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;sequence>
 *           &lt;element ref="{}Underline"/>
 *           &lt;element ref="{}StyledElement" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "content"
})
@XmlRootElement(name = "StyledElement")
public class StyledElement implements Visitable
{

    @XmlElementRefs({
        @XmlElementRef(name = "StyledElement", type = StyledElement.class, required = false),
        @XmlElementRef(name = "LineBreak", type = LineBreak.class, required = false),
        @XmlElementRef(name = "Bold", type = Bold.class, required = false),
        @XmlElementRef(name = "Paragraph", type = Paragraph.class, required = false),
        @XmlElementRef(name = "PlainText", type = PlainText.class, required = false),
        @XmlElementRef(name = "Font", type = Font.class, required = false),
        @XmlElementRef(name = "Italic", type = Italic.class, required = false),
        @XmlElementRef(name = "SizeElement", type = SizeElement.class, required = false),
        @XmlElementRef(name = "Container", type = Container.class, required = false),
        @XmlElementRef(name = "Underline", type = Underline.class, required = false),
        @XmlElementRef(name = "TextColor", type = TextColor.class, required = false),
        @XmlElementRef(name = "BackGroundColor", type = BackGroundColor.class, required = false),
        @XmlElementRef(name = "SoftHyphen", type = SoftHyphen.class, required = false),
        @XmlElementRef(name = "StrikeThrough", type = StrikeThrough.class, required = false),
        @XmlElementRef(name = "Enumeration", type = Enumeration.class, required = false)
    })
    protected List<Object> content;

    /**
     * 获取内容模型的其余部分。
     * 
     * <p>
     * 由于以下原因, 您获取的是此 "catch-all" 属性: 
     * 字段名称 "StyledElement" 由模式的两个不同部分使用。请参阅: 
     * file:/D:/Apromore/Apromore-Schema/aris-schema/src/main/resources/xsd/ARIS-Export.xsd的第 431 行
     * file:/D:/Apromore/Apromore-Schema/aris-schema/src/main/resources/xsd/ARIS-Export.xsd的第 427 行
     * <p>
     * 要清除此属性, 请将属性定制设置应用于以下两个声明
     * 或其中一个以更改其名称: 
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StyledElement }
     * {@link LineBreak }
     * {@link Bold }
     * {@link Paragraph }
     * {@link PlainText }
     * {@link Font }
     * {@link Italic }
     * {@link SizeElement }
     * {@link Container }
     * {@link Underline }
     * {@link TextColor }
     * {@link BackGroundColor }
     * {@link SoftHyphen }
     * {@link StrikeThrough }
     * {@link Enumeration }
     * 
     * 
     */
    public List<Object> getContent() {
        if (content == null) {
            content = new ArrayList<Object>();
        }
        return this.content;
    }

    public void accept(Visitor aVisitor) {
        aVisitor.visit(this);
    }

}
