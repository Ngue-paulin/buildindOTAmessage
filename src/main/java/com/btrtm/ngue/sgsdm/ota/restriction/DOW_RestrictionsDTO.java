package com.btrtm.ngue.sgsdm.ota.restriction;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class DOW_RestrictionsDTO implements Serializable {

    @XmlElement(name ="ArrivalDaysOfWeek" )
    private ArrivalDaysOfWeekDTO arrivalDaysOfWeek;

    public ArrivalDaysOfWeekDTO getArrivalDaysOfWeek() {
        return arrivalDaysOfWeek;
    }

    public void setArrivalDaysOfWeek(ArrivalDaysOfWeekDTO arrivalDaysOfWeek) {
        this.arrivalDaysOfWeek = arrivalDaysOfWeek;
    }
}
