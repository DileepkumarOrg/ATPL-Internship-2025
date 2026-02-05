package com.books.LibraryManagement.LibraryController;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.books.LibraryManagement.BookModel.Author;
import com.books.LibraryManagement.BookModel.Book;
import com.books.LibraryManagement.DTOs.AuthorDto;
import com.books.LibraryManagement.DTOs.BookDto;
import com.books.LibraryManagement.LibraryService.LibraryService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class LibraryController {
	public final LibraryService librarySer;
	
	@GetMapping("/books")
	public List<BookDto> getBooks(){
		return librarySer.getAllBooks();
	}

	@GetMapping("/authors")
	public List<AuthorDto> getAuthors(){
		return librarySer.getAllAuthors();
		
	}
	
	@GetMapping("/books/{id}")
	public Book getBookById(@PathVariable long id){
		return librarySer.getBookById(id);
	}

	@GetMapping("/authors/{id}")
	public Author getAuthorById(@PathVariable long id){
		return librarySer.getAuthorById(id);
	}
	
	@PostMapping("/book")
	public BookDto addBook(@RequestBody BookDto book) {
		return librarySer.addBook(book);
	}

	@PostMapping("/author")
	public Author addAuthor(@RequestBody Author author) {
		return librarySer.addAuthor(author);
	}
	
	@PutMapping("/book")
	public Book updateBook(@RequestBody Book book) {
		return librarySer.updateBook(book);
	}

	@PutMapping("/author")
	public Author updateAuthor(@RequestBody Author author) {
		return librarySer.updateAuthor(author);
	}
	
	@DeleteMapping("/book/{id}")
	public void deleteBookById(@PathVariable long id) {
		librarySer.deleteBook(id);
	}

	@DeleteMapping("/author/{id}")
	public void deleteAuthById(@PathVariable long id) {
		librarySer.deleteAuthor(id);
	}
}
