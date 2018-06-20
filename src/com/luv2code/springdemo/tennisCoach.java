package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class tennisCoach implements Coach {
	
	

	private FortuneService fortuneService; 
	
	@Autowired
	public tennisCoach( FortuneService thefortuneService ) {
		this.fortuneService = thefortuneService;
	}
	
	
	@Override
	public String getDailyWorkout() {
		return "Practice your ( Tennis ) backend";
	}
	
	
	@Override
	public String getDailyFortune() {
//		return " getDailyFortune  - Practice giving fortune";
		return fortuneService.getFortune(); 
	}
	

}
