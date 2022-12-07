package tut_week7;

import java.util.HashMap;

public class Exercise1 {

	public static void main(String[] args) {
		
		HashMap<String,String> people = new HashMap<>();
		
		people.put("matti","mage");
		people.put("mikael","mixu");
		people.put("arto","arppa");
		
		
		String nick = people.get("mikael");
		System.out.println(nick);
	}

}
