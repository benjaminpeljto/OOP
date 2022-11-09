package tut_week4;

public class Exercise2 {

	public static void main(String[] args) {
		
		Dice dice = new Dice(9);
		
		int i = 0;
		
		while (i < 10) {
			System.err.println(dice.roll());
			i++;
		}
	}

}
