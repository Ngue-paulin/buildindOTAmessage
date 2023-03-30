package com.btrtm.ngue.sgsdm.resource;

import com.btrtm.ngue.sgsdm.domaine.avail.HotelInventoryCount;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class Testresource {

    @GetMapping("/test")
    public Map<String,Object> myTesresource(){
        Object object = new Object();
        HotelInventoryCount hotelInventories = new HotelInventoryCount();

        return Map.of("TEST","PPPPPPPPPP");

    }
}
