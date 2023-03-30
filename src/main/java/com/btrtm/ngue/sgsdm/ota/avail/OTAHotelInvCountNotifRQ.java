package com.btrtm.ngue.sgsdm.ota.avail;

import com.btrtm.ngue.sgsdm.domaine.HotelInformation;
import com.btrtm.ngue.sgsdm.ota.POS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement(name = "OTA_HotelInvCountNotifRQ")
@XmlAccessorType(XmlAccessType.FIELD)
public class OTAHotelInvCountNotifRQ implements Serializable {

    @XmlElement(name = "POS")
    private POS pos ;
    @XmlElement(name = "Inventories")
    private Inventories inventories ;

    public OTAHotelInvCountNotifRQ() {
    }

    public POS getPos() {
        return pos;
    }

    public void setPos(POS pos) {
        this.pos = pos;
    }

    public Inventories getInventories() {
        return inventories;
    }

    public void setInventories(Inventories inventories) {
        this.inventories = inventories;
    }

    @Override
    public String toString() {
        return "OTAHotelInvCountNotifRQ{" +
                "pos=" + pos +
                ", inventories=" + inventories +
                '}';
    }
}
