package com.example.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    // expose "/" that returns "Hello World"
    @GetMapping("/")
    public String sayHello() {
        return "Hello World!";
    }

    //expose new endpoint "workout"
    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "Daily workout";
    }
}
