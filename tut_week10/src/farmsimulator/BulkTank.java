package farmsimulator;

public class BulkTank {
	
	private double capacity;
	private double volume;
	
	public BulkTank() {
		this.capacity = 2000;
		this.volume = 0;
	}
	public BulkTank(double capacity) {
		this.capacity = capacity;
		this.volume = 0;
	}
	
	
	
	
	public double getCapacity() {
		return this.capacity;
	}
	
	public double getVolume() {
		return this.volume;
	}
	
	public double howMuchFreeSpace() {
		return this.capacity - this.volume;
	}
	
	public void addToTank(double amount) {
		if(this.volume + amount > this.capacity) {
			double rest = this.capacity - this.volume;
			this.volume += rest;
		}
		
		else {
			this.volume += amount;
		}
	}
	
	public double getFromTank(double amount) {
		if(this.volume - amount < 0) {
			double v = this.volume;
			this.volume = 0;
			return v;
			
		}
		
		else {
			this.volume -= amount;
			return amount;
		}
	}
	
	@Override
	public String toString() {
		return Math.ceil(this.volume) + "/" + this.capacity;
	}

}
