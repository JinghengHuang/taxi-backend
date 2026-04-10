package com.jingheng.taxiapp.entity;

import java.time.LocalDateTime;

import com.jingheng.taxiapp.enums.VehicleType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="vehicle")
@Data
@NoArgsConstructor
public class Vehicle {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long vehicleId;
    
    @Column(nullable = false, unique = true)
    private String licensePlate;
    @Column(nullable = false)
    private VehicleType vehicleType;
    @Column(nullable = false)
    private Long capacity;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private Boolean isActive;
}
