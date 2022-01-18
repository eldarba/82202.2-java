package app.core.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAspect {
	
	// below is an advice method of type "before"
	// it has an annotation @Before
	// the annotation has a pointcut expression [execution(void addCompany(int, String))]
	
	@Before("execution(void addCompany(int, String))")
	public void logAdvice() {
		System.out.println("---------");
	}

}
