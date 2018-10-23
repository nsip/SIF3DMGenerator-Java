
package sif.dd.au30.model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 *         This common metadata element describes the life cycle of the object it represents, based on the IEEE LOM LifeCycle element [LOM].
 *       
 * 
 * <p>Java class for LifeCycleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LifeCycleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Created" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="DateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="Creators" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Creator" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
 *                                       &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ModificationHistory" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Modified" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="By" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
 *                             &lt;element name="DateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                             &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TimeElements" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="TimeElement" type="{http://www.sifassociation.org/datamodel/au/3.4}TimeElementType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
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
@XmlType(name = "LifeCycleType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "created",
    "modificationHistory",
    "timeElements"
})
public class LifeCycleType {

    @XmlElementRef(name = "Created", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<LifeCycleType.Created> created;
    @XmlElementRef(name = "ModificationHistory", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<LifeCycleType.ModificationHistory> modificationHistory;
    @XmlElementRef(name = "TimeElements", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<LifeCycleType.TimeElements> timeElements;

    /**
     * Gets the value of the created property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LifeCycleType.Created }{@code >}
     *     
     */
    public JAXBElement<LifeCycleType.Created> getCreated() {
        return created;
    }

    /**
     * Sets the value of the created property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LifeCycleType.Created }{@code >}
     *     
     */
    public void setCreated(JAXBElement<LifeCycleType.Created> value) {
        this.created = value;
    }

    /**
     * Gets the value of the modificationHistory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LifeCycleType.ModificationHistory }{@code >}
     *     
     */
    public JAXBElement<LifeCycleType.ModificationHistory> getModificationHistory() {
        return modificationHistory;
    }

    /**
     * Sets the value of the modificationHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LifeCycleType.ModificationHistory }{@code >}
     *     
     */
    public void setModificationHistory(JAXBElement<LifeCycleType.ModificationHistory> value) {
        this.modificationHistory = value;
    }

    /**
     * Gets the value of the timeElements property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LifeCycleType.TimeElements }{@code >}
     *     
     */
    public JAXBElement<LifeCycleType.TimeElements> getTimeElements() {
        return timeElements;
    }

    /**
     * Sets the value of the timeElements property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LifeCycleType.TimeElements }{@code >}
     *     
     */
    public void setTimeElements(JAXBElement<LifeCycleType.TimeElements> value) {
        this.timeElements = value;
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
     *         &lt;element name="DateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *         &lt;element name="Creators" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Creator" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
     *                             &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
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
        "dateTime",
        "creators"
    })
    public static class Created {

        @XmlElement(name = "DateTime", namespace = "http://www.sifassociation.org/datamodel/au/3.4", required = true, type = String.class)
        @XmlJavaTypeAdapter(Adapter1 .class)
        @XmlSchemaType(name = "dateTime")
        protected Calendar dateTime;
        @XmlElementRef(name = "Creators", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
        protected JAXBElement<LifeCycleType.Created.Creators> creators;

        /**
         * Gets the value of the dateTime property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public Calendar getDateTime() {
            return dateTime;
        }

        /**
         * Sets the value of the dateTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDateTime(Calendar value) {
            this.dateTime = value;
        }

        /**
         * Gets the value of the creators property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link LifeCycleType.Created.Creators }{@code >}
         *     
         */
        public JAXBElement<LifeCycleType.Created.Creators> getCreators() {
            return creators;
        }

        /**
         * Sets the value of the creators property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link LifeCycleType.Created.Creators }{@code >}
         *     
         */
        public void setCreators(JAXBElement<LifeCycleType.Created.Creators> value) {
            this.creators = value;
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
         *         &lt;element name="Creator" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
         *                   &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
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
            "creator"
        })
        public static class Creators {

            @XmlElement(name = "Creator", namespace = "http://www.sifassociation.org/datamodel/au/3.4", required = true)
            protected List<LifeCycleType.Created.Creators.Creator> creator;

            /**
             * Gets the value of the creator property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the creator property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCreator().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link LifeCycleType.Created.Creators.Creator }
             * 
             * 
             */
            public List<LifeCycleType.Created.Creators.Creator> getCreator() {
                if (creator == null) {
                    creator = new ArrayList<LifeCycleType.Created.Creators.Creator>();
                }
                return this.creator;
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
             *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
             *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
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
                "name",
                "id"
            })
            public static class Creator {

                @XmlElement(name = "Name", namespace = "http://www.sifassociation.org/datamodel/au/3.4", required = true)
                @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
                @XmlSchemaType(name = "normalizedString")
                protected String name;
                @XmlElement(name = "ID", namespace = "http://www.sifassociation.org/datamodel/au/3.4", required = true)
                @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
                @XmlSchemaType(name = "normalizedString")
                protected String id;

                /**
                 * Gets the value of the name property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getName() {
                    return name;
                }

                /**
                 * Sets the value of the name property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setName(String value) {
                    this.name = value;
                }

                /**
                 * Gets the value of the id property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getID() {
                    return id;
                }

                /**
                 * Sets the value of the id property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setID(String value) {
                    this.id = value;
                }

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
     *         &lt;element name="Modified" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="By" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
     *                   &lt;element name="DateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *                   &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
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
        "modified"
    })
    public static class ModificationHistory {

        @XmlElement(name = "Modified", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
        protected List<LifeCycleType.ModificationHistory.Modified> modified;

        /**
         * Gets the value of the modified property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the modified property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getModified().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LifeCycleType.ModificationHistory.Modified }
         * 
         * 
         */
        public List<LifeCycleType.ModificationHistory.Modified> getModified() {
            if (modified == null) {
                modified = new ArrayList<LifeCycleType.ModificationHistory.Modified>();
            }
            return this.modified;
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
         *         &lt;element name="By" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
         *         &lt;element name="DateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
         *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "by",
            "dateTime",
            "description"
        })
        public static class Modified {

            @XmlElement(name = "By", namespace = "http://www.sifassociation.org/datamodel/au/3.4", required = true)
            @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
            @XmlSchemaType(name = "normalizedString")
            protected String by;
            @XmlElement(name = "DateTime", namespace = "http://www.sifassociation.org/datamodel/au/3.4", required = true, type = String.class)
            @XmlJavaTypeAdapter(Adapter1 .class)
            @XmlSchemaType(name = "dateTime")
            protected Calendar dateTime;
            @XmlElementRef(name = "Description", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
            protected JAXBElement<String> description;

            /**
             * Gets the value of the by property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBy() {
                return by;
            }

            /**
             * Sets the value of the by property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBy(String value) {
                this.by = value;
            }

            /**
             * Gets the value of the dateTime property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public Calendar getDateTime() {
                return dateTime;
            }

            /**
             * Sets the value of the dateTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDateTime(Calendar value) {
                this.dateTime = value;
            }

            /**
             * Gets the value of the description property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getDescription() {
                return description;
            }

            /**
             * Sets the value of the description property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setDescription(JAXBElement<String> value) {
                this.description = value;
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
     *         &lt;element name="TimeElement" type="{http://www.sifassociation.org/datamodel/au/3.4}TimeElementType" maxOccurs="unbounded" minOccurs="0"/>
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
        "timeElement"
    })
    public static class TimeElements {

        @XmlElement(name = "TimeElement", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
        protected List<TimeElementType> timeElement;

        /**
         * Gets the value of the timeElement property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the timeElement property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTimeElement().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TimeElementType }
         * 
         * 
         */
        public List<TimeElementType> getTimeElement() {
            if (timeElement == null) {
                timeElement = new ArrayList<TimeElementType>();
            }
            return this.timeElement;
        }

    }

}
