package app.core.services;

import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import app.core.entities.Book;
import app.core.repos.BookRepo;

@Service
@Transactional
public class BookService {
	
	@Autowired
	private BookRepo bookRepo;
	
	public int addBook(Book book) {
		return bookRepo.save(book).getId();
	}
	
	public Book getBook(int bookId) throws RuntimeException {
		Optional<Book> opt = bookRepo.findById(bookId);
		if(opt.isPresent()) { 
			return opt.get();
		}else {
			throw new RuntimeException("getBook faild - not found");
		}
	}

}
