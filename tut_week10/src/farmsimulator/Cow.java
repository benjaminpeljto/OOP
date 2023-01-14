package farmsimulator;

import java.util.Random;

public class Cow implements Milkable,Alive{
	
	 

	private String name;
	private double udderCapacity;
	private double udderAmount;
	
	public Cow() {
		this.name = RandomNames.getRandomName();
		this.udderCapacity = new Random().nextInt(26) + 15;
	}
	
	public Cow(String name) {
		this.name = name;
		this.udderCapacity = new Random().nextInt(26) + 15;
	}

	public String getName() {
		return name;
	}

	public double getUdderCapacity() {
		return udderCapacity;
	}

	public double getUdderAmount() {
		return udderAmount;
	}
	
	public double milk() {
		double v = udderAmount;
		this.udderAmount = 0;
		return v;
	}
	
	public void liveHour() {
		double randMilk = 0.7 + 1.3 * (new Random().nextDouble());
		if(udderAmount + randMilk > udderCapacity) {
			double c = udderCapacity - udderAmount;
			udderAmount += c;
		}
		else {
			udderAmount += randMilk;
		}
	}

	@Override
	public String toString() {
		return this.name + " " + Math.ceil(udderAmount) + "/" + Math.ceil(udderCapacity);
	}

	
	
	
	
	

}
