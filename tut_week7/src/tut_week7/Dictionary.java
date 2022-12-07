package tut_week7;

import java.util.ArrayList;
import java.util.HashMap;

public class Dictionary {
	private HashMap<String, String> translations;

	public Dictionary() {
		translations = new HashMap<>();
	}
	
	 public String translate(String word) {
		 if(this.translations.containsKey(word)) {
			 return this.translations.get(word);
		 }
		 return null;
	 }
	 
	 public void add(String word, String translation) {
		 this.translations.put(word,translation);
	 }
	 
	 public int amountOfWords() {
		 return this.translations.size();
	 }
	 
	 public ArrayList<String> translationList(){

		 ArrayList<String> trans = new ArrayList<>();
		 for (String word : this.translations.keySet()) {
			String n = word + " = " + this.translations.get(word);
			trans.add(n);
		}
		 
		 return trans;
	 }
}
