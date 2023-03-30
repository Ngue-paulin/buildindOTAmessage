package com.btrtm.ngue.sgsdm.domaine.avail;

import java.io.Serializable;

public class OTA_HotelInvCountNotifRQ implements Serializable {
    private HotelInventoryCount hotelInventoryCounts;

    public HotelInventoryCount getHotelInventoryCounts() {
        return hotelInventoryCounts;
    }

    public void setHotelInventoryCounts(HotelInventoryCount hotelInventoryCounts) {
        this.hotelInventoryCounts = hotelInventoryCounts;
    }
}
