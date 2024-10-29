package com.dawidhr.KafkaVehicleLocationConsumer.repository;

import com.dawidhr.KafkaVehicleLocationConsumer.model.VehicleLocation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  VehicleLocationRepository extends JpaRepository<VehicleLocation, Long> {
}
