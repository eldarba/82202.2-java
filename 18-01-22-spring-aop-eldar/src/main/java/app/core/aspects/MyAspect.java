package app.core.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//@Component
@Aspect
public class MyAspect {

	// Advice Type 1 - before
	@Before("div()")
	public void beforeDivAdvice(JoinPoint jp) {
		System.out.println(">>>@Before " + jp);
	}

	// Advice Type 2 - after
	@After("div()")
	public void afterDivAdvice(JoinPoint jp) {
		System.out.println(">>>@After " + jp);
	}

	// Advice Type 3 - after return
	@AfterReturning(pointcut = "div()", returning = "res")
	public void afterReturnDivAdvice(JoinPoint jp, String res) {
		System.out.println(">>>@AfterReturning " + jp + " [result is " + res + "]");
	}

	// Advice Type 4 - after throwing
	@AfterThrowing(pointcut = "div()", throwing = "e")
	public void afterThrowingDivAdvice(JoinPoint jp, Throwable e) {
		System.out.println(">>>@AfterThrowing " + jp + " [exception is " + e + "]");
	}

	// Advice Type 5 - around
	@Around("div()")
	public String arroundDivAdvice(ProceedingJoinPoint pjp) {
		System.out.println(">>>@Around - before " + pjp);
		Object res;
		try {
			// run the join point (business method) using proceed
			res = pjp.proceed();
			System.out.println(">>>@Around - after return: " + res);
			return res.toString();
		} catch (Throwable e) {
			System.out.println(">>>@Around - after throw: " + e);
			return "---AROUND: divied failed ---";
		}finally {
			System.out.println(">>>@Around - after " + pjp);
		}
	}

	@Pointcut("execution(* *.div(..))")
	public void div() {
	}

}
