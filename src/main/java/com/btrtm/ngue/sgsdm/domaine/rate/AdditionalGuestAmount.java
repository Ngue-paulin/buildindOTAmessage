package com.btrtm.ngue.sgsdm.domaine.rate;

public class AdditionalGuestAmount {

    private String ageQualifyingCode;

    private String minAge ;

    private  String maxAge ;

    private String amount ;

    public AdditionalGuestAmount() {
    }

    public String getAgeQualifyingCode() {
        return ageQualifyingCode;
    }

    public void setAgeQualifyingCode(String ageQualifyingCode) {
        this.ageQualifyingCode = ageQualifyingCode;
    }

    public String getMinAge() {
        return minAge;
    }

    public void setMinAge(String minAge) {
        this.minAge = minAge;
    }

    public String getMaxAge() {
        return maxAge;
    }

    public void setMaxAge(String maxAge) {
        this.maxAge = maxAge;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "AdditionalGuestAmount{" +
                "ageQualifyingCode='" + ageQualifyingCode + '\'' +
                ", minAge='" + minAge + '\'' +
                ", maxAge='" + maxAge + '\'' +
                ", amount='" + amount + '\'' +
                '}';
    }
}
