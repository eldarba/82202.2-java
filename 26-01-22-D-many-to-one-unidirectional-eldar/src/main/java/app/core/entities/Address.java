package app.core.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/*
 * spring beans (@Component, @Bean) - are managed by spring context (spring container)
 * JPA Entities (@Entity) - are managed by Hibernate session context (hibernate session)
 * entity is not bean. it is not managed by spring context. Entity is managed by hibernate session context
 * */

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = "company")
@Entity
public class Address {

	@Id // primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String country;
	private String city;
	private String street;
	@Column(name = "apt_number") // give column name in the database
	private int aptNumber;
	@OneToOne(mappedBy = "address")
	private Company company;

}
