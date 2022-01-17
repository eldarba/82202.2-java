package app.core.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Gym {
	
	private RunningTrainer runningTrainer;
	private SwimmingTrainer swimmingTrainer;
	private CyclingTrainer cyclingTrainer;
	private TennisTrainer tennisTrainer;
	
	public Gym() {
	}
	
	 
	@Autowired
	public Gym(RunningTrainer runningTrainer, SwimmingTrainer swimmingTrainer, CyclingTrainer cyclingTrainer,
			TennisTrainer tennisTrainer) {
		super();
		this.runningTrainer = runningTrainer;
		this.swimmingTrainer = swimmingTrainer;
		this.cyclingTrainer = cyclingTrainer;
		this.tennisTrainer = tennisTrainer;
	}

	public RunningTrainer getRunningTrainer() {
		return runningTrainer;
	}

	public SwimmingTrainer getSwimmingTrainer() {
		return swimmingTrainer;
	}

	public CyclingTrainer getCyclingTrainer() {
		return cyclingTrainer;
	}

	public TennisTrainer getTennisTrainer() {
		return tennisTrainer;
	}
	
	
	
	
	

}
