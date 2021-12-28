package e;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectFromFile {

	public static void main(String[] args) {

		
		File file = new File("files/person.obj");
		// object de-serialization
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));) {

		Person p = (Person) in.readObject();
		System.out.println(p);

		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
