package com.btrtm.ngue.sgsdm.ota.rate;

import javax.xml.bind.annotation.*;
import java.io.Serializable;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class BaseByGuestAmtDTO implements Serializable {

    @XmlAttribute(name = "AmountAfterTax")
    private Double amountAfterTax;
    @XmlAttribute(name = "AmountBeforeTax")
    private Double amountBeforeTax;
    @XmlAttribute(name = "AgeQualifyingCode")
    private String ageQualifyingCode;
    @XmlAttribute(name = "NumberOfGuests")
    private int numberOfGuests;

    public Double getAmountAfterTax() {
        return amountAfterTax;
    }

    public void setAmountAfterTax(Double amountAfterTax) {
        this.amountAfterTax = amountAfterTax;
    }

    public Double getAmountBeforeTax() {
        return amountBeforeTax;
    }

    public void setAmountBeforeTax(Double amountBeforeTax) {
        this.amountBeforeTax = amountBeforeTax;
    }

    public String getAgeQualifyingCode() {
        return ageQualifyingCode;
    }

    public void setAgeQualifyingCode(String ageQualifyingCode) {
        this.ageQualifyingCode = ageQualifyingCode;
    }

    public int getNumberOfGuests() {
        return numberOfGuests;
    }

    public void setNumberOfGuests(int numberOfGuests) {
        this.numberOfGuests = numberOfGuests;
    }

}
