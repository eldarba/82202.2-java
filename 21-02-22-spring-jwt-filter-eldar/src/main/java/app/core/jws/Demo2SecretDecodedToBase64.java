package app.core.jws;

import java.util.Arrays;
import java.util.Base64;

public class Demo2SecretDecodedToBase64 {

	public static void main(String[] args) {

		String scretKey = "aaaaaaaaa1aaaaaaaaa2aaaaaaaaa3aaaaaaaaa4aaa";
		byte[] secretKeyEncoded = scretKey.getBytes();
		System.out.println(Arrays.toString(secretKeyEncoded));

		// we need an array of bytes in base-64
		byte[] secretKeyDecoded = Base64.getDecoder().decode(secretKeyEncoded);
		System.out.println(Arrays.toString(secretKeyDecoded));
		System.out.println(secretKeyDecoded.length);
		
		

	}

}
