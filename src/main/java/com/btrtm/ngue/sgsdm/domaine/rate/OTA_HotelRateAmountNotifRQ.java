package com.btrtm.ngue.sgsdm.domaine.rate;

import java.io.Serializable;

public class OTA_HotelRateAmountNotifRQ implements Serializable {

    private HotelRatePlan hotelRatePlans;

    public HotelRatePlan getHotelRatePlans() {
        return hotelRatePlans;
    }

    public void setHotelRatePlans(HotelRatePlan hotelRatePlans) {
        this.hotelRatePlans = hotelRatePlans;
    }

}
