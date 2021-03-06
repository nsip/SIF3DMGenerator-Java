
package sif.dd.au30.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AUCodeSetsNAPTestItemTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AUCodeSetsNAPTestItemTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="ET"/>
 *     &lt;enumeration value="COMP"/>
 *     &lt;enumeration value="HS"/>
 *     &lt;enumeration value="TS"/>
 *     &lt;enumeration value="IA"/>
 *     &lt;enumeration value="IC"/>
 *     &lt;enumeration value="IGA"/>
 *     &lt;enumeration value="IGGM"/>
 *     &lt;enumeration value="IGM"/>
 *     &lt;enumeration value="IGO"/>
 *     &lt;enumeration value="IM"/>
 *     &lt;enumeration value="IO"/>
 *     &lt;enumeration value="MC"/>
 *     &lt;enumeration value="MCS"/>
 *     &lt;enumeration value="PO"/>
 *     &lt;enumeration value="SL"/>
 *     &lt;enumeration value="SP"/>
 *     &lt;enumeration value="TE"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AUCodeSetsNAPTestItemTypeType", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
@XmlEnum
public enum AUCodeSetsNAPTestItemTypeType {

    ET("ET"),
    COMP("COMP"),
    HS("HS"),
    TS("TS"),
    IA("IA"),
    IC("IC"),
    IGA("IGA"),
    IGGM("IGGM"),
    IGM("IGM"),
    IGO("IGO"),
    IM("IM"),
    IO("IO"),
    MC("MC"),
    MCS("MCS"),
    PO("PO"),
    SL("SL"),
    SP("SP"),
    TE("TE"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    AUCodeSetsNAPTestItemTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AUCodeSetsNAPTestItemTypeType fromValue(String v) {
        for (AUCodeSetsNAPTestItemTypeType c: AUCodeSetsNAPTestItemTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
