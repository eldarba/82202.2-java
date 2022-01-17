package app.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import app.core.beans.Gym;
import app.core.beans.Trainer;

@Configuration
@ComponentScan
@PropertySource("application.properties")
public class App2 {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(App2.class);

		Gym gym = ctx.getBean(Gym.class);
		
		System.out.println(gym.getCyclingTrainer().getTrainingProgram());
		System.out.println(gym.getTennisTrainer().getTrainingProgram());
		System.out.println(gym.getRunningTrainer().getTrainingProgram());
		System.out.println(gym.getSwimmingTrainer().getTrainingProgram());

		ctx.close();

	}

}
