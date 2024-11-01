package com.dawidhr.KafkaVehicleLocationConsumer.dao;

import com.dawidhr.KafkaVehicleLocationConsumer.model.VehicleLocation;
import com.dawidhr.KafkaVehicleLocationConsumer.repository.VehicleLocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class VehicleLocationDAOImpl implements VehicleLocationDAO {

    @Autowired
    VehicleLocationRepository vehicleLocationRepository;

    @Override
    public void add(VehicleLocation vehicleLocation) {
        vehicleLocationRepository.save(vehicleLocation);
    }

    @Override
    public Optional<VehicleLocation> getById(Long id) {
        Optional<VehicleLocation> vehicleLocationFromDB = vehicleLocationRepository.findById(id);
        if(vehicleLocationFromDB.isPresent()) {
            return vehicleLocationFromDB;
        }
        return Optional.empty();
    }
}
