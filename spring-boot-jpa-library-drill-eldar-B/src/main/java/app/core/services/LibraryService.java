package app.core.services;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

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

	// ==================== more service methods
	public Book getBook(int bookId) {
		return bookRepo.findById(bookId).orElseThrow();
	}

	/**
	 * updates the library. only the name and address are updated.
	 * 
	 * @param library the library with the new data.
	 */
	public void updateLibrary(Library library) {
		Library libraryPersistent = getLibrary(library.getId());
		libraryPersistent.setName(library.getName());
		libraryPersistent.setAddress(library.getAddress());
	}

	/**
	 * updates the book. only the publication and title are updated.
	 * 
	 * @param book the book with the new data.
	 */
	public void updateBook(Book book) {
		Book bookPersistent = getBook(book.getId());
		bookPersistent.setPublication(book.getPublication());
		bookPersistent.setTitle(book.getTitle());
	}

	/**
	 * returns the book with the specified title or null if not found
	 * 
	 * @param bookTitle
	 * @return
	 */
	public Book getBookByTitle(String bookTitle) {
		return bookRepo.findByTitle(bookTitle);
	}

	/**
	 * return an optional of the specified library.
	 * 
	 * @param libraryName
	 * @return
	 */
	public Optional<Library> getLibraryByName(String libraryName) {
		return libraryRepo.findByName(libraryName);
	}

	public List<Book> getAllBooksPublishedBefore(LocalDate date) {
		return bookRepo.findByPublicationBefore(date);
	}

	public List<Book> getAllBooksPublishedAfter(LocalDate date) {
		return bookRepo.findByPublicationAfter(date);
	}

	public List<Book> getAllBooksPublishedBetween(LocalDate erliest, LocalDate latest) {
		return bookRepo.findByPublicationBetweenOrderByPublication(erliest, latest);
	}

	public List<Book> getAllBooksAuthorStartsWith(char c) {
		return bookRepo.findByAuthorStartingWith(c);
	}

}
