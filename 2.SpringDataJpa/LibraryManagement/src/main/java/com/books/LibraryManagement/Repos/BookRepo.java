package com.books.LibraryManagement.Repos;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.books.LibraryManagement.BookModel.Book;
import com.books.LibraryManagement.DTOs.BookDto;

public interface BookRepo extends JpaRepository<Book, Long>{
	Optional<Book> findByTitle(String title);
	
	
}
