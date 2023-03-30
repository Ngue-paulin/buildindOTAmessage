package com.btrtm.ngue.sgsdm.ota.rate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class AdditionalChargesDTO implements Serializable {

    private List<AdditionalChargeDTO> additionalCharges = new ArrayList<>();

    public List<AdditionalChargeDTO> getAdditionalCharges() {
        return additionalCharges;
    }

    public void setAdditionalCharges(List<AdditionalChargeDTO> additionalCharges) {
        this.additionalCharges = additionalCharges;
    }
}
