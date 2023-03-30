package com.btrtm.ngue.sgsdm.ota.rate;


import com.btrtm.ngue.sgsdm.ota.POS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement(name = "OTA_HOtelRateAmountNotifRQ")
@XmlAccessorType(XmlAccessType.FIELD)
public class OTAHotelRateAmountNotifRQ implements Serializable {

    @XmlElement(name = "POS")
    private POS pos ;

    @XmlElement(name = "RateAmountMessages")
    private RateAmountMessagesDTO rateAmountMessages;

    public RateAmountMessagesDTO getRateAmountMessages() {
        return rateAmountMessages;
    }

    public POS getPos() {
        return pos;
    }

    public void setPos(POS pos) {
        this.pos = pos;
    }

    public void setRateAmountMessages(RateAmountMessagesDTO rateAmountMessages) {
        this.rateAmountMessages = rateAmountMessages;
    }
}
