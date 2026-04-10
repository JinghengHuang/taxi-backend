package com.jingheng.taxiapp.entity;

import java.time.LocalDateTime;

import org.locationtech.jts.geom.Point;

import com.jingheng.taxiapp.enums.VehicleState;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="vehicle")
@Data
@NoArgsConstructor
public class VehiclePosition {

    @Id
    @GeneratedValue
    private Long positionId;
    @ManyToOne
    @JoinColumn(name="vehicleId")
    private Vehicle vehicle;
    @ManyToOne
    @JoinColumn(name="driverId")
    private Driver driver;
    
    @Column(columnDefinition="geometry(Point, 4326)")
    private Point currentPosition;

    private Double speed;
    private Double heading;

    private LocalDateTime reportedAt;
    private LocalDateTime receivedAt;
    private VehicleState state;
    @ManyToOne
    @JoinColumn(name="taskId")
    private Task task;
}
