package app.core.services;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import app.core.entities.Book;
import app.core.entities.Library;

@Service
public class LibraryService extends MyService {

	// the repositories are defined in the super class

	@Transactional
	public int addLibrary(Library library) {
		if (!this.libraryRepo.existsById(library.getId())) {
			library = this.libraryRepo.save(library);
			return library.getId();
		} else {
			throw new RuntimeException("addLibrary failed - already exists library id " + library.getId());
		}
	}

	public int addBook(Book book) {
		if (!this.bookRepo.existsById(book.getId())) {
			book = bookRepo.save(book);
			return book.getId();
		} else {
			throw new RuntimeException("addBook failed - already exists book id " + book.getId());
		}
	}

	public void addBookToLibrary(Book book, int libraryId) {
		if (this.libraryRepo.existsById(libraryId) && !bookRepo.existsById(book.getId())) {
			Library library = this.libraryRepo.findById(libraryId).get();
			library.addBook(book);
		} else {
			throw new RuntimeException("addBookToLibrary failed - library " + libraryId + " - not found or book "
					+ book.getId() + " already exist");
		}
	}

	public List<Book> getAllBooksOfLibrary(int libraryId) {
		return bookRepo.findByLibraryId(libraryId);
	}

	public void updateLibrary(Library library) {
		Optional<Library> opt = libraryRepo.findById(library.getId());
		if (opt.isPresent()) {
			Library LibraryFromDb = opt.get();
			LibraryFromDb.setName(library.getName());
			LibraryFromDb.setAddress(library.getAddress());
		} else {
			throw new RuntimeException("updateLibrary failed - library " + library.getId() + " - not found");
		}
	}

	public void updateBook(Book book) {
		if (this.bookRepo.existsById(book.getId())) {
			Book bookFromDb = bookRepo.findById(book.getId()).get();
			bookFromDb.setTitle(book.getTitle());
			bookFromDb.setPublication(book.getPublication());
		} else {
			throw new RuntimeException("updateBook failed - not found");
		}
	}

	public Optional<Book> findBookById(int bookId) {
		return bookRepo.findById(bookId);
	}

	public Library getLibraryByName(String libraryName) {
		Library library = libraryRepo.findByName(libraryName);
		if (library != null) {
			return library;
		} else {
			throw new RuntimeException("getLibraryByName failed - not found");
		}
	}

	public List<Book> getAllBooksPublishedBefore(LocalDate date) {
		return bookRepo.findByPublicationBefore(date);
	}

	public List<Book> getAllBooksPublishedAfter(LocalDate date) {
		return bookRepo.findByPublicationAfter(date);
	}

	public List<Book> getAllBooksPublishedBetween(LocalDate date1, LocalDate date2) {
		return bookRepo.findByPublicationBetweenOrderByPublication(date1, date2);
	}

	public List<Book> getBooksByAuthorStartingWith(char prefix) {
		return bookRepo.findByAuthorStartingWith(prefix);
	}
}
