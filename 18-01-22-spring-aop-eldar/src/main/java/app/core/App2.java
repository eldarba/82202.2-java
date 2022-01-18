package app.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import app.core.aspects.StatisticsAspect;
import app.core.dao.company.Company;
import app.core.dao.company.CompanyDao;
import app.core.dao.coupon.CouponDao;

public class App2 {

	public static void main(String[] args) {
		
		try(AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);){
			// get the beans
			CompanyDao companyDao = ctx.getBean(CompanyDao.class);
			CouponDao couponDao = ctx.getBean(CouponDao.class);
			
			
			// use them
			companyDao.addCompany(101, "AAA");
			companyDao.addCompany(new Company());
			companyDao.addCompany(new Company());
			companyDao.addCompany(new Company());
			companyDao.sayHello();
			
			couponDao.addCoupon();
			couponDao.doWork();
			
			StatisticsAspect statisticsAspect = ctx.getBean(StatisticsAspect.class);
			System.out.println("number of calls: " + statisticsAspect.getNumberOfCalls());
			
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
