package application;

import java.util.Random;

public class Thermometer implements Sensor{
	
	private boolean state;
	
	public Thermometer() {
		this.state = false;
	}
	
	public void on() {
		this.state=true;
	}
	public void off() {
		this.state=false;
	}
	public boolean isOn() {
		return this.state;
	}
	
	public int measure() {
		if(this.state) {
		Random rand = new Random();
		return rand.nextInt(31)-30;
		}
		else {
			throw new IllegalStateException("Thermometer is off!");
		}
	}
	
	

}
