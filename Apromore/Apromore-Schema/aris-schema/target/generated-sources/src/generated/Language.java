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
import javax.xml.bind.annotation.XmlID;
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
 *       &lt;sequence>
 *         &lt;element ref="{}LanguageName" minOccurs="0"/>
 *         &lt;element ref="{}LogFont" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Language.ID" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="LocaleId" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="Codepage" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "languageName",
    "logFont"
})
@XmlRootElement(name = "Language")
public class Language
    implements Visitable
{

    @XmlElement(name = "LanguageName")
    protected String languageName;
    @XmlElement(name = "LogFont")
    protected LogFont logFont;
    @XmlAttribute(name = "Language.ID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String languageID;
    @XmlAttribute(name = "LocaleId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String localeId;
    @XmlAttribute(name = "Codepage", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String codepage;

    /**
     * 获取languageName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageName() {
        return languageName;
    }

    /**
     * 设置languageName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageName(String value) {
        this.languageName = value;
    }

    /**
     * 获取logFont属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LogFont }
     *     
     */
    public LogFont getLogFont() {
        return logFont;
    }

    /**
     * 设置logFont属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LogFont }
     *     
     */
    public void setLogFont(LogFont value) {
        this.logFont = value;
    }

    /**
     * 获取languageID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageID() {
        return languageID;
    }

    /**
     * 设置languageID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageID(String value) {
        this.languageID = value;
    }

    /**
     * 获取localeId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocaleId() {
        return localeId;
    }

    /**
     * 设置localeId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocaleId(String value) {
        this.localeId = value;
    }

    /**
     * 获取codepage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodepage() {
        return codepage;
    }

    /**
     * 设置codepage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodepage(String value) {
        this.codepage = value;
    }

    public void accept(Visitor aVisitor) {
        aVisitor.visit(this);
    }

}
