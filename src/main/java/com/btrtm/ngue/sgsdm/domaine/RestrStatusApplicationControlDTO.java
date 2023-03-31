package com.btrtm.ngue.sgsdm.domaine;

import com.btrtm.ngue.sgsdm.enumaration.InvType;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement(name = "StatusApplicationControl")
@XmlAccessorType(XmlAccessType.FIELD)
public class RestrStatusApplicationControlDTO implements Serializable {

    @XmlAttribute(name = "Start")
    private String start;
    @XmlAttribute(name = "End")
    private String end;
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
    @XmlAttribute(name = "InvTypeCode")
    private String invTypeCode;
    @XmlAttribute(name = "InvCode")
    private String invCode;
    @XmlAttribute(name = "InvType")
    @Enumerated(EnumType.STRING)
    private InvType invType;
    @XmlAttribute(name = "InvBlockCode")
    private String invBlockCode;

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

    public String getInvTypeCode() {
        return invTypeCode;
    }

    public void setInvTypeCode(String invTypeCode) {
        this.invTypeCode = invTypeCode;
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

}
