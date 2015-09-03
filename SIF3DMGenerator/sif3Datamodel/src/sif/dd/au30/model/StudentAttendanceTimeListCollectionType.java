
package sif.dd.au30.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StudentAttendanceTimeListCollectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StudentAttendanceTimeListCollectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StudentAttendanceTimeList" type="{http://www.sifassociation.org/au/datamodel/1.4}StudentAttendanceTimeListType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StudentAttendanceTimeListCollectionType", namespace = "http://www.sifassociation.org/au/datamodel/1.4", propOrder = {
    "studentAttendanceTimeList"
})
public class StudentAttendanceTimeListCollectionType {

    @XmlElement(name = "StudentAttendanceTimeList", namespace = "http://www.sifassociation.org/au/datamodel/1.4")
    protected List<StudentAttendanceTimeListType> studentAttendanceTimeList;

    /**
     * Gets the value of the studentAttendanceTimeList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the studentAttendanceTimeList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStudentAttendanceTimeList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StudentAttendanceTimeListType }
     * 
     * 
     */
    public List<StudentAttendanceTimeListType> getStudentAttendanceTimeList() {
        if (studentAttendanceTimeList == null) {
            studentAttendanceTimeList = new ArrayList<StudentAttendanceTimeListType>();
        }
        return this.studentAttendanceTimeList;
    }

}
