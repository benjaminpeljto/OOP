package tut_week7;

import java.util.Scanner;

public class TextUserInterface {
	private Scanner reader;
	private Dictionary dictionary;
	
	
	public TextUserInterface(Scanner reader, Dictionary dictionary) {
		
		this.reader = reader;
		this.dictionary = dictionary;
	}
	
	
	
	public void start() {
		System.out.println("Statement:");
		System.out.println("add - adds a word pair to the dictionary");
		System.out.println("translate - asks a word and prints it's translation");
		System.out.println("quit - quit text user interface");


		
		while(true) {
			
			System.out.print("Statement: ");
			String command = this.reader.nextLine();
			
			if(command.equals("quit")) {
				System.out.println("Cheers!");
				break;
			}
			else if(command.equals("add")) {
				System.out.print("In Finnish: ");
				String fin = reader.nextLine();
				System.out.print("Translation: ");
				String tr = reader.nextLine();
				
				this.dictionary.add(fin, tr);
			}
			
			else if (command.equals("translate")) {
				System.out.print("Give a word: ");
				String word = reader.nextLine();
				
				System.out.println("Translation: " + this.dictionary.translate(word));
			}
		}
		
		
	}

}
