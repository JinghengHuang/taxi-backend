package com.jingheng.taxiapp.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jingheng.taxiapp.entity.Alert;




@RestController
@RequestMapping("/api/alert")
public class AlertController {

    @GetMapping("info")
    public Alert getAlertInfoById(@RequestParam String param) {
        return new Alert();
    }
    @GetMapping("list")
    public List<Alert> listAlert(@RequestParam String param) {
        Alert v1 = new Alert();
        return List.of(v1);
    }
    @PostMapping("update")
    public Alert insertOrUpdateAlertById(@RequestBody String entity) {
        //TODO: process POST request
        
        return new Alert();
    }
    @DeleteMapping("delete")
    public Alert deleteAlertById(@RequestBody String entity) {
        //TODO: process POST request
        
        return new Alert();
    }
    
}
