package Fifth;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Analysis {

	private File file;
	
	public Analysis(File file){
		this.file = file;
	}
	
	public int lines() throws FileNotFoundException {
		int l = 0;
		Scanner reader = new Scanner(file);
		if(!reader.hasNext()) {
			reader.close();
			return 0;
		}
		while(reader.hasNext()) {
			l++;
			reader.nextLine();
		}
		reader.close();
		return l;
		
	}
	
	public int characters() throws FileNotFoundException{
		int c = 0;
		
		Scanner reader = new Scanner(this.file);
		
		if(!reader.hasNext()) {
			reader.close();
			return 0;
		}
		else {
			while(reader.hasNext()) {
				String s = reader.nextLine();
				c += s.length();
			}
			reader.close();
			return c;
		}
	}

}
