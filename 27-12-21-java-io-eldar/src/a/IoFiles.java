package a;

import java.io.File;
import java.io.IOException;

public class IoFiles {

	public static void main(String[] args) {
		try {
			String path = "c:/eldar/temp/file1.txt";
			File file = new File(path);

			if (file.exists()) {
				System.out.println("file exists: " + file);
			} else {
				System.out.println("file NOT exists: " + file);
				file.createNewFile();
				System.out.println("file created");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
