package com.training.springcoredemo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

/*
 * Marks the class as a SPring bean(makes the class available for dependency 
 * injection)*/

@Component
@Lazy(false)
public class CricketCoach implements Coach {
	
	public CricketCoach() {
		System.out.println("In constructor: " + getClass().getSimpleName());
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes!!!";
	}
}
