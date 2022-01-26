package app.core.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import app.core.entities.Coupon;

public interface CouponRepo extends JpaRepository<Coupon, Integer> {

	List<Coupon> findByCustomersId(int customerId);
}
