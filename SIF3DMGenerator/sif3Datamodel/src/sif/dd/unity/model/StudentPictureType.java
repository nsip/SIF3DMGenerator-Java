
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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for StudentPictureType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StudentPictureType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PictureSource" type="{http://www.sifassociation.org/datamodel/na/4.x}PictureSourceType"/>
 *         &lt;element name="OKToPublish" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>token">
 *                 &lt;attribute name="Codeset" type="{http://www.w3.org/2001/XMLSchema}token" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SIF_Metadata" type="{http://www.sifassociation.org/datamodel/na/4.x}SIF_MetadataType" minOccurs="0"/>
 *         &lt;element name="SIF_ExtendedElements" type="{http://www.sifassociation.org/datamodel/na/4.x}SIF_ExtendedElementsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="RefId" use="required" type="{http://www.sifassociation.org/datamodel/na/4.x}RefIdType" />
 *       &lt;attribute name="StudentPersonalRefId" use="required" type="{http://www.sifassociation.org/datamodel/na/4.x}IdRefType" />
 *       &lt;attribute name="SchoolYear" use="required" type="{http://www.sifassociation.org/datamodel/na/4.x}SchoolYearType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StudentPictureType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "pictureSource",
    "okToPublish",
    "sifMetadata",
    "sifExtendedElements"
})
public class StudentPictureType {

    @XmlElement(name = "PictureSource", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    protected PictureSourceType pictureSource;
    @XmlElement(name = "OKToPublish", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected StudentPictureType.OKToPublish okToPublish;
    @XmlElement(name = "SIF_Metadata", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected SIFMetadataType sifMetadata;
    @XmlElement(name = "SIF_ExtendedElements", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected SIFExtendedElementsType sifExtendedElements;
    @XmlAttribute(name = "RefId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refId;
    @XmlAttribute(name = "StudentPersonalRefId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String studentPersonalRefId;
    @XmlAttribute(name = "SchoolYear", required = true)
    protected XMLGregorianCalendar schoolYear;

    /**
     * Gets the value of the pictureSource property.
     * 
     * @return
     *     possible object is
     *     {@link PictureSourceType }
     *     
     */
    public PictureSourceType getPictureSource() {
        return pictureSource;
    }

    /**
     * Sets the value of the pictureSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link PictureSourceType }
     *     
     */
    public void setPictureSource(PictureSourceType value) {
        this.pictureSource = value;
    }

    /**
     * Gets the value of the okToPublish property.
     * 
     * @return
     *     possible object is
     *     {@link StudentPictureType.OKToPublish }
     *     
     */
    public StudentPictureType.OKToPublish getOKToPublish() {
        return okToPublish;
    }

    /**
     * Sets the value of the okToPublish property.
     * 
     * @param value
     *     allowed object is
     *     {@link StudentPictureType.OKToPublish }
     *     
     */
    public void setOKToPublish(StudentPictureType.OKToPublish value) {
        this.okToPublish = value;
    }

    /**
     * Gets the value of the sifMetadata property.
     * 
     * @return
     *     possible object is
     *     {@link SIFMetadataType }
     *     
     */
    public SIFMetadataType getSIFMetadata() {
        return sifMetadata;
    }

    /**
     * Sets the value of the sifMetadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link SIFMetadataType }
     *     
     */
    public void setSIFMetadata(SIFMetadataType value) {
        this.sifMetadata = value;
    }

    /**
     * Gets the value of the sifExtendedElements property.
     * 
     * @return
     *     possible object is
     *     {@link SIFExtendedElementsType }
     *     
     */
    public SIFExtendedElementsType getSIFExtendedElements() {
        return sifExtendedElements;
    }

    /**
     * Sets the value of the sifExtendedElements property.
     * 
     * @param value
     *     allowed object is
     *     {@link SIFExtendedElementsType }
     *     
     */
    public void setSIFExtendedElements(SIFExtendedElementsType value) {
        this.sifExtendedElements = value;
    }

    /**
     * Gets the value of the refId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefId() {
        return refId;
    }

    /**
     * Sets the value of the refId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefId(String value) {
        this.refId = value;
    }

    /**
     * Gets the value of the studentPersonalRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudentPersonalRefId() {
        return studentPersonalRefId;
    }

    /**
     * Sets the value of the studentPersonalRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudentPersonalRefId(String value) {
        this.studentPersonalRefId = value;
    }

    /**
     * Gets the value of the schoolYear property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSchoolYear() {
        return schoolYear;
    }

    /**
     * Sets the value of the schoolYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSchoolYear(XMLGregorianCalendar value) {
        this.schoolYear = value;
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
    public static class OKToPublish {

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

}
