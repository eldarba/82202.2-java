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

		CompanyRepo companyRepo = ctx.getBean(CompanyRepo.class);
		AddressRepo addressRepo = ctx.getBean(AddressRepo.class);

		Optional<Company> opt = companyRepo.findById(2);
		if (opt.isPresent()) {
			Company company = opt.get();
			Address address = company.getAddress();

			System.out.println(company);
			System.out.println(address);
		} else {
			System.out.println("not found");
		}

//		companyRepo.deleteById(2); // ok - cascade to delete the address as well  
//		addressRepo.deleteById(2); // error because of foreign key constraint

//		addressRepo.save(new Address(0, "aaa", "aaa", "aaa", 22));
		addressRepo.deleteById(3); // ok - not referenced by any company
	}

}
