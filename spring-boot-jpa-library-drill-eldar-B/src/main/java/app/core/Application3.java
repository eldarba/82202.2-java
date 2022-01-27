package app.core;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import app.core.entities.Book;
import app.core.entities.Library;
import app.core.services.LibraryService;

@SpringBootApplication
public class Application3 {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(Application3.class, args);
		LibraryService service = ctx.getBean(LibraryService.class);

		{ // find book by title
			System.out.println("\n========== find book by title");
			Book book1 = service.getBookByTitle("book-77");
			Book book2 = service.getBookByTitle("book-77qq");
			System.out.println(book1);
			System.out.println(book2);
		}

		{ // find library by name
			String libraryName = "Library of Haifa";
			Optional<Library> opt = service.getLibraryByName(libraryName);
			if (opt.isPresent()) {
				Library library = opt.get();
				System.out.println(library);
			} else {
				System.out.println("NOT FOUND - " + libraryName);
			}
		}

		{ // find books published before date
			LocalDate date = LocalDate.of(1974, 1, 26);
			System.out.println("\n========== find books published before date: " + date);
			List<Book> books = service.getAllBooksPublishedBefore(date);
			printCollection(books);
		}

		{ // find books published after date
			LocalDate date = LocalDate.of(2016, 1, 26);
			System.out.println("\n========== find books published after date: " + date);
			List<Book> books = service.getAllBooksPublishedAfter(date);
			printCollection(books);
		}

		{ // find books published between dates
			LocalDate date1 = LocalDate.of(1980, 1, 26);
			LocalDate date2 = LocalDate.of(1990, 1, 26);
			System.out.println("\n========== find books published between: " + date1 + " - " + date2);
			List<Book> books = service.getAllBooksPublishedBetween(date1, date2);
			printCollection(books);
		}

		{ // find books author starts with
			char c = 'B';
			System.out.println("\n========== find books author starts with: " + c);
			List<Book> books = service.getAllBooksAuthorStartsWith(c);
			printCollection(books);
		}

		System.out.println("\n=== END ===");

	}

	private static void printCollection(Collection<?> col) {
		for (Object e : col) {
			System.out.println(e);
		}

	}

}
