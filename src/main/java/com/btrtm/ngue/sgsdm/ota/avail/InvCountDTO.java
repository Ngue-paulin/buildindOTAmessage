package com.btrtm.ngue.sgsdm.ota.avail;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class InvCountDTO implements Serializable {
    @XmlAttribute(name = "Count")
    private Integer count;
    @XmlAttribute(name = "CountType")
    private String countTypes;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getCountTypes() {
        return countTypes;
    }

    public void setCountTypes(String countTypes) {
        this.countTypes = countTypes;
    }
}
