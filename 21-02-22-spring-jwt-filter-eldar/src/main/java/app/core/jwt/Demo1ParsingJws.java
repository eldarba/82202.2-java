package app.core.jwt;

import java.security.Key;
import java.util.Base64;

import javax.crypto.spec.SecretKeySpec;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.JwtParser;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class Demo1ParsingJws {

	public static void main(String[] args) {

		// creating the key
		String scretKey = "aaaaaaaaa1aaaaaaaaa2aaaaaaaaa3aaaaaaaaa4aaa";
		// 2. decode to base-64
		byte[] secretKeyDecoded = Base64.getDecoder().decode(scretKey.getBytes());
		// 3. choose algorithm
		String algorithm = SignatureAlgorithm.HS256.getJcaName();
		// 4. create the key
		Key key = new SecretKeySpec(secretKeyDecoded, algorithm);
		
		// ==========================
		// get a token
		String jws = "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYWFAbWFpbC5jb20iLCJpYXQiOjE2NDUxMDA3NjcsImV4cCI6MTY0NTEwMTA2NywiY2xpZW50LXR5cGUiOiJDb21wYW55IiwiYWRkcmVzcyI6IkplcnVzYWxlbSwgSXNyYWVsIn0.gEjIs6bumywQf-6LlLaqQDONyrTw52ORWEWZheJoBZw";
		// get a parser
		JwtParser jwtParser = Jwts.parserBuilder().setSigningKey(key).build();
		// parse the token and get the parsed JWT
		Jws<Claims> jwt = jwtParser.parseClaimsJws(jws);
		
		// print data
		System.out.println(jwt.getHeader());
		System.out.println(jwt.getBody());
		System.out.println(jwt.getSignature());
		

	}

}
