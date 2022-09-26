//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.04.18 时间 02:50:25 PM CST 
//


package org.apromore.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>VersionSummaryType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="VersionSummaryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Annotations" type="{urn:qut-edu-au:schema:apromore:manager}AnnotationsType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ranking" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="last_update" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="creation_date" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="score" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="versionNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="empty" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VersionSummaryType", propOrder = {
    "annotations"
})
public class VersionSummaryType
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Annotations")
    protected List<AnnotationsType> annotations;
    @XmlAttribute(name = "ranking")
    protected String ranking;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "last_update")
    protected String lastUpdate;
    @XmlAttribute(name = "creation_date")
    protected String creationDate;
    @XmlAttribute(name = "score")
    protected Double score;
    @XmlAttribute(name = "versionNumber")
    protected String versionNumber;
    @XmlAttribute(name = "empty")
    protected Boolean empty;

    /**
     * Gets the value of the annotations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the annotations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnnotations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AnnotationsType }
     * 
     * 
     */
    public List<AnnotationsType> getAnnotations() {
        if (annotations == null) {
            annotations = new ArrayList<AnnotationsType>();
        }
        return this.annotations;
    }

    /**
     * 获取ranking属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRanking() {
        return ranking;
    }

    /**
     * 设置ranking属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRanking(String value) {
        this.ranking = value;
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
     * 获取lastUpdate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastUpdate() {
        return lastUpdate;
    }

    /**
     * 设置lastUpdate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastUpdate(String value) {
        this.lastUpdate = value;
    }

    /**
     * 获取creationDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreationDate() {
        return creationDate;
    }

    /**
     * 设置creationDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreationDate(String value) {
        this.creationDate = value;
    }

    /**
     * 获取score属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getScore() {
        return score;
    }

    /**
     * 设置score属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setScore(Double value) {
        this.score = value;
    }

    /**
     * 获取versionNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersionNumber() {
        return versionNumber;
    }

    /**
     * 设置versionNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersionNumber(String value) {
        this.versionNumber = value;
    }

    /**
     * 获取empty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEmpty() {
        return empty;
    }

    /**
     * 设置empty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEmpty(Boolean value) {
        this.empty = value;
    }

    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        {
            List<AnnotationsType> theAnnotations;
            theAnnotations = this.getAnnotations();
            strategy.appendField(locator, this, "annotations", buffer, theAnnotations);
        }
        {
            String theRanking;
            theRanking = this.getRanking();
            strategy.appendField(locator, this, "ranking", buffer, theRanking);
        }
        {
            String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName);
        }
        {
            String theLastUpdate;
            theLastUpdate = this.getLastUpdate();
            strategy.appendField(locator, this, "lastUpdate", buffer, theLastUpdate);
        }
        {
            String theCreationDate;
            theCreationDate = this.getCreationDate();
            strategy.appendField(locator, this, "creationDate", buffer, theCreationDate);
        }
        {
            Double theScore;
            theScore = this.getScore();
            strategy.appendField(locator, this, "score", buffer, theScore);
        }
        {
            String theVersionNumber;
            theVersionNumber = this.getVersionNumber();
            strategy.appendField(locator, this, "versionNumber", buffer, theVersionNumber);
        }
        {
            Boolean theEmpty;
            theEmpty = this.isEmpty();
            strategy.appendField(locator, this, "empty", buffer, theEmpty);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof VersionSummaryType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final VersionSummaryType that = ((VersionSummaryType) object);
        {
            List<AnnotationsType> lhsAnnotations;
            lhsAnnotations = this.getAnnotations();
            List<AnnotationsType> rhsAnnotations;
            rhsAnnotations = that.getAnnotations();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "annotations", lhsAnnotations), LocatorUtils.property(thatLocator, "annotations", rhsAnnotations), lhsAnnotations, rhsAnnotations)) {
                return false;
            }
        }
        {
            String lhsRanking;
            lhsRanking = this.getRanking();
            String rhsRanking;
            rhsRanking = that.getRanking();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ranking", lhsRanking), LocatorUtils.property(thatLocator, "ranking", rhsRanking), lhsRanking, rhsRanking)) {
                return false;
            }
        }
        {
            String lhsName;
            lhsName = this.getName();
            String rhsName;
            rhsName = that.getName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsName), LocatorUtils.property(thatLocator, "name", rhsName), lhsName, rhsName)) {
                return false;
            }
        }
        {
            String lhsLastUpdate;
            lhsLastUpdate = this.getLastUpdate();
            String rhsLastUpdate;
            rhsLastUpdate = that.getLastUpdate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lastUpdate", lhsLastUpdate), LocatorUtils.property(thatLocator, "lastUpdate", rhsLastUpdate), lhsLastUpdate, rhsLastUpdate)) {
                return false;
            }
        }
        {
            String lhsCreationDate;
            lhsCreationDate = this.getCreationDate();
            String rhsCreationDate;
            rhsCreationDate = that.getCreationDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "creationDate", lhsCreationDate), LocatorUtils.property(thatLocator, "creationDate", rhsCreationDate), lhsCreationDate, rhsCreationDate)) {
                return false;
            }
        }
        {
            Double lhsScore;
            lhsScore = this.getScore();
            Double rhsScore;
            rhsScore = that.getScore();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "score", lhsScore), LocatorUtils.property(thatLocator, "score", rhsScore), lhsScore, rhsScore)) {
                return false;
            }
        }
        {
            String lhsVersionNumber;
            lhsVersionNumber = this.getVersionNumber();
            String rhsVersionNumber;
            rhsVersionNumber = that.getVersionNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "versionNumber", lhsVersionNumber), LocatorUtils.property(thatLocator, "versionNumber", rhsVersionNumber), lhsVersionNumber, rhsVersionNumber)) {
                return false;
            }
        }
        {
            Boolean lhsEmpty;
            lhsEmpty = this.isEmpty();
            Boolean rhsEmpty;
            rhsEmpty = that.isEmpty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "empty", lhsEmpty), LocatorUtils.property(thatLocator, "empty", rhsEmpty), lhsEmpty, rhsEmpty)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            List<AnnotationsType> theAnnotations;
            theAnnotations = this.getAnnotations();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "annotations", theAnnotations), currentHashCode, theAnnotations);
        }
        {
            String theRanking;
            theRanking = this.getRanking();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ranking", theRanking), currentHashCode, theRanking);
        }
        {
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName);
        }
        {
            String theLastUpdate;
            theLastUpdate = this.getLastUpdate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lastUpdate", theLastUpdate), currentHashCode, theLastUpdate);
        }
        {
            String theCreationDate;
            theCreationDate = this.getCreationDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "creationDate", theCreationDate), currentHashCode, theCreationDate);
        }
        {
            Double theScore;
            theScore = this.getScore();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "score", theScore), currentHashCode, theScore);
        }
        {
            String theVersionNumber;
            theVersionNumber = this.getVersionNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "versionNumber", theVersionNumber), currentHashCode, theVersionNumber);
        }
        {
            Boolean theEmpty;
            theEmpty = this.isEmpty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "empty", theEmpty), currentHashCode, theEmpty);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
