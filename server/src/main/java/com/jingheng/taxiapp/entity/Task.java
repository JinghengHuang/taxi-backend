package com.jingheng.taxiapp.entity;

import java.time.LocalDateTime;

import org.locationtech.jts.geom.Point;

import com.jingheng.taxiapp.enums.TaskState;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="task")
@Data
@NoArgsConstructor
public class Task {
    
    @Id
    @GeneratedValue
    private Long taskId;

    @Column(nullable=false, unique=true)
    private String taskCode;
    @Column(nullable=false)
    private String taskTitle;

    private String taskDesc;

    @Column(columnDefinition="geometry(Point, 4326)")
    private Point startPosition;
    @Column(columnDefinition="geometry(Point, 4326)")
    private Point endPosition;

    @OneToOne
    @JoinColumn(name="vehicleId")
    private Vehicle assignedVehicle;
    @OneToOne
    @JoinColumn(name="driverId")
    private Driver assignedDriver;
    private TaskState taskStatus;

    private Boolean isOvertime;
    private Integer priority;

    private LocalDateTime startTime;
    private LocalDateTime endTime;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    
}
