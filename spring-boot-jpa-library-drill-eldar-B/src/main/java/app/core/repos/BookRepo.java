package app.core.repos;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import app.core.entities.Book;

public interface BookRepo extends JpaRepository<Book, Integer> {

	List<Book> findByLibraryId(int libraryId);

	Book findByTitle(String bookTitle);

	List<Book> findByPublicationBefore(LocalDate date);

	List<Book> findByPublicationAfter(LocalDate date);

	List<Book> findByPublicationBetweenOrderByPublication(LocalDate erliest, LocalDate latest);

	List<Book> findByAuthorStartingWith(char prefix);
}
