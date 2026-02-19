package com.Book.Thymeleaf.Repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Book.Thymeleaf.Models.Book;

public interface BookRepository extends JpaRepository<Book, Long>{
	
}
