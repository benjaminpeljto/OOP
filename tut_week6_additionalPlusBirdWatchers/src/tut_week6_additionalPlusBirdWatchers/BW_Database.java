package tut_week6_additionalPlusBirdWatchers;
import java.util.ArrayList;



public class BW_Database {
	
	private ArrayList<Bird> birds;
	
	public BW_Database() {
		birds = new ArrayList<>();
	}
	
	public void addBird(Bird b1) {
		this.birds.add(b1);
	}
	
	public void printDataBase() {
		for (Bird bird : birds) {
			System.out.println(bird);
		}
	}
	
	public boolean isBird(String n) {
		for (Bird bird : this.birds) {
			if(bird.getName().equals(n)) {
				return true;
			}
		}
		return false;
	}
	
	public Bird getBird(String n) {
		for (Bird bird : this.birds) {
			if(bird.getName().equals(n)) {
				return bird;
			}
		}
		return birds.get(0);
	}

}
