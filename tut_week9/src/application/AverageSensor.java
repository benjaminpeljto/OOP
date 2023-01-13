package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {
	
	private List<Sensor> sensors;
	private boolean state;
	private List<Integer> readings;
	
	public AverageSensor() {
		this.sensors = new ArrayList<>();
		this.state = true;
		for(Sensor s : this.sensors) {
			if(!s.isOn()) {
				this.state = false;
				break;
			}
		}
		this.readings = new ArrayList<>();
	}
	
	public void addSensor(Sensor additional) {
		this.sensors.add(additional);
	}
	
	public void on() {
		for(Sensor s : this.sensors) {
			s.on();
		}
		this.state = true;
	}
	
	public void off() {
		for(Sensor s : this.sensors) {
			s.off();
		}
		this.state = false;
	}
	
	public boolean isOn() {
		return this.state;
	}
	
	public int measure() {
		if(this.state == false || this.sensors.size() == 0) {
			throw new IllegalStateException("Sensors are not yet added. Add sensors and try again!");
		}
		else {
			int avg = 0;
			for(Sensor s : this.sensors) {
				avg += s.measure();
			}
			int avg1 = avg/this.sensors.size();
			this.readings.add(avg1);
			return avg1;
		}
	}
	
	public List<Integer> readings(){
		return this.readings;
	}
	
	

}
