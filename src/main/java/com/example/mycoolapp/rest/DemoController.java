package com.example.mycoolapp.rest;


import com.example.mycoolapp.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    //define private field for the dependencies
    private Coach myCoach;
    //define constructor for dependency injection
    @Autowired
   public DemoController(
           @Qualifier("cricketCoach") Coach theCoach) {
        System.out.println("In DemoController: " + getClass().getSimpleName());
        myCoach = theCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }


}
