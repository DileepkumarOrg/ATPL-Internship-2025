package com.books.LibraryManagement.LibraryController;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.books.LibraryManagement.BookModel.Author;
import com.books.LibraryManagement.BookModel.Book;
import com.books.LibraryManagement.DTOs.AuthorByIdDto;
import com.books.LibraryManagement.DTOs.AuthorDto;
import com.books.LibraryManagement.DTOs.BookDto;
import com.books.LibraryManagement.LibraryService.LibraryService;

import jakarta.validation.Valid;
import jakarta.websocket.server.PathParam;
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
	public BookDto getBookById(@PathVariable long id){
		return librarySer.getBookById(id);
	}

	@GetMapping("/authors/{id}")
	public AuthorByIdDto getAuthorById(@PathVariable long id){
		return librarySer.getAuthorById(id);
	}
	
	@GetMapping("/booksByGenre")
	public Page<BookDto> booksByGenre(@RequestParam int pageNu, @RequestParam int pageSize){
		return librarySer.getPageByGenre(pageNu, pageSize);
	}
	
	@PostMapping("/books")
	public BookDto addBook(@Valid @RequestBody BookDto book) {
		return librarySer.addBook(book);
	}

	@PostMapping("/authors")
	public Author addAuthor(@RequestBody Author author) {
		return librarySer.addAuthor(author);
	}
	
	@PutMapping("/books")
	public BookDto updateBook(@RequestBody BookDto book) {
		return librarySer.updateBook(book);
	}

	@PutMapping("/authors")
	public Author updateAuthor(@RequestBody Author author) {
		return librarySer.updateAuthor(author);
	}
	
	@DeleteMapping("/books/{id}")
	public void deleteBookById(@PathVariable long id) {
		librarySer.deleteBook(id);
	}

	@DeleteMapping("/authors/{id}")
	public void deleteAuthById(@PathVariable long id) {
		librarySer.deleteAuthor(id);
	}
	
	@DeleteMapping("/publisher/{id}")
	public void deletePublisherById(@PathVariable long id) {
		librarySer.deleteFromMapping(id);
	}
	
	@GetMapping("/publisher/{id}")
	public void activatePublisherById(@PathVariable long id) {
		librarySer.activateFromMapping(id);
	}
	
	
}
