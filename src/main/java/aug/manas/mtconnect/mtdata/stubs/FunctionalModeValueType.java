//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.07.28 at 10:32:49 PM EDT 
//


package aug.manas.mtconnect.mtdata.stubs;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FunctionalModeValueType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FunctionalModeValueType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNAVAILABLE"/>
 *     &lt;enumeration value="PRODUCTION"/>
 *     &lt;enumeration value="SETUP"/>
 *     &lt;enumeration value="TEARDOWN"/>
 *     &lt;enumeration value="MAINTENANCE"/>
 *     &lt;enumeration value="PROCESS_DEVELOPMENT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FunctionalModeValueType")
@XmlEnum
public enum FunctionalModeValueType {

    UNAVAILABLE,
    PRODUCTION,
    SETUP,
    TEARDOWN,
    MAINTENANCE,
    PROCESS_DEVELOPMENT;

    public String value() {
        return name();
    }

    public static FunctionalModeValueType fromValue(String v) {
        return valueOf(v);
    }

}