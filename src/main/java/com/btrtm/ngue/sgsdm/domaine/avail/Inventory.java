package com.btrtm.ngue.sgsdm.domaine.avail;

import com.btrtm.ngue.sgsdm.domaine.RestrStatusApplicationControl;

import java.io.Serializable;
import java.util.List;

public class Inventory implements Serializable {

    private RestrStatusApplicationControl statusApplicationControl;

    private List<InvCount> invCounts;

    public RestrStatusApplicationControl getStatusApplicationControl() {
        return statusApplicationControl;
    }

    public void setStatusApplicationControl(RestrStatusApplicationControl statusApplicationControl) {
        this.statusApplicationControl = statusApplicationControl;
    }

    public List<InvCount> getInvCounts() {
        return invCounts;
    }

    public void setInvCounts(List<InvCount> invCounts) {
        this.invCounts = invCounts;
    }
}
