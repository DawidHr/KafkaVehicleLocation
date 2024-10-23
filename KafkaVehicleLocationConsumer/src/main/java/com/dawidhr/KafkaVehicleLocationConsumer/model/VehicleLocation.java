package com.dawidhr.KafkaVehicleLocationConsumer.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class VehicleLocation implements Serializable {
    private Integer userId;
    private Integer vehicleId;
    private Double x;
    private Double y;
}
