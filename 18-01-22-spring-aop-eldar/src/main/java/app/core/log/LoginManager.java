package app.core.log;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class LoginManager {

	private boolean logged;
	@Value("${user}")
	private String user;
	@Value("${pass}")
	private String pass;

	public boolean login(String user, String password) {
		if (this.user.equals(user) && this.pass.equals(password)) {
			this.logged = true;
		} else {
			this.logged = false;
		}
		return this.logged;
	}

	public boolean isLogged() {
		return logged;
	}

}
