package com.btrtm.ngue.sgsdm.domaine.rate;

public class BaseByGuestAmt {

    private String ageQualifyingCode ;

    private String numberOfGuests ;

    private String amountBeforeTax ;

    private String amountAfterTax ;

    public BaseByGuestAmt() {
    }

    public String getAgeQualifyingCode() {
        return ageQualifyingCode;
    }

    public void setAgeQualifyingCode(String ageQualifyingCode) {
        this.ageQualifyingCode = ageQualifyingCode;
    }

    public String getNumberOfGuests() {
        return numberOfGuests;
    }

    public void setNumberOfGuests(String numberOfGuests) {
        this.numberOfGuests = numberOfGuests;
    }

    public String getAmountBeforeTax() {
        return amountBeforeTax;
    }

    public void setAmountBeforeTax(String amountBeforeTax) {
        this.amountBeforeTax = amountBeforeTax;
    }

    public String getAmountAfterTax() {
        return amountAfterTax;
    }

    public void setAmountAfterTax(String amountAfterTax) {
        this.amountAfterTax = amountAfterTax;
    }

    @Override
    public String toString() {
        return "BaseByGuestAmt{" +
                "ageQualifyingCode=" + ageQualifyingCode +
                ", numberOfGuests=" + numberOfGuests +
                ", amountBeforeTax=" + amountBeforeTax +
                ", amountAfterTax=" + amountAfterTax +
                '}';
    }
}
