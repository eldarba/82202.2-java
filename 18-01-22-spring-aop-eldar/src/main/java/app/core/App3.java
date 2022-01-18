package app.core;

import javax.swing.JOptionPane;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import app.core.beans.CalculatorBeanInterface;

public class App3 {

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);) {

			CalculatorBeanInterface calc = ctx.getBean(CalculatorBeanInterface.class);
			
			int a = Integer.parseInt(JOptionPane.showInputDialog("enter 1st number"));
			int b = Integer.parseInt(JOptionPane.showInputDialog("enter 2nd number"));
			
//			int a = 10;
//			int b = 2;
			
			try {
				String res = calc.div(a, b);
				System.out.println("MAIN: " + res);
			} catch (Exception e) {
				System.out.println("Error: " + e);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
