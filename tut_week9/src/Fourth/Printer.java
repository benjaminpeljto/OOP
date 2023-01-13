package Fourth;

import java.io.File;
import java.util.Scanner;

public class Printer {
	
	private File file;
	
	public Printer(String fileName) throws Exception {
		this.file = new File(fileName);
	}
	
	public void printLinesWhichContain(String word) throws Exception{
		
		Scanner reader = new Scanner(this.file);
		
		if(word.equals("")) {
			while(reader.hasNext()) {
				System.out.println(reader.nextLine());
			}
		}
		else {
			while(reader.hasNext()) {
				String s = reader.nextLine();
				if(s.contains(word)) {
					System.out.println(s);
				}
			}
		}
		reader.close();
	}

}
