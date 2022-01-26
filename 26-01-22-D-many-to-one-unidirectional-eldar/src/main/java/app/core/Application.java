package app.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import app.core.entities.Address;
import app.core.entities.Company;
import app.core.repos.CompanyRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(Application.class, args);
		CompanyRepo companyRepo = ctx.getBean(CompanyRepo.class);

		Company company = new Company(0, "AAA", "aaa@mail", null);
		company.setAddress(new Address(0, "Israel", "Tel Aviv", "sd. Rothchild", 125, null));

		company = companyRepo.save(company);

		System.out.println(company);

	}

}
