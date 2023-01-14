package boxes;

import java.util.Collection;

public abstract class Box {
	
	public abstract void add(Thing thing);
	
	public void add(Collection<Thing> things) {
		for(Thing t : things) {
			add(t);
		}
	}
	
	public abstract boolean isInTheBox(Thing t);
}
