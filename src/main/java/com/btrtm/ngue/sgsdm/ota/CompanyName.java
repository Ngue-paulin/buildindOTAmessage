package com.btrtm.ngue.sgsdm.ota;

import javax.xml.bind.annotation.*;
import java.io.Serializable;

@XmlRootElement(name = "CompanyName")
@XmlAccessorType(XmlAccessType.FIELD)
public class CompanyName implements Serializable {
    @XmlValue
    private String Name;

    public CompanyName() {
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
