//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.04.18 时间 02:49:28 PM CST 
//


package org.apromore.pnml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * 
 *                 XSD Authors: The child element correlations needs to be a Local Element Declaration,
 *                 because there is another correlations element defined for the non-invoke activities.
 *             
 * 
 * <p>tInvoke complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="tInvoke">
 *   &lt;complexContent>
 *     &lt;extension base="{pnml.apromore.org}tActivity">
 *       &lt;sequence>
 *         &lt;element name="correlations" type="{pnml.apromore.org}tCorrelationsWithPattern" minOccurs="0"/>
 *         &lt;element ref="{pnml.apromore.org}catch" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{pnml.apromore.org}catchAll" minOccurs="0"/>
 *         &lt;element ref="{pnml.apromore.org}compensationHandler" minOccurs="0"/>
 *         &lt;element ref="{pnml.apromore.org}toParts" minOccurs="0"/>
 *         &lt;element ref="{pnml.apromore.org}fromParts" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="partnerLink" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="portType" type="{http://www.w3.org/2001/XMLSchema}QName" />
 *       &lt;attribute name="operation" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="inputVariable" type="{pnml.apromore.org}BPELVariableName" />
 *       &lt;attribute name="outputVariable" type="{pnml.apromore.org}BPELVariableName" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tInvoke", propOrder = {
    "correlations",
    "_catch",
    "catchAll",
    "compensationHandler",
    "toParts",
    "fromParts"
})
public class TInvoke
    extends TActivity
{

    protected TCorrelationsWithPattern correlations;
    @XmlElement(name = "catch")
    protected List<TCatch> _catch;
    protected TActivityContainer catchAll;
    protected TActivityContainer compensationHandler;
    protected TToParts toParts;
    protected TFromParts fromParts;
    @XmlAttribute(name = "partnerLink", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String partnerLink;
    @XmlAttribute(name = "portType")
    protected QName portType;
    @XmlAttribute(name = "operation", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String operation;
    @XmlAttribute(name = "inputVariable")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String inputVariable;
    @XmlAttribute(name = "outputVariable")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String outputVariable;

    /**
     * 获取correlations属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TCorrelationsWithPattern }
     *     
     */
    public TCorrelationsWithPattern getCorrelations() {
        return correlations;
    }

    /**
     * 设置correlations属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TCorrelationsWithPattern }
     *     
     */
    public void setCorrelations(TCorrelationsWithPattern value) {
        this.correlations = value;
    }

    /**
     * Gets the value of the catch property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the catch property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCatch().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TCatch }
     * 
     * 
     */
    public List<TCatch> getCatch() {
        if (_catch == null) {
            _catch = new ArrayList<TCatch>();
        }
        return this._catch;
    }

    /**
     * 获取catchAll属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TActivityContainer }
     *     
     */
    public TActivityContainer getCatchAll() {
        return catchAll;
    }

    /**
     * 设置catchAll属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TActivityContainer }
     *     
     */
    public void setCatchAll(TActivityContainer value) {
        this.catchAll = value;
    }

    /**
     * 获取compensationHandler属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TActivityContainer }
     *     
     */
    public TActivityContainer getCompensationHandler() {
        return compensationHandler;
    }

    /**
     * 设置compensationHandler属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TActivityContainer }
     *     
     */
    public void setCompensationHandler(TActivityContainer value) {
        this.compensationHandler = value;
    }

    /**
     * 获取toParts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TToParts }
     *     
     */
    public TToParts getToParts() {
        return toParts;
    }

    /**
     * 设置toParts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TToParts }
     *     
     */
    public void setToParts(TToParts value) {
        this.toParts = value;
    }

    /**
     * 获取fromParts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TFromParts }
     *     
     */
    public TFromParts getFromParts() {
        return fromParts;
    }

    /**
     * 设置fromParts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TFromParts }
     *     
     */
    public void setFromParts(TFromParts value) {
        this.fromParts = value;
    }

    /**
     * 获取partnerLink属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerLink() {
        return partnerLink;
    }

    /**
     * 设置partnerLink属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerLink(String value) {
        this.partnerLink = value;
    }

    /**
     * 获取portType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getPortType() {
        return portType;
    }

    /**
     * 设置portType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setPortType(QName value) {
        this.portType = value;
    }

    /**
     * 获取operation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperation() {
        return operation;
    }

    /**
     * 设置operation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperation(String value) {
        this.operation = value;
    }

    /**
     * 获取inputVariable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputVariable() {
        return inputVariable;
    }

    /**
     * 设置inputVariable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputVariable(String value) {
        this.inputVariable = value;
    }

    /**
     * 获取outputVariable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutputVariable() {
        return outputVariable;
    }

    /**
     * 设置outputVariable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutputVariable(String value) {
        this.outputVariable = value;
    }

}
