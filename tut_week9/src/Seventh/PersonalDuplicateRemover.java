package Seventh;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PersonalDuplicateRemover implements DuplicateRemover{

	private List<String> characterStrings;
	private int duplicateCounter;
	
	public PersonalDuplicateRemover() {
		this.characterStrings = new ArrayList<>();
		this.duplicateCounter = 0;
	}
	
	public void add(String characterString) {
		if(this.characterStrings.contains(characterString)) {
			duplicateCounter++;
		}
		else {
			characterStrings.add(characterString);
		}
	}
	
	public int getNumberOfDetectedDuplicates() {
		return duplicateCounter;
	}
	
	public Set<String> getUniqueCharacterStrings(){
		//Now I realised that I should have made the attribute of type Set.
		//But I feel lazy now to change it and it is 1:04 in the morning so I will just continue.. haha
		
		Set<String> unique = new HashSet<>();
		if(this.characterStrings.size() == 0) {
			return unique;
		}
		for(String s : this.characterStrings) {
			unique.add(s);
		}
		
		return unique;
		
	}
	
	public void empty() {
		this.characterStrings.clear();
		this.duplicateCounter = 0;
	}
}
