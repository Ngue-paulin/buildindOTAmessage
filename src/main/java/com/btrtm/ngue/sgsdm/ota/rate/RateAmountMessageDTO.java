package com.btrtm.ngue.sgsdm.ota.rate;

import com.btrtm.ngue.sgsdm.domaine.RestrStatusApplicationControl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class RateAmountMessageDTO implements Serializable {

    private RestrStatusApplicationControl statusApplicationControl;

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
