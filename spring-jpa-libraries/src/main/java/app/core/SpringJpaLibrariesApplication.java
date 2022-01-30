package app.core;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import app.core.entities.Book;
import app.core.entities.Library;
import app.core.services.LibraryService;

@SpringBootApplication
public class SpringJpaLibrariesApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringJpaLibrariesApplication.class, args);


		// create libraries
		Library lib1 = new Library(0, "Libray of Jerusalem", "Jerusalem", null);
		Library lib2 = new Library(0, "Libray of Tel Aviv", "Tel Aviv", null);
		Library lib3 = new Library(0, "Libray of Haifa", "Haifa", null);
		Library[] libraries = { lib1, lib2, lib3 };

		String[] authors = { "Yael", "Nir", "Yotam", "Danna", "Nira" };

		// create books
		for (int i = 1; i <= 25; i++) {
			int year = (int) (Math.random() * 21) + 2000;
			LocalDate publication = LocalDate.of(year, 1, 1);
			Book book = new Book(0, "book-" + i, authors[i % authors.length], publication, null);
			// add the book to a library
			libraries[i % libraries.length].addBook(book);
		}

		// save the libraries
		LibraryService service = ctx.getBean(LibraryService.class);
		for (Library lib : libraries) {
			service.addLibrary(lib);
		}

	}

}
