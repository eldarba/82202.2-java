package app.core.jws;

import java.security.Key;
import java.util.Base64;

import javax.crypto.spec.SecretKeySpec;

import io.jsonwebtoken.SignatureAlgorithm;

public class Demo4CreateKey {

	public static void main(String[] args) {

		// 1. set the secret
		String scretKey = "aaaaaaaaa1aaaaaaaaa2aaaaaaaaa3aaaaaaaaa4aaa";
		// 2. decode to base-64
		byte[] secretKeyDecoded = Base64.getDecoder().decode(scretKey.getBytes());
		// 3. choose algorithm
		String algorithm = SignatureAlgorithm.HS256.getJcaName();

		// 4. create the key
		Key key = new SecretKeySpec(secretKeyDecoded, algorithm);

		System.out.println(key.getAlgorithm());

	}

}
