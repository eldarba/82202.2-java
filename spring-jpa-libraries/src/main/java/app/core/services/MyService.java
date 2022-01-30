package app.core.services;

import org.springframework.beans.factory.annotation.Autowired;

import app.core.repos.BookRepo;
import app.core.repos.LibraryRepo;

public class MyService {
	
	@Autowired
	protected BookRepo bookRepo;
	@Autowired
	protected LibraryRepo libraryRepo;

}
