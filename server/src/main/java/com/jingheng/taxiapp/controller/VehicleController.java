package com.jingheng.taxiapp.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jingheng.taxiapp.entity.Vehicle;




@RestController
@RequestMapping("/api/vehicles")
public class VehicleController {

    @GetMapping("info")
    public Vehicle getVehicleInfoById(@RequestParam String param) {
        return new Vehicle();
    }
    @GetMapping("list")
    public List<Vehicle> listVehicles(@RequestParam String param) {
        Vehicle v1 = new Vehicle();
        return List.of(v1);
    }
    @PostMapping("update")
    public String insertOrUpdateVehicleById(@RequestBody String entity) {
        //TODO: process POST request
        
        return entity;
    }
    @DeleteMapping("delete")
    public String deleteVehicleById(@RequestBody String entity) {
        //TODO: process POST request
        
        return entity;
    }
}
