package tut_week6;

public class Exercise6 {

	public static void main(String[] args) {
		int[] array = {5, 1, 3, 4, 2};
		printElegantly(array);
	}
	
	public static void printElegantly(int[] arr) {
		if(arr.length == 0) {
			System.out.print("");
		}
		else {
			int i = 0;
			while(i<arr.length-1) {
				System.out.print(arr[i] + ", ");
				i++;
			}
			System.out.print(arr[i]);
		}
	}

}
