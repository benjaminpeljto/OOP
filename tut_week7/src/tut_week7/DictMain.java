package tut_week7;

import java.util.ArrayList;

public class DictMain {

	public static void main(String[] args) {
		
		//FIRST TEST
		/*Dictionary dictionary = new Dictionary();
	    dictionary.add("apina", "monkey");
	    dictionary.add("banaani", "banana");
	    dictionary.add("cembalo", "harpsichord");
	 
	    System.out.println(dictionary.translate("apina"));
	    System.out.println(dictionary.translate("porkkana"));*/
		
		//SECOND TEST
		
		/*Dictionary dictionary = new Dictionary();
	    dictionary.add("apina", "monkey");
	    dictionary.add("banaani", "banana");
	    System.out.println(dictionary.amountOfWords());
	 
	    dictionary.add("cembalo", "harpsichord");
	    System.out.println(dictionary.amountOfWords());	*/
		
		//THIRD TEST
		
		Dictionary dictionary = new Dictionary();
	    dictionary.add("apina", "monkey");
	    dictionary.add("banaani", "banana");
	    dictionary.add("cembalo", "harpsichord");
	 
	    ArrayList<String> translations = dictionary.translationList();
	    for(String translation: translations) {
	        System.out.println(translation);
	    }
		
		
		
		
	}

}
