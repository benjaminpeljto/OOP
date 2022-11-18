package tut_week5;

public class Player {
	private String Name;
	private int numOfGoals;
	
	public Player(String name) {
		this.Name = name;
		this.numOfGoals = 0;
	}
	
	public Player(String name, int goals) {
		this.Name = name;
		this.numOfGoals = goals;
	}
	
	public String getName() {
		return this.Name;
	}
	
	public int getGoals() {
		return this.numOfGoals;
	}
	
	public String toString() {
		return (this.Name + ", goals: " + this.numOfGoals);
	}
}
