package com.btrtm.ngue.sgsdm.ota.restriction;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


@XmlRootElement(name = "BookingRules")
@XmlAccessorType(XmlAccessType.FIELD)
public class BookingRulesDTO implements Serializable {

    @XmlElement(name = "BookingRule")
    private List<BookingRuleDTO> bookingRules = new ArrayList<>();

    public List<BookingRuleDTO> getBookingRules() {
        return bookingRules;
    }

    public void setBookingRules(List<BookingRuleDTO> bookingRules) {
        this.bookingRules = bookingRules;
    }

}
