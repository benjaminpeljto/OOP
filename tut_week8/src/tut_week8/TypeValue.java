package tut_week8;

public class TypeValue<value> {
	private value val;
	
	public TypeValue(value someType) {
		this.val = someType;
	}
	
	
	public String toString() {
		return (this.val.getClass() + " Value: " + this.val);
	}
}
