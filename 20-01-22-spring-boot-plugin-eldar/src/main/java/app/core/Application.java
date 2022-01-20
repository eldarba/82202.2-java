package app.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import app.core.beans.Point;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		try (ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args);) {

			Point p1 = ctx.getBean(Point.class);
			Point p2 = ctx.getBean(Point.class);

			p1.setX(11);
			p1.setY(22);

			p2.setX(11);
			p2.setY(22);

			System.out.println(p1);
			System.out.println(p2);
			System.out.println(p1.equals(p2));

		}
	}

}
