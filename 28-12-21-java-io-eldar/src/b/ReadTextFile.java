package b;

import java.io.FileReader;
import java.io.IOException;

public class ReadTextFile {

	public static void main(String[] args) {

		try (FileReader in = new FileReader("c:/eldar/temp/file1.txt");) {

			int c = in.read(); // read the first character
			while (c != -1) {
				System.out.print((char) c);
				c = in.read(); // read the next character
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
