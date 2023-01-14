package farmsimulator;

import java.util.ArrayList;
import java.util.List;

public class Farm implements Alive{
	
	private String owner;
	private Barn barn;
	private List<Cow> herd;
	
	public Farm(String ownerName, Barn barn) {
		this.owner = ownerName;
		this.barn = barn;
		this.herd = new ArrayList<>();
	}

	
	public void addCow(Cow cow) {
		herd.add(cow);
	}
	
	public String getOwner() {
		return this.owner;
	}
	
	public void liveHour() {
		if(herd.size() == 0) {
			throw new IllegalStateException("No cows in the farm!");
		}
		else {
			for(Cow c : herd) {
				c.liveHour();
			}
		}
		
	}
	
	public String toString() {
		
		if(herd.size() == 0) {
			return "Farm owner: " + this.owner + "\nBarn bulk tank: " + this.barn.getBullBulkTank().toString() + "\nNo cows.";
		}
		else {
			String cows = "";
			for(Cow c : herd) {
				cows = cows +"\t" + c.toString() + "\n";
			}
			return "Farm owner: " + this.owner + "\nBarn bulk tank: " + this.barn.getBullBulkTank().toString() + "\nAnimals: \n" + cows;
		}
	}
}
