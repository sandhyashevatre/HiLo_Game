package com.learning.hello.contoller;

import java.util.Random;

public class HiloController {
	private int guess;
	private int correctGuess;
	
	public void setGuess(int guess) {
		this.guess = guess;
	}
	public void reset() {
		guess = new Random().nextInt(0,200);
	}
	public int judge() {
		if(guess == correctGuess) {
			return 0;
		}
		else if(guess > correctGuess)
			return -1;
		else
			return 1;
	}
	public String feedback() {
		if(judge() == 0)
			return "correct Guess --> "+ guess;
		else if(judge() == -1)
			return "Guess Lower";
		else
			return "Guess Higher";
	}
}
