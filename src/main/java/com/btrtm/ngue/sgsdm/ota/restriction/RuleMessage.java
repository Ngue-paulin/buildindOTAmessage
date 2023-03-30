package com.btrtm.ngue.sgsdm.ota.restriction;

import com.btrtm.ngue.sgsdm.domaine.RestrStatusApplicationControl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


@XmlRootElement(name = "RuleMessage")
@XmlAccessorType(XmlAccessType.FIELD)
public class RuleMessage implements Serializable {

    @XmlElement(name = "StatusApplicationControl")
    private RestrStatusApplicationControl statusApplicationControl;

    private BookingRuleDTO bookingRules ;

    public RestrStatusApplicationControl getStatusApplicationControl() {
        return statusApplicationControl;
    }

    public void setStatusApplicationControl(RestrStatusApplicationControl statusApplicationControl) {
        this.statusApplicationControl = statusApplicationControl;
    }

    public BookingRuleDTO getBookingRules() {
        return bookingRules;
    }

    public void setBookingRules(BookingRuleDTO bookingRules) {
        this.bookingRules = bookingRules;
    }
}
