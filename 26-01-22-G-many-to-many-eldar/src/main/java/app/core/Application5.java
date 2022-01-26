package app.core;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import app.core.entities.Coupon;
import app.core.entities.Customer;
import app.core.repos.CouponRepo;
import app.core.repos.CustomerRepo;

@SpringBootApplication
public class Application5 {

	public static void main(String[] args) {

		// spring context
		ApplicationContext ctx = SpringApplication.run(Application5.class, args);

		CouponRepo couponRepo = ctx.getBean(CouponRepo.class);
		CustomerRepo customerRepo = ctx.getBean(CustomerRepo.class);

		// get the customer or throw an exception if not found
		try {
			int customerId = 1;
			Customer customer = customerRepo.findById(customerId).orElseThrow();

			List<Coupon> coupons = new ArrayList<>();
			coupons.add(new Coupon(0, "food", null, null));
			coupons.add(new Coupon(0, "electricity", null, null));
			coupons.add(new Coupon(0, "camping", null, null));

			customer.setCoupons(coupons);

			customerRepo.save(customer);

		} catch (NoSuchElementException e) {
			System.out.println("NOT FOUND: " + e.getMessage());
		}

	}

}
