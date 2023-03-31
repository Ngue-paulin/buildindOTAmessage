package com.btrtm.ngue.sgsdm.ota.rate;

import javax.xml.bind.annotation.*;
import java.io.Serializable;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class RateDTO implements Serializable {
    @XmlAttribute(name = "Start")
    private String start;
    @XmlAttribute(name = "End")
    private String end ;
    @XmlAttribute(name = "Mon")
    private  int mon;
    @XmlAttribute(name = "Tue")
    private  int tue;
    @XmlAttribute(name = "Weds")
    private  int weds;
    @XmlAttribute(name = "Thur")
    private  int thur;
    @XmlAttribute(name = "Fri")
    private  int fri;
    @XmlAttribute(name = "Sat")
    private  int sat;
    @XmlAttribute(name = "Sun")
    private  int sun;
    @XmlElement(name = "BaseByGuestAmts")
    private BaseByGuestAmtsDTO baseByGuestAmts;
    @XmlElement(name = "AdditionalGuestAmounts")
    private AdditionalGuestAmountsDTO additionalGuestAmounts;
    @XmlElement(name = "AdditionalCharges")
    private AdditionalChargesDTO additionalCharges;

    public BaseByGuestAmtsDTO getBaseByGuestAmts() {
        return baseByGuestAmts;
    }

    public void setBaseByGuestAmts(BaseByGuestAmtsDTO baseByGuestAmts) {
        this.baseByGuestAmts = baseByGuestAmts;
    }

    public AdditionalGuestAmountsDTO getAdditionalGuestAmounts() {
        return additionalGuestAmounts;
    }

    public void setAdditionalGuestAmounts(AdditionalGuestAmountsDTO additionalGuestAmounts) {
        this.additionalGuestAmounts = additionalGuestAmounts;
    }

    public AdditionalChargesDTO getAdditionalCharges() {
        return additionalCharges;
    }

    public void setAdditionalCharges(AdditionalChargesDTO additionalCharges) {
        this.additionalCharges = additionalCharges;
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

    public int getMon() {
        return mon;
    }

    public void setMon(int mon) {
        this.mon = mon;
    }

    public int getTue() {
        return tue;
    }

    public void setTue(int tue) {
        this.tue = tue;
    }

    public int getWeds() {
        return weds;
    }

    public void setWeds(int weds) {
        this.weds = weds;
    }

    public int getThur() {
        return thur;
    }

    public void setThur(int thur) {
        this.thur = thur;
    }

    public int getFri() {
        return fri;
    }

    public void setFri(int fri) {
        this.fri = fri;
    }

    public int getSat() {
        return sat;
    }

    public void setSat(int sat) {
        this.sat = sat;
    }

    public int getSun() {
        return sun;
    }

    public void setSun(int sun) {
        this.sun = sun;
    }

}
