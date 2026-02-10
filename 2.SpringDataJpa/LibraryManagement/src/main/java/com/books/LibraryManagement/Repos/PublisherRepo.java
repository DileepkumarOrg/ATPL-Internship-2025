package com.books.LibraryManagement.Repos;



import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.books.LibraryManagement.BookModel.Publisher;

import jakarta.transaction.Transactional;

public interface PublisherRepo extends JpaRepository<Publisher, Long>{
	Optional<Publisher> findByName(String name);
	
	@Modifying 
	@Transactional
	@Query(value = "UPDATE publisher_dileep SET deleted = 0 WHERE id = :id", nativeQuery = true)
    void restorePublisher(long id);
}
