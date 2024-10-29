package com.dawidhr.KafkaVehicleLocationConsumer.service;

import com.dawidhr.KafkaVehicleLocationConsumer.dao.VehicleLocationDAOImpl;
import com.dawidhr.KafkaVehicleLocationConsumer.model.VehicleLocation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehicleLocationService {

    @Autowired
    VehicleLocationDAOImpl vehicleLocationDAO;

    public void addLocation(VehicleLocation vehicleLocation) {
        vehicleLocationDAO.add(vehicleLocation);
    }
}
