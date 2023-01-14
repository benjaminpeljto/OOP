package boxes;

import java.util.ArrayList;
import java.util.List;

public class MaxWeightBox extends Box{

	private List<Thing> things;
	private int maxWeight;
	private int currentWeight;
	
	public MaxWeightBox(int maxWeight) {
		this.maxWeight = maxWeight;
		things = new ArrayList<>();
		this.currentWeight = 0;
	}
	
	public void add(Thing t) {
		if(t.getWeight() + this.currentWeight <= maxWeight) {
			things.add(t);
			currentWeight += t.getWeight();
		}
	}
	
	public boolean isInTheBox(Thing thing) {
		if(things.contains(thing)) {
			return true;
		}
		return false;
	}
	
	public void printThingsInTheBox() {
		for(Thing t : this.things) {
			System.out.println(t);
		}
	}
	
	

}
