package com.btrtm.ngue.sgsdm.ota.restriction;

import com.btrtm.ngue.sgsdm.domaine.restriction.LengthOfStay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class LengthsOfStayDTO implements Serializable {
    @XmlElement(name = "LengthOfStay")
    private List<LengthOfStay> lengthOfStay = new ArrayList<>();

    public List<LengthOfStay> getLengthOfStay() {
        return lengthOfStay;
    }

    public void setLengthOfStay(List<LengthOfStay> lengthOfStay) {
        this.lengthOfStay = lengthOfStay;
    }
}
