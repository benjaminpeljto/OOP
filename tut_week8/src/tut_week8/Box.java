package tut_week8;

import java.util.ArrayList;

public class Box {
	private double maxWeight;
	private double currentWeight;
	private ArrayList<ToBeStored> items;
	
	public Box(double capacity) {
		this.maxWeight = capacity;
		this.items = new ArrayList<>();
	}
	
	public void add(ToBeStored item) {
		if((item.weight() + this.currentWeight) < this.maxWeight) {
			items.add(item);
			this.currentWeight += item.weight();
		}
	}

	@Override
	public String toString() {
		return "Box: " + this.items.size() + " things, total weight " + this.currentWeight + "kg.";
	}
}
