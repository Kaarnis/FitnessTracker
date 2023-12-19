package com.example.WeatherClothingHelper.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {
    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/api/hello")
    public String helloWorld() {
        return "Hello, World!";
    }
}
