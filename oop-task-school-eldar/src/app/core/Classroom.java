package app.core;

public class Classroom {

	private String name;
	private Teacher teacher;
	private Student[] students = new Student[15];

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
		for (int i = 0; i < students.length; i++) {
			if (students[i] == null) {
				students[i] = student;
				return;
			}
		}
	}

	@Override
	public String toString() {
		return "Classroom [name=" + name + ", teacher=" + teacher + "]";
	}

}
