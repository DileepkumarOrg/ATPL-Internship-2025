package com.books.LibraryManagement.Repos;



import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.books.LibraryManagement.BookModel.Publisher;

public interface PublisherRepo extends JpaRepository<Publisher, Long>{
	Optional<Publisher> findByName(String name);
}
