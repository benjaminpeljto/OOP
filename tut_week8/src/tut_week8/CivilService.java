package tut_week8;

public class CivilService implements NationalService {
	private int daysLeft;
	
	public CivilService() {
		this.daysLeft = 362;
	}
	
	public int getDaysLeft() {
		return this.daysLeft;
	}
	
	public void work() {
		this.daysLeft -= 1;
	}

}