package application;

public class ConstantSensor {
	
	private int measuring;
	
	public ConstantSensor(int measure) {
		this.measuring = measure;
	}
	
	
	public boolean isOn() {
		return true;
	}
	public int measure() {
		return this.measuring;
	}
	public void on() {}
	public void off() {}
	
	
}
