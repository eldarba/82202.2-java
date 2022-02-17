package app.core.jws;

import java.security.Key;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Base64;
import java.util.Date;

import javax.crypto.spec.SecretKeySpec;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class Demo5TokenWithSignature {

	public static void main(String[] args) {

		// 1. set the secret
		String scretKey = "aaaaaaaaa1aaaaaaaaa2aaaaaaaaa3aaaaaaaaa4aaa";
		// 2. decode to base-64
		byte[] secretKeyDecoded = Base64.getDecoder().decode(scretKey.getBytes());
		// 3. choose algorithm
		String algorithm = SignatureAlgorithm.HS256.getJcaName();
		// 4. create the key
		Key key = new SecretKeySpec(secretKeyDecoded, algorithm);

		Instant now = Instant.now();
		Instant expiration = now.plus(5, ChronoUnit.MINUTES);

		String jws = Jwts.builder()

				.signWith(key)

				.setSubject("aaa@mail.com") // sub

				.setIssuedAt(Date.from(now)) // iat

				.setExpiration(Date.from(expiration)) // exp

				.claim("client-type", "Company")

				.claim("address", "Jerusalem, Israel")

				.compact();

		System.out.println(jws);

	}

}
