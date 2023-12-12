package com.training.springcoredemo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.springcoredemo.common.Coach;

@RestController
public class DemoController {
	
	// Define a private field for the dependency
	private Coach myCoach;
	private Coach aCoach;
	
	/* Tells Spring to inject a dependency (if you have just one constructor 
	 * then Autowired annotation is optional)*/
	
	@Autowired 
	public void setCoach(@Qualifier("squashCoach") Coach theCoach,
						 @Qualifier("squashCoach") Coach anOtherCoach) {
		myCoach = theCoach;
		aCoach = anOtherCoach;
		
		System.out.println("Squash coach: " + myCoach.getDailyWorkout());
		System.out.println("Cricket coach: " + aCoach.getDailyWorkout());
	}
	
	@GetMapping("/dailyworkout")
	public String getDailyWorkout() {
		return myCoach.getDailyWorkout();
	}
	
	@GetMapping("/check")
	public String check() {
		return "Comparing beans: myCoach == aCoach, " + (myCoach == aCoach);
	}
	
	
}
