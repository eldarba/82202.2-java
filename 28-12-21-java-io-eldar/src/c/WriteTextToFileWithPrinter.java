package c;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteTextToFileWithPrinter {

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
		boolean append = false; // add to existing content or not
		try(PrintWriter out = new PrintWriter(new FileWriter(file, append));) {
			out.println("this is first line");
			out.println(8);
			out.println(8.3);
			
			System.out.println("text writeen");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
