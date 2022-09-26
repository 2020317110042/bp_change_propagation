//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.04.18 时间 02:49:16 PM CST 
//


package org.omg.spec.bpmn._20100524.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;
import com.sun.xml.bind.Locatable;
import com.sun.xml.bind.annotation.XmlLocation;
import org.omg.spec.bpmn._20100524.di.BPMNDiagram;
import org.xml.sax.Locator;


/**
 * <p>tDefinitions complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="tDefinitions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}import" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}extension" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}rootElement" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/DI}BPMNDiagram" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}relationship" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="targetNamespace" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="expressionLanguage" type="{http://www.w3.org/2001/XMLSchema}anyURI" default="http://www.w3.org/1999/XPath" />
 *       &lt;attribute name="typeLanguage" type="{http://www.w3.org/2001/XMLSchema}anyURI" default="http://www.w3.org/2001/XMLSchema" />
 *       &lt;attribute name="exporter" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="exporterVersion" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tDefinitions", propOrder = {
    "_import",
    "extension",
    "rootElement",
    "bpmnDiagram",
    "relationship"
})
public class TDefinitions
    implements Locatable, Visitable
{

    @XmlElement(name = "import")
    protected List<TImport> _import;
    protected List<TExtension> extension;
    @XmlElementRef(name = "rootElement", namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", type = JAXBElement.class, required = false)
    protected List<JAXBElement<? extends TRootElement>> rootElement;
    @XmlElement(name = "BPMNDiagram", namespace = "http://www.omg.org/spec/BPMN/20100524/DI")
    protected List<BPMNDiagram> bpmnDiagram;
    protected List<TRelationship> relationship;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "targetNamespace", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String targetNamespace;
    @XmlAttribute(name = "expressionLanguage")
    @XmlSchemaType(name = "anyURI")
    protected String expressionLanguage;
    @XmlAttribute(name = "typeLanguage")
    @XmlSchemaType(name = "anyURI")
    protected String typeLanguage;
    @XmlAttribute(name = "exporter")
    protected String exporter;
    @XmlAttribute(name = "exporterVersion")
    protected String exporterVersion;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();
    @XmlLocation
    @XmlTransient
    protected Locator locator;

    /**
     * Gets the value of the import property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the import property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImport().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TImport }
     * 
     * 
     */
    public List<TImport> getImport() {
        if (_import == null) {
            _import = new ArrayList<TImport>();
        }
        return this._import;
    }

    /**
     * Gets the value of the extension property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extension property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtension().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TExtension }
     * 
     * 
     */
    public List<TExtension> getExtension() {
        if (extension == null) {
            extension = new ArrayList<TExtension>();
        }
        return this.extension;
    }

    /**
     * Gets the value of the rootElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rootElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRootElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link TCompensateEventDefinition }{@code >}
     * {@link JAXBElement }{@code <}{@link TGlobalConversation }{@code >}
     * {@link JAXBElement }{@code <}{@link TGlobalScriptTask }{@code >}
     * {@link JAXBElement }{@code <}{@link TLinkEventDefinition }{@code >}
     * {@link JAXBElement }{@code <}{@link TCorrelationProperty }{@code >}
     * {@link JAXBElement }{@code <}{@link TErrorEventDefinition }{@code >}
     * {@link JAXBElement }{@code <}{@link TItemDefinition }{@code >}
     * {@link JAXBElement }{@code <}{@link TSignalEventDefinition }{@code >}
     * {@link JAXBElement }{@code <}{@link TPartnerEntity }{@code >}
     * {@link JAXBElement }{@code <}{@link TEscalation }{@code >}
     * {@link JAXBElement }{@code <}{@link TTimerEventDefinition }{@code >}
     * {@link JAXBElement }{@code <}{@link TEndPoint }{@code >}
     * {@link JAXBElement }{@code <}{@link TEventDefinition }{@code >}
     * {@link JAXBElement }{@code <}{@link TGlobalChoreographyTask }{@code >}
     * {@link JAXBElement }{@code <}{@link TCollaboration }{@code >}
     * {@link JAXBElement }{@code <}{@link TResource }{@code >}
     * {@link JAXBElement }{@code <}{@link TError }{@code >}
     * {@link JAXBElement }{@code <}{@link TMessage }{@code >}
     * {@link JAXBElement }{@code <}{@link TConditionalEventDefinition }{@code >}
     * {@link JAXBElement }{@code <}{@link TMessageEventDefinition }{@code >}
     * {@link JAXBElement }{@code <}{@link TChoreography }{@code >}
     * {@link JAXBElement }{@code <}{@link TGlobalManualTask }{@code >}
     * {@link JAXBElement }{@code <}{@link TCancelEventDefinition }{@code >}
     * {@link JAXBElement }{@code <}{@link TEscalationEventDefinition }{@code >}
     * {@link JAXBElement }{@code <}{@link TCategory }{@code >}
     * {@link JAXBElement }{@code <}{@link TTerminateEventDefinition }{@code >}
     * {@link JAXBElement }{@code <}{@link TRootElement }{@code >}
     * {@link JAXBElement }{@code <}{@link TGlobalTask }{@code >}
     * {@link JAXBElement }{@code <}{@link TDataStore }{@code >}
     * {@link JAXBElement }{@code <}{@link TProcess }{@code >}
     * {@link JAXBElement }{@code <}{@link TGlobalUserTask }{@code >}
     * {@link JAXBElement }{@code <}{@link TGlobalBusinessRuleTask }{@code >}
     * {@link JAXBElement }{@code <}{@link TPartnerRole }{@code >}
     * {@link JAXBElement }{@code <}{@link TInterface }{@code >}
     * {@link JAXBElement }{@code <}{@link TSignal }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends TRootElement>> getRootElement() {
        if (rootElement == null) {
            rootElement = new ArrayList<JAXBElement<? extends TRootElement>>();
        }
        return this.rootElement;
    }

    /**
     * Gets the value of the bpmnDiagram property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bpmnDiagram property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBPMNDiagram().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BPMNDiagram }
     * 
     * 
     */
    public List<BPMNDiagram> getBPMNDiagram() {
        if (bpmnDiagram == null) {
            bpmnDiagram = new ArrayList<BPMNDiagram>();
        }
        return this.bpmnDiagram;
    }

    /**
     * Gets the value of the relationship property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relationship property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelationship().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TRelationship }
     * 
     * 
     */
    public List<TRelationship> getRelationship() {
        if (relationship == null) {
            relationship = new ArrayList<TRelationship>();
        }
        return this.relationship;
    }

    /**
     * 获取id属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * 设置id属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * 获取name属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * 设置name属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * 获取targetNamespace属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetNamespace() {
        return targetNamespace;
    }

    /**
     * 设置targetNamespace属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetNamespace(String value) {
        this.targetNamespace = value;
    }

    /**
     * 获取expressionLanguage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpressionLanguage() {
        if (expressionLanguage == null) {
            return "http://www.w3.org/1999/XPath";
        } else {
            return expressionLanguage;
        }
    }

    /**
     * 设置expressionLanguage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpressionLanguage(String value) {
        this.expressionLanguage = value;
    }

    /**
     * 获取typeLanguage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeLanguage() {
        if (typeLanguage == null) {
            return "http://www.w3.org/2001/XMLSchema";
        } else {
            return typeLanguage;
        }
    }

    /**
     * 设置typeLanguage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeLanguage(String value) {
        this.typeLanguage = value;
    }

    /**
     * 获取exporter属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExporter() {
        return exporter;
    }

    /**
     * 设置exporter属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExporter(String value) {
        this.exporter = value;
    }

    /**
     * 获取exporterVersion属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExporterVersion() {
        return exporterVersion;
    }

    /**
     * 设置exporterVersion属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExporterVersion(String value) {
        this.exporterVersion = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
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
