package com.btrtm.ngue.sgsdm.ota.restriction;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ArrivalDaysOfWeekDTO implements Serializable {
    @XmlAttribute(name = "Mon")
    private  boolean mon;
    @XmlAttribute(name = "Tue")
    private  boolean tue;
    @XmlAttribute(name = "Weds")
    private  boolean weds;
    @XmlAttribute(name = "Thur")
    private  boolean thur;
    @XmlAttribute(name = "Fri")
    private  boolean fri;
    @XmlAttribute(name = "Sat")
    private  boolean sat;
    @XmlAttribute(name = "Sun")
    private  boolean sun;

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
}
