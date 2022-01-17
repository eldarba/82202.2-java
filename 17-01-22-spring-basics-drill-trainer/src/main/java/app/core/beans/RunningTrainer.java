package app.core.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("runninCoach")
public class RunningTrainer implements Trainer {
	
	@Value("${train.program.run}")
	private String trainingProgram;

	@Override
	public String getTrainingProgram() {
		return this.trainingProgram;
	}

}
 