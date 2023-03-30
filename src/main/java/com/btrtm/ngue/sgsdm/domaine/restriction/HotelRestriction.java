package com.btrtm.ngue.sgsdm.domaine.restriction;

import com.btrtm.ngue.sgsdm.domaine.HotelInformation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;


@XmlRootElement(name = "")
@XmlAccessorType(XmlAccessType.FIELD)
public class HotelRestriction extends HotelInformation {

    private List<RestrictionAvailStatusMessage> availStatusMessages = new ArrayList<>();

    public HotelRestriction() {
    }

    public List<RestrictionAvailStatusMessage> getAvailStatusMessages() {
        return availStatusMessages;
    }

    public void setAvailStatusMessages(List<RestrictionAvailStatusMessage> availStatusMessages) {
        this.availStatusMessages = availStatusMessages;
    }
}
