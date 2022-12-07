package tut_week7;

import java.util.HashMap;

public class PromissoryNote {
	private HashMap<String, Double> people;

	public PromissoryNote() {
		
		people = new HashMap<>();
	}
	
	public void setLoan(String toWhom, double value) {
		this.people.put(toWhom, value);
	}
	
	 public double howMuchIsTheDebt(String whose) {
		 
		 if(people.containsKey(whose)) {
			 return this.people.get(whose);
		 }
		 
		 else {
			 return 0;
		 }
	 }

}
