package tut_week7;

import java.util.Scanner;

public class TextUserInterfaceMain {

	public static void main(String[] args) {
		
		//FIRST TEST
		
		/*Dictionary dictionary = new Dictionary();
		Scanner reader = new Scanner(System.in);
		
	    TextUserInterface ui = new TextUserInterface(reader, dictionary);
	    ui.start();*/
		
		//SECOND TEST
		
		Dictionary dict = new Dictionary();
		Scanner reader = new Scanner(System.in);
		
	    TextUserInterface ui = new TextUserInterface(reader, dict);
	    ui.start();
		
	}

}
