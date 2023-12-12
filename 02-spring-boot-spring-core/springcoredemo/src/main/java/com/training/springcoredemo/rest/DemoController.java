package com.training.springcoredemo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.springcoredemo.common.Coach;

@RestController
public class DemoController {
	
	// Define a private field for the dependency
	private Coach myCoach;
	
	/* Tells Spring to inject a dependency (if you have just one constructor 
	 * then Autowired annotation is optional)*/
	@Autowired 
	public DemoController(Coach theCoach) {
		myCoach = theCoach;
	}
	
	@GetMapping("/dailyworkout")
	public String getDailyWorkout() {
		return myCoach.getDailyWorkout();
	}
}
