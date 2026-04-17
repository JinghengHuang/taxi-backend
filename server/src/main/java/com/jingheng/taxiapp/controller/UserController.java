package com.jingheng.taxiapp.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jingheng.taxiapp.entity.User;


@RestController
@RequestMapping("/api/user")
public class UserController {

    @PostMapping("login")
    public User login(@RequestBody String entity) {
        //TODO: process POST request
        
        return new User();
    }
    @PostMapping("register")
    public User register(@RequestBody String entity) {
        //TODO: process POST request
        
        return new User();
    }
    @DeleteMapping("deleteUser")
    public User deleteUser(@RequestParam String param) {
        return new User();
    }
    
    
    
}
