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
public class RatesDTO implements Serializable {
    @XmlElement(name = "Rate")
    private List<RateDTO> rate = new ArrayList<>();

    public List<RateDTO> getRate() {
        return rate;
    }

    public void setRate(List<RateDTO> rate) {
        this.rate = rate;
    }
}
