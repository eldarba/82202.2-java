package app.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import app.core.beans.Message;

//@Configuration
//@ComponentScan
public class App {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(App.class);
		System.out.println("application context started");
		
		////////////////////////////////////////////
		Message m1 = ctx.getBean("message", Message.class);
		Message m2 = ctx.getBean("alertMesage", Message.class);
		System.out.println(m1);
		System.out.println(m2);
		////////////////////////////////////////////
		
		
		try {
			System.out.println("closing application context in 5 seconds");
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		ctx.close();
		System.out.println("application context closed");

	}
	
	@Bean
	public String content() {
		return "this is the message content from the @Bean method";
	}
	
	@Bean
	@Scope("prototype")
	public Message alertMesage() {
		Message message = new Message("");
		message.setContent("Alert!!!");
		return message;
	}

}
