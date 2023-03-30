package com.btrtm.ngue.sgsdm.ota.rate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.List;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class RateAmountMessagesDTO implements Serializable {

    @XmlAttribute(name = "HotelCode")
    private int hotelCode ;

    @XmlAttribute(name = "ChainCode")
    private int chainCode ;

    private List<RateAmountMessageDTO> rateAmountMessage;

    public List<RateAmountMessageDTO> getRateAmountMessage() {
        return rateAmountMessage;
    }

    public void setRateAmountMessage(List<RateAmountMessageDTO> rateAmountMessage) {
        this.rateAmountMessage = rateAmountMessage;
    }

    public int getHotelCode() {
        return hotelCode;
    }

    public void setHotelCode(int hotelCode) {
        this.hotelCode = hotelCode;
    }

    public int getChainCode() {
        return chainCode;
    }

    public void setChainCode(int chainCode) {
        this.chainCode = chainCode;
    }
}
