package com.btrtm.ngue.sgsdm.domaine.restriction;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class OTA_HotelRestrictionsNotifRQ implements Serializable {

    @XmlElement(name = "HotelRestriction")
    private HotelRestriction hotelRestrictions;

    public HotelRestriction getHotelRestrictions() {
        return hotelRestrictions;
    }

    public void setHotelRestrictions(HotelRestriction hotelRestrictions) {
        this.hotelRestrictions = hotelRestrictions;
    }
}
