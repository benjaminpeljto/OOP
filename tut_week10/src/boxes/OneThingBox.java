package boxes;

public class OneThingBox extends Box{

	private Thing thing;
	
	public OneThingBox() {
		this.thing = null;
	}
	
	@Override
	public void add(Thing t) {
		if(this.thing == null) {
			this.thing = t;
		}
	}
	
	@Override
	public boolean isInTheBox(Thing t) {
		if(this.thing.equals(t)) {
			return true;
		}
		return false;
	}

}
