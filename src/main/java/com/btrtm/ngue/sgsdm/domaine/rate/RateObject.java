package com.btrtm.ngue.sgsdm.domaine.rate;

import java.util.ArrayList;
import java.util.List;

public class RateObject {

    private String invTypeCode;

    private String maxGuestApplicable ;

    // the start date
    private String start ;

    // the end date
    private String end;

    private  boolean mon;
    private  boolean tue;
    private  boolean weds;
    private  boolean thur;
    private  boolean fri;
    private  boolean sat;
    private  boolean sun;

    private List<RatesAmount> ratesAmounts = new ArrayList<>();

    public RateObject() {
    }

    public String getInvTypeCode() {
        return invTypeCode;
    }

    public void setInvTypeCode(String invTypeCode) {
        this.invTypeCode = invTypeCode;
    }

    public String getMaxGuestApplicable() {
        return maxGuestApplicable;
    }

    public void setMaxGuestApplicable(String maxGuestApplicable) {
        this.maxGuestApplicable = maxGuestApplicable;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public boolean isMon() {
        return mon;
    }

    public void setMon(boolean mon) {
        this.mon = mon;
    }

    public boolean isTue() {
        return tue;
    }

    public void setTue(boolean tue) {
        this.tue = tue;
    }

    public boolean isWeds() {
        return weds;
    }

    public void setWeds(boolean weds) {
        this.weds = weds;
    }

    public boolean isThur() {
        return thur;
    }

    public void setThur(boolean thur) {
        this.thur = thur;
    }

    public boolean isFri() {
        return fri;
    }

    public void setFri(boolean fri) {
        this.fri = fri;
    }

    public boolean isSat() {
        return sat;
    }

    public void setSat(boolean sat) {
        this.sat = sat;
    }

    public boolean isSun() {
        return sun;
    }

    public void setSun(boolean sun) {
        this.sun = sun;
    }

    public List<RatesAmount> getRatesAmounts() {
        return ratesAmounts;
    }

    public void setRatesAmounts(List<RatesAmount> ratesAmounts) {
        this.ratesAmounts = ratesAmounts;
    }

    @Override
    public String toString() {
        return "RateObject{" +
                "invTypeCode='" + invTypeCode + '\'' +
                ", maxGuestApplicable='" + maxGuestApplicable + '\'' +
                ", start='" + start + '\'' +
                ", end='" + end + '\'' +
                ", mon=" + mon +
                ", tue=" + tue +
                ", weds=" + weds +
                ", thur=" + thur +
                ", fri=" + fri +
                ", sat=" + sat +
                ", sun=" + sun +
                ", ratesAmounts=" + ratesAmounts +
                '}';
    }

}
