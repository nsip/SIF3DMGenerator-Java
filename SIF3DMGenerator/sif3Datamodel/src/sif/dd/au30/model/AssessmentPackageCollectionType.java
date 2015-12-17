
package sif.dd.au30.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssessmentPackageCollectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssessmentPackageCollectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AssessmentPackage" type="{http://www.sifassociation.org/au/datamodel/3.4}AssessmentPackageType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssessmentPackageCollectionType", namespace = "http://www.sifassociation.org/au/datamodel/3.4", propOrder = {
    "assessmentPackage"
})
public class AssessmentPackageCollectionType {

    @XmlElement(name = "AssessmentPackage", namespace = "http://www.sifassociation.org/au/datamodel/3.4")
    protected List<AssessmentPackageType> assessmentPackage;

    /**
     * Gets the value of the assessmentPackage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assessmentPackage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssessmentPackage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssessmentPackageType }
     * 
     * 
     */
    public List<AssessmentPackageType> getAssessmentPackage() {
        if (assessmentPackage == null) {
            assessmentPackage = new ArrayList<AssessmentPackageType>();
        }
        return this.assessmentPackage;
    }

}
