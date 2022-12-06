package tut_week6_additionalPlusBirdWatchers;

import java.util.Scanner;

public class BW_Database_Main {

	public static void main(String[] args) {
		
		String[] commands = {"Add","Observation","Statistics","Show","Quit"};
		Scanner reader = new Scanner(System.in);
		BW_Database dbase = new BW_Database();
		
		System.out.print("? ");
		String in1 = reader.nextLine();
		while(!(in1.equals(commands[4]))){
			
			if(in1.equals(commands[0])) {
				System.out.print("Name: ");
				String name = reader.nextLine();
				System.out.print("Latin Name: ");
				String lname = reader.nextLine();
				dbase.addBird(new Bird(name,lname));
			}
			
			else if(in1.equals(commands[1])) {
				System.out.print("What was observed?:");
				String name = reader.nextLine();
				if(dbase.isBird(name)) {
					dbase.getBird(name).addObservation();
				}
				else {
					System.out.println("Is not a bird!");
				}
			}
			
			else if(in1.equals(commands[2])) {
				dbase.printDataBase();
			}
			
			else if(in1.equals(commands[3])) {
				System.out.print("What?: ");
				String name = reader.nextLine();
				
				if(dbase.isBird(in1)) {
					
					System.out.println(dbase.getBird(name));
					
				}
				else {
					System.err.println("Is not a bird!");
				}
			}
			
			else {
				System.out.println("Not a command!");
			}
			
			System.out.print("? ");
			in1 = reader.nextLine();
			
		}
	}

}
