package app.core;

public class Grade {
	
	public static final int MIN_SCORE = 40;
	public static final int MAX_SCORE = 100;
	
	private Profession proffesion;
	private int score = MIN_SCORE;
	
	public Grade() {
	}

	public Grade(Profession proffesion, int score) {
		super();
		this.proffesion = proffesion;
		setScore(score);
	}

	public Profession getProffesion() {
		return proffesion;
	}

	public void setProffesion(Profession proffesion) {
		this.proffesion = proffesion;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		if(score >=MIN_SCORE &&score<=MAX_SCORE) {
			this.score = score;
		}
	}

	@Override
	public String toString() {
		return "Grade [proffesion=" + proffesion + ", score=" + score + "]";
	}
	
	
	
	

}
