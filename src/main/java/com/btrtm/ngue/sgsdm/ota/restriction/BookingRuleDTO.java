package com.btrtm.ngue.sgsdm.ota.restriction;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


@XmlRootElement(name = "BookingRules")
@XmlAccessorType(XmlAccessType.FIELD)
public class BookingRuleDTO implements Serializable {

    @XmlElement(name = "BookingRule")
    private List<BookingRule> bookingRules = new ArrayList<>();

    public List<BookingRule> getBookingRules() {
        return bookingRules;
    }

    public void setBookingRules(List<BookingRule> bookingRules) {
        this.bookingRules = bookingRules;
    }

}
