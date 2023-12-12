package com.training.springcoredemo.common;

import org.springframework.stereotype.Component;

/*
 * Marks the class as a SPring bean(makes the class available for dependency 
 * injection)*/

@Component 
public class CricketCoach implements Coach {
	
	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes!!!";
	}
}
