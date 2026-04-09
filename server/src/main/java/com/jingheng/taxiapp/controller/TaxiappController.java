package com.jingheng.taxiapp.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/vehicles")
public class TaxiappController {

    @GetMapping("list")
    public List<String> List() {
        return List.of("V1", "V2");
    }
    
}
