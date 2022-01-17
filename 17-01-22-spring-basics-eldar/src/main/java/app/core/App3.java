package app.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import app.core.beans.MyBean;
import app.core.beans.Person;

@Configuration
@ComponentScan
public class App3 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("App3");
		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(App3.class);
		
		
		Thread.sleep(3000);
		ctx.close();
		System.out.println("App3 END");
	}

	

}
