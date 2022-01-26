package app.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import app.core.entities.Coupon;
import app.core.entities.Customer;
import app.core.repos.CouponRepo;

@SpringBootApplication
public class Application3 {

	public static void main(String[] args) {

		// spring context
		ApplicationContext ctx = SpringApplication.run(Application3.class, args);

		CouponRepo couponRepo = ctx.getBean(CouponRepo.class);

		Coupon coupon = new Coupon(0, "BBB", null, null);

		Customer customer1 = new Customer(0, "aaa", "avi@mail", null);
		Customer customer2 = new Customer(0, "bbb", "ann@mail", null);
		Customer customer3 = new Customer(0, "ccc", "lea@mail", null);

		coupon.addCustomer(customer1); // add customer who bought this coupon
		coupon.addCustomer(customer2);
		coupon.addCustomer(customer3);

		couponRepo.save(coupon);

	}

}
