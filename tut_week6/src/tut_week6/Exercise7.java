package tut_week6;

public class Exercise7 {

	public static void main(String[] args) {
		
		//FIRST TEST
		System.out.println("First test:");
		NightSky nightSky = new NightSky(0.1,40,10);
		nightSky.printLine();
		
		//SECOND TEST
		System.out.println("Second test:");
		NightSky nightSky2 = new NightSky(8,4);
		nightSky2.print();
		
		//THIRD TEST
		System.out.println("Third test:");
		NightSky nightSky3 = new NightSky (40,10);
		
		nightSky3.print();
		System.out.println("Number of stars: " + nightSky3.starsInLastPrint());
		System.out.println("Number of stars: " + nightSky3.starsInLastPrint()); 
		System.out.println("");
		
		nightSky3.print();
		System.out.println("Number of stars: " + nightSky3.starsInLastPrint());

	}

}
