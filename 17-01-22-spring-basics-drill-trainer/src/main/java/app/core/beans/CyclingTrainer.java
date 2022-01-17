package app.core.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CyclingTrainer implements Trainer {
	
	@Value("${train.program.cycling}")
	private String trainingProgram;

	@Override
	public String getTrainingProgram() {
		return this.trainingProgram;
	}

}
 