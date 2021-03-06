
package sif.dd.unity.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for AggregateCharacteristicInfoRefIdListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AggregateCharacteristicInfoRefIdListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AggregateCharacteristicInfoRefId" type="{http://www.sifassociation.org/datamodel/na/4.x}IdRefType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AggregateCharacteristicInfoRefIdListType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "aggregateCharacteristicInfoRefId"
})
public class AggregateCharacteristicInfoRefIdListType {

    @XmlElement(name = "AggregateCharacteristicInfoRefId", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected List<String> aggregateCharacteristicInfoRefId;

    /**
     * Gets the value of the aggregateCharacteristicInfoRefId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aggregateCharacteristicInfoRefId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAggregateCharacteristicInfoRefId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAggregateCharacteristicInfoRefId() {
        if (aggregateCharacteristicInfoRefId == null) {
            aggregateCharacteristicInfoRefId = new ArrayList<String>();
        }
        return this.aggregateCharacteristicInfoRefId;
    }

}
