package app.core.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import app.core.exceptions.ProductException;
import app.core.services.JwtUtil.ClientDetails;
import app.core.services.JwtUtil.ClientDetails.ClientType;

@Service
public class LoginService {

	@Value("${app.login.email}")
	private String email;
	@Value("${app.login.password}")
	private String password;
	@Autowired
	private JwtUtil jwtUtil;

	public String login(String email, String password) {
		if (email.equals(this.email) && password.equals(this.password)) {
			ClientDetails clientDetails = new ClientDetails(email, ClientType.ADMIN, 0);
			String token = jwtUtil.generateToken(clientDetails);
			return token;
		} else {
			throw new ProductException("login faild - bad credentials");
		}
	}

}
