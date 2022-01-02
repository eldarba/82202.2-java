package app.core;

public class School {
	private final static int MAX = 5; 
	private Classroom[] classrooms;

	public Classroom[] getClassrooms() {
		return classrooms;
	}

	public void setClassrooms(Classroom[] classrooms) {
		this.classrooms = classrooms;
	}
	
	public void addClassroom(Classroom classroom) {
		if(this.classrooms==null) {
			this.classrooms = new Classroom[MAX];
		}
		for (int i = 0; i < classrooms.length; i++) {
			if (classrooms[i] == null) {
				classrooms[i] = classroom;
				return;
			}
		}
	}
	
	public void print() {
		System.out.println("SCHOOL:");
		for (Classroom classroom : classrooms) {
			if(classroom != null) {
				System.out.println(classroom);
				classroom.printStudents();
			}
		}
	}

	
}
