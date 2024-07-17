package com.example.avia_aid.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/api/data")
    public String getData() {
        return "{\"message\": \"Backend of the AviaAid Application\"}";
    }
    
}