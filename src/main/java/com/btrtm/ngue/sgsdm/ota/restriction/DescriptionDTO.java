package com.btrtm.ngue.sgsdm.ota.restriction;

import javax.xml.bind.annotation.*;
import java.io.Serializable;


@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class DescriptionDTO implements Serializable {
    @XmlElement(name = "Text")
    private TextDTO text;
    public TextDTO getText() {
        return text;
    }

    public void setText(TextDTO text) {
        this.text = text;
    }
}
