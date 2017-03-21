
package sif.dd.au30.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CodeFrameTestItemListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CodeFrameTestItemListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TestItem" type="{http://www.sifassociation.org/datamodel/au/3.4.1}CodeFrameTestItemType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CodeFrameTestItemListType", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", propOrder = {
    "testItem"
})
public class CodeFrameTestItemListType {

    @XmlElement(name = "TestItem", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", required = true)
    protected List<CodeFrameTestItemType> testItem;

    /**
     * Gets the value of the testItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the testItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTestItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeFrameTestItemType }
     * 
     * 
     */
    public List<CodeFrameTestItemType> getTestItem() {
        if (testItem == null) {
            testItem = new ArrayList<CodeFrameTestItemType>();
        }
        return this.testItem;
    }

}
