package com.btrtm.ngue.sgsdm.ota.avail;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "InvCounts")
@XmlAccessorType(XmlAccessType.FIELD)
public class InvCounts implements Serializable {
    @XmlElement(name = "InvCount")
    private List<InvCountDTO> InvCount = new ArrayList<>();

    public InvCounts() {
    }

    public List<InvCountDTO> getInvCount() {
        return InvCount;
    }

    public void setInvCount(List<InvCountDTO> invCount) {
        InvCount = invCount;
    }
}
