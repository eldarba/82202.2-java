package app.core.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import app.core.entities.Book;
import app.core.entities.Library;
import app.core.repos.BookRepo;
import app.core.repos.LibraryRepo;

@Service
@Transactional
public class LibraryService {

	@Autowired
	private LibraryRepo libraryRepo;
	@Autowired
	private BookRepo bookRepo;

	public int addLibrary(Library library) {
		library = libraryRepo.save(library);
		return library.getId();
	}

	public int addBook(Book book) {
		book = bookRepo.save(book);
		return book.getId();
	}

	public void addBookToLibrary(Book book, int libraryId) {
		Library library = getLibrary(libraryId);
		library.addBook(book);
	}

	public Library getLibrary(int libraryId) {
		return libraryRepo.findById(libraryId).orElseThrow();
	}

	public List<Book> getAllBooksOfLibrary(int libraryId) {
		return this.bookRepo.findByLibraryId(libraryId);
	}

	public List<Library> getAllLibraries() {
		return this.libraryRepo.findAll();
	}

}
