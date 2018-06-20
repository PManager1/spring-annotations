package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class tennisCoach implements Coach {
	
	private FortuneService fortuneService; 
	
//	@Autowired
//	public tennisCoach( FortuneService thefortuneService ) {
//		this.fortuneService = thefortuneService;
//	}
	
	public tennisCoach() {
		System.out.println("17 - default constructor called in tennisCoach");
	}
	
	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
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
