package First;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) throws Exception {
		
		/*FileManager f = new FileManager();
		
		for(String line : f.read("src/First/testinput1.txt")) {
			System.out.println(line);
		}*/
		
		//********************************************   MY TESTS FOR b) & c)
		
		/*FileManager f = new FileManager();
		
		f.save("src/First/testinput1.txt", "Benjooooo");*/
		
		ArrayList<String> al = new ArrayList<>();
		al.add("Hehe");
		al.add("dede");
		al.add("bebe");
		al.add("zeze");
		
		FileManager d  = new FileManager();
		d.save("src/First/testinput1.txt",al);
	
		
		
	}

}
