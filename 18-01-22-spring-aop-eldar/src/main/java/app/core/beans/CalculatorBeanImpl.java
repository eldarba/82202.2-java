package app.core.beans;

import org.springframework.stereotype.Component;

@Component
public class CalculatorBeanImpl implements CalculatorBeanInterface {

	@Override
	public String div(int a, int b) throws RuntimeException {
		String str = a + " / " + b + " = " + (a / b) + " Rem: " + (a % b);
		System.out.println(str);
		return str;
	}

} 
