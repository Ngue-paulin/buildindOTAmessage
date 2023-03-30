package com.btrtm.ngue.sgsdm.resource;

import com.btrtm.ngue.sgsdm.domaine.avail.HotelInventoryCount;
import com.btrtm.ngue.sgsdm.domaine.avail.OTA_HotelInvCountNotifRQ;
import com.btrtm.ngue.sgsdm.domaine.rate.OTA_HotelRateAmountNotifRQ;
import com.btrtm.ngue.sgsdm.domaine.restriction.OTA_HotelRestrictionsNotifRQ;
import com.btrtm.ngue.sgsdm.ota.avail.OTAHotelInvCountNotifRQ;
import com.btrtm.ngue.sgsdm.ota.rate.OTAHotelRateAmountNotifRQ;
import com.btrtm.ngue.sgsdm.ota.restriction.OTAHotelRestrictionsNotifRQ;
import com.btrtm.ngue.sgsdm.service.mapper.AvailMapper;
import com.btrtm.ngue.sgsdm.util.TransformToXml;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.bind.JAXBException;

@RestController
@RequestMapping("/api")
public class SaveAvailResource {

private final TransformToXml transformToXml;

    private final Logger log = LoggerFactory.getLogger ( SaveAvailResource.class );
private final AvailMapper availMapper;

    public SaveAvailResource(TransformToXml transformToXml, AvailMapper availMapper) {
        this.transformToXml = transformToXml;
        this.availMapper = availMapper;
    }


    @PostMapping(value = "/saveAvail", produces = "application/xml")
    public ResponseEntity<String> saveAvail(@RequestBody OTA_HotelInvCountNotifRQ ota_HotelInvCountNotifRQ) throws JAXBException {

        OTAHotelInvCountNotifRQ otaHotelInvCountNotifRQ = availMapper.getInvValues(ota_HotelInvCountNotifRQ);

        log.info("otaHotelInvCountNotifRQ {}",otaHotelInvCountNotifRQ);


        String result = transformToXml.getXml(OTAHotelInvCountNotifRQ.class,otaHotelInvCountNotifRQ);

        return ResponseEntity.status(HttpStatus.CREATED).body(result);
    }

    @PostMapping(value = "/saveRestriction" , produces = "application/xml")
    public ResponseEntity<String> saveRestrictions(@RequestBody OTA_HotelRestrictionsNotifRQ otaHotelRestrictionsNotifRQ) throws JAXBException {

        OTAHotelRestrictionsNotifRQ otaHotelRestrictionsNotifRS = availMapper.getRestValues(otaHotelRestrictionsNotifRQ);

        String result = transformToXml.getXml(OTAHotelRestrictionsNotifRQ.class,otaHotelRestrictionsNotifRS);

        return ResponseEntity.status(HttpStatus.CREATED).body(result);

    }

    @PostMapping(value = "/saveRate" , produces = "application/xml")
    public ResponseEntity<String> saveRate(@RequestBody OTA_HotelRateAmountNotifRQ ota_hotelRateAmountNotifRQ) throws JAXBException {
        OTAHotelRateAmountNotifRQ otaHotelRateAmountNotifRQ = availMapper.getRateValues(ota_hotelRateAmountNotifRQ);

        String result = transformToXml.getXml(OTAHotelRateAmountNotifRQ.class,otaHotelRateAmountNotifRQ);

        return ResponseEntity.status(HttpStatus.CREATED).body(result);

    }


}
