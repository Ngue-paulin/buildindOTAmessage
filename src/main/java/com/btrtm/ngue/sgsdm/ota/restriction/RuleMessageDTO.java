package com.btrtm.ngue.sgsdm.ota.restriction;

import com.btrtm.ngue.sgsdm.domaine.RestrStatusApplicationControl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;


@XmlRootElement(name = "RuleMessage")
@XmlAccessorType(XmlAccessType.FIELD)
public class RuleMessageDTO implements Serializable {

    @XmlElement(name = "StatusApplicationControl")
    private RestrStatusApplicationControl statusApplicationControl;
    @XmlElement(name = "BookingRules")
    private BookingRulesDTO bookingRules ;

    public RestrStatusApplicationControl getStatusApplicationControl() {
        return statusApplicationControl;
    }

    public void setStatusApplicationControl(RestrStatusApplicationControl statusApplicationControl) {
        this.statusApplicationControl = statusApplicationControl;
    }

    public BookingRulesDTO getBookingRules() {
        return bookingRules;
    }

    public void setBookingRules(BookingRulesDTO bookingRules) {
        this.bookingRules = bookingRules;
    }
}
