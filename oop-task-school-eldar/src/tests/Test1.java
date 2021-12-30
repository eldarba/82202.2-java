package tests;

import java.util.Arrays;

import app.core.Grade;
import app.core.Profession;
import app.core.Student;
import app.core.Teacher;

public class Test1 {

	public static void main(String[] args) {
		Grade gr = new Grade(Profession.CHEMISTRY, 60);
		System.out.println(gr);
		
		Student student = new Student("Avi", 25);
		student.addGrade(new Grade(Profession.CHEMISTRY, 80));
		student.addGrade(new Grade(Profession.GEOGRAPHY, 90));
		student.addGrade(new Grade(Profession.LITERATURE, 55));
		student.addGrade(new Grade(Profession.MATH, 30));
		student.addGrade(new Grade(Profession.PHYSICS, 90));
		student.addGrade(new Grade(Profession.SPORTS, 100));
		Teacher teacher = new Teacher("Moshe", 33, Profession.LITERATURE);
		
		System.out.println(student);
		System.out.println(teacher);
		
		System.out.println("===========student grades");
		for (Grade grade : student.getGrades()) {
			System.out.println(grade);
		}
		
		System.out.println("===========student grades");
		System.out.println(Arrays.toString(student.getGrades()));

	}

}
