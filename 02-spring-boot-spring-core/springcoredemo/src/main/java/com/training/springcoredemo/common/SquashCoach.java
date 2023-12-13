package com.training.springcoredemo.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class SquashCoach implements Coach {
	
	public SquashCoach() {
		System.out.println("In constructor: " + getClass().getSimpleName());
	}


	@Override
	public String getDailyWorkout() {
		return "Do long ball twice, post then cross 15 times in a row!";
	}
}
