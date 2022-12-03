package tut_week6;
import java.util.Arrays;
public class BinarySearch {
	// -4 -1 3 6 12 19 36 66

	public static boolean search(int[] array, int searchedValue) {
		
		if(array.length == 0) {
			return false;
		}
		
		Arrays.sort(array);
		
		int left = 0;
		int right = array.length-1;
		
		while(left<=right) {
			int middle = left + (right-left)/2;
			if(array[middle] == searchedValue) {
				return true;
			}
			else if(array[middle] < searchedValue) {
				left = middle+1;
			}
			else {
				right = middle-1;
			}
		}
		return false;
	}

}
