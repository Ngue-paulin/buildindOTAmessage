package com.btrtm.ngue.sgsdm.domaine.restriction;

import com.btrtm.ngue.sgsdm.domaine.RestrStatusApplicationControl;

import java.util.ArrayList;
import java.util.List;

public class RestrictionAvailStatusMessage {

    private RestrStatusApplicationControl statusApplicationControl ;

    private RestrictionStatus restrictionStatus ;

    private List<LengthOfStay> lengthsOfStay= new ArrayList<>() ;

    public RestrictionAvailStatusMessage() {
    }

    public RestrStatusApplicationControl getStatusApplicationControl() {
        return statusApplicationControl;
    }

    public void setStatusApplicationControl(RestrStatusApplicationControl statusApplicationControl) {
        this.statusApplicationControl = statusApplicationControl;
    }

    public RestrictionStatus getRestrictionStatus() {
        return restrictionStatus;
    }

    public void setRestrictionStatus(RestrictionStatus restrictionStatus) {
        this.restrictionStatus = restrictionStatus;
    }

    public List<LengthOfStay> getLengthsOfStay() {
        return lengthsOfStay;
    }

    public void setLengthsOfStay(List<LengthOfStay> lengthsOfStay) {
        this.lengthsOfStay = lengthsOfStay;
    }

    @Override
    public String toString() {
        return "RestrictionAvailStatusMessage{" +
                "statusApplicationControl=" + statusApplicationControl +
                ", restrictionStatus=" + restrictionStatus +
                ", lengthsOfStay=" + lengthsOfStay +
                '}';
    }
}
