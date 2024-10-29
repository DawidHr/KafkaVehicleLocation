package com.dawidhr.KafkaVehicleLocationConsumer.dao;

import com.dawidhr.KafkaVehicleLocationConsumer.model.VehicleLocation;

import java.util.Optional;

public interface VehicleLocationDAO {
    public void add(VehicleLocation vehicleLocation);
    public Optional<VehicleLocation> getById(Long id);
}
