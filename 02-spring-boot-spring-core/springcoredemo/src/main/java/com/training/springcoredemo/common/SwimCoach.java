package com.training.springcoredemo.common;

// we're not using annotation component on purpose
public class SwimCoach implements Coach {

    public SwimCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Swim a 1000 meters as a warm up";
    }
}
