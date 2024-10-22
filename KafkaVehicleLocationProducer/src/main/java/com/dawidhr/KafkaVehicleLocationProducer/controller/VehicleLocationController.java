package com.dawidhr.KafkaVehicleLocationProducer.controller;

import com.dawidhr.KafkaVehicleLocationProducer.model.VehicleLocation;
import com.dawidhr.KafkaVehicleLocationProducer.service.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VehicleLocationController {
    @Autowired
    KafkaProducer kafkaProducer;

    @PostMapping("/vehicle_location")
    public void vehicleLocation(@RequestBody VehicleLocation vehicleLocation) {
        System.out.println(vehicleLocation.toString());
        kafkaProducer.sendMessage(vehicleLocation);
    }
}
