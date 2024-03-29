package boxes;

import java.util.ArrayList;
import java.util.List;

public class BlackHoleBox extends Box{

	private List<Thing> things;
	
	public BlackHoleBox() {
		this.things = new ArrayList<>();
	}
	
	public void printContents() {
		for(Thing t : things) {
			System.err.println(t);
		}
	}
	
	@Override
	public void add(Thing thing) {
		this.things.add(thing);
	}
	
	@Override
	public boolean isInTheBox(Thing t) {
		return false;
	}

}
