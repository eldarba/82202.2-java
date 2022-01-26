package app.core;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import app.core.entities.Coupon;
import app.core.repos.CouponRepo;

@SpringBootApplication
public class Application4 {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(Application4.class, args);

		CouponRepo couponRepo = ctx.getBean(CouponRepo.class);

//		couponRepo.deleteById(3);

		Optional<Coupon> opt = couponRepo.findById(6);
		if (opt.isPresent()) {
			Coupon coupon = opt.get();
			System.out.println(coupon);
			System.out.println(coupon.getReviews());
		} else {
			System.out.println("NOT FOUND");
		}

	}

}
