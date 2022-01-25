package app.core;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import app.core.entities.Address;
import app.core.entities.Company;
import app.core.repos.AddressRepo;
import app.core.repos.CompanyRepo;

@SpringBootApplication
public class Application2 {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(Application2.class, args);
		AddressRepo addressRepo = ctx.getBean(AddressRepo.class);

		Optional<Address> opt = addressRepo.findById(1);
		if (opt.isPresent()) {
			Address address = opt.get();
			Company company = address.getCompany();
			System.out.println(address);
			System.out.println(company);
		} else {
			System.out.println("NOT FOUND");
		}

	}

}
