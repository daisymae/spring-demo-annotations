package com.cherylorcutt.springdemo;

import org.springframework.stereotype.Component;

@Component
public class PingPongCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practice serve";
	}

}
