package app.core;

public class Student extends Person {

	private Grade[] grades = new Grade[6];

	public Student() {
	}

	public Student(String name, int age) {
		super(name, age);
	}

	public Grade[] getGrades() {
		return grades;
	}

	// 1. this is one option to set grades for this student
	public void setGrades(Grade[] grades) {
		this.grades = grades;
	}

	// 2. this is another option to set grades for this student
	public void addGrade(Grade grade) {
		for (int i = 0; i < grades.length; i++) {
			if (grades[i] == null) {
				grades[i] = grade;
				return;
			}
		}
	}

	@Override
	public String toString() {
		return "Student [name=" + getName() + ", age=" + getAge() + "]";
	}
	
	public void printGrades() {
		System.out.println("\t" + getName() + " grades: ");
		for (Grade grade : grades) {
			if(grade!=null) {
				System.out.println("\t\t" + grade);
			}
		}
	}

}
