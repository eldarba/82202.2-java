package app.core;

import java.util.NoSuchElementException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import app.core.entities.Coupon;
import app.core.entities.Customer;
import app.core.repos.CouponRepo;
import app.core.repos.CustomerRepo;

@SpringBootApplication
public class Application4 {

	public static void main(String[] args) {

		// spring context
		ApplicationContext ctx = SpringApplication.run(Application4.class, args);

		CouponRepo couponRepo = ctx.getBean(CouponRepo.class);
		CustomerRepo customerRepo = ctx.getBean(CustomerRepo.class);

		// get the customer or throw an exception if not found
		try {
			int customerId = 1;
			Customer customer = customerRepo.findById(customerId).orElseThrow();
			System.out.println(customer);
//			System.out.println(customer.getCoupons()); // error
			System.out.println(couponRepo.findByCustomersId(customerId));
		} catch (NoSuchElementException e) {
			System.out.println("NOT FOUND: " + e.getMessage());
		}

	}

}
