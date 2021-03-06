
package sif.dd.au30.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NAPEventStudentLinkCollectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NAPEventStudentLinkCollectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NAPEventStudentLink" type="{http://www.sifassociation.org/datamodel/au/3.4}NAPEventStudentLinkType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NAPEventStudentLinkCollectionType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "napEventStudentLink"
})
public class NAPEventStudentLinkCollectionType {

    @XmlElement(name = "NAPEventStudentLink", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected List<NAPEventStudentLinkType> napEventStudentLink;

    /**
     * Gets the value of the napEventStudentLink property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the napEventStudentLink property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNAPEventStudentLink().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NAPEventStudentLinkType }
     * 
     * 
     */
    public List<NAPEventStudentLinkType> getNAPEventStudentLink() {
        if (napEventStudentLink == null) {
            napEventStudentLink = new ArrayList<NAPEventStudentLinkType>();
        }
        return this.napEventStudentLink;
    }

}
