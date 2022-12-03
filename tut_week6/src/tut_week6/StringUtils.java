package tut_week6;

public class StringUtils {
	public static boolean included(String word, String searched) {
		if(word == null || searched == null) {
			return false;
		}
		
		
		String word1 = word.trim().toLowerCase();
		String searched1 = searched.trim().toLowerCase();
		
		if(word1.contains(searched1)) {
			return true;
		}
		else {
			return false;
		}
	}
}
