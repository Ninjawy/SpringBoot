package com.training.springcoredemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SquashCoach implements Coach {
	
	@Override
	public String getDailyWorkout() {
		return "Do long ball twice, post then cross 15 times in a row!";
	}
}
