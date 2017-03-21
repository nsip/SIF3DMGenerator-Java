
package sif.dd.au30.model;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for NAPTestScoreSummaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NAPTestScoreSummaryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SchoolInfoRefId" type="{http://www.sifassociation.org/datamodel/au/3.4.1}IdRefType" minOccurs="0"/>
 *         &lt;element name="SchoolACARAId" type="{http://www.sifassociation.org/datamodel/au/3.4.1}LocalIdType"/>
 *         &lt;element name="NAPTestRefId" type="{http://www.sifassociation.org/datamodel/au/3.4.1}IdRefType" minOccurs="0"/>
 *         &lt;element name="NAPTestLocalId" type="{http://www.sifassociation.org/datamodel/au/3.4.1}LocalIdType"/>
 *         &lt;element name="DomainNationalAverage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DomainSchoolAverage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DomainJurisdictionAverage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DomainTopNational60Percent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DomainBottomNational60Percent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SIF_Metadata" type="{http://www.sifassociation.org/datamodel/au/3.4.1}SIF_MetadataType" minOccurs="0"/>
 *         &lt;element name="SIF_ExtendedElements" type="{http://www.sifassociation.org/datamodel/au/3.4.1}SIF_ExtendedElementsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="RefId" use="required" type="{http://www.sifassociation.org/datamodel/au/3.4.1}RefIdType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NAPTestScoreSummaryType", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", propOrder = {
    "schoolInfoRefId",
    "schoolACARAId",
    "napTestRefId",
    "napTestLocalId",
    "domainNationalAverage",
    "domainSchoolAverage",
    "domainJurisdictionAverage",
    "domainTopNational60Percent",
    "domainBottomNational60Percent",
    "sifMetadata",
    "sifExtendedElements"
})
public class NAPTestScoreSummaryType {

    @XmlElementRef(name = "SchoolInfoRefId", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> schoolInfoRefId;
    @XmlElement(name = "SchoolACARAId", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String schoolACARAId;
    @XmlElementRef(name = "NAPTestRefId", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> napTestRefId;
    @XmlElement(name = "NAPTestLocalId", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String napTestLocalId;
    @XmlElementRef(name = "DomainNationalAverage", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> domainNationalAverage;
    @XmlElementRef(name = "DomainSchoolAverage", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> domainSchoolAverage;
    @XmlElementRef(name = "DomainJurisdictionAverage", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> domainJurisdictionAverage;
    @XmlElementRef(name = "DomainTopNational60Percent", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> domainTopNational60Percent;
    @XmlElementRef(name = "DomainBottomNational60Percent", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> domainBottomNational60Percent;
    @XmlElementRef(name = "SIF_Metadata", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", type = JAXBElement.class, required = false)
    protected JAXBElement<SIFMetadataType> sifMetadata;
    @XmlElementRef(name = "SIF_ExtendedElements", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", type = JAXBElement.class, required = false)
    protected JAXBElement<SIFExtendedElementsType> sifExtendedElements;
    @XmlAttribute(name = "RefId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refId;

    /**
     * Gets the value of the schoolInfoRefId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSchoolInfoRefId() {
        return schoolInfoRefId;
    }

    /**
     * Sets the value of the schoolInfoRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSchoolInfoRefId(JAXBElement<String> value) {
        this.schoolInfoRefId = value;
    }

    /**
     * Gets the value of the schoolACARAId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchoolACARAId() {
        return schoolACARAId;
    }

    /**
     * Sets the value of the schoolACARAId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchoolACARAId(String value) {
        this.schoolACARAId = value;
    }

    /**
     * Gets the value of the napTestRefId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNAPTestRefId() {
        return napTestRefId;
    }

    /**
     * Sets the value of the napTestRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNAPTestRefId(JAXBElement<String> value) {
        this.napTestRefId = value;
    }

    /**
     * Gets the value of the napTestLocalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNAPTestLocalId() {
        return napTestLocalId;
    }

    /**
     * Sets the value of the napTestLocalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNAPTestLocalId(String value) {
        this.napTestLocalId = value;
    }

    /**
     * Gets the value of the domainNationalAverage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getDomainNationalAverage() {
        return domainNationalAverage;
    }

    /**
     * Sets the value of the domainNationalAverage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setDomainNationalAverage(JAXBElement<BigDecimal> value) {
        this.domainNationalAverage = value;
    }

    /**
     * Gets the value of the domainSchoolAverage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getDomainSchoolAverage() {
        return domainSchoolAverage;
    }

    /**
     * Sets the value of the domainSchoolAverage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setDomainSchoolAverage(JAXBElement<BigDecimal> value) {
        this.domainSchoolAverage = value;
    }

    /**
     * Gets the value of the domainJurisdictionAverage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getDomainJurisdictionAverage() {
        return domainJurisdictionAverage;
    }

    /**
     * Sets the value of the domainJurisdictionAverage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setDomainJurisdictionAverage(JAXBElement<BigDecimal> value) {
        this.domainJurisdictionAverage = value;
    }

    /**
     * Gets the value of the domainTopNational60Percent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getDomainTopNational60Percent() {
        return domainTopNational60Percent;
    }

    /**
     * Sets the value of the domainTopNational60Percent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setDomainTopNational60Percent(JAXBElement<BigDecimal> value) {
        this.domainTopNational60Percent = value;
    }

    /**
     * Gets the value of the domainBottomNational60Percent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getDomainBottomNational60Percent() {
        return domainBottomNational60Percent;
    }

    /**
     * Sets the value of the domainBottomNational60Percent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setDomainBottomNational60Percent(JAXBElement<BigDecimal> value) {
        this.domainBottomNational60Percent = value;
    }

    /**
     * Gets the value of the sifMetadata property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SIFMetadataType }{@code >}
     *     
     */
    public JAXBElement<SIFMetadataType> getSIFMetadata() {
        return sifMetadata;
    }

    /**
     * Sets the value of the sifMetadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SIFMetadataType }{@code >}
     *     
     */
    public void setSIFMetadata(JAXBElement<SIFMetadataType> value) {
        this.sifMetadata = value;
    }

    /**
     * Gets the value of the sifExtendedElements property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SIFExtendedElementsType }{@code >}
     *     
     */
    public JAXBElement<SIFExtendedElementsType> getSIFExtendedElements() {
        return sifExtendedElements;
    }

    /**
     * Sets the value of the sifExtendedElements property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SIFExtendedElementsType }{@code >}
     *     
     */
    public void setSIFExtendedElements(JAXBElement<SIFExtendedElementsType> value) {
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

}
