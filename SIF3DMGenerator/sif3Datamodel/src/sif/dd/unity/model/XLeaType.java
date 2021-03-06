
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for xLeaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="xLeaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="localId" type="{http://www.sifassociation.org/datamodel/na/4.x}xOrganizationIdType" minOccurs="0"/>
 *         &lt;element name="leaRefId" type="{http://www.sifassociation.org/datamodel/na/4.x}gRefIdPointerType" minOccurs="0"/>
 *         &lt;element name="stateProvinceId" type="{http://www.sifassociation.org/datamodel/na/4.x}xOrganizationIdType" minOccurs="0"/>
 *         &lt;element name="ncesId" type="{http://www.sifassociation.org/datamodel/na/4.x}xOrganizationIdType" minOccurs="0"/>
 *         &lt;element name="leaName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="address" type="{http://www.sifassociation.org/datamodel/na/4.x}xOrganizationAddressType" minOccurs="0"/>
 *         &lt;element name="phoneNumber" type="{http://www.sifassociation.org/datamodel/na/4.x}xTelephoneType" minOccurs="0"/>
 *         &lt;element name="otherPhoneNumbers" type="{http://www.sifassociation.org/datamodel/na/4.x}xTelephoneListType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="refId" use="required" type="{http://www.sifassociation.org/datamodel/na/4.x}gRefIdType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xLeaType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "localId",
    "leaRefId",
    "stateProvinceId",
    "ncesId",
    "leaName",
    "address",
    "phoneNumber",
    "otherPhoneNumbers"
})
public class XLeaType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String localId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String leaRefId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String stateProvinceId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String ncesId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected String leaName;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected XOrganizationAddressType address;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected XTelephoneType phoneNumber;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected XTelephoneListType otherPhoneNumbers;
    @XmlAttribute(name = "refId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refId;

    /**
     * Gets the value of the localId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalId() {
        return localId;
    }

    /**
     * Sets the value of the localId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalId(String value) {
        this.localId = value;
    }

    /**
     * Gets the value of the leaRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeaRefId() {
        return leaRefId;
    }

    /**
     * Sets the value of the leaRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeaRefId(String value) {
        this.leaRefId = value;
    }

    /**
     * Gets the value of the stateProvinceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateProvinceId() {
        return stateProvinceId;
    }

    /**
     * Sets the value of the stateProvinceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateProvinceId(String value) {
        this.stateProvinceId = value;
    }

    /**
     * Gets the value of the ncesId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNcesId() {
        return ncesId;
    }

    /**
     * Sets the value of the ncesId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNcesId(String value) {
        this.ncesId = value;
    }

    /**
     * Gets the value of the leaName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeaName() {
        return leaName;
    }

    /**
     * Sets the value of the leaName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeaName(String value) {
        this.leaName = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link XOrganizationAddressType }
     *     
     */
    public XOrganizationAddressType getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link XOrganizationAddressType }
     *     
     */
    public void setAddress(XOrganizationAddressType value) {
        this.address = value;
    }

    /**
     * Gets the value of the phoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link XTelephoneType }
     *     
     */
    public XTelephoneType getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link XTelephoneType }
     *     
     */
    public void setPhoneNumber(XTelephoneType value) {
        this.phoneNumber = value;
    }

    /**
     * Gets the value of the otherPhoneNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link XTelephoneListType }
     *     
     */
    public XTelephoneListType getOtherPhoneNumbers() {
        return otherPhoneNumbers;
    }

    /**
     * Sets the value of the otherPhoneNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link XTelephoneListType }
     *     
     */
    public void setOtherPhoneNumbers(XTelephoneListType value) {
        this.otherPhoneNumbers = value;
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
