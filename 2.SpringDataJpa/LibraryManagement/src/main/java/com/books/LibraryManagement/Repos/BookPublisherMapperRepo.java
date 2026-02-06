package com.books.LibraryManagement.Repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.books.LibraryManagement.BookModel.BookPublisherMapper;

public interface BookPublisherMapperRepo extends JpaRepository<BookPublisherMapper, Long>{

}
