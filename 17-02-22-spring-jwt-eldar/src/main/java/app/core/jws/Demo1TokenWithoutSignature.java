package app.core.jws;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Date;

import io.jsonwebtoken.Jwts;

public class Demo1TokenWithoutSignature {

	public static void main(String[] args) {

		Instant now = Instant.now();
		Instant expiration = now.plus(5, ChronoUnit.MINUTES);

		String jws = Jwts.builder()

				.setSubject("aaa@mail.com") // sub

				.setIssuedAt(Date.from(now)) // iat

				.setExpiration(Date.from(expiration)) // exp

				.claim("client-type", "Company")

				.claim("address", "Jerusalem, Israel")

				.compact();

		System.out.println(jws);

	}

}
