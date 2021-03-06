
package sif.dd.unity.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TermInfoCollectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TermInfoCollectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TermInfo" type="{http://www.sifassociation.org/datamodel/na/4.x}TermInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TermInfoCollectionType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "termInfo"
})
public class TermInfoCollectionType {

    @XmlElement(name = "TermInfo", namespace = "http://www.sifassociation.org/datamodel/na/4.x")
    protected List<TermInfoType> termInfo;

    /**
     * Gets the value of the termInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the termInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTermInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TermInfoType }
     * 
     * 
     */
    public List<TermInfoType> getTermInfo() {
        if (termInfo == null) {
            termInfo = new ArrayList<TermInfoType>();
        }
        return this.termInfo;
    }

}
