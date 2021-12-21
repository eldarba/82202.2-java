package a;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Demo2Exception {

	public static void main(String[] args) {
		
		// C:/eldar/temp/letter.txt
		
		File file = new File("C:/eldar/temp/letter.txt");
		
		try {
			FileReader in = new FileReader(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
