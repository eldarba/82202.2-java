package app.core.beans;

import org.springframework.stereotype.Component;

import app.core.annotaions.MyLogAnnotaion;

@Component
@MyLogAnnotaion
public class MyDao {

	@MyLogAnnotaion
	public void save() {
		System.out.println("dao is saving");
	}

	public void find(int id) {
		System.out.println("dao is finding " + id);
	}

	public void delete() {
		System.out.println("dao is deleteing");
	}

}
