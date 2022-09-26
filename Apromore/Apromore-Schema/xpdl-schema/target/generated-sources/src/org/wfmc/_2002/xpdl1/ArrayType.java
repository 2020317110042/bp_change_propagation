//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.04.18 时间 02:49:32 PM CST 
//


package org.wfmc._2002.xpdl1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
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
 *       &lt;group ref="{http://www.wfmc.org/2002/XPDL1.0}DataTypes"/>
 *       &lt;attribute name="LowerIndex" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="UpperIndex" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "basicType",
    "declaredType",
    "schemaType",
    "externalReference",
    "recordType",
    "unionType",
    "enumerationType",
    "arrayType",
    "listType"
})
@XmlRootElement(name = "ArrayType")
public class ArrayType {

    @XmlElement(name = "BasicType")
    protected BasicType basicType;
    @XmlElement(name = "DeclaredType")
    protected DeclaredType declaredType;
    @XmlElement(name = "SchemaType")
    protected SchemaType schemaType;
    @XmlElement(name = "ExternalReference")
    protected ExternalReference externalReference;
    @XmlElement(name = "RecordType")
    protected RecordType recordType;
    @XmlElement(name = "UnionType")
    protected UnionType unionType;
    @XmlElement(name = "EnumerationType")
    protected EnumerationType enumerationType;
    @XmlElement(name = "ArrayType")
    protected ArrayType arrayType;
    @XmlElement(name = "ListType")
    protected ListType listType;
    @XmlAttribute(name = "LowerIndex", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String lowerIndex;
    @XmlAttribute(name = "UpperIndex", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String upperIndex;

    /**
     * 获取basicType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BasicType }
     *     
     */
    public BasicType getBasicType() {
        return basicType;
    }

    /**
     * 设置basicType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BasicType }
     *     
     */
    public void setBasicType(BasicType value) {
        this.basicType = value;
    }

    /**
     * 获取declaredType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DeclaredType }
     *     
     */
    public DeclaredType getDeclaredType() {
        return declaredType;
    }

    /**
     * 设置declaredType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DeclaredType }
     *     
     */
    public void setDeclaredType(DeclaredType value) {
        this.declaredType = value;
    }

    /**
     * 获取schemaType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SchemaType }
     *     
     */
    public SchemaType getSchemaType() {
        return schemaType;
    }

    /**
     * 设置schemaType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SchemaType }
     *     
     */
    public void setSchemaType(SchemaType value) {
        this.schemaType = value;
    }

    /**
     * 获取externalReference属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ExternalReference }
     *     
     */
    public ExternalReference getExternalReference() {
        return externalReference;
    }

    /**
     * 设置externalReference属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalReference }
     *     
     */
    public void setExternalReference(ExternalReference value) {
        this.externalReference = value;
    }

    /**
     * 获取recordType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordType }
     *     
     */
    public RecordType getRecordType() {
        return recordType;
    }

    /**
     * 设置recordType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordType }
     *     
     */
    public void setRecordType(RecordType value) {
        this.recordType = value;
    }

    /**
     * 获取unionType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link UnionType }
     *     
     */
    public UnionType getUnionType() {
        return unionType;
    }

    /**
     * 设置unionType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link UnionType }
     *     
     */
    public void setUnionType(UnionType value) {
        this.unionType = value;
    }

    /**
     * 获取enumerationType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EnumerationType }
     *     
     */
    public EnumerationType getEnumerationType() {
        return enumerationType;
    }

    /**
     * 设置enumerationType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EnumerationType }
     *     
     */
    public void setEnumerationType(EnumerationType value) {
        this.enumerationType = value;
    }

    /**
     * 获取arrayType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayType }
     *     
     */
    public ArrayType getArrayType() {
        return arrayType;
    }

    /**
     * 设置arrayType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayType }
     *     
     */
    public void setArrayType(ArrayType value) {
        this.arrayType = value;
    }

    /**
     * 获取listType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ListType }
     *     
     */
    public ListType getListType() {
        return listType;
    }

    /**
     * 设置listType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ListType }
     *     
     */
    public void setListType(ListType value) {
        this.listType = value;
    }

    /**
     * 获取lowerIndex属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLowerIndex() {
        return lowerIndex;
    }

    /**
     * 设置lowerIndex属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLowerIndex(String value) {
        this.lowerIndex = value;
    }

    /**
     * 获取upperIndex属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpperIndex() {
        return upperIndex;
    }

    /**
     * 设置upperIndex属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpperIndex(String value) {
        this.upperIndex = value;
    }

}
