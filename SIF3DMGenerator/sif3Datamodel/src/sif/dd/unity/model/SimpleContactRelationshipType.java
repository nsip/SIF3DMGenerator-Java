
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SimpleContactRelationshipType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SimpleContactRelationshipType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Relationship" type="{http://www.sifassociation.org/datamodel/na/4.x}RelationshipType"/>
 *         &lt;element name="Name" type="{http://www.sifassociation.org/datamodel/na/4.x}NameType" minOccurs="0"/>
 *         &lt;element name="OtherIdList" type="{http://www.sifassociation.org/datamodel/na/4.x}OtherIdListType" minOccurs="0"/>
 *         &lt;element name="EducationalLevel" type="{http://www.sifassociation.org/datamodel/na/4.x}EducationalLevelType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SimpleContactRelationshipType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "relationship",
    "name",
    "otherIdList",
    "educationalLevel"
})
public class SimpleContactRelationshipType {

    @XmlElement(name = "Relationship", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    protected RelationshipType relationship;
    @XmlElement(name = "Name", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected NameType name;
    @XmlElement(name = "OtherIdList", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected OtherIdListType otherIdList;
    @XmlElement(name = "EducationalLevel", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected EducationalLevelType educationalLevel;

    /**
     * Gets the value of the relationship property.
     * 
     * @return
     *     possible object is
     *     {@link RelationshipType }
     *     
     */
    public RelationshipType getRelationship() {
        return relationship;
    }

    /**
     * Sets the value of the relationship property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelationshipType }
     *     
     */
    public void setRelationship(RelationshipType value) {
        this.relationship = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link NameType }
     *     
     */
    public NameType getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameType }
     *     
     */
    public void setName(NameType value) {
        this.name = value;
    }

    /**
     * Gets the value of the otherIdList property.
     * 
     * @return
     *     possible object is
     *     {@link OtherIdListType }
     *     
     */
    public OtherIdListType getOtherIdList() {
        return otherIdList;
    }

    /**
     * Sets the value of the otherIdList property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherIdListType }
     *     
     */
    public void setOtherIdList(OtherIdListType value) {
        this.otherIdList = value;
    }

    /**
     * Gets the value of the educationalLevel property.
     * 
     * @return
     *     possible object is
     *     {@link EducationalLevelType }
     *     
     */
    public EducationalLevelType getEducationalLevel() {
        return educationalLevel;
    }

    /**
     * Sets the value of the educationalLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link EducationalLevelType }
     *     
     */
    public void setEducationalLevel(EducationalLevelType value) {
        this.educationalLevel = value;
    }

}
