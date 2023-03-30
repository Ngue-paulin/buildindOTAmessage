package com.btrtm.ngue.sgsdm.ota.rate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class AdditionalGuestAmountDTO implements Serializable {

    @XmlAttribute(name = "AgeQualifyingCode")
    private String ageQualifyingCode;
    @XmlAttribute(name = "Amount")
    private Double amount;
    @XmlAttribute(name = "MinAge")
    private int minAge ;
    @XmlAttribute(name = "MaxAge")
    private  int maxAge ;

    public String getAgeQualifyingCode() {
        return ageQualifyingCode;
    }

    public void setAgeQualifyingCode(String ageQualifyingCode) {
        this.ageQualifyingCode = ageQualifyingCode;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public int getMinAge() {
        return minAge;
    }

    public void setMinAge(int minAge) {
        this.minAge = minAge;
    }

    public int getMaxAge() {
        return maxAge;
    }

    public void setMaxAge(int maxAge) {
        this.maxAge = maxAge;
    }
}
