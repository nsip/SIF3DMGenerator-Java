
package sif.dd.au30.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AUCodeSetsNAPParticipationCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AUCodeSetsNAPParticipationCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="P"/>
 *     &lt;enumeration value="A"/>
 *     &lt;enumeration value="C"/>
 *     &lt;enumeration value="E"/>
 *     &lt;enumeration value="W"/>
 *     &lt;enumeration value="S"/>
 *     &lt;enumeration value="R"/>
 *     &lt;enumeration value="X"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AUCodeSetsNAPParticipationCodeType", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
@XmlEnum
public enum AUCodeSetsNAPParticipationCodeType {


    /**
     * Present
     * 
     */
    P,

    /**
     * Absent
     * 
     */
    A,

    /**
     * Cancelled
     * 
     */
    C,

    /**
     * Exempt
     * 
     */
    E,

    /**
     * Withdrawn
     * 
     */
    W,

    /**
     * Sanctioned Abandonment
     * 
     */
    S,

    /**
     * Refused
     * 
     */
    R,

    /**
     * No Longer Enrolled
     * 
     */
    X;

    public String value() {
        return name();
    }

    public static AUCodeSetsNAPParticipationCodeType fromValue(String v) {
        return valueOf(v);
    }

}
