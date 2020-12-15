package com.example.demo.controllers;

import com.example.demo.domain.Bicycle;
import com.example.demo.domain.BicycleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BicycleController {

    final BicycleService bicycleService;

    @Autowired
    public BicycleController(BicycleService bicycleService) {
        this.bicycleService = bicycleService;
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping("/bicycles")
    public Bicycle create (@RequestBody Bicycle bicycle) {
        return bicycleService.create(bicycle);
    }



}
