
package sif.dd.us32.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for aeProgramCollectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="aeProgramCollectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="aeProgram" type="{http://www.sifassociation.org/datamodel/na/3.2}aeProgramType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "aeProgramCollectionType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "aeProgram"
})
public class AeProgramCollectionType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected List<AeProgramType> aeProgram;

    /**
     * Gets the value of the aeProgram property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aeProgram property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAeProgram().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AeProgramType }
     * 
     * 
     */
    public List<AeProgramType> getAeProgram() {
        if (aeProgram == null) {
            aeProgram = new ArrayList<AeProgramType>();
        }
        return this.aeProgram;
    }

}
