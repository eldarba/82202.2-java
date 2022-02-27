package app.core.services;

import java.security.Key;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.crypto.spec.SecretKeySpec;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import app.core.services.JwtUtil.ClientDetails.ClientType;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.JwtParser;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import lombok.AllArgsConstructor;
import lombok.Data;

@Component
public class JwtUtil {
	private String signatureAlgorithm = SignatureAlgorithm.HS256.getJcaName();
	@Value("${jwt.util.secret.key}")
	private String encodedSecretKey;
	private Key decodedSecretKey;
	@Value("${jwt.util.chrono.unit.number}")
	private int unitsNumber;
	@Value("${jwt.util.chrono.unit}")
	private String chronoUnit;

	@PostConstruct
	public void init() {
		this.decodedSecretKey = new SecretKeySpec(Base64.getDecoder().decode(encodedSecretKey),
				this.signatureAlgorithm);
	}

	@Data
	@AllArgsConstructor
	public static class ClientDetails {
		public String email;
		public ClientType clientType;
		public int clentId;

		public enum ClientType {
			ADMIN, COMPANY, CUSTOMER
		}

	}

	public String generateToken(ClientDetails clientDetails) {
		Map<String, Object> claims = new HashMap<>();
		claims.put("clientType", clientDetails.clientType);
		claims.put("clentId", clientDetails.clentId);
		return createToken(claims, clientDetails.email);
	}

	private String createToken(Map<String, Object> claims, String subject) {
		Instant now = Instant.now();
		return Jwts.builder().setClaims(claims)

				.setSubject(subject)

				.setIssuedAt(Date.from(now))

//				.setExpiration(Date.from(now.plus(10, ChronoUnit.MINUTES)))

				.setExpiration(Date.from(now.plus(this.unitsNumber, ChronoUnit.valueOf(this.chronoUnit))))

				.signWith(this.decodedSecretKey)

				.compact();
	}

	public ClientDetails extractClient(String token) {
		Claims claims = extractAllClaims(token);
		String email = claims.getSubject();
		ClientType clientType = ClientType.valueOf(claims.get("clientType", String.class));
		int clientId = claims.get("clentId", Integer.class);
		ClientDetails clientDetails = new ClientDetails(email, clientType, clientId);
		return clientDetails;
	}

	private Claims extractAllClaims(String token) throws ExpiredJwtException {
		JwtParser jwtParser = Jwts.parserBuilder().setSigningKey(this.decodedSecretKey).build();
		return jwtParser.parseClaimsJws(token).getBody();
	}

	/** returns the JWT subject - in our case the email address */
	public String extractSubject(String token) {
		return extractAllClaims(token).getSubject();
	}

	public Date extractExpiration(String token) {
		return extractAllClaims(token).getExpiration();
	}

	public Date extractIssuedAt(String token) {
		return extractAllClaims(token).getIssuedAt();
	}

	public boolean isTokenExpired(String token) {
		try {
			extractAllClaims(token);
			return false;
		} catch (ExpiredJwtException e) {
			return true;
		}
	}

}
