
package sif.dd.unity.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StudentContactPersonalCollectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StudentContactPersonalCollectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StudentContactPersonal" type="{http://www.sifassociation.org/datamodel/na/4.x}StudentContactPersonalType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StudentContactPersonalCollectionType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "studentContactPersonal"
})
public class StudentContactPersonalCollectionType {

    @XmlElement(name = "StudentContactPersonal", namespace = "http://www.sifassociation.org/datamodel/na/4.x")
    protected List<StudentContactPersonalType> studentContactPersonal;

    /**
     * Gets the value of the studentContactPersonal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the studentContactPersonal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStudentContactPersonal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StudentContactPersonalType }
     * 
     * 
     */
    public List<StudentContactPersonalType> getStudentContactPersonal() {
        if (studentContactPersonal == null) {
            studentContactPersonal = new ArrayList<StudentContactPersonalType>();
        }
        return this.studentContactPersonal;
    }

}
