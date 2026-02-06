package com.books.LibraryManagement.Repos;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.books.LibraryManagement.BookModel.Book;

public interface BookRepo extends JpaRepository<Book, Long>{
	Optional<Book> findByTitle(String title);
	
	
}
