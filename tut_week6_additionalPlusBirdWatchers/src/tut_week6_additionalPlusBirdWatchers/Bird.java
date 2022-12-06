package tut_week6_additionalPlusBirdWatchers;

public class Bird {
	private String name;
	private String latinName;
	private int observation;
	
	public Bird(String name, String latin) {
		this.name = name;
		this.latinName = latin;
		observation = 0;
	}
	
	public void addObservation() {
		this.observation++;
	}
	
	public String toString() {
		return this.name + " (" + this.latinName + "): " + this.observation + " observations";
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getObservations(){
		return this.observation;
	}

}
