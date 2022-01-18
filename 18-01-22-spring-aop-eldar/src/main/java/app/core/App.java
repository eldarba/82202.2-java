package app.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import app.core.dao.company.CompanyDao;
import app.core.dao.coupon.CouponDao;

public class App {

	public static void main(String[] args) {
		
		try(AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);){
			// get the beans
			CompanyDao companyDao = ctx.getBean(CompanyDao.class);
			CouponDao couponDao = ctx.getBean(CouponDao.class);
			// use them
			companyDao.addCompany(101, "AAA");
			companyDao.sayHello();
			
			couponDao.addCoupon();
			couponDao.doWork();
			
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
