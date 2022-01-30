package app.core;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import app.core.entities.Book;
import app.core.services.LibraryService;

@SpringBootApplication
public class SpringJpaLibrariesApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringJpaLibrariesApplication.class, args);

		LibraryService service = ctx.getBean(LibraryService.class);

		Optional<Book> opt = service.findBookById(1);

		if (opt.isPresent()) {
			Book book = opt.get();
			System.out.println(opt);
			System.out.println(book);
		} else {
			System.out.println("book not found");
		}
	}

}
