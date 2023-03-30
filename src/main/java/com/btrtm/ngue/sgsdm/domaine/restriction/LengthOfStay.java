package com.btrtm.ngue.sgsdm.domaine.restriction;

import com.btrtm.ngue.sgsdm.enumaration.LOSEnum;
import com.btrtm.ngue.sgsdm.enumaration.TimeUnitEnum;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class LengthOfStay implements Serializable {

    @XmlAttribute(name = "MinMaxMessageType")
    @Enumerated(value = EnumType.STRING)
    private LOSEnum minMaxMessageType;

    @XmlAttribute(name = "TimeUnit")
    @Enumerated(value = EnumType.STRING)
    private TimeUnitEnum timeUnit;

    @XmlAttribute(name = "OpenStatusIndicator")
    private boolean openStatusIndicator;

    @XmlAttribute(name = "Time")
    private String time ;

    public LengthOfStay() {
    }

    @Enumerated(EnumType.STRING)
    public LOSEnum getMinMaxMessageType() {
        return minMaxMessageType;
    }

    public void setMinMaxMessageType(LOSEnum minMaxMessageType) {
        this.minMaxMessageType = minMaxMessageType;
    }

    public TimeUnitEnum getTimeUnit() {
        return timeUnit;
    }

    public void setTimeUnit(TimeUnitEnum timeUnit) {
        this.timeUnit = timeUnit;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public boolean isOpenStatusIndicator() {
        return openStatusIndicator;
    }

    public void setOpenStatusIndicator(boolean openStatusIndicator) {
        this.openStatusIndicator = openStatusIndicator;
    }

    @Override
    public String toString() {
        return "LengthOfStay{" +
                "minMaxMessageType=" + minMaxMessageType +
                ", timeUnit=" + timeUnit +
                ", openStatusIndicator=" + openStatusIndicator +
                ", time='" + time + '\'' +
                '}';
    }
}
