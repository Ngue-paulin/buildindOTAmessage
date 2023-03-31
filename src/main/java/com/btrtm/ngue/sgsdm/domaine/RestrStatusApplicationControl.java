package com.btrtm.ngue.sgsdm.domaine;

import com.btrtm.ngue.sgsdm.enumaration.InvType;
import org.springframework.beans.factory.annotation.Value;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement(name = "StatusApplicationControl")
@XmlAccessorType(XmlAccessType.FIELD)
public class RestrStatusApplicationControl implements Serializable {
    @XmlAttribute(name = "Start")
    private String start;
    @XmlAttribute(name = "End")
    private String end;
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
    @XmlAttribute(name = "InvTypeCode")
    private String invTypeCode;
    @XmlAttribute(name = "InvCode")
    private String invCode;
    @XmlAttribute(name = "InvType")
    @Enumerated(EnumType.STRING)
    private InvType invType;
    @XmlAttribute(name = "InvBlockCode")
    private String invBlockCode;

    @XmlAttribute(name = "RatePlanCode")
    private String ratePlanCode;

    @XmlAttribute(name = "RatePlanID")
    private String ratePlanID;

    @XmlAttribute(name = "RatePlanCategory")
    private String ratePlanCategory ;

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getInvCode() {
        return invCode;
    }

    public void setInvCode(String invCode) {
        this.invCode = invCode;
    }

    public InvType getInvType() {
        return invType;
    }

    public void setInvType(InvType invType) {
        this.invType = invType;
    }

    public String getInvBlockCode() {
        return invBlockCode;
    }

    public void setInvBlockCode(String invBlockCode) {
        this.invBlockCode = invBlockCode;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getInvTypeCode() {
        return invTypeCode;
    }

    public void setInvTypeCode(String invTypeCode) {
        this.invTypeCode = invTypeCode;
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

    public String getRatePlanCode() {
        return ratePlanCode;
    }

    public void setRatePlanCode(String ratePlanCode) {
        this.ratePlanCode = ratePlanCode;
    }

    public String getRatePlanID() {
        return ratePlanID;
    }

    public void setRatePlanID(String ratePlanID) {
        this.ratePlanID = ratePlanID;
    }

    public String getRatePlanCategory() {
        return ratePlanCategory;
    }

    public void setRatePlanCategory(String ratePlanCategory) {
        this.ratePlanCategory = ratePlanCategory;
    }

}
