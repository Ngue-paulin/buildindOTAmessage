package com.btrtm.ngue.sgsdm.ota;

import javax.xml.bind.annotation.*;
import java.io.Serializable;

@XmlRootElement(name = "RequestorID")
@XmlAccessorType(XmlAccessType.FIELD)
public class RequestorID implements Serializable {

    @XmlElement(name = "CompanyName")
    private CompanyName companyName;
    @XmlAttribute(name = "ID")
    private String id;
    @XmlAttribute(name = "Type")
    private String type;

    public RequestorID() {
    }

    public CompanyName getCompanyName() {
        return companyName;
    }

    public void setCompanyName(CompanyName companyName) {
        this.companyName = companyName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
