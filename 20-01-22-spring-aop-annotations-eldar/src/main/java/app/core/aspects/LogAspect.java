package app.core.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAspect {

	@Before("classAnnotation()") // runs on all methods in class
	public void logAdvice(JoinPoint jp) {
		System.out.println(">>> Log: " + jp);
	}
	
	@Before("methodAnnotation()") // runs an annotated methods only
	public void logASavedvice(JoinPoint jp) {
		System.out.println("*** Log: " + jp);
	}
	
	// method level - for annotation on method
	@Pointcut("@annotation(app.core.annotaions.MyLogAnnotaion)")
	public void methodAnnotation() {
		
	}
	
	// class level - for annotation on class
	@Pointcut("@target(app.core.annotaions.MyLogAnnotaion)")
	public void classAnnotation() {
		
	}
	
//	@Before("execution(* *.find(..))")
//	public void logAdvice(JoinPoint jp) {
//		System.out.println(">>> Log: " + jp);
//	}

}
