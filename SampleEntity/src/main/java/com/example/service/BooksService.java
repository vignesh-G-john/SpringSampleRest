package com.example.service;

import java.util.ArrayList;

import com.example.model.Books;
import com.example.repository.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BooksService {
	@Autowired
	BooksRepository booksRepository;
	
	public List<Books> getAllBooks(){
		List<Books> books = new ArrayList<Books>();
		booksRepository.findAll().forEach(bookIndex->books.add(bookIndex));
		return books;
	}
	
	public Books getBooks(int bookId){
		return booksRepository.findById(bookId).get();
	}
	
	public void saveOrUpdate(Books books){
		booksRepository.save(books);
	}

}
