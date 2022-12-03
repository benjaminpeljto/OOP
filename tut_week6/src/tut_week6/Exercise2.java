package tut_week6;

public class Exercise2 {

	public static int indexOfTheSmallest(int[] array) {
		int smallestIndex = 0;
		int smallest = array[0];
		for (int i = 1 ; i < array.length ; i++) {
			if (array[i] < smallest) {
				smallest = array[i];
				smallestIndex = i;
			}
		}
		return smallestIndex;
	}
	
	
	public static void main(String[] args) {

		int[] values = {6,5,8,7,11};
		System.out.println("Index of the smallest: " + indexOfTheSmallest(values));
		
	}

}
