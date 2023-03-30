package com.btrtm.ngue.sgsdm.domaine.restriction;

import com.btrtm.ngue.sgsdm.enumaration.RestrictionEnum;
import com.btrtm.ngue.sgsdm.enumaration.StatsEnum;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

public class RestrictionStatus {
    @Enumerated(EnumType.STRING)
    private StatsEnum statsEnum;

    @Enumerated(EnumType.STRING)
    private RestrictionEnum restrictionEnum;

    private String minAdvancedBookingOffset;

    private String maxAdvancedBookingOffset;

    private int minTotalOccupancy;

    private int maxTotalOccupancy;

    public RestrictionStatus() {
    }

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

    public int getMinTotalOccupancy() {
        return minTotalOccupancy;
    }

    public void setMinTotalOccupancy(int minTotalOccupancy) {
        this.minTotalOccupancy = minTotalOccupancy;
    }

    public int getMaxTotalOccupancy() {
        return maxTotalOccupancy;
    }

    public void setMaxTotalOccupancy(int maxTotalOccupancy) {
        this.maxTotalOccupancy = maxTotalOccupancy;
    }

    @Override
    public String toString() {
        return "RestrictionStatus{" +
                "statsEnum=" + statsEnum +
                ", restrictionEnum=" + restrictionEnum +
                ", minAdvancedBookingOffset='" + minAdvancedBookingOffset + '\'' +
                ", maxAdvancedBookingOffset='" + maxAdvancedBookingOffset + '\'' +
                ", minTotalOccupancy=" + minTotalOccupancy +
                ", maxTotalOccupancy=" + maxTotalOccupancy +
                '}';
    }
}
