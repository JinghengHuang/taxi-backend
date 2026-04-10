package com.jingheng.taxiapp.entity;

import java.time.LocalDateTime;

import org.locationtech.jts.geom.Point;

import com.jingheng.taxiapp.enums.AlertStatus;
import com.jingheng.taxiapp.enums.AlertType;

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
@Table(name="alert")
@Data
@NoArgsConstructor
public class Alert {
    @Id
    @GeneratedValue
    private Long alertId;
    @ManyToOne
    @JoinColumn(name="vehicleId")
    private Vehicle vehicle;
    @ManyToOne
    @JoinColumn(name="driverId")
    private Driver driver;
    private AlertType alertType;
    private Long alertLevel;
    private String message;
    @Column(columnDefinition="geometry(Point, 4326)")
    private Point pos;
    private LocalDateTime createdAt;
    private LocalDateTime reportedAt;
    private LocalDateTime resolvedAt;
    private AlertStatus status;
}
