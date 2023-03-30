package com.btrtm.ngue.sgsdm.domaine.rate;

import javax.xml.bind.annotation.XmlAttribute;
import java.io.Serializable;

public class AdditionalCharges implements Serializable {

    private String amountAfterTax;
    private String amountBeforeTax;

    public String getAmountAfterTax() {
        return amountAfterTax;
    }

    public void setAmountAfterTax(String amountAfterTax) {
        this.amountAfterTax = amountAfterTax;
    }

    public String getAmountBeforeTax() {
        return amountBeforeTax;
    }

    public void setAmountBeforeTax(String amountBeforeTax) {
        this.amountBeforeTax = amountBeforeTax;
    }

    @Override
    public String toString() {
        return "AdditionalCharges{" +
                "amountAfterTax=" + amountAfterTax +
                ", amountBeforeTax=" + amountBeforeTax +
                '}';
    }
}
