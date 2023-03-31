package com.btrtm.ngue.sgsdm.ota.restriction;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


@XmlRootElement(name = "RuleMessages")
@XmlAccessorType(XmlAccessType.FIELD)
public class RuleMessagesDTO implements Serializable {
    @XmlAttribute(name = "HotelCode")
    private int hotelCode;
    @XmlAttribute(name = "ChainCode")
    private int chainCode;
    @XmlElement(name = "RuleMessage" )
    private List<RuleMessageDTO> ruleMessages = new ArrayList<>();

    public int getHotelCode() {
        return hotelCode;
    }

    public void setHotelCode(int hotelCode) {
        this.hotelCode = hotelCode;
    }

    public int getChainCode() {
        return chainCode;
    }

    public void setChainCode(int chainCode) {
        this.chainCode = chainCode;
    }

    public List<RuleMessageDTO> getRuleMessages() {
        return ruleMessages;
    }

    public void setRuleMessages(List<RuleMessageDTO> ruleMessages) {
        this.ruleMessages = ruleMessages;
    }
}
