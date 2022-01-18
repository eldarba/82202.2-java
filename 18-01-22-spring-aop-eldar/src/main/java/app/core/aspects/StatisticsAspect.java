package app.core.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class StatisticsAspect {
	
	
	private int numberOfCalls;
	
	// match on any method that accepts Company parameter
	@Before("companyPackage() && companyParam()")
	public void counterAdvice(JoinPoint jp) {
		numberOfCalls++;
		System.out.println("   >>>" + jp);
	}

	
	// define poincuts to use on advice methods
	@Pointcut("execution(* *.*(app.core.dao.company.Company))")
	public void companyParam() {
	}
	
	@Pointcut("execution(* app.core.dao.company.*.*(..))")
	public void companyPackage() {
		
	}

	// this is not advice
	public int getNumberOfCalls() {
		return numberOfCalls;
	}
}
