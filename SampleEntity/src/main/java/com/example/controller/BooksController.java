package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Books;
import com.example.service.BooksService;

@RestController
public class BooksController {

	@Autowired
	BooksService booksService;
	
	@GetMapping("/books")
	private List<Books> getAllBooks(){
		return booksService.getAllBooks();
	}
	
	@GetMapping("/books/{bookId}")
	private Books getBooks(@PathVariable("bookId") int bookId ) {
		return booksService.getBooks(bookId);
	}
	
	@PostMapping("/books")
	private void saveOrUpdate(@RequestBody Books books) {
		booksService.saveOrUpdate(books);
	}
}
