package com.btrtm.ngue.sgsdm.ota.avail;

import com.btrtm.ngue.sgsdm.domaine.RestrStatusApplicationControl;

import javax.xml.bind.annotation.*;
import java.io.Serializable;

@XmlRootElement(name = "InvCount")
@XmlAccessorType(XmlAccessType.FIELD)
public class InventoryDTO implements Serializable {

    @XmlElement(name = "StatusApplicationControl")
    private RestrStatusApplicationControl statusApplicationControl;

    @XmlElement(name = "InvCounts")
    private InvCounts invCounts;

    public InventoryDTO() {
    }

    public RestrStatusApplicationControl getStatusApplicationControl() {
        return statusApplicationControl;
    }

    public void setStatusApplicationControl(RestrStatusApplicationControl statusApplicationControl) {
        this.statusApplicationControl = statusApplicationControl;
    }

    public InvCounts getInvCounts() {
        return invCounts;
    }

    public void setInvCounts(InvCounts invCounts) {
        this.invCounts = invCounts;
    }

    @Override
    public String toString() {
        return "InventoryDTO{" +
                "statusApplicationControl=" + statusApplicationControl +
                ", invCounts=" + invCounts +
                '}';
    }
}
