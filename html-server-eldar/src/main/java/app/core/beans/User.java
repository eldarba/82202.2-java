package app.core.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor @AllArgsConstructor
@EqualsAndHashCode(of = "name")
public class User {
	
	private String name;
	private String address;
	private int age;
	
	
	
	

}
