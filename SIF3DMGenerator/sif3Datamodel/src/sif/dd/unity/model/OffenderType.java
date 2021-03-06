
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for OffenderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OffenderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.sifassociation.org/datamodel/na/4.x}NameType"/>
 *         &lt;element name="SIF_RefId" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.sifassociation.org/datamodel/na/4.x>IdRefType">
 *                 &lt;attribute name="SIF_RefObject" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *                       &lt;enumeration value="StudentPersonal"/>
 *                       &lt;enumeration value="StaffPersonal"/>
 *                       &lt;enumeration value="EmployeePersonal"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Injury">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>token">
 *                 &lt;attribute name="Codeset" type="{http://www.w3.org/2001/XMLSchema}token" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ManifestationDetermination" type="{http://www.sifassociation.org/datamodel/na/4.x}ManifestationDeterminationType" minOccurs="0"/>
 *         &lt;element name="ActionList" type="{http://www.sifassociation.org/datamodel/na/4.x}DisciplineActionListType" minOccurs="0"/>
 *         &lt;element name="WeaponTypeList" type="{http://www.sifassociation.org/datamodel/na/4.x}WeaponTypeListType" minOccurs="0"/>
 *         &lt;element name="RelatedToList" type="{http://www.sifassociation.org/datamodel/na/4.x}RelatedToListType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Type" use="required" type="{http://www.w3.org/2001/XMLSchema}token" />
 *       &lt;attribute name="TypeCodeset" type="{http://www.w3.org/2001/XMLSchema}token" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OffenderType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "name",
    "sifRefId",
    "injury",
    "manifestationDetermination",
    "actionList",
    "weaponTypeList",
    "relatedToList"
})
public class OffenderType {

    @XmlElement(name = "Name", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    protected NameType name;
    @XmlElement(name = "SIF_RefId", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected OffenderType.SIFRefId sifRefId;
    @XmlElement(name = "Injury", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    protected OffenderType.Injury injury;
    @XmlElement(name = "ManifestationDetermination", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected ManifestationDeterminationType manifestationDetermination;
    @XmlElement(name = "ActionList", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected DisciplineActionListType actionList;
    @XmlElement(name = "WeaponTypeList", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected WeaponTypeListType weaponTypeList;
    @XmlElement(name = "RelatedToList", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected RelatedToListType relatedToList;
    @XmlAttribute(name = "Type", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String type;
    @XmlAttribute(name = "TypeCodeset")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String typeCodeset;

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
     * Gets the value of the sifRefId property.
     * 
     * @return
     *     possible object is
     *     {@link OffenderType.SIFRefId }
     *     
     */
    public OffenderType.SIFRefId getSIFRefId() {
        return sifRefId;
    }

    /**
     * Sets the value of the sifRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link OffenderType.SIFRefId }
     *     
     */
    public void setSIFRefId(OffenderType.SIFRefId value) {
        this.sifRefId = value;
    }

    /**
     * Gets the value of the injury property.
     * 
     * @return
     *     possible object is
     *     {@link OffenderType.Injury }
     *     
     */
    public OffenderType.Injury getInjury() {
        return injury;
    }

    /**
     * Sets the value of the injury property.
     * 
     * @param value
     *     allowed object is
     *     {@link OffenderType.Injury }
     *     
     */
    public void setInjury(OffenderType.Injury value) {
        this.injury = value;
    }

    /**
     * Gets the value of the manifestationDetermination property.
     * 
     * @return
     *     possible object is
     *     {@link ManifestationDeterminationType }
     *     
     */
    public ManifestationDeterminationType getManifestationDetermination() {
        return manifestationDetermination;
    }

    /**
     * Sets the value of the manifestationDetermination property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManifestationDeterminationType }
     *     
     */
    public void setManifestationDetermination(ManifestationDeterminationType value) {
        this.manifestationDetermination = value;
    }

    /**
     * Gets the value of the actionList property.
     * 
     * @return
     *     possible object is
     *     {@link DisciplineActionListType }
     *     
     */
    public DisciplineActionListType getActionList() {
        return actionList;
    }

    /**
     * Sets the value of the actionList property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisciplineActionListType }
     *     
     */
    public void setActionList(DisciplineActionListType value) {
        this.actionList = value;
    }

    /**
     * Gets the value of the weaponTypeList property.
     * 
     * @return
     *     possible object is
     *     {@link WeaponTypeListType }
     *     
     */
    public WeaponTypeListType getWeaponTypeList() {
        return weaponTypeList;
    }

    /**
     * Sets the value of the weaponTypeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link WeaponTypeListType }
     *     
     */
    public void setWeaponTypeList(WeaponTypeListType value) {
        this.weaponTypeList = value;
    }

    /**
     * Gets the value of the relatedToList property.
     * 
     * @return
     *     possible object is
     *     {@link RelatedToListType }
     *     
     */
    public RelatedToListType getRelatedToList() {
        return relatedToList;
    }

    /**
     * Sets the value of the relatedToList property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelatedToListType }
     *     
     */
    public void setRelatedToList(RelatedToListType value) {
        this.relatedToList = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the typeCodeset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeCodeset() {
        return typeCodeset;
    }

    /**
     * Sets the value of the typeCodeset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeCodeset(String value) {
        this.typeCodeset = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>token">
     *       &lt;attribute name="Codeset" type="{http://www.w3.org/2001/XMLSchema}token" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class Injury {

        @XmlValue
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String value;
        @XmlAttribute(name = "Codeset")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String codeset;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the codeset property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodeset() {
            return codeset;
        }

        /**
         * Sets the value of the codeset property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodeset(String value) {
            this.codeset = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.sifassociation.org/datamodel/na/4.x>IdRefType">
     *       &lt;attribute name="SIF_RefObject" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
     *             &lt;enumeration value="StudentPersonal"/>
     *             &lt;enumeration value="StaffPersonal"/>
     *             &lt;enumeration value="EmployeePersonal"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class SIFRefId {

        @XmlValue
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String value;
        @XmlAttribute(name = "SIF_RefObject", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String sifRefObject;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the sifRefObject property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSIFRefObject() {
            return sifRefObject;
        }

        /**
         * Sets the value of the sifRefObject property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSIFRefObject(String value) {
            this.sifRefObject = value;
        }

    }

}
