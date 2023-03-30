package com.btrtm.ngue.sgsdm.domaine.avail;

import com.btrtm.ngue.sgsdm.domaine.HotelInformation;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

public class HotelInventoryCount extends HotelInformation {
    private List<Inventory> inventories;

    public List<Inventory> getInventories() {
        return inventories;
    }

    public void setInventories(List<Inventory> inventories) {
        this.inventories = inventories;
    }

    public HotelInventoryCount() {
    }


}
