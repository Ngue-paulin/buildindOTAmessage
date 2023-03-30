package com.btrtm.ngue.sgsdm.ota.restriction;

import com.btrtm.ngue.sgsdm.enumaration.RestrictionEnum;
import com.btrtm.ngue.sgsdm.enumaration.StatsEnum;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class RestrictionStatusDTO implements Serializable {

    @Enumerated(EnumType.STRING)
    @XmlAttribute(name = "Status")
    private StatsEnum statsEnum;

    @Enumerated(EnumType.STRING)
    @XmlAttribute(name = "Restriction")
    private RestrictionEnum restrictionEnum;
    @XmlAttribute(name = "MinAdvancedBookingOffset")
    private String minAdvancedBookingOffset;
    @XmlAttribute(name = "MaxAdvancedBookingOffset")
    private String maxAdvancedBookingOffset;


    public StatsEnum getStatsEnum() {
        return statsEnum;
    }

    public void setStatsEnum(StatsEnum statsEnum) {
        this.statsEnum = statsEnum;
    }

    public RestrictionEnum getRestrictionEnum() {
        return restrictionEnum;
    }

    public void setRestrictionEnum(RestrictionEnum restrictionEnum) {
        this.restrictionEnum = restrictionEnum;
    }

    public String getMinAdvancedBookingOffset() {
        return minAdvancedBookingOffset;
    }

    public void setMinAdvancedBookingOffset(String minAdvancedBookingOffset) {
        this.minAdvancedBookingOffset = minAdvancedBookingOffset;
    }

    public String getMaxAdvancedBookingOffset() {
        return maxAdvancedBookingOffset;
    }

    public void setMaxAdvancedBookingOffset(String maxAdvancedBookingOffset) {
        this.maxAdvancedBookingOffset = maxAdvancedBookingOffset;
    }

}
