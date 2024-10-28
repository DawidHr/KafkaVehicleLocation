package com.dawidhr.KafkaVehicleLocationProducer.service;

import com.dawidhr.KafkaVehicleLocationProducer.model.KafkaTopic;
import com.dawidhr.KafkaVehicleLocationProducer.model.VehicleLocation;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class KafkaProducer {
    @Autowired
    KafkaTemplate<String, Object> kafkaTemplate;

    public void sendMessage(VehicleLocation vehicleLocation) {
        kafkaTemplate.send(KafkaTopic.VEHICLE_LOCATION.getTopicName(), createKey(vehicleLocation), vehicleLocation);
    }

    private String createKey(VehicleLocation vehicleLocation) {
        return vehicleLocation.getUserId() + "-" + vehicleLocation.getVehicleId();
    }
}
