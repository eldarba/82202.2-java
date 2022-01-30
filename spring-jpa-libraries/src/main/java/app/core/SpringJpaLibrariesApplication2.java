package app.core;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import app.core.dao.BookDao;
import app.core.entities.Book;

@SpringBootApplication
public class SpringJpaLibrariesApplication2 {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringJpaLibrariesApplication2.class, args);

		// save the libraries
		BookDao bookDao = ctx.getBean(BookDao.class);
		Book book = new Book(0, "Spring-1", "Eldar", LocalDate.now(), null);
		bookDao.addBook(book);

	}

}
