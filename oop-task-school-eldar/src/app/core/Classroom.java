package app.core;

public class Classroom {

	public static final int MAX_SIZE = 15;
	private String name;
	private Teacher teacher;
	private Student[] students;

	public Classroom() {
	}

	public Classroom(String name, Teacher teacher, Student[] students) {
		super();
		this.name = name;
		this.teacher = teacher;
		this.students = students;
	}

	public Classroom(String name, Teacher teacher) {
		this(name, teacher, null);
	}

	public Classroom(String name, Student[] students) {
		this(name, null, students);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public Student[] getStudents() {
		return students;
	}

	public void setStudents(Student[] students) {
		this.students = students;
	}

	public void addStudent(Student student) {
		if(this.students==null) {
			this.students = new Student[MAX_SIZE];
		}
		for (int i = 0; i < students.length; i++) {
			if (students[i] == null) {
				students[i] = student;
				return;
			}
		}
	}

	@Override
	public String toString() {
		return "Classroom [name=" + name + ", teacher=" + this.teacher + "]";
	}

	public void printStudents() {
		System.out.println("students:");
		for (Student student : students) {
			if (student != null) {
				System.out.println(student);
				student.printGrades();
			}
		}
		System.out.println("================");
	}

}
