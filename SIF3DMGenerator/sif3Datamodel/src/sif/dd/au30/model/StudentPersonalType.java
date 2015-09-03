
package sif.dd.au30.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * This object contains all the personal information related to the student.
 * 
 * <p>Java class for StudentPersonalType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StudentPersonalType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AlertMessages" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AlertMessage" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="Type" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *                                 &lt;enumeration value="Legal"/>
 *                                 &lt;enumeration value="Discipline"/>
 *                                 &lt;enumeration value="Educational"/>
 *                                 &lt;enumeration value="Other"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="MedicalAlertMessages" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="MedicalAlertMessage" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="Severity" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *                                 &lt;enumeration value="Low"/>
 *                                 &lt;enumeration value="Moderate"/>
 *                                 &lt;enumeration value="High"/>
 *                                 &lt;enumeration value="Severe"/>
 *                                 &lt;enumeration value="Unknown"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.sifassociation.org/au/datamodel/1.4}LocalId" minOccurs="0"/>
 *         &lt;element name="StateProvinceId" type="{http://www.sifassociation.org/au/datamodel/1.4}StateProvinceIdType" minOccurs="0"/>
 *         &lt;element name="ElectronicIdList" type="{http://www.sifassociation.org/au/datamodel/1.4}ElectronicIdListType" minOccurs="0"/>
 *         &lt;element name="OtherIdList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="OtherId" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>normalizedString">
 *                           &lt;attribute name="Type" use="required" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.sifassociation.org/au/datamodel/1.4}PersonInfo" minOccurs="0"/>
 *         &lt;element name="ProjectedGraduationYear" type="{http://www.sifassociation.org/au/datamodel/1.4}ProjectedGraduationYearType" minOccurs="0"/>
 *         &lt;element name="OnTimeGraduationYear" type="{http://www.sifassociation.org/au/datamodel/1.4}OnTimeGraduationYearType" minOccurs="0"/>
 *         &lt;element name="GraduationDate" type="{http://www.sifassociation.org/au/datamodel/1.4}GraduationDateType" minOccurs="0"/>
 *         &lt;element name="MostRecent" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="SchoolLocalId" type="{http://www.sifassociation.org/au/datamodel/1.4}LocalIdType" minOccurs="0"/>
 *                   &lt;element name="HomeroomLocalId" type="{http://www.sifassociation.org/au/datamodel/1.4}LocalIdType" minOccurs="0"/>
 *                   &lt;element name="YearLevel" type="{http://www.sifassociation.org/au/datamodel/1.4}YearLevelType" minOccurs="0"/>
 *                   &lt;element name="FTE" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                         &lt;minInclusive value="0"/>
 *                         &lt;maxInclusive value="1"/>
 *                         &lt;fractionDigits value="2"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="Parent1Language" type="{http://www.sifassociation.org/au/datamodel/1.4}AUCodeSetsAustralianStandardClassificationOfLanguagesASCLType" minOccurs="0"/>
 *                   &lt;element name="Parent2Language" type="{http://www.sifassociation.org/au/datamodel/1.4}AUCodeSetsAustralianStandardClassificationOfLanguagesASCLType" minOccurs="0"/>
 *                   &lt;element name="Parent1EmploymentType" type="{http://www.sifassociation.org/au/datamodel/1.4}AUCodeSetsEmploymentTypeType" minOccurs="0"/>
 *                   &lt;element name="Parent2EmploymentType" type="{http://www.sifassociation.org/au/datamodel/1.4}AUCodeSetsEmploymentTypeType" minOccurs="0"/>
 *                   &lt;element name="Parent1SchoolEducationLevel" type="{http://www.sifassociation.org/au/datamodel/1.4}AUCodeSetsSchoolEducationLevelTypeType" minOccurs="0"/>
 *                   &lt;element name="Parent2SchoolEducationLevel" type="{http://www.sifassociation.org/au/datamodel/1.4}AUCodeSetsSchoolEducationLevelTypeType" minOccurs="0"/>
 *                   &lt;element name="Parent1NonSchoolEducation" type="{http://www.sifassociation.org/au/datamodel/1.4}AUCodeSetsNonSchoolEducationType" minOccurs="0"/>
 *                   &lt;element name="Parent2NonSchoolEducation" type="{http://www.sifassociation.org/au/datamodel/1.4}AUCodeSetsNonSchoolEducationType" minOccurs="0"/>
 *                   &lt;element name="Parent1Sex" type="{http://www.sifassociation.org/au/datamodel/1.4}AUCodeSetsSexCodeType" minOccurs="0"/>
 *                   &lt;element name="Parent2Sex" type="{http://www.sifassociation.org/au/datamodel/1.4}AUCodeSetsSexCodeType" minOccurs="0"/>
 *                   &lt;element name="Parent1Relationship" type="{http://www.sifassociation.org/au/datamodel/1.4}RelationshipType" minOccurs="0"/>
 *                   &lt;element name="Parent2Relationship" type="{http://www.sifassociation.org/au/datamodel/1.4}RelationshipType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="NAPRegistration" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="AcceptableUsePolicy" type="{http://www.sifassociation.org/au/datamodel/1.4}AUCodeSetsYesOrNoCategoryType" minOccurs="0"/>
 *         &lt;element name="GiftedTalented" type="{http://www.sifassociation.org/au/datamodel/1.4}AUCodeSetsYesOrNoCategoryType" minOccurs="0"/>
 *         &lt;element name="EconomicDisadvantage" type="{http://www.sifassociation.org/au/datamodel/1.4}AUCodeSetsYesOrNoCategoryType" minOccurs="0"/>
 *         &lt;element name="ESL" type="{http://www.sifassociation.org/au/datamodel/1.4}AUCodeSetsYesOrNoCategoryType" minOccurs="0"/>
 *         &lt;element name="YoungCarersRole" type="{http://www.sifassociation.org/au/datamodel/1.4}AUCodeSetsYesOrNoCategoryType" minOccurs="0"/>
 *         &lt;element name="Disability" type="{http://www.sifassociation.org/au/datamodel/1.4}AUCodeSetsYesOrNoCategoryType" minOccurs="0"/>
 *         &lt;element name="IntegrationAide" type="{http://www.sifassociation.org/au/datamodel/1.4}AUCodeSetsYesOrNoCategoryType" minOccurs="0"/>
 *         &lt;element name="PrePrimaryEducation" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="FirstAUSchoolEnrollment" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="SIF_Metadata" type="{http://www.sifassociation.org/au/datamodel/1.4}SIF_MetadataType" minOccurs="0"/>
 *         &lt;element name="SIF_ExtendedElements" type="{http://www.sifassociation.org/au/datamodel/1.4}SIF_ExtendedElementsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="RefId" use="required" type="{http://www.sifassociation.org/au/datamodel/1.4}RefIdType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StudentPersonalType", namespace = "http://www.sifassociation.org/au/datamodel/1.4", propOrder = {
    "alertMessages",
    "medicalAlertMessages",
    "localId",
    "stateProvinceId",
    "electronicIdList",
    "otherIdList",
    "personInfo",
    "projectedGraduationYear",
    "onTimeGraduationYear",
    "graduationDate",
    "mostRecent",
    "napRegistration",
    "acceptableUsePolicy",
    "giftedTalented",
    "economicDisadvantage",
    "esl",
    "youngCarersRole",
    "disability",
    "integrationAide",
    "prePrimaryEducation",
    "firstAUSchoolEnrollment",
    "sifMetadata",
    "sifExtendedElements"
})
public class StudentPersonalType {

    @XmlElementRef(name = "AlertMessages", namespace = "http://www.sifassociation.org/au/datamodel/1.4", type = JAXBElement.class, required = false)
    protected JAXBElement<StudentPersonalType.AlertMessages> alertMessages;
    @XmlElementRef(name = "MedicalAlertMessages", namespace = "http://www.sifassociation.org/au/datamodel/1.4", type = JAXBElement.class, required = false)
    protected JAXBElement<StudentPersonalType.MedicalAlertMessages> medicalAlertMessages;
    @XmlElement(name = "LocalId", namespace = "http://www.sifassociation.org/au/datamodel/1.4")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String localId;
    @XmlElementRef(name = "StateProvinceId", namespace = "http://www.sifassociation.org/au/datamodel/1.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> stateProvinceId;
    @XmlElementRef(name = "ElectronicIdList", namespace = "http://www.sifassociation.org/au/datamodel/1.4", type = JAXBElement.class, required = false)
    protected JAXBElement<ElectronicIdListType> electronicIdList;
    @XmlElementRef(name = "OtherIdList", namespace = "http://www.sifassociation.org/au/datamodel/1.4", type = JAXBElement.class, required = false)
    protected JAXBElement<StudentPersonalType.OtherIdList> otherIdList;
    @XmlElement(name = "PersonInfo", namespace = "http://www.sifassociation.org/au/datamodel/1.4")
    protected PersonInfoType personInfo;
    @XmlElementRef(name = "ProjectedGraduationYear", namespace = "http://www.sifassociation.org/au/datamodel/1.4", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> projectedGraduationYear;
    @XmlElementRef(name = "OnTimeGraduationYear", namespace = "http://www.sifassociation.org/au/datamodel/1.4", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> onTimeGraduationYear;
    @XmlElementRef(name = "GraduationDate", namespace = "http://www.sifassociation.org/au/datamodel/1.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> graduationDate;
    @XmlElementRef(name = "MostRecent", namespace = "http://www.sifassociation.org/au/datamodel/1.4", type = JAXBElement.class, required = false)
    protected JAXBElement<StudentPersonalType.MostRecent> mostRecent;
    @XmlElementRef(name = "NAPRegistration", namespace = "http://www.sifassociation.org/au/datamodel/1.4", type = JAXBElement.class, required = false)
    protected JAXBElement<Object> napRegistration;
    @XmlElementRef(name = "AcceptableUsePolicy", namespace = "http://www.sifassociation.org/au/datamodel/1.4", type = JAXBElement.class, required = false)
    protected JAXBElement<AUCodeSetsYesOrNoCategoryType> acceptableUsePolicy;
    @XmlElementRef(name = "GiftedTalented", namespace = "http://www.sifassociation.org/au/datamodel/1.4", type = JAXBElement.class, required = false)
    protected JAXBElement<AUCodeSetsYesOrNoCategoryType> giftedTalented;
    @XmlElementRef(name = "EconomicDisadvantage", namespace = "http://www.sifassociation.org/au/datamodel/1.4", type = JAXBElement.class, required = false)
    protected JAXBElement<AUCodeSetsYesOrNoCategoryType> economicDisadvantage;
    @XmlElementRef(name = "ESL", namespace = "http://www.sifassociation.org/au/datamodel/1.4", type = JAXBElement.class, required = false)
    protected JAXBElement<AUCodeSetsYesOrNoCategoryType> esl;
    @XmlElementRef(name = "YoungCarersRole", namespace = "http://www.sifassociation.org/au/datamodel/1.4", type = JAXBElement.class, required = false)
    protected JAXBElement<AUCodeSetsYesOrNoCategoryType> youngCarersRole;
    @XmlElementRef(name = "Disability", namespace = "http://www.sifassociation.org/au/datamodel/1.4", type = JAXBElement.class, required = false)
    protected JAXBElement<AUCodeSetsYesOrNoCategoryType> disability;
    @XmlElementRef(name = "IntegrationAide", namespace = "http://www.sifassociation.org/au/datamodel/1.4", type = JAXBElement.class, required = false)
    protected JAXBElement<AUCodeSetsYesOrNoCategoryType> integrationAide;
    @XmlElementRef(name = "PrePrimaryEducation", namespace = "http://www.sifassociation.org/au/datamodel/1.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> prePrimaryEducation;
    @XmlElementRef(name = "FirstAUSchoolEnrollment", namespace = "http://www.sifassociation.org/au/datamodel/1.4", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> firstAUSchoolEnrollment;
    @XmlElementRef(name = "SIF_Metadata", namespace = "http://www.sifassociation.org/au/datamodel/1.4", type = JAXBElement.class, required = false)
    protected JAXBElement<SIFMetadataType> sifMetadata;
    @XmlElementRef(name = "SIF_ExtendedElements", namespace = "http://www.sifassociation.org/au/datamodel/1.4", type = JAXBElement.class, required = false)
    protected JAXBElement<SIFExtendedElementsType> sifExtendedElements;
    @XmlAttribute(name = "RefId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refId;

    /**
     * Gets the value of the alertMessages property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StudentPersonalType.AlertMessages }{@code >}
     *     
     */
    public JAXBElement<StudentPersonalType.AlertMessages> getAlertMessages() {
        return alertMessages;
    }

    /**
     * Sets the value of the alertMessages property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StudentPersonalType.AlertMessages }{@code >}
     *     
     */
    public void setAlertMessages(JAXBElement<StudentPersonalType.AlertMessages> value) {
        this.alertMessages = value;
    }

    /**
     * Gets the value of the medicalAlertMessages property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StudentPersonalType.MedicalAlertMessages }{@code >}
     *     
     */
    public JAXBElement<StudentPersonalType.MedicalAlertMessages> getMedicalAlertMessages() {
        return medicalAlertMessages;
    }

    /**
     * Sets the value of the medicalAlertMessages property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StudentPersonalType.MedicalAlertMessages }{@code >}
     *     
     */
    public void setMedicalAlertMessages(JAXBElement<StudentPersonalType.MedicalAlertMessages> value) {
        this.medicalAlertMessages = value;
    }

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
     * Gets the value of the stateProvinceId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStateProvinceId() {
        return stateProvinceId;
    }

    /**
     * Sets the value of the stateProvinceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStateProvinceId(JAXBElement<String> value) {
        this.stateProvinceId = value;
    }

    /**
     * Gets the value of the electronicIdList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ElectronicIdListType }{@code >}
     *     
     */
    public JAXBElement<ElectronicIdListType> getElectronicIdList() {
        return electronicIdList;
    }

    /**
     * Sets the value of the electronicIdList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ElectronicIdListType }{@code >}
     *     
     */
    public void setElectronicIdList(JAXBElement<ElectronicIdListType> value) {
        this.electronicIdList = value;
    }

    /**
     * Gets the value of the otherIdList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StudentPersonalType.OtherIdList }{@code >}
     *     
     */
    public JAXBElement<StudentPersonalType.OtherIdList> getOtherIdList() {
        return otherIdList;
    }

    /**
     * Sets the value of the otherIdList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StudentPersonalType.OtherIdList }{@code >}
     *     
     */
    public void setOtherIdList(JAXBElement<StudentPersonalType.OtherIdList> value) {
        this.otherIdList = value;
    }

    /**
     * Gets the value of the personInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PersonInfoType }
     *     
     */
    public PersonInfoType getPersonInfo() {
        return personInfo;
    }

    /**
     * Sets the value of the personInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonInfoType }
     *     
     */
    public void setPersonInfo(PersonInfoType value) {
        this.personInfo = value;
    }

    /**
     * Gets the value of the projectedGraduationYear property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getProjectedGraduationYear() {
        return projectedGraduationYear;
    }

    /**
     * Sets the value of the projectedGraduationYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setProjectedGraduationYear(JAXBElement<XMLGregorianCalendar> value) {
        this.projectedGraduationYear = value;
    }

    /**
     * Gets the value of the onTimeGraduationYear property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getOnTimeGraduationYear() {
        return onTimeGraduationYear;
    }

    /**
     * Sets the value of the onTimeGraduationYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setOnTimeGraduationYear(JAXBElement<XMLGregorianCalendar> value) {
        this.onTimeGraduationYear = value;
    }

    /**
     * Gets the value of the graduationDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGraduationDate() {
        return graduationDate;
    }

    /**
     * Sets the value of the graduationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGraduationDate(JAXBElement<String> value) {
        this.graduationDate = value;
    }

    /**
     * Gets the value of the mostRecent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StudentPersonalType.MostRecent }{@code >}
     *     
     */
    public JAXBElement<StudentPersonalType.MostRecent> getMostRecent() {
        return mostRecent;
    }

    /**
     * Sets the value of the mostRecent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StudentPersonalType.MostRecent }{@code >}
     *     
     */
    public void setMostRecent(JAXBElement<StudentPersonalType.MostRecent> value) {
        this.mostRecent = value;
    }

    /**
     * Gets the value of the napRegistration property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public JAXBElement<Object> getNAPRegistration() {
        return napRegistration;
    }

    /**
     * Sets the value of the napRegistration property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public void setNAPRegistration(JAXBElement<Object> value) {
        this.napRegistration = value;
    }

    /**
     * Gets the value of the acceptableUsePolicy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}
     *     
     */
    public JAXBElement<AUCodeSetsYesOrNoCategoryType> getAcceptableUsePolicy() {
        return acceptableUsePolicy;
    }

    /**
     * Sets the value of the acceptableUsePolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}
     *     
     */
    public void setAcceptableUsePolicy(JAXBElement<AUCodeSetsYesOrNoCategoryType> value) {
        this.acceptableUsePolicy = value;
    }

    /**
     * Gets the value of the giftedTalented property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}
     *     
     */
    public JAXBElement<AUCodeSetsYesOrNoCategoryType> getGiftedTalented() {
        return giftedTalented;
    }

    /**
     * Sets the value of the giftedTalented property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}
     *     
     */
    public void setGiftedTalented(JAXBElement<AUCodeSetsYesOrNoCategoryType> value) {
        this.giftedTalented = value;
    }

    /**
     * Gets the value of the economicDisadvantage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}
     *     
     */
    public JAXBElement<AUCodeSetsYesOrNoCategoryType> getEconomicDisadvantage() {
        return economicDisadvantage;
    }

    /**
     * Sets the value of the economicDisadvantage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}
     *     
     */
    public void setEconomicDisadvantage(JAXBElement<AUCodeSetsYesOrNoCategoryType> value) {
        this.economicDisadvantage = value;
    }

    /**
     * Gets the value of the esl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}
     *     
     */
    public JAXBElement<AUCodeSetsYesOrNoCategoryType> getESL() {
        return esl;
    }

    /**
     * Sets the value of the esl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}
     *     
     */
    public void setESL(JAXBElement<AUCodeSetsYesOrNoCategoryType> value) {
        this.esl = value;
    }

    /**
     * Gets the value of the youngCarersRole property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}
     *     
     */
    public JAXBElement<AUCodeSetsYesOrNoCategoryType> getYoungCarersRole() {
        return youngCarersRole;
    }

    /**
     * Sets the value of the youngCarersRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}
     *     
     */
    public void setYoungCarersRole(JAXBElement<AUCodeSetsYesOrNoCategoryType> value) {
        this.youngCarersRole = value;
    }

    /**
     * Gets the value of the disability property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}
     *     
     */
    public JAXBElement<AUCodeSetsYesOrNoCategoryType> getDisability() {
        return disability;
    }

    /**
     * Sets the value of the disability property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}
     *     
     */
    public void setDisability(JAXBElement<AUCodeSetsYesOrNoCategoryType> value) {
        this.disability = value;
    }

    /**
     * Gets the value of the integrationAide property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}
     *     
     */
    public JAXBElement<AUCodeSetsYesOrNoCategoryType> getIntegrationAide() {
        return integrationAide;
    }

    /**
     * Sets the value of the integrationAide property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}
     *     
     */
    public void setIntegrationAide(JAXBElement<AUCodeSetsYesOrNoCategoryType> value) {
        this.integrationAide = value;
    }

    /**
     * Gets the value of the prePrimaryEducation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrePrimaryEducation() {
        return prePrimaryEducation;
    }

    /**
     * Sets the value of the prePrimaryEducation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrePrimaryEducation(JAXBElement<String> value) {
        this.prePrimaryEducation = value;
    }

    /**
     * Gets the value of the firstAUSchoolEnrollment property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFirstAUSchoolEnrollment() {
        return firstAUSchoolEnrollment;
    }

    /**
     * Sets the value of the firstAUSchoolEnrollment property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFirstAUSchoolEnrollment(JAXBElement<XMLGregorianCalendar> value) {
        this.firstAUSchoolEnrollment = value;
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="AlertMessage" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;attribute name="Type" use="required">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
     *                       &lt;enumeration value="Legal"/>
     *                       &lt;enumeration value="Discipline"/>
     *                       &lt;enumeration value="Educational"/>
     *                       &lt;enumeration value="Other"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "alertMessage"
    })
    public static class AlertMessages {

        @XmlElement(name = "AlertMessage", namespace = "http://www.sifassociation.org/au/datamodel/1.4")
        protected List<StudentPersonalType.AlertMessages.AlertMessage> alertMessage;

        /**
         * Gets the value of the alertMessage property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the alertMessage property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAlertMessage().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link StudentPersonalType.AlertMessages.AlertMessage }
         * 
         * 
         */
        public List<StudentPersonalType.AlertMessages.AlertMessage> getAlertMessage() {
            if (alertMessage == null) {
                alertMessage = new ArrayList<StudentPersonalType.AlertMessages.AlertMessage>();
            }
            return this.alertMessage;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *       &lt;attribute name="Type" use="required">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
         *             &lt;enumeration value="Legal"/>
         *             &lt;enumeration value="Discipline"/>
         *             &lt;enumeration value="Educational"/>
         *             &lt;enumeration value="Other"/>
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
        public static class AlertMessage {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "Type", required = true)
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String type;

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

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="MedicalAlertMessage" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;attribute name="Severity" use="required">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
     *                       &lt;enumeration value="Low"/>
     *                       &lt;enumeration value="Moderate"/>
     *                       &lt;enumeration value="High"/>
     *                       &lt;enumeration value="Severe"/>
     *                       &lt;enumeration value="Unknown"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "medicalAlertMessage"
    })
    public static class MedicalAlertMessages {

        @XmlElement(name = "MedicalAlertMessage", namespace = "http://www.sifassociation.org/au/datamodel/1.4")
        protected List<StudentPersonalType.MedicalAlertMessages.MedicalAlertMessage> medicalAlertMessage;

        /**
         * Gets the value of the medicalAlertMessage property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the medicalAlertMessage property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMedicalAlertMessage().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link StudentPersonalType.MedicalAlertMessages.MedicalAlertMessage }
         * 
         * 
         */
        public List<StudentPersonalType.MedicalAlertMessages.MedicalAlertMessage> getMedicalAlertMessage() {
            if (medicalAlertMessage == null) {
                medicalAlertMessage = new ArrayList<StudentPersonalType.MedicalAlertMessages.MedicalAlertMessage>();
            }
            return this.medicalAlertMessage;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *       &lt;attribute name="Severity" use="required">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
         *             &lt;enumeration value="Low"/>
         *             &lt;enumeration value="Moderate"/>
         *             &lt;enumeration value="High"/>
         *             &lt;enumeration value="Severe"/>
         *             &lt;enumeration value="Unknown"/>
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
        public static class MedicalAlertMessage {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "Severity", required = true)
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String severity;

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
             * Gets the value of the severity property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSeverity() {
                return severity;
            }

            /**
             * Sets the value of the severity property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSeverity(String value) {
                this.severity = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="SchoolLocalId" type="{http://www.sifassociation.org/au/datamodel/1.4}LocalIdType" minOccurs="0"/>
     *         &lt;element name="HomeroomLocalId" type="{http://www.sifassociation.org/au/datamodel/1.4}LocalIdType" minOccurs="0"/>
     *         &lt;element name="YearLevel" type="{http://www.sifassociation.org/au/datamodel/1.4}YearLevelType" minOccurs="0"/>
     *         &lt;element name="FTE" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *               &lt;minInclusive value="0"/>
     *               &lt;maxInclusive value="1"/>
     *               &lt;fractionDigits value="2"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="Parent1Language" type="{http://www.sifassociation.org/au/datamodel/1.4}AUCodeSetsAustralianStandardClassificationOfLanguagesASCLType" minOccurs="0"/>
     *         &lt;element name="Parent2Language" type="{http://www.sifassociation.org/au/datamodel/1.4}AUCodeSetsAustralianStandardClassificationOfLanguagesASCLType" minOccurs="0"/>
     *         &lt;element name="Parent1EmploymentType" type="{http://www.sifassociation.org/au/datamodel/1.4}AUCodeSetsEmploymentTypeType" minOccurs="0"/>
     *         &lt;element name="Parent2EmploymentType" type="{http://www.sifassociation.org/au/datamodel/1.4}AUCodeSetsEmploymentTypeType" minOccurs="0"/>
     *         &lt;element name="Parent1SchoolEducationLevel" type="{http://www.sifassociation.org/au/datamodel/1.4}AUCodeSetsSchoolEducationLevelTypeType" minOccurs="0"/>
     *         &lt;element name="Parent2SchoolEducationLevel" type="{http://www.sifassociation.org/au/datamodel/1.4}AUCodeSetsSchoolEducationLevelTypeType" minOccurs="0"/>
     *         &lt;element name="Parent1NonSchoolEducation" type="{http://www.sifassociation.org/au/datamodel/1.4}AUCodeSetsNonSchoolEducationType" minOccurs="0"/>
     *         &lt;element name="Parent2NonSchoolEducation" type="{http://www.sifassociation.org/au/datamodel/1.4}AUCodeSetsNonSchoolEducationType" minOccurs="0"/>
     *         &lt;element name="Parent1Sex" type="{http://www.sifassociation.org/au/datamodel/1.4}AUCodeSetsSexCodeType" minOccurs="0"/>
     *         &lt;element name="Parent2Sex" type="{http://www.sifassociation.org/au/datamodel/1.4}AUCodeSetsSexCodeType" minOccurs="0"/>
     *         &lt;element name="Parent1Relationship" type="{http://www.sifassociation.org/au/datamodel/1.4}RelationshipType" minOccurs="0"/>
     *         &lt;element name="Parent2Relationship" type="{http://www.sifassociation.org/au/datamodel/1.4}RelationshipType" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "schoolLocalId",
        "homeroomLocalId",
        "yearLevel",
        "fte",
        "parent1Language",
        "parent2Language",
        "parent1EmploymentType",
        "parent2EmploymentType",
        "parent1SchoolEducationLevel",
        "parent2SchoolEducationLevel",
        "parent1NonSchoolEducation",
        "parent2NonSchoolEducation",
        "parent1Sex",
        "parent2Sex",
        "parent1Relationship",
        "parent2Relationship"
    })
    public static class MostRecent {

        @XmlElementRef(name = "SchoolLocalId", namespace = "http://www.sifassociation.org/au/datamodel/1.4", type = JAXBElement.class, required = false)
        protected JAXBElement<String> schoolLocalId;
        @XmlElementRef(name = "HomeroomLocalId", namespace = "http://www.sifassociation.org/au/datamodel/1.4", type = JAXBElement.class, required = false)
        protected JAXBElement<String> homeroomLocalId;
        @XmlElementRef(name = "YearLevel", namespace = "http://www.sifassociation.org/au/datamodel/1.4", type = JAXBElement.class, required = false)
        protected JAXBElement<YearLevelType> yearLevel;
        @XmlElementRef(name = "FTE", namespace = "http://www.sifassociation.org/au/datamodel/1.4", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> fte;
        @XmlElementRef(name = "Parent1Language", namespace = "http://www.sifassociation.org/au/datamodel/1.4", type = JAXBElement.class, required = false)
        protected JAXBElement<String> parent1Language;
        @XmlElementRef(name = "Parent2Language", namespace = "http://www.sifassociation.org/au/datamodel/1.4", type = JAXBElement.class, required = false)
        protected JAXBElement<String> parent2Language;
        @XmlElementRef(name = "Parent1EmploymentType", namespace = "http://www.sifassociation.org/au/datamodel/1.4", type = JAXBElement.class, required = false)
        protected JAXBElement<String> parent1EmploymentType;
        @XmlElementRef(name = "Parent2EmploymentType", namespace = "http://www.sifassociation.org/au/datamodel/1.4", type = JAXBElement.class, required = false)
        protected JAXBElement<String> parent2EmploymentType;
        @XmlElementRef(name = "Parent1SchoolEducationLevel", namespace = "http://www.sifassociation.org/au/datamodel/1.4", type = JAXBElement.class, required = false)
        protected JAXBElement<String> parent1SchoolEducationLevel;
        @XmlElementRef(name = "Parent2SchoolEducationLevel", namespace = "http://www.sifassociation.org/au/datamodel/1.4", type = JAXBElement.class, required = false)
        protected JAXBElement<String> parent2SchoolEducationLevel;
        @XmlElementRef(name = "Parent1NonSchoolEducation", namespace = "http://www.sifassociation.org/au/datamodel/1.4", type = JAXBElement.class, required = false)
        protected JAXBElement<String> parent1NonSchoolEducation;
        @XmlElementRef(name = "Parent2NonSchoolEducation", namespace = "http://www.sifassociation.org/au/datamodel/1.4", type = JAXBElement.class, required = false)
        protected JAXBElement<String> parent2NonSchoolEducation;
        @XmlElementRef(name = "Parent1Sex", namespace = "http://www.sifassociation.org/au/datamodel/1.4", type = JAXBElement.class, required = false)
        protected JAXBElement<String> parent1Sex;
        @XmlElementRef(name = "Parent2Sex", namespace = "http://www.sifassociation.org/au/datamodel/1.4", type = JAXBElement.class, required = false)
        protected JAXBElement<String> parent2Sex;
        @XmlElementRef(name = "Parent1Relationship", namespace = "http://www.sifassociation.org/au/datamodel/1.4", type = JAXBElement.class, required = false)
        protected JAXBElement<RelationshipType> parent1Relationship;
        @XmlElementRef(name = "Parent2Relationship", namespace = "http://www.sifassociation.org/au/datamodel/1.4", type = JAXBElement.class, required = false)
        protected JAXBElement<RelationshipType> parent2Relationship;

        /**
         * Gets the value of the schoolLocalId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getSchoolLocalId() {
            return schoolLocalId;
        }

        /**
         * Sets the value of the schoolLocalId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setSchoolLocalId(JAXBElement<String> value) {
            this.schoolLocalId = value;
        }

        /**
         * Gets the value of the homeroomLocalId property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getHomeroomLocalId() {
            return homeroomLocalId;
        }

        /**
         * Sets the value of the homeroomLocalId property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setHomeroomLocalId(JAXBElement<String> value) {
            this.homeroomLocalId = value;
        }

        /**
         * Gets the value of the yearLevel property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link YearLevelType }{@code >}
         *     
         */
        public JAXBElement<YearLevelType> getYearLevel() {
            return yearLevel;
        }

        /**
         * Sets the value of the yearLevel property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link YearLevelType }{@code >}
         *     
         */
        public void setYearLevel(JAXBElement<YearLevelType> value) {
            this.yearLevel = value;
        }

        /**
         * Gets the value of the fte property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getFTE() {
            return fte;
        }

        /**
         * Sets the value of the fte property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setFTE(JAXBElement<BigDecimal> value) {
            this.fte = value;
        }

        /**
         * Gets the value of the parent1Language property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getParent1Language() {
            return parent1Language;
        }

        /**
         * Sets the value of the parent1Language property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setParent1Language(JAXBElement<String> value) {
            this.parent1Language = value;
        }

        /**
         * Gets the value of the parent2Language property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getParent2Language() {
            return parent2Language;
        }

        /**
         * Sets the value of the parent2Language property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setParent2Language(JAXBElement<String> value) {
            this.parent2Language = value;
        }

        /**
         * Gets the value of the parent1EmploymentType property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getParent1EmploymentType() {
            return parent1EmploymentType;
        }

        /**
         * Sets the value of the parent1EmploymentType property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setParent1EmploymentType(JAXBElement<String> value) {
            this.parent1EmploymentType = value;
        }

        /**
         * Gets the value of the parent2EmploymentType property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getParent2EmploymentType() {
            return parent2EmploymentType;
        }

        /**
         * Sets the value of the parent2EmploymentType property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setParent2EmploymentType(JAXBElement<String> value) {
            this.parent2EmploymentType = value;
        }

        /**
         * Gets the value of the parent1SchoolEducationLevel property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getParent1SchoolEducationLevel() {
            return parent1SchoolEducationLevel;
        }

        /**
         * Sets the value of the parent1SchoolEducationLevel property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setParent1SchoolEducationLevel(JAXBElement<String> value) {
            this.parent1SchoolEducationLevel = value;
        }

        /**
         * Gets the value of the parent2SchoolEducationLevel property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getParent2SchoolEducationLevel() {
            return parent2SchoolEducationLevel;
        }

        /**
         * Sets the value of the parent2SchoolEducationLevel property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setParent2SchoolEducationLevel(JAXBElement<String> value) {
            this.parent2SchoolEducationLevel = value;
        }

        /**
         * Gets the value of the parent1NonSchoolEducation property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getParent1NonSchoolEducation() {
            return parent1NonSchoolEducation;
        }

        /**
         * Sets the value of the parent1NonSchoolEducation property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setParent1NonSchoolEducation(JAXBElement<String> value) {
            this.parent1NonSchoolEducation = value;
        }

        /**
         * Gets the value of the parent2NonSchoolEducation property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getParent2NonSchoolEducation() {
            return parent2NonSchoolEducation;
        }

        /**
         * Sets the value of the parent2NonSchoolEducation property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setParent2NonSchoolEducation(JAXBElement<String> value) {
            this.parent2NonSchoolEducation = value;
        }

        /**
         * Gets the value of the parent1Sex property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getParent1Sex() {
            return parent1Sex;
        }

        /**
         * Sets the value of the parent1Sex property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setParent1Sex(JAXBElement<String> value) {
            this.parent1Sex = value;
        }

        /**
         * Gets the value of the parent2Sex property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getParent2Sex() {
            return parent2Sex;
        }

        /**
         * Sets the value of the parent2Sex property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setParent2Sex(JAXBElement<String> value) {
            this.parent2Sex = value;
        }

        /**
         * Gets the value of the parent1Relationship property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link RelationshipType }{@code >}
         *     
         */
        public JAXBElement<RelationshipType> getParent1Relationship() {
            return parent1Relationship;
        }

        /**
         * Sets the value of the parent1Relationship property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link RelationshipType }{@code >}
         *     
         */
        public void setParent1Relationship(JAXBElement<RelationshipType> value) {
            this.parent1Relationship = value;
        }

        /**
         * Gets the value of the parent2Relationship property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link RelationshipType }{@code >}
         *     
         */
        public JAXBElement<RelationshipType> getParent2Relationship() {
            return parent2Relationship;
        }

        /**
         * Sets the value of the parent2Relationship property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link RelationshipType }{@code >}
         *     
         */
        public void setParent2Relationship(JAXBElement<RelationshipType> value) {
            this.parent2Relationship = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="OtherId" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>normalizedString">
     *                 &lt;attribute name="Type" use="required" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "otherId"
    })
    public static class OtherIdList {

        @XmlElement(name = "OtherId", namespace = "http://www.sifassociation.org/au/datamodel/1.4")
        protected List<StudentPersonalType.OtherIdList.OtherId> otherId;

        /**
         * Gets the value of the otherId property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the otherId property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOtherId().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link StudentPersonalType.OtherIdList.OtherId }
         * 
         * 
         */
        public List<StudentPersonalType.OtherIdList.OtherId> getOtherId() {
            if (otherId == null) {
                otherId = new ArrayList<StudentPersonalType.OtherIdList.OtherId>();
            }
            return this.otherId;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>normalizedString">
         *       &lt;attribute name="Type" use="required" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
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
        public static class OtherId {

            @XmlValue
            @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
            @XmlSchemaType(name = "normalizedString")
            protected String value;
            @XmlAttribute(name = "Type", required = true)
            @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
            @XmlSchemaType(name = "normalizedString")
            protected String type;

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

        }

    }

}
