package com.example.repository;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import com.example.model.Books;

@Repository
public interface BooksRepository extends CrudRepository<Books, Integer>{

}
