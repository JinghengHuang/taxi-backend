package com.jingheng.taxiapp.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jingheng.taxiapp.entity.Task;




@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    @GetMapping("info")
    public Task getTaskInfoById(@RequestParam String param) {
        return new Task();
    }
    @GetMapping("list")
    public List<Task> listTasks(@RequestParam String param) {
        Task v1 = new Task();
        return List.of(v1);
    }
    @PostMapping("update")
    public Task insertOrUpdateTaskById(@RequestBody String entity) {
        //TODO: process POST request
        
        return new Task();
    }
    @DeleteMapping("delete")
    public Task deleteTaskById(@RequestBody String entity) {
        //TODO: process POST request
        
        return new Task();
    }
    
}
