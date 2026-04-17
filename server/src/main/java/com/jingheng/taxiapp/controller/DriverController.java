package com.jingheng.taxiapp.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jingheng.taxiapp.entity.Driver;



@RestController
@RequestMapping("/api/driver")
public class DriverController {
    @GetMapping("info")
    public Driver getDriverById(@RequestParam String param) {
        return new Driver();
    }
    @GetMapping("list")
    public List<Driver> getDriverList(@RequestParam String param) {
        Driver d1 = new Driver();
        return List.of(d1);
    }
    @PostMapping("update")
    public Driver insertOrUpdateDriver(@RequestBody String entity) {
        //TODO: process POST request
        
        return new Driver();
    }
    @DeleteMapping("delete")
    public Driver deleteDriver(@RequestBody String entity) {
        //TODO: process POST request
        
        return new Driver();
    }
    
}
