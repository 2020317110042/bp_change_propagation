//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.04.18 时间 02:49:21 PM CST 
//


package com.processconfiguration.cmap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import com.sun.xml.bind.Locatable;
import com.sun.xml.bind.annotation.XmlLocation;
import org.xml.sax.Locator;


/**
 * <p>c-epcType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="c-epcType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="COR" type="{http://www.processconfiguration.com/CMAP}CORType"/>
 *         &lt;element name="CXOR" type="{http://www.processconfiguration.com/CMAP}CXORType"/>
 *         &lt;element name="CAND" type="{http://www.processconfiguration.com/CMAP}CANDType"/>
 *         &lt;element name="CFunction" type="{http://www.processconfiguration.com/CMAP}CFunctionType"/>
 *       &lt;/choice>
 *       &lt;attribute name="epml" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "c-epcType", propOrder = {
    "corOrCXOROrCAND"
})
public class CEpcType implements Visitable, Locatable
{

    @XmlElements({
        @XmlElement(name = "COR", type = CORType.class),
        @XmlElement(name = "CXOR", type = CXORType.class),
        @XmlElement(name = "CAND", type = CANDType.class),
        @XmlElement(name = "CFunction", type = CFunctionType.class)
    })
    protected List<Object> corOrCXOROrCAND;
    @XmlAttribute(name = "epml")
    protected String epml;
    @XmlLocation
    @XmlTransient
    protected Locator locator;

    /**
     * Gets the value of the corOrCXOROrCAND property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the corOrCXOROrCAND property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCOROrCXOROrCAND().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CORType }
     * {@link CXORType }
     * {@link CANDType }
     * {@link CFunctionType }
     * 
     * 
     */
    public List<Object> getCOROrCXOROrCAND() {
        if (corOrCXOROrCAND == null) {
            corOrCXOROrCAND = new ArrayList<Object>();
        }
        return this.corOrCXOROrCAND;
    }

    /**
     * 获取epml属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEpml() {
        return epml;
    }

    /**
     * 设置epml属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEpml(String value) {
        this.epml = value;
    }

    public Locator sourceLocation() {
        return locator;
    }

    public void setSourceLocation(Locator newLocator) {
        locator = newLocator;
    }

    public void accept(Visitor aVisitor) {
        aVisitor.visit(this);
    }

}
