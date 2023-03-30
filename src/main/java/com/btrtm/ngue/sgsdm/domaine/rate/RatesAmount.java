package com.btrtm.ngue.sgsdm.domaine.rate;

import java.util.ArrayList;
import java.util.List;

public class RatesAmount {

private List<BaseByGuestAmt> baseByGuestAmts = new ArrayList<>();

private List<AdditionalGuestAmount> additionalGuestAmounts = new ArrayList<>();

private List<AdditionalCharges> additionalCharges = new ArrayList<>();

    public RatesAmount() {
    }

    public List<BaseByGuestAmt> getBaseByGuestAmts() {
        return baseByGuestAmts;
    }

    public void setBaseByGuestAmts(List<BaseByGuestAmt> baseByGuestAmts) {
        this.baseByGuestAmts = baseByGuestAmts;
    }

    public List<AdditionalGuestAmount> getAdditionalGuestAmounts() {
        return additionalGuestAmounts;
    }

    public void setAdditionalGuestAmounts(List<AdditionalGuestAmount> additionalGuestAmounts) {
        this.additionalGuestAmounts = additionalGuestAmounts;
    }

    public List<AdditionalCharges> getAdditionalCharges() {
        return additionalCharges;
    }

    public void setAdditionalCharges(List<AdditionalCharges> additionalCharges) {
        this.additionalCharges = additionalCharges;
    }
}
