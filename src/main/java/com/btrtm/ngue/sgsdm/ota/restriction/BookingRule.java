package com.btrtm.ngue.sgsdm.ota.restriction;

import javax.xml.bind.annotation.*;
import java.io.Serializable;


@XmlRootElement(name = "BookingRuledddd")
@XmlAccessorType(XmlAccessType.FIELD)
public class BookingRule implements Serializable {
    @XmlAttribute(name = "MinTotalOccupancy")
    private int minTotalOccupancy;

    @XmlAttribute(name = "MaxTotalOccupancy")
    private int maxTotalOccupancy;

    @XmlElement(name = "RequiredPaymts")
    private RequiredPaymtDTO requiredPaymts;

    @XmlElement(name = "Description")
    private DescriptionDTO description;

    @XmlElement(name = "LengthsOfStay")
    private LengthsOfStayDTO lengthsOfStay;

    @XmlElement(name = "RestrictionStatus")
    private RestrictionStatusDTO restrictionStatus;

    public LengthsOfStayDTO getLengthsOfStay() {
        return lengthsOfStay;
    }

    public void setLengthsOfStay(LengthsOfStayDTO lengthsOfStay) {
        this.lengthsOfStay = lengthsOfStay;
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

    public RequiredPaymtDTO getRequiredPaymts() {
        return requiredPaymts;
    }

    public void setRequiredPaymts(RequiredPaymtDTO requiredPaymts) {
        this.requiredPaymts = requiredPaymts;
    }

    public DescriptionDTO getDescription() {
        return description;
    }

    public void setDescription(DescriptionDTO description) {
        this.description = description;
    }

    public RestrictionStatusDTO getRestrictionStatus() {
        return restrictionStatus;
    }

    public void setRestrictionStatus(RestrictionStatusDTO restrictionStatus) {
        this.restrictionStatus = restrictionStatus;
    }

}
