package tut_week8;

public class MilitaryService implements NationalService {
	private int daysLeft;
	
	public MilitaryService(int days) {
		this.daysLeft = days;
	}
	
	public int getDaysLeft() {
		return this.daysLeft;
	}
	
	public void work() {
		this.daysLeft -= 1;
	}

}
