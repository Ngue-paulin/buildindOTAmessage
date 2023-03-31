package com.btrtm.ngue.sgsdm.service.mapper;

import com.btrtm.ngue.sgsdm.domaine.RestrStatusApplicationControl;
import com.btrtm.ngue.sgsdm.domaine.avail.HotelInventoryCount;
import com.btrtm.ngue.sgsdm.domaine.avail.OTA_HotelInvCountNotifRQ;
import com.btrtm.ngue.sgsdm.domaine.rate.HotelRatePlan;
import com.btrtm.ngue.sgsdm.domaine.rate.OTA_HotelRateAmountNotifRQ;
import com.btrtm.ngue.sgsdm.domaine.rate.RateObject;
import com.btrtm.ngue.sgsdm.domaine.restriction.HotelRestriction;
import com.btrtm.ngue.sgsdm.domaine.restriction.OTA_HotelRestrictionsNotifRQ;
import com.btrtm.ngue.sgsdm.enumaration.InvType;
import com.btrtm.ngue.sgsdm.ota.POS;
import com.btrtm.ngue.sgsdm.ota.avail.*;
import com.btrtm.ngue.sgsdm.ota.rate.*;
import com.btrtm.ngue.sgsdm.ota.restriction.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AvailMapper {
    private final Logger log = LoggerFactory.getLogger ( AvailMapper.class );

    public OTAHotelInvCountNotifRQ getInvValues(OTA_HotelInvCountNotifRQ ota_HotelInvCountNotifRQ){

        OTAHotelInvCountNotifRQ otaHotelInvCountNotifRQ = new OTAHotelInvCountNotifRQ();
        HotelInventoryCount hotelInventoryCount = ota_HotelInvCountNotifRQ.getHotelInventoryCounts();

        POS pos = new POS();

        otaHotelInvCountNotifRQ.setPos(pos.setPOS(hotelInventoryCount.getChannelCode(), hotelInventoryCount.getUniqueId()));

        Inventories inventories = new Inventories();
        inventories.setChainCode(hotelInventoryCount.getChainCode());
        inventories.setHotelCode(hotelInventoryCount.getHotelCode());


        if(hotelInventoryCount.getInventories() != null && !hotelInventoryCount.getInventories().isEmpty()){
            hotelInventoryCount.getInventories().stream().forEach(inv -> {

                InvCounts invCounts = new InvCounts();
                List<InvCountDTO> invCountList = new ArrayList<>();

                if(inv.getInvCounts() != null && !inv.getInvCounts().isEmpty()){
                    inv.getInvCounts().stream().forEach(invCount -> {
                        InvCountDTO invCountDTO = new InvCountDTO();
                        invCountDTO.setCount(invCount.getCount());
                        invCountDTO.setCountTypes(invCount.getCountType());
                        invCountList.add(invCountDTO);
                    });
                }

                InventoryDTO inventory = new InventoryDTO();
                String [] catCode_roomTcode;
                //inv.
                if(inv.getStatusApplicationControl() != null && inv.getStatusApplicationControl().getInvTypeCode() != null){
                    inv.getStatusApplicationControl().setInvCode(formatTypeCode(inv.getStatusApplicationControl().getInvTypeCode()));
                    inv.getStatusApplicationControl().setInvType(InvType.Type);
                    inventory.setStatusApplicationControl(inv.getStatusApplicationControl());
                }

                invCounts.setInvCount(invCountList);
                inventory.setInvCounts(invCounts);

                inventories.getInventories().add(inventory);
            } );
        }

        otaHotelInvCountNotifRQ.setInventories(inventories);

        return otaHotelInvCountNotifRQ;
    }

    public OTAHotelRestrictionsNotifRQ getRestrictionValues(OTA_HotelRestrictionsNotifRQ otaHotelRestrictionsNotifRQ){

        OTAHotelRestrictionsNotifRQ otaHotelRestrictionsNotifRS = new OTAHotelRestrictionsNotifRQ();
        HotelRestriction hotelRestriction = otaHotelRestrictionsNotifRQ.getHotelRestrictions();

        RuleMessagesDTO ruleMessageDTO = new RuleMessagesDTO();

        // infos CRS et infos Hotels
        ruleMessageDTO.setChainCode(hotelRestriction.getChainCode());
        ruleMessageDTO.setHotelCode(hotelRestriction.getHotelCode());

        List<BookingRuleDTO> bookingRules = new ArrayList<>();
        BookingRulesDTO bookingRulesDTO = new BookingRulesDTO();


        // Infos de restriction
        List<RuleMessageDTO> ruleMessages = new ArrayList<>();
        hotelRestriction.getAvailStatusMessages().stream().forEach(resStMes ->{
            RuleMessageDTO ruleMessage = new RuleMessageDTO();

            // ajouter StatusApplicationControl
            RestrStatusApplicationControl statusApplicationControl = new RestrStatusApplicationControl();
            DOW_RestrictionsDTO dowRestrictions = new DOW_RestrictionsDTO();
            ArrivalDaysOfWeekDTO arrivalDaysOfWeek = new ArrivalDaysOfWeekDTO();
            if(resStMes.getStatusApplicationControl() != null && ! resStMes.getStatusApplicationControl().getInvTypeCode().isEmpty()){
                statusApplicationControl = resStMes.getStatusApplicationControl();
                // opera envoie les infos pour les chambres.
                statusApplicationControl.setInvType(InvType.Type);
                statusApplicationControl.setInvTypeCode(formatTypeCode(statusApplicationControl.getInvTypeCode()));
                statusApplicationControl.setInvCode(statusApplicationControl.getInvTypeCode());

                arrivalDaysOfWeek.setMon(statusApplicationControl.isMon());
                arrivalDaysOfWeek.setTue(statusApplicationControl.isTue());
                arrivalDaysOfWeek.setWeds(statusApplicationControl.isWeds());
                arrivalDaysOfWeek.setThur(statusApplicationControl.isThur());
                arrivalDaysOfWeek.setFri(statusApplicationControl.isFri());
                arrivalDaysOfWeek.setSat(statusApplicationControl.isSat());
                arrivalDaysOfWeek.setSun(statusApplicationControl.isSun());

                dowRestrictions.setArrivalDaysOfWeek(arrivalDaysOfWeek);
                /**
                 * @// TODO: 28/03/2023
                 * formage de rate plan code à faire
                 */
                statusApplicationControl.setRatePlanCode(statusApplicationControl.getRatePlanCode());
            }
            ruleMessage.setStatusApplicationControl(statusApplicationControl);

            // Ajouter RestrictionStatus

            RestrictionStatusDTO restrictionStatusDTO = new RestrictionStatusDTO();
            BookingRuleDTO bookingRule = new BookingRuleDTO();

            bookingRule.setDowRestrictions(dowRestrictions);

            /**
             * todo
             * Description values
             */
            DescriptionDTO descriptionDTO = new DescriptionDTO();
            TextDTO textDTO = new TextDTO();
            textDTO.setText("priceperpax=0;MaxAdult=99;MaxJunior=99;MaxChild=99;MaxInfant=99");
            descriptionDTO.setText(textDTO);
            bookingRule.setDescription(descriptionDTO);

            LengthsOfStayDTO lengthsOfStays = new LengthsOfStayDTO();

            if(resStMes.getRestrictionStatus() != null){
                bookingRule.setMinTotalOccupancy(resStMes.getRestrictionStatus().getMinTotalOccupancy());
                bookingRule.setMaxTotalOccupancy(resStMes.getRestrictionStatus().getMaxTotalOccupancy());

                restrictionStatusDTO.setRestrictionEnum(resStMes.getRestrictionStatus().getRestrictionEnum());
                restrictionStatusDTO.setStatsEnum(resStMes.getRestrictionStatus().getStatsEnum());
                restrictionStatusDTO.setMinAdvancedBookingOffset(resStMes.getRestrictionStatus().getMinAdvancedBookingOffset());
                restrictionStatusDTO.setMaxAdvancedBookingOffset(resStMes.getRestrictionStatus().getMaxAdvancedBookingOffset());
            }
            bookingRule.setRestrictionStatus(restrictionStatusDTO);

            // ajout de LengthsOfStay
            if(resStMes.getLengthsOfStay() != null && !resStMes.getLengthsOfStay().isEmpty()){
                lengthsOfStays.setLengthOfStay(resStMes.getLengthsOfStay());
            }
            bookingRule.setLengthsOfStay(lengthsOfStays);

            /**
             * todo
             * Adding RequiredPaymt informations
             */

            RequiredPaymtDTO requiredPaymtDTO = new RequiredPaymtDTO();
            GuaranteePaymentDTO guaranteePaymentDTO = new GuaranteePaymentDTO();
            guaranteePaymentDTO.setGuaranteeCode("night");
            requiredPaymtDTO.setGuaranteePayment(guaranteePaymentDTO);

            bookingRule.setRequiredPaymts(requiredPaymtDTO);


            bookingRules.add(bookingRule);
            bookingRulesDTO.setBookingRules(bookingRules);
            ruleMessage.setBookingRules(bookingRulesDTO);
            ruleMessageDTO.getRuleMessages().add(ruleMessage);

        });


        otaHotelRestrictionsNotifRS.setRuleMessage(ruleMessageDTO);

        return otaHotelRestrictionsNotifRS;
    }

    public OTAHotelRateAmountNotifRQ getRateValues(OTA_HotelRateAmountNotifRQ ota_hotelRateAmountNotifRQ) {

        OTAHotelRateAmountNotifRQ otaHotelRateAmountNotifRQ = new OTAHotelRateAmountNotifRQ();
        HotelRatePlan hotelRatePlan = ota_hotelRateAmountNotifRQ.getHotelRatePlans();

        POS pos = new POS();
        otaHotelRateAmountNotifRQ.setPos(pos.setPOS(hotelRatePlan.getChannelCode(), hotelRatePlan.getUniqueId()));


        if (hotelRatePlan != null) {

            if (hotelRatePlan.getRatePlans() != null && !hotelRatePlan.getRatePlans().isEmpty()) {

                // adding RateAmountMessages
                RateAmountMessagesDTO rateAmountMessagesDTO = new RateAmountMessagesDTO();
                rateAmountMessagesDTO.setChainCode(hotelRatePlan.getChainCode());
                rateAmountMessagesDTO.setHotelCode(hotelRatePlan.getHotelCode());

                // adding List of RateAmountMessage
                List<RateAmountMessageDTO> rateAmountMessageDTOS = new ArrayList<>();


                hotelRatePlan.getRatePlans().stream().forEach(ratePlan -> {
                    RateAmountMessageDTO rateAmountMessageDTO = new RateAmountMessageDTO();
                    RestrStatusApplicationControl statusApplicationControl = new RestrStatusApplicationControl();
                    statusApplicationControl.setRatePlanCode(ratePlan.getRatePlanCode());
                    statusApplicationControl.setRatePlanCategory(ratePlan.getRateCategory());
                    statusApplicationControl.setStart(ratePlan.getStartSellDate());
                    statusApplicationControl.setEnd(ratePlan.getEndSellDate());

                    //todo
                    statusApplicationControl.setRatePlanID("--------------");


                    RatesDTO ratesDTO = new RatesDTO();
                    if (ratePlan.getRates() != null && !ratePlan.getRates().isEmpty()) {
                        RateObject rateObject = ratePlan.getRates().stream().findFirst().get();

                        /*statusApplicationControl.setMon(rateObject.isMon());
                        statusApplicationControl.setTue(rateObject.isTue());
                        statusApplicationControl.setWeds(rateObject.isWeds());
                        statusApplicationControl.setThur(rateObject.isThur());
                        statusApplicationControl.setFri(rateObject.isFri());
                        statusApplicationControl.setSat(rateObject.isSat());
                        statusApplicationControl.setSun(rateObject.isSun());
*/
                        List<RateDTO> rateDTOS = new ArrayList<>();

                        ratePlan.getRates().stream().forEach(rate -> {

                            RateDTO rateDTO = new RateDTO();

                            rateDTO.setEnd(rate.getEnd());
                            rateDTO.setStart(rate.getStart());
                            rateDTO.setMon(rate.isMon() ? 1 : 0);
                            rateDTO.setTue(rate.isTue() ? 1 :0);
                            rateDTO.setWeds(rate.isWeds() ? 1 : 0);
                            rateDTO.setThur(rate.isThur() ? 1 : 0);
                            rateDTO.setFri(rate.isFri() ? 1 : 0);
                            rateDTO.setSat(rate.isSat() ? 1 : 0);
                            rateDTO.setSun(rate.isSun() ? 1 : 0);

                            statusApplicationControl.setInvCode(formatTypeCode(rate.getInvTypeCode()));
                            statusApplicationControl.setInvTypeCode(formatTypeCode(rate.getInvTypeCode()));

                            if (rate.getRatesAmounts() != null && !rate.getRatesAmounts().isEmpty()) {
                                BaseByGuestAmtsDTO baseByGuestAmtsDTO = new BaseByGuestAmtsDTO();
                                AdditionalGuestAmountsDTO additionalGuestAmountsDTO = new AdditionalGuestAmountsDTO();
                                AdditionalChargesDTO additionalChargesDTO = new AdditionalChargesDTO();
                                rate.getRatesAmounts().stream().forEach(rateAmount -> {
                                    if (rateAmount.getBaseByGuestAmts() != null && !rateAmount.getBaseByGuestAmts().isEmpty()) {
                                        List<BaseByGuestAmtDTO> baseByGuestAmtDTOS = new ArrayList<>();
                                        rateAmount.getBaseByGuestAmts().stream().forEach(baseGamount -> {
                                            BaseByGuestAmtDTO baseByGuestAmtDTO = new BaseByGuestAmtDTO();
                                            if(baseGamount.getAmountAfterTax() != null && ! baseGamount.getAmountAfterTax().isEmpty()) {
                                                baseByGuestAmtDTO.setAmountAfterTax(Double.valueOf(baseGamount.getAmountAfterTax()));
                                            }
                                            if(baseGamount.getAmountBeforeTax() != null && ! baseGamount.getAmountBeforeTax().isEmpty()) {
                                                baseByGuestAmtDTO.setAmountBeforeTax(Double.valueOf(baseGamount.getAmountBeforeTax()));
                                            }
                                            if(baseGamount.getNumberOfGuests() != null && ! baseGamount.getNumberOfGuests().isEmpty()) {
                                                baseByGuestAmtDTO.setNumberOfGuests(Integer.parseInt(baseGamount.getNumberOfGuests()));
                                            }
                                            baseByGuestAmtDTO.setAgeQualifyingCode(baseGamount.getAgeQualifyingCode());
                                            baseByGuestAmtDTOS.add(baseByGuestAmtDTO);
                                        });
                                        baseByGuestAmtsDTO.setBaseByGuestAmt(baseByGuestAmtDTOS);
                                        rateDTO.setBaseByGuestAmts(baseByGuestAmtsDTO);
                                    }

                                    if (rateAmount.getAdditionalGuestAmounts() != null && !rateAmount.getAdditionalGuestAmounts().isEmpty()) {
                                        List<AdditionalGuestAmountDTO> additionalGuestAmountDTOS = new ArrayList<>();
                                        rateAmount.getAdditionalGuestAmounts().stream().forEach(additionlGamount -> {
                                            AdditionalGuestAmountDTO additionalGuestAmountDTO = new AdditionalGuestAmountDTO();
                                            additionalGuestAmountDTO.setAgeQualifyingCode(additionlGamount.getAgeQualifyingCode());
                                            additionalGuestAmountDTO.setCurrencyCode(ratePlan.getCurrencyCode());
                                            if(additionlGamount.getAmount() != null && ! additionlGamount.getAmount().isEmpty()) {
                                                additionalGuestAmountDTO.setAmount(Double.valueOf(additionlGamount.getAmount()));
                                            }
                                            if(additionlGamount.getMaxAge() != null && ! additionlGamount.getMaxAge().isEmpty()) {
                                                additionalGuestAmountDTO.setMaxAge(Integer.parseInt(additionlGamount.getMaxAge()));
                                            }
                                            if(additionlGamount.getMinAge() != null && !additionlGamount.getMinAge().isEmpty())
                                            additionalGuestAmountDTO.setMinAge(Integer.parseInt(additionlGamount.getMinAge()));

                                            additionalGuestAmountDTOS.add(additionalGuestAmountDTO);
                                        });
                                        additionalGuestAmountsDTO.setAdditionalGuestAmount(additionalGuestAmountDTOS);
                                        rateDTO.setAdditionalGuestAmounts(additionalGuestAmountsDTO);
                                    }
                                    if (rateAmount.getAdditionalCharges() != null && !rateAmount.getAdditionalCharges().isEmpty()) {
                                        List<AdditionalChargeDTO> additionalChargeDTOS = new ArrayList<>();
                                        rateAmount.getAdditionalCharges().stream().forEach(addCarge -> {
                                            AdditionalChargeDTO additionalChargeDTO = new AdditionalChargeDTO();
                                            if(addCarge.getAmountAfterTax() != null && ! addCarge.getAmountAfterTax().isEmpty()) {
                                                additionalChargeDTO.setAmountAfterTax(Double.valueOf(addCarge.getAmountAfterTax()));
                                            }
                                            if(addCarge.getAmountBeforeTax() != null && ! addCarge.getAmountBeforeTax().isEmpty()) {
                                                additionalChargeDTO.setAmountBeforeTax(Double.valueOf(addCarge.getAmountBeforeTax()));
                                            }

                                            additionalChargeDTOS.add(additionalChargeDTO);
                                        });
                                        additionalChargesDTO.setAdditionalCharges(additionalChargeDTOS);
                                        rateDTO.setAdditionalCharges(additionalChargesDTO);
                                    }
                                });
                            }
                            rateDTOS.add(rateDTO);
                        });

                        ratesDTO.setRate(rateDTOS);
                        rateAmountMessageDTO.setRates(ratesDTO);
                    }
                    statusApplicationControl.setInvType(InvType.Type);
                    rateAmountMessageDTO.setStatusApplicationControl(statusApplicationControl);
                    rateAmountMessageDTOS.add(rateAmountMessageDTO);

                });
                rateAmountMessagesDTO.setRateAmountMessage(rateAmountMessageDTOS);
                otaHotelRateAmountNotifRQ.setRateAmountMessages(rateAmountMessagesDTO);
            }

        }
        return otaHotelRateAmountNotifRQ;

    }


    public String formatTypeCode(String typeCode){
        String result;
        String [] catCode_roomTcode = typeCode.split("_");
        result = catCode_roomTcode[0] + "-" + catCode_roomTcode[1];

    return result;
    }



}
