package app.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import app.core.beans.Trainer;

@Configuration
@ComponentScan
@PropertySource("application.properties")
public class App {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(App.class);

		Trainer trainer;
		
		trainer = ctx.getBean("swimmingTrainer", Trainer.class);
		System.out.println(trainer.getTrainingProgram());
		
		trainer = ctx.getBean("runningTrainer", Trainer.class);
		System.out.println(trainer.getTrainingProgram());
		
		trainer = ctx.getBean("cyclingTrainer", Trainer.class);
		System.out.println(trainer.getTrainingProgram());
		
		trainer = ctx.getBean("tennisTrainer", Trainer.class);
		System.out.println(trainer.getTrainingProgram());

		ctx.close();

	}

}
