
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for EmployeePictureType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmployeePictureType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PictureSource" type="{http://www.sifassociation.org/datamodel/na/4.x}PictureSourceType"/>
 *         &lt;element name="SIF_Metadata" type="{http://www.sifassociation.org/datamodel/na/4.x}SIF_MetadataType" minOccurs="0"/>
 *         &lt;element name="SIF_ExtendedElements" type="{http://www.sifassociation.org/datamodel/na/4.x}SIF_ExtendedElementsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="RefId" use="required" type="{http://www.sifassociation.org/datamodel/na/4.x}RefIdType" />
 *       &lt;attribute name="EmployeePersonalRefId" use="required" type="{http://www.sifassociation.org/datamodel/na/4.x}IdRefType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmployeePictureType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "pictureSource",
    "sifMetadata",
    "sifExtendedElements"
})
public class EmployeePictureType {

    @XmlElement(name = "PictureSource", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    protected PictureSourceType pictureSource;
    @XmlElement(name = "SIF_Metadata", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected SIFMetadataType sifMetadata;
    @XmlElement(name = "SIF_ExtendedElements", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected SIFExtendedElementsType sifExtendedElements;
    @XmlAttribute(name = "RefId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refId;
    @XmlAttribute(name = "EmployeePersonalRefId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String employeePersonalRefId;

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
     * Gets the value of the employeePersonalRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeePersonalRefId() {
        return employeePersonalRefId;
    }

    /**
     * Sets the value of the employeePersonalRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeePersonalRefId(String value) {
        this.employeePersonalRefId = value;
    }

}
