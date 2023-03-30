package com.btrtm.ngue.sgsdm.ota.rate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class AdditionalGuestAmountsDTO implements Serializable {

    @XmlElement(name = "AdditionalGuestAmount")
    private List<AdditionalGuestAmountDTO> additionalGuestAmount = new ArrayList<>();

    public List<AdditionalGuestAmountDTO> getAdditionalGuestAmount() {
        return additionalGuestAmount;
    }

    public void setAdditionalGuestAmount(List<AdditionalGuestAmountDTO> additionalGuestAmount) {
        this.additionalGuestAmount = additionalGuestAmount;
    }

}
