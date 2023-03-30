package com.btrtm.ngue.sgsdm.domaine.rate;

import com.btrtm.ngue.sgsdm.domaine.HotelInformation;

import java.util.ArrayList;
import java.util.List;

public class HotelRatePlan extends HotelInformation {


    private List<RatePlan> ratePlans = new ArrayList<>();

    public HotelRatePlan() {
    }

    public List<RatePlan> getRatePlans() {
        return ratePlans;
    }

    public void setRatePlans(List<RatePlan> ratePlans) {
        this.ratePlans = ratePlans;
    }

    @Override
    public String toString() {
        return "HotelRatePlan{" +
                "ratePlans=" + ratePlans +
                '}';
    }
}
