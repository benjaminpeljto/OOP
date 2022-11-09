package tut_week4;

import java.util.Random;

public class Dice {
	private Random random;
	private int numOfSides;
	
	public Dice(int numberOfSides) {
		this.numOfSides = numberOfSides;
		random  = new Random();
	}
	
	public int roll() {
		return random.nextInt(this.numOfSides+1);
	}
}
