package com.dawidhr.KafkaVehicleLocationConsumer.listener;

import com.dawidhr.KafkaVehicleLocationConsumer.model.VehicleLocation;
import com.dawidhr.KafkaVehicleLocationConsumer.service.VehicleLocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class VehicleLocationListener {

    @Autowired
    VehicleLocationService vehicleLocationService;


    @KafkaListener(
            id = "kafka_listener_id",
            topics = "vehicle.location",
            groupId = "kafka_listener_group_id"
    )
    public void listener(VehicleLocation vehicleLocation) {
        System.out.println(vehicleLocation.toString());
        vehicleLocationService.addLocation(vehicleLocation);
    }
}
