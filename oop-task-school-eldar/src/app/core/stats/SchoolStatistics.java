package app.core.stats;

import app.core.Classroom;
import app.core.Grade;
import app.core.Person;
import app.core.Profession;
import app.core.School;
import app.core.Student;
import app.core.Teacher;

public class SchoolStatistics {

	private static int nextClassNumber = 101;

	public static void main(String[] args) {

		School school = getRandomSchool();
		school.print();

		System.out.println("\n========== statistical information ===============");
		printSchoolGradesAverage(school);

		System.out.println("\n=== classroom averages:");
		for (Classroom classroom : school.getClassrooms()) {
			if (classroom != null) {
				printClassroomGradesAverage(classroom);
			}
		}

	}

	// methods that produce statistical information
	// section 5
	// 1
	public static void printSchoolGradesAverage(School school) {
		double sum = 0;
		int c = 0;
		for (Classroom classroom : school.getClassrooms()) {
			if (classroom != null) {
				double avg = classroom.getGradesAvg();
				if (avg != -1) {
					sum += avg;
					c++;
				}
			}
		}
		if (c != 0) {
			System.out.println("school total average: " + sum / c);
		} else {
			System.out.println("school total average: NO DATA");
		}

	}

	// 2
	public static void printClassroomGradesAverage(Classroom classroom) {
		double avg = classroom.getGradesAvg();

		System.out.print(classroom.getName() + " average: ");
		if (avg != -1) {
			System.out.println(avg);
		} else {
			System.out.println("NO DATA");
		}
	}

	// methods that generate random data
	public static School getRandomSchool() {
		School school = new School();
		// use add methods to add classrooms to school
		for (int i = 0; i < 5; i++) {
			school.addClassroom(getRandomClassroom());
		}
		return school;
	}

	public static Classroom getRandomClassroom() {
		int numberOfStudents = (int) (Math.random() * 6) + 10; // 10 - 15
		Student[] students = new Student[numberOfStudents];
		for (int i = 0; i < numberOfStudents; i++) {
			students[i] = getRandomStudent();
		}
		// use CTOR to add students
		// prepare an array of student and give it to the Classroom CTOR
		Classroom classroom = new Classroom("classroom-" + nextClassNumber++, getRandomTeacher(), students);
		return classroom;
	}

	public static Teacher getRandomTeacher() {
		int age = (int) (Math.random() * (Person.MAX_AGE - Person.MIN_AGE + 1)) + Person.MIN_AGE;
		int index = (int) (Math.random() * Profession.values().length);
		Teacher teacher = new Teacher(getRandomStudentName(), age, Profession.values()[index]);
		return teacher;
	}

	public static Student getRandomStudent() {
		int age = (int) (Math.random() * (Person.MAX_AGE - Person.MIN_AGE + 1)) + Person.MIN_AGE;
		Student student = new Student(getRandomStudentName(), age);
		for (Profession profession : Profession.values()) {
			int score = (int) (Math.random() * (Grade.MAX_SCORE - Grade.MIN_SCORE)) + Grade.MIN_SCORE;
			Grade gr = new Grade(profession, score);
			student.addGrade(gr);
		}
		return student;
	}

	private static String getRandomStudentName() {
		String[] arr = { "Ron", "Danna", "Moshe", "David", "Lea" };
		int i = (int) (Math.random() * arr.length);
		return arr[i];
	}

}
