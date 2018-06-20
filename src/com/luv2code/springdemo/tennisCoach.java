package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class tennisCoach implements Coach {
	
	@Autowired
	private FortuneService fortuneService; 
	
//	@Autowired
//	public tennisCoach( FortuneService thefortuneService ) {
//		this.fortuneService = thefortuneService;
//	}

	//	Constructor 
//	public tennisCoach() {
//		System.out.println("17 - default constructor called in tennisCoach");
//	}

//	@Autowired 
//	public void doSomeCrazyMethod( FortuneService thefortuneService ) {
//		System.out.println("22 - calling doSomeCrazyMethod");
//		this.fortuneService = thefortuneService;
//	}
	
	
	@Override
	public String getDailyWorkout() {
		return "Practice your ( Tennis ) backend";
	}
	
	
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune(); 
	}
	
}
