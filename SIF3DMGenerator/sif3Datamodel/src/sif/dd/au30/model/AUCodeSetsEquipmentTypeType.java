
package sif.dd.au30.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AUCodeSetsEquipmentTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AUCodeSetsEquipmentTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="DesktopComputer"/>
 *     &lt;enumeration value="LaptopComputer"/>
 *     &lt;enumeration value="Tablet"/>
 *     &lt;enumeration value="OverheadProjector"/>
 *     &lt;enumeration value="SlideProjector"/>
 *     &lt;enumeration value="Vehicle"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AUCodeSetsEquipmentTypeType", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
@XmlEnum
public enum AUCodeSetsEquipmentTypeType {

    @XmlEnumValue("DesktopComputer")
    DESKTOP_COMPUTER("DesktopComputer"),
    @XmlEnumValue("LaptopComputer")
    LAPTOP_COMPUTER("LaptopComputer"),
    @XmlEnumValue("Tablet")
    TABLET("Tablet"),
    @XmlEnumValue("OverheadProjector")
    OVERHEAD_PROJECTOR("OverheadProjector"),
    @XmlEnumValue("SlideProjector")
    SLIDE_PROJECTOR("SlideProjector"),
    @XmlEnumValue("Vehicle")
    VEHICLE("Vehicle"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    AUCodeSetsEquipmentTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AUCodeSetsEquipmentTypeType fromValue(String v) {
        for (AUCodeSetsEquipmentTypeType c: AUCodeSetsEquipmentTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
