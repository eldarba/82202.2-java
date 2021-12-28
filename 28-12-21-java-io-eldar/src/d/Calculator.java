package d;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Calculator {
	
	private double res;
	
	public void storeResult() {
		// object that can write binary java data to file
		File dir = new File("files"); // relative path - created in the program directory
		dir.mkdirs();
		File file = new File(dir, "res.data");
		// data - java primitives
		// DataOutputStream - can write java data to a stream
		// FileOutputStream - the stream to write to is a binary file
		// file - the file we want to write the data to
		try(DataOutputStream out = new DataOutputStream(new FileOutputStream(file));) {
			out.writeDouble(res);
			System.out.println("data stored in " + file);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public double getStoredResult() {
		File dir = new File("files"); // relative path - created in the program directory
		File file = new File(dir, "res.data");
		try (DataInputStream in = new DataInputStream(new FileInputStream(file));){
			double storedResult = in.readDouble();
			return storedResult;
		} catch (IOException e) {
			throw new RuntimeException("getStoredResult failed");
		}
		
	}
	
	
	
	public void add(double val) {
		res += val;
	}
	public void sub(double val) {
		res -= val;
	}
	public void mul(double val) {
		res *= val;
	}
	public void div(double val) {
		res /= val;
	}
	
	public void clear() {
		res = 0;
	}

	public double getRes() {
		return res;
	}
	

	
}
