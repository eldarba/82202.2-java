package app.core;

public class Teacher extends Person {
	
	private Profession profession;

	public Teacher() {
	}

	public Teacher(String name, int age, Profession profession) {
		super(name, age);
		this.profession = profession;
	}

	public Profession getProfession() {
		return profession;
	}

	public void setProfession(Profession profession) {
		this.profession = profession;
	}

	@Override
	public String toString() {
		return "Teacher [profession=" + profession + ", name=" + getName() + ", age=" + getAge() + "]";
	}
	
	
	
	

}
