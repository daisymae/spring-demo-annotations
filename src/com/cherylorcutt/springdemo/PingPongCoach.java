package com.cherylorcutt.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PingPongCoach implements Coach {

	private FortuneService fortuneService;

	@Autowired
	PingPongCoach(@Qualifier("happyFortuneService") FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice serve";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
