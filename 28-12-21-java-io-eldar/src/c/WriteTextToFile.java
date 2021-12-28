package c;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTextToFile {

	public static void main(String[] args) {
		File directory = new File("c:/eldar/temp/a/b");
		if(!directory.exists()) {
//			directory.mkdir();
			directory.mkdirs();
		}
		
		// this is the file we want to write to
		File file = new File(directory, "/file2.txt");
		
		// create an object that can write text to file
		// add buffer
		boolean append = true; // add to existing content or not
		try(BufferedWriter out = new BufferedWriter(new FileWriter(file, append));) {
			out.write("this is the first line.");
			out.newLine();
			out.write("this is the second line.");
			out.newLine();
//			int x = 500;
//			out.write(""+x);
			
			System.out.println("text writeen");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
