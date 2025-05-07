package com.example.mycoolapp.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
    public CricketCoach() {
        System.out.println("In Constructor: " + getClass().getSimpleName());
    }
    @PostConstruct
    public void doMyStartupStuff() {
        System.out.println("In doMyStartupStuff: " + getClass().getSimpleName());
    }

    @PreDestroy
    public void doMyDistroyupStuff() {
        System.out.println("In doMyDistroyupStuff: " + getClass().getSimpleName());
    }


    @Override
    public String getDailyWorkout() {
        return "Practice fast Bowling for 15 mins :)";
    }
}
