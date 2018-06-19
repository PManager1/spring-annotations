package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class tennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practice your ( Tennis ) backend";
	}

}
