package app.core.stats;

import app.core.Grade;
import app.core.Person;
import app.core.Profession;
import app.core.Student;

public class SchoolStatistics {

	public static void main(String[] args) {
		
		Student student = getRandomStudent();
		System.out.println(student);
		System.out.println("=== grades:");
		for (Grade grade : student.getGrades()) {
			System.out.println(grade);
		}

	}

	public static Student getRandomStudent() {
		int age = (int) (Math.random() * (Person.MAX_AGE - Person.MIN_AGE + 1)) + Person.MIN_AGE;
		Student student = new Student(getRandomName(), age);
		for (Profession profession : Profession.values()) {
			int score = (int) (Math.random() * (Grade.MAX_SCORE - Grade.MIN_SCORE)) + Grade.MIN_SCORE;
			Grade gr = new Grade(profession, score);
			student.addGrade(gr);
		}
		return student;
	}

	private static String getRandomName() {
		String[] arr = { "Ron", "Danna", "Moshe", "David", "Lea" };
		int i = (int) (Math.random() * arr.length);
		return arr[i];
	}

}
