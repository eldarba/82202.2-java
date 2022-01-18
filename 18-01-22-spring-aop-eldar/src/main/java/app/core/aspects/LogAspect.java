package app.core.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

//@Component
@Aspect
public class LogAspect {
	
	// below is an advice method of type "before"
	// it has an annotation @Before
	// the annotation has a pointcut expression [execution(void addCompany(int, String))]
	
	@Before("execution(* *.*(.., int, ..))")
	public void logAdviceSpecific(JoinPoint jp) {
		System.out.println(">>> Log for method: " + jp.getSignature());
	}
	
//	@Before("execution(* *.*(..))")
//	public void logAdviceGeneral() {
//		System.out.println("\t>>> Log for ALL methods");
//	}

}
