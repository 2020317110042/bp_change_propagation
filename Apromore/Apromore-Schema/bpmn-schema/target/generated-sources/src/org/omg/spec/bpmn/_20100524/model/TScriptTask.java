//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.04.18 时间 02:49:16 PM CST 
//


package org.omg.spec.bpmn._20100524.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>tScriptTask complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="tScriptTask">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.omg.org/spec/BPMN/20100524/MODEL}tTask">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}script" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="scriptFormat" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tScriptTask", propOrder = {
    "script"
})
public class TScriptTask
    extends TTask
    implements Visitable
{

    protected TScript script;
    @XmlAttribute(name = "scriptFormat")
    protected String scriptFormat;

    /**
     * 获取script属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TScript }
     *     
     */
    public TScript getScript() {
        return script;
    }

    /**
     * 设置script属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TScript }
     *     
     */
    public void setScript(TScript value) {
        this.script = value;
    }

    /**
     * 获取scriptFormat属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScriptFormat() {
        return scriptFormat;
    }

    /**
     * 设置scriptFormat属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScriptFormat(String value) {
        this.scriptFormat = value;
    }

    public void accept(Visitor aVisitor) {
        aVisitor.visit(this);
    }

}
