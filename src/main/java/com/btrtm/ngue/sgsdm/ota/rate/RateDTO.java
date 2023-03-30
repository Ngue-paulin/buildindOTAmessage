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
}
