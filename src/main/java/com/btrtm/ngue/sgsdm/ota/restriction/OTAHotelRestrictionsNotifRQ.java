package com.btrtm.ngue.sgsdm.ota.restriction;

import javax.xml.bind.annotation.*;
import java.io.Serializable;

@XmlRootElement(name = "OTA_HotelRestrictionsNotifRQ")
@XmlAccessorType(XmlAccessType.FIELD)
public class OTAHotelRestrictionsNotifRQ implements Serializable {

    @XmlAttribute(name = "xmlns:xsi")
    private String nameSpace = "http://www.w3.org/2001/XMLSchema-instance";
    @XmlAttribute(name = "xmlns")
    private String xmlns = "http://www.opentravel.org/OTA/2008/01";
    @XmlAttribute(name = "Target")
    private String target ;
    @XmlAttribute(name = "TimeStamp")
    private String timeStamp;
    @XmlAttribute(name = "SequenceNmbr")
    private String sequenceNmbr ;
    @XmlAttribute(name = "xsi:schemaLocation")
    private String schemaLocation ="http://www.opentravel.org/OTA/2008/01/OTA_HotelBookingRuleNotifRQ.xsd";
    @XmlAttribute(name = "TransactionIdentifier")
    private String transactionIdentifier ;
    @XmlAttribute(name = "AltLangID")
    private String altLangID ;
    @XmlAttribute(name = "PrimaryLangID")
    private String primaryLangID;
    @XmlAttribute(name = "RetransmissionIndicator")
    private boolean retransmissionIndicator;
    @XmlAttribute(name = "TransactionStatusCode")
    private String transactionStatusCode ;
    @XmlAttribute(name = "Version")
    private String version ;

    @XmlElement(name = "RuleMessages")
    private RuleMessagesDTO ruleMessage;

    public RuleMessagesDTO getRuleMessage() {
        return ruleMessage;
    }

    public void setRuleMessage(RuleMessagesDTO ruleMessage) {
        this.ruleMessage = ruleMessage;
    }

    public String getNameSpace() {
        return nameSpace;
    }

    public void setNameSpace(String nameSpace) {
        this.nameSpace = nameSpace;
    }

    public String getXmlns() {
        return xmlns;
    }

    public void setXmlns(String xmlns) {
        this.xmlns = xmlns;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getSequenceNmbr() {
        return sequenceNmbr;
    }

    public void setSequenceNmbr(String sequenceNmbr) {
        this.sequenceNmbr = sequenceNmbr;
    }

    public String getSchemaLocation() {
        return schemaLocation;
    }

    public void setSchemaLocation(String schemaLocation) {
        this.schemaLocation = schemaLocation;
    }

    public String getTransactionIdentifier() {
        return transactionIdentifier;
    }

    public void setTransactionIdentifier(String transactionIdentifier) {
        this.transactionIdentifier = transactionIdentifier;
    }

    public String getAltLangID() {
        return altLangID;
    }

    public void setAltLangID(String altLangID) {
        this.altLangID = altLangID;
    }

    public String getPrimaryLangID() {
        return primaryLangID;
    }

    public void setPrimaryLangID(String primaryLangID) {
        this.primaryLangID = primaryLangID;
    }

    public boolean isRetransmissionIndicator() {
        return retransmissionIndicator;
    }

    public void setRetransmissionIndicator(boolean retransmissionIndicator) {
        this.retransmissionIndicator = retransmissionIndicator;
    }

    public String getTransactionStatusCode() {
        return transactionStatusCode;
    }

    public void setTransactionStatusCode(String transactionStatusCode) {
        this.transactionStatusCode = transactionStatusCode;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
