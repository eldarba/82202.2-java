package app.core.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity // tell JPA that this is a table
public class Person {

	@Id // tell JPA that this is a primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // auto numbering
	private int id;
	private String name;
	private int age;

}
