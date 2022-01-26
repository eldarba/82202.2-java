package app.core;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import app.core.entities.Book;
import app.core.entities.Library;
import app.core.services.LibraryService;

@SpringBootApplication
public class Application2FindLibraries {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Application2FindLibraries.class, args);

		LibraryService service = ctx.getBean(LibraryService.class);

		{// PART 2 - PRINT LIBRARIES AND BOOKS FROM DATABASE

			// get all libraries
			List<Library> libraries = service.getAllLibraries();

			for (Library library : libraries) {
				// print the library name
				System.out.println(library.getName());
				// print the library books
				for (Book book : service.getAllBooksOfLibrary(library.getId())) {
					System.out.println(book);
				}
				System.out.println("=========================\n");
			}

		}

	}

}
