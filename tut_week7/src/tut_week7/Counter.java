package tut_week7;

public class Counter {
	private int spent;
	private int max;
	
	public Counter(int max) {
		this.max = max;
		this.spent = 0;
	}
	
	public void reset() {
		this.spent = 0;
	}
	
	public void incr1() {
		this.spent +=1;
	}
	
	public void incr10() {
		this.spent +=10;
	}
	
	public void incr100() {
		this.spent += 100;
	}
	
	public void incr1000() {
		this.spent += 1000;
	}
	
	public boolean overflow() {
		if(spent > max) {
			return true;
		}
		
		return false;
	}

}
