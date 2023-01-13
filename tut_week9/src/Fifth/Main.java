package Fifth;

import java.io.File;
import java.io.FileNotFoundException;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		File newFile = new File("src/textfile.txt");
		
		Analysis a = new Analysis(newFile);
		for(int i = 0; i<3;i++) {
			System.out.println("File has " + a.lines() + " lines.");
			System.out.println("File has " + a.characters() + " characters.");
		}
	}

}
