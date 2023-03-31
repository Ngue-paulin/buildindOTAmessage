package com.btrtm.ngue.sgsdm.ota.rate;

import com.btrtm.ngue.sgsdm.domaine.RestrStatusApplicationControl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class RateAmountMessageDTO implements Serializable {

    @XmlElement(name = "StatusApplicationControl")
    private RestrStatusApplicationControl statusApplicationControl;

    @XmlElement(name = "Rates")
    private RatesDTO rates;

    public RestrStatusApplicationControl getStatusApplicationControl() {
        return statusApplicationControl;
    }

    public void setStatusApplicationControl(RestrStatusApplicationControl statusApplicationControl) {
        this.statusApplicationControl = statusApplicationControl;
    }

    public RatesDTO getRates() {
        return rates;
    }

    public void setRates(RatesDTO rates) {
        this.rates = rates;
    }
}
