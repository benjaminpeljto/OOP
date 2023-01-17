package First;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class FileManager {
	
	public FileManager() {
	}
	
	public ArrayList<String> read(String location) throws Exception{
		File file = new File(location);
		Scanner reader = new Scanner(file);
		ArrayList<String> strings = new ArrayList<>();
		while(reader.hasNext()) {
			strings.add(reader.nextLine());
		}
		
		reader.close();
		return strings;
		
	}
	
	 public void save(String file, String text) throws Exception{
		 File file1 = new File(file);
		 FileWriter fw = new FileWriter(file1);
		 fw.write(text);
		 fw.close();
	 }
	 
	 public void save(String file, ArrayList<String> texts) throws Exception{
		 File file1 = new File(file);
		 FileWriter fw = new FileWriter(file1);
		 for(String s : texts) {
			 fw.write(s + "\n");
		 }
		 fw.close();
	 }

}
