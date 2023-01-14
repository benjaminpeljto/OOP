package farmsimulator;

import java.util.Random;

public class RandomNames {
	private static final String[] NAMES = new String[]{"Anu", "Arpa", "Essi", "Heluna", "Hely",
			 "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",  "Jaana", "Jami", "Jatta",
			 "Laku", "Liekki",  "Mainikki", "Mella", "Mimmi", "Naatti", "Nina", "Nyytti", "Papu",
			 "Pullukka", "Pulu", "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};
	
	public static String getRandomName() {
		int r = new Random().nextInt(NAMES.length);
		return NAMES[r];
	}
}
