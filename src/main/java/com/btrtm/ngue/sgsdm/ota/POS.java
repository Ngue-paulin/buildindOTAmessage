package com.btrtm.ngue.sgsdm.ota;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement(name = "POS")
@XmlAccessorType(XmlAccessType.FIELD)
public class POS implements Serializable {

    @XmlElement(name = "Source")
    private Source source ;

    public POS() {
    }

    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }


    public POS setPOS(String channelCode,String uniqueId){
        return getPos(channelCode, uniqueId);
    }

    public static POS getPos(String channelCode, String uniqueId) {
        POS pos = new POS();
        CompanyName companyName = new CompanyName();
        companyName.setName(channelCode);
        RequestorID requestorID = new RequestorID();
        requestorID.setId(uniqueId);
        requestorID.setType("10");
        requestorID.setCompanyName(companyName);
        Source source = new Source();
        source.setRequestorID(requestorID);
        pos.setSource(source);

        return pos;
    }
}
