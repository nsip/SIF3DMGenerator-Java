
package sif.dd.us33.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for authenticationCollectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="authenticationCollectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="authentication" type="{http://www.sifassociation.org/datamodel/na/3.3}gAuthenticationType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "authenticationCollectionType", namespace = "http://www.sifassociation.org/datamodel/na/3.3", propOrder = {
    "authentication"
})
public class AuthenticationCollectionType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected List<GAuthenticationType> authentication;

    /**
     * Gets the value of the authentication property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the authentication property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthentication().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GAuthenticationType }
     * 
     * 
     */
    public List<GAuthenticationType> getAuthentication() {
        if (authentication == null) {
            authentication = new ArrayList<GAuthenticationType>();
        }
        return this.authentication;
    }

}
