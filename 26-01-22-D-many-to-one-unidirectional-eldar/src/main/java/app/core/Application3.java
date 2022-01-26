package app.core;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import app.core.entities.Coupon;
import app.core.entities.Review;
import app.core.repos.CouponRepo;

@SpringBootApplication
public class Application3 {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(Application3.class, args);

		List<Review> reviews = new ArrayList<>();
		for (int i = 1; i <= 3; i++) {
			Review review = new Review(0, "comment-" + i);
			reviews.add(review);
		}

		Coupon coupon = new Coupon(0, "Food", reviews);

		// add the coupon (with reviews) to db

		CouponRepo couponRepo = ctx.getBean(CouponRepo.class);
		couponRepo.save(coupon);

	}

}
