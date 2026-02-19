package com.Book.Thymeleaf.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Book.Thymeleaf.Models.Book;
import com.Book.Thymeleaf.Repos.BookRepository;

@Service
public class BookService {

    @Autowired
    private BookRepository repo;

    public List<Book> getAllBooks() {
        return repo.findAll();
    }

    public void save(Book book) {
        repo.save(book);
    }

    public Book getById(Long id) {
        return repo.findById(id).orElseThrow();
    }

    public void delete(Long id) {
        repo.findById(id).orElseThrow(() -> new RuntimeException("Book not found"));
        repo.deleteById(id);
    }

}
