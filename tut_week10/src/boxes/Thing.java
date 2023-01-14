package boxes;

public class Thing {
	private String name;
	private int weight;
	
	public Thing(String name, int weight) {
		if(weight<0) {
			throw new IllegalArgumentException("Weight can't be negative!");
		}
		else {
			this.name = name;
			this.weight = weight;
		}
	}
	
	public Thing(String name) {
		this.name = name;
		this.weight = 0;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getWeight() {
		return this.weight;
	}
	
	@Override
	public String toString() {
		return this.name + " " + this.weight;
	}
	
	@Override
	public boolean equals(Object o){
		Thing t = (Thing) o;
		if(this.name.equals(t.getName())) {
			return true;
		}
		
		return false;
	}
	
	@Override
	public int hashCode() {
		return this.name.hashCode();
	}

}
