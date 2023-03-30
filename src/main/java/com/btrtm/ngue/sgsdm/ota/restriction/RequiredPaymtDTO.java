package com.btrtm.ngue.sgsdm.ota.restriction;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;


@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class RequiredPaymtDTO implements Serializable {

    @XmlElement(name = "GuaranteePayment")
    private GuaranteePaymentDTO guaranteePayment;

    public GuaranteePaymentDTO getGuaranteePayment() {
        return guaranteePayment;
    }

    public void setGuaranteePayment(GuaranteePaymentDTO guaranteePayment) {
        this.guaranteePayment = guaranteePayment;
    }
}
