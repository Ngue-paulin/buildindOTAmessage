package com.btrtm.ngue.sgsdm.domaine.rate;

import com.btrtm.ngue.sgsdm.enumaration.RatePlanNotifTypeEnum;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.util.ArrayList;
import java.util.List;

public class RatePlan {


    @Enumerated(EnumType.STRING)
    private RatePlanNotifTypeEnum ratePlanNotifType;

    private String ratePlanCode ;

    private String rateCategory ;

    private boolean commissionable ;

    private String currencyCode ;

    private String startSellDate ;

    private String endSellDate ;

    private String shortDescription ;

    private List<RateObject> rates = new ArrayList<>();

    public RatePlan() {
    }

    public RatePlanNotifTypeEnum getRatePlanNotifType() {
        return ratePlanNotifType;
    }

    public void setRatePlanNotifType(RatePlanNotifTypeEnum ratePlanNotifType) {
        this.ratePlanNotifType = ratePlanNotifType;
    }

    public String getRatePlanCode() {
        return ratePlanCode;
    }

    public void setRatePlanCode(String ratePlanCode) {
        this.ratePlanCode = ratePlanCode;
    }

    public String getRateCategory() {
        return rateCategory;
    }

    public void setRateCategory(String rateCategory) {
        this.rateCategory = rateCategory;
    }

    public boolean isCommissionable() {
        return commissionable;
    }

    public void setCommissionable(boolean commissionable) {
        this.commissionable = commissionable;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getStartSellDate() {
        return startSellDate;
    }

    public void setStartSellDate(String startSellDate) {
        this.startSellDate = startSellDate;
    }

    public String getEndSellDate() {
        return endSellDate;
    }

    public void setEndSellDate(String endSellDate) {
        this.endSellDate = endSellDate;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public List<RateObject> getRates() {
        return rates;
    }

    public void setRates(List<RateObject> rates) {
        this.rates = rates;
    }
}
