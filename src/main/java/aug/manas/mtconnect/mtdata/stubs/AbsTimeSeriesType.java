//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.07.28 at 10:32:49 PM EDT 
//


package aug.manas.mtconnect.mtdata.stubs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         The abstract waveform
 *       
 * 
 * <p>Java class for AbsTimeSeriesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbsTimeSeriesType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;urn:mtconnect.org:MTConnectStreams:1.3>SampleType">
 *       &lt;attribute name="sampleCount" use="required" type="{urn:mtconnect.org:MTConnectStreams:1.3}CountValueType" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbsTimeSeriesType")
@XmlSeeAlso({
    TimeSeriesType.class
})
public abstract class AbsTimeSeriesType
    extends SampleType
{

    @XmlAttribute(name = "sampleCount", required = true)
    protected String sampleCount;

    /**
     * Gets the value of the sampleCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSampleCount() {
        return sampleCount;
    }

    /**
     * Sets the value of the sampleCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSampleCount(String value) {
        this.sampleCount = value;
    }

}