package app.core.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.core.entities.Book;
import app.core.services.BookService;

@RestController
@RequestMapping("/book") // http://localhost:8080/book
public class BookController {

	@Autowired
	private BookService bookService;

	// http://localhost:8080/book?bookId=125 // request parameter
	// http://localhost:8080/book/125 // path variable
	@GetMapping(path = "/{bookId}")
	public Book getBook(@PathVariable int bookId) {
		return bookService.getBook(bookId);
	}

	@PostMapping
	public int addBook(@RequestBody Book book) {
		return bookService.addBook(book);
	}

}
