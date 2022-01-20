package app.core.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Component
@Scope("prototype")
@ToString
@Getter @Setter
public class Person {

	private int id;
	private String name;

	
	

}
