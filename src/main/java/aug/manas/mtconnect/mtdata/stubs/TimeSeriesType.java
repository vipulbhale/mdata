//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.07.28 at 10:32:49 PM EDT 
//


package aug.manas.mtconnect.mtdata.stubs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         An abstract time series with the restriction value
 *       
 * 
 * <p>Java class for TimeSeriesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimeSeriesType">
 *   &lt;simpleContent>
 *     &lt;restriction base="&lt;urn:mtconnect.org:MTConnectStreams:1.3>AbsTimeSeriesType">
 *     &lt;/restriction>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeSeriesType")
@XmlSeeAlso({
    AccelerationTimeSeriesType.class,
    PathFeedrateTimeSeriesType.class,
    AngularVelocityTimeSeriesType.class,
    PathPositionTimeSeriesType.class,
    FlowTimeSeriesType.class,
    FrequencyTimeSeriesType.class,
    ResistanceTimeSeriesType.class,
    VoltsTimeSeriesType.class,
    TorqueTimeSeriesType.class,
    SpindleSpeedTimeSeriesType.class,
    TiltTimeSeriesType.class,
    AxisFeedrateTimeSeriesType.class,
    WattTimeSeriesType.class,
    AccumulatedTimeTimeSeriesType.class,
    PositionTimeSeriesType.class,
    ElectricalEnergyTimeSeriesType.class,
    AmperageTimeSeriesType.class,
    GlobalPositionTimeSeriesType.class,
    LinearForceTimeSeriesType.class,
    VoltageTimeSeriesType.class,
    PressureTimeSeriesType.class,
    StrainTimeSeriesType.class,
    SoundPressureTimeSeriesType.class,
    VelocityTimeSeriesType.class,
    AngleTimeSeriesType.class,
    TemperatureTimeSeriesType.class,
    FillLevelTimeSeriesType.class,
    RotaryVelocityTimeSeriesType.class,
    AbsTimeSeriesTimeSeriesType.class,
    WattageTimeSeriesType.class,
    LengthTimeSeriesType.class,
    AngularAccelerationTimeSeriesType.class,
    LoadTimeSeriesType.class,
    ConcentrationTimeSeriesType.class,
    ViscosityTimeSeriesType.class,
    ConductivityTimeSeriesType.class,
    PowerFactorTimeSeriesType.class,
    DisplacementTimeSeriesType.class
})
public abstract class TimeSeriesType
    extends AbsTimeSeriesType
{


}