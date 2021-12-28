package d;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo1 {
	
	public static void main(String[] args) {
		// data to file
		int n1 = 123;
		byte n2 = 50;
		double n3 = 2.458;
		boolean b = true;
		long n4 = 99999999999L;
		
		// 1. define a file with relative path:
		// files/primitives.data
		File file = new File("files/primitives.data");
		
		// 2. create a DataOutputStream object to write the above data to file
		try(DataOutputStream out = new DataOutputStream(new FileOutputStream(file));) {
			// write the data:
			out.writeInt(n1);
			out.writeByte(n2);
			out.writeDouble(n3);
			out.writeBoolean(b);
			out.writeLong(n4);
			// 3. print a success message
			System.out.println("data written to: " + file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
