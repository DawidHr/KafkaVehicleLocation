package com.dawidhr.KafkaVehicleLocationConsumer.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Entity(name = "vehicle_location")
public class VehicleLocation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vehicle_location_id")
    private Long vehicleLocationId;
    @Column(name = "user_id", nullable=false)
    private Integer userId;
    @Column(name = "vehicle_id")
    private Integer vehicleId;
    @Column(name = "x")
    private Double x;
    @Column(name = "y")
    private Double y;
}
