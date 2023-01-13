package Sixth;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PersonalMultipleEntryDictionary implements MultipleEntryDictionary{
	
	private Map<String, Set<String>> translations;

	public PersonalMultipleEntryDictionary() {
		this.translations = new HashMap<>();
	}
	
	
	public void add(String word, String entry) {
		if(!this.translations.containsKey(word)) {
			Set<String> someSet = new HashSet<>();
			someSet.add(entry);
			this.translations.put(word, someSet);
		}
		
		else {
			this.translations.get(word).add(entry);
		}
	}
	
	
	
	public Set<String> translate(String word){
		if(!this.translations.containsKey(word)) {
			return null;
		}
		else {
			return this.translations.get(word);
		}
	}
	
	
	
	public void remove(String word) {
		if(!this.translations.containsKey(word)) {
			throw new NullPointerException("Word cannot be removed because it doesn't exist in the dictionary");
		}
		else {
			this.translations.remove(word);
		}
	}

}
