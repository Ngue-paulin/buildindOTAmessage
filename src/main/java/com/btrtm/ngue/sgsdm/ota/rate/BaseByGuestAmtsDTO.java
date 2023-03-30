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
public class BaseByGuestAmtsDTO implements Serializable {

    @XmlElement(name = "BaseByGuestAmt")
    private List<BaseByGuestAmtDTO> baseByGuestAmt = new ArrayList<>();

    public List<BaseByGuestAmtDTO> getBaseByGuestAmt() {
        return baseByGuestAmt;
    }

    public void setBaseByGuestAmt(List<BaseByGuestAmtDTO> baseByGuestAmt) {
        this.baseByGuestAmt = baseByGuestAmt;
    }

}
