package com.btrtm.ngue.sgsdm.util;

import com.btrtm.ngue.sgsdm.domaine.avail.HotelInventoryCount;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.StringWriter;

@Service
public class TransformToXml {

    public <T> String getXml (Class<T> jconPbkect, Object xmlObject) throws JAXBException {
        //Create JAXB Context
        JAXBContext jaxbContext = JAXBContext.newInstance(jconPbkect);

        //Create Marshaller
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

        //Required formatting??
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

        //Print XML String to Console
        StringWriter sw = new StringWriter();

        //Write XML to StringWriter
        jaxbMarshaller.marshal(xmlObject, sw);

        //Verify XML Content
        return sw.toString();

    }



}
