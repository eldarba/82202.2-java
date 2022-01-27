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
public class Application1AddLibraries {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(Application1AddLibraries.class, args);
		LibraryService service = ctx.getBean(LibraryService.class);

		// PART 1 - ADD LIBRARIES WITH BOOKS TO DATABASE

		// create libraries
		Library library1 = new Library(0, "Library of Jerusalem", "Jerusalem", null);
		Library library2 = new Library(0, "Library of Tel Aviv", "Tel Aviv", null);
		Library library3 = new Library(0, "Library of Haifa", "Haifa", null);
		Library[] libraries = { library1, library2, library3 };

		// create books
		int numberOfBooks = 100;
		String[] authors = { "Ben", "Dan", "Lea", "Boris", "Mark", "Moshe", "Sarrah", "Sam" };
		List<Book> books = new ArrayList<>();
		for (int i = 1; i <= numberOfBooks; i++) {
			LocalDate publication = LocalDate.now();
			publication = publication.minusYears((long) (Math.random() * 51)); // now to 50 years back
			Book book = new Book(0, "book-" + i, authors[i % authors.length], publication, null);
			books.add(book);
		}

		// add books to libraries
		int c = 0;
		for (Book book : books) {
			int i = c % libraries.length;
			libraries[i].addBook(book);
			c++;
		}

		// save
		service.addLibrary(library1);
		service.addLibrary(library2);
		service.addLibrary(library3);

		System.out.println("\n============ libraries added =================");

	}

}
