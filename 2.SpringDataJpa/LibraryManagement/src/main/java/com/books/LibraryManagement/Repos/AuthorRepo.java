package com.books.LibraryManagement.Repos;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.books.LibraryManagement.BookModel.Author;

public interface AuthorRepo extends JpaRepository<Author, Long>{
	Optional<Author> findByName(String name);
}
