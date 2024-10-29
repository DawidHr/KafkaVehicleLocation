package com.dawidhr.KafkaVehicleLocationConsumer.listener;

import com.dawidhr.KafkaVehicleLocationConsumer.model.VehicleLocation;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class VehicleLocationListener {

    @KafkaListener(
            id = "kafka_listener_id",
            topics = "vehicle.location",
            groupId = "kafka_listener_group_id"
    )
    public void listener(VehicleLocation vehicleLocation) {
        System.out.println(vehicleLocation.toString());
    }
}
