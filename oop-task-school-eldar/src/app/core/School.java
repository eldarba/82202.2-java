package app.core;

public class School {
	
	private Classroom[] classrooms = new Classroom[5];

	public Classroom[] getClassrooms() {
		return classrooms;
	}

	public void setClassrooms(Classroom[] classrooms) {
		this.classrooms = classrooms;
	}
	
	public void addClassroom(Classroom classroom) {
		for (int i = 0; i < classrooms.length; i++) {
			if (classrooms[i] == null) {
				classrooms[i] = classroom;
				return;
			}
		}
	}

	
}
