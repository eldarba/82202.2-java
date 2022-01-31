package app.core.model;

import lombok.Data;

@Data
public class User {

	private String email;
	private String password;
	
	public int sum(int a, int b) {
		return a + b;
	}


}
