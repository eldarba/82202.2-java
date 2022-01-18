package app.core.dao.company;

import org.springframework.stereotype.Component;

@Component
public class CompanyDao {

	// Business methods to be intercepted as joinpoints
	
	public void addCompany(int id, String name) {
		System.out.println("company added");
	}
	
	public void addCompany(Company company) {
		System.out.println("company added");
	}

	public void sayHello() {
		System.out.println("hello from comapny DAO");
	}

}
