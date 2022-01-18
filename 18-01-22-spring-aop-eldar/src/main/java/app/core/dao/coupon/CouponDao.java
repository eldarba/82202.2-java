package app.core.dao.coupon;

import org.springframework.stereotype.Component;

@Component
public class CouponDao {

	// Business methods to be intercepted as joinpoints
	
	public void addCoupon() {
		System.out.println("coupon added");
	}

	public void doWork() {
		System.out.println("doing work at CouponDao");
	}

}
