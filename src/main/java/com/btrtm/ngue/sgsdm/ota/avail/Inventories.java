package com.btrtm.ngue.sgsdm.ota.avail;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
@XmlRootElement(name = "Inventories")
@XmlAccessorType(XmlAccessType.FIELD)
public class Inventories implements Serializable {

    @XmlAttribute(name = "HotelCode")
    private int hotelCode;
    @XmlAttribute(name = "ChainCode")
    private int chainCode;
    @XmlElement(name = "Inventory")
    List<InventoryDTO> Inventory = new ArrayList<>();

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

    public List<InventoryDTO> getInventories() {
        return Inventory;
    }

    public void setInventories(List<InventoryDTO> inventory) {
        Inventory = inventory;
    }
}
