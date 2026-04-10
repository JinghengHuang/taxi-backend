package com.jingheng.taxiapp.entity;

import java.time.LocalDateTime;

import com.jingheng.taxiapp.enums.DriverState;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="driver")
@Data
@NoArgsConstructor
public class Driver {

    @Id
    @GeneratedValue
    private Long driverId;

    @OneToOne
    @JoinColumn(name="userId")
    private User user;

    private String driverName;
    private DriverState state;
    private String phone;
    private Boolean isAvailable;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}
