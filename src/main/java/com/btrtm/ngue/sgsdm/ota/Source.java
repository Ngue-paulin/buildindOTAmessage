package com.btrtm.ngue.sgsdm.ota;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement(name = "Source")
@XmlAccessorType(XmlAccessType.FIELD)
public class Source implements Serializable {

    @XmlElement(name = "RequestorID")
    private RequestorID requestorID;

    public Source() {
    }

    public RequestorID getRequestorID() {
        return requestorID;
    }

    public void setRequestorID(RequestorID requestorID) {
        this.requestorID = requestorID;
    }

}
