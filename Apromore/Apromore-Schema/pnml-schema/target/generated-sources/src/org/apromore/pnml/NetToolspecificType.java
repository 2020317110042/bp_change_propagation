//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.04.18 时间 02:49:28 PM CST 
//


package org.apromore.pnml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>netToolspecificType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="netToolspecificType">
 *   &lt;complexContent>
 *     &lt;extension base="{pnml.apromore.org}toolspecificType">
 *       &lt;sequence>
 *         &lt;element name="bounds" type="{pnml.apromore.org}graphicsSimpleType" minOccurs="0"/>
 *         &lt;element name="treeWidth" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="verticalLayout" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="resources" type="{pnml.apromore.org}resourcesType" minOccurs="0"/>
 *         &lt;element name="simulations" type="{pnml.apromore.org}simulationsType" minOccurs="0"/>
 *         &lt;element ref="{pnml.apromore.org}partnerLinks" minOccurs="0"/>
 *         &lt;element ref="{pnml.apromore.org}variables" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "netToolspecificType", propOrder = {
    "bounds",
    "treeWidth",
    "verticalLayout",
    "resources",
    "simulations",
    "partnerLinks",
    "variables"
})
public class NetToolspecificType
    extends ToolspecificType
{

    protected GraphicsSimpleType bounds;
    protected Integer treeWidth;
    protected Boolean verticalLayout;
    protected ResourcesType resources;
    protected SimulationsType simulations;
    protected TPartnerLinks partnerLinks;
    protected TVariables variables;

    /**
     * 获取bounds属性的值。
     * 
     * @return
     *     possible object is
     *     {@link GraphicsSimpleType }
     *     
     */
    public GraphicsSimpleType getBounds() {
        return bounds;
    }

    /**
     * 设置bounds属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link GraphicsSimpleType }
     *     
     */
    public void setBounds(GraphicsSimpleType value) {
        this.bounds = value;
    }

    /**
     * 获取treeWidth属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTreeWidth() {
        return treeWidth;
    }

    /**
     * 设置treeWidth属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTreeWidth(Integer value) {
        this.treeWidth = value;
    }

    /**
     * 获取verticalLayout属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVerticalLayout() {
        return verticalLayout;
    }

    /**
     * 设置verticalLayout属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVerticalLayout(Boolean value) {
        this.verticalLayout = value;
    }

    /**
     * 获取resources属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ResourcesType }
     *     
     */
    public ResourcesType getResources() {
        return resources;
    }

    /**
     * 设置resources属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ResourcesType }
     *     
     */
    public void setResources(ResourcesType value) {
        this.resources = value;
    }

    /**
     * 获取simulations属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SimulationsType }
     *     
     */
    public SimulationsType getSimulations() {
        return simulations;
    }

    /**
     * 设置simulations属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SimulationsType }
     *     
     */
    public void setSimulations(SimulationsType value) {
        this.simulations = value;
    }

    /**
     * 获取partnerLinks属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TPartnerLinks }
     *     
     */
    public TPartnerLinks getPartnerLinks() {
        return partnerLinks;
    }

    /**
     * 设置partnerLinks属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TPartnerLinks }
     *     
     */
    public void setPartnerLinks(TPartnerLinks value) {
        this.partnerLinks = value;
    }

    /**
     * 获取variables属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TVariables }
     *     
     */
    public TVariables getVariables() {
        return variables;
    }

    /**
     * 设置variables属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TVariables }
     *     
     */
    public void setVariables(TVariables value) {
        this.variables = value;
    }

}
