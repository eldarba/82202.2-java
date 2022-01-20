package app.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import app.core.beans.MyDao;

public class App1 {

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);) {
			
			MyDao dao = ctx.getBean(MyDao.class);
			dao.save();
			dao.find(111);
			dao.delete(); 
			
		}

	}

}
