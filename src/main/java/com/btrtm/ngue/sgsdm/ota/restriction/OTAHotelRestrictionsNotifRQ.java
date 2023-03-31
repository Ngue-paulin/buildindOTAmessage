package com.btrtm.ngue.sgsdm.ota.restriction;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement(name = "OTA_HotelRestrictionsNotifRQ")
@XmlAccessorType(XmlAccessType.FIELD)
public class OTAHotelRestrictionsNotifRQ implements Serializable {

    @XmlElement(name = "RuleMessages")
    private RuleMessagesDTO ruleMessage;

    public RuleMessagesDTO getRuleMessage() {
        return ruleMessage;
    }

    public void setRuleMessage(RuleMessagesDTO ruleMessage) {
        this.ruleMessage = ruleMessage;
    }


}
