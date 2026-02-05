package com.books.LibraryManagement.LibraryService;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.books.LibraryManagement.BookModel.Author;
import com.books.LibraryManagement.BookModel.Book;
import com.books.LibraryManagement.DTOs.AuthorDto;
import com.books.LibraryManagement.DTOs.BookDto;
import com.books.LibraryManagement.Repos.AuthorRepo;
import com.books.LibraryManagement.Repos.BookRepo;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class LibraryService {
	private final BookRepo bookRepo;
	private final AuthorRepo authRepo;
	private final ModelMapper modelMapper;
	
		
	
	public BookDto addBook(BookDto bookDto) {
	    // 1. Handle the Author (Find existing or create new)
	    Author author = authRepo.findByName(bookDto.getAuthorName())
	            .orElseGet(() -> {
	                Author newAuthor = new Author();
	                newAuthor.setName(bookDto.getAuthorName());
	                return authRepo.save(newAuthor);
	            });

	    // 2. Handle the Book
	    // Check if book already exists to avoid duplicates
	    Book book = bookRepo.findByTitle(bookDto.getTitle())
	            .orElseGet(() -> {
	                Book newBook = new Book();
	                newBook.setTitle(bookDto.getTitle());
	                newBook.setGenre(bookDto.getGenre());
	                // IMPORTANT: Link the author to the book
	                newBook.setAuthor(author); 
	                return bookRepo.save(newBook);
	            });

	    // 3. Return the DTO (mapping back ensures you return the saved IDs)
	    return modelMapper.map(book, BookDto.class);
	}
	
	public Author addAuthor(Author author) {
		return authRepo.save(author);
	}
	
	public List<BookDto> getAllBooks() {
		System.err.println(bookRepo.findAll().toString());
	    return bookRepo.findAll()
	            .stream()
	            .map(book -> modelMapper.map(book, BookDto.class))
	            .toList();
	}
	
//	public BookDto bookDtoToBook(Book book) {
//		BookDto bookDto = new BookDto();
//		bookDto = modelMapper.map(book, BookDto.class);
//		return bookDto;
//	}
	
	public List<AuthorDto> getAllAuthors() {
//		System.out.println(authRepo.findAll());
		System.err.println(authRepo.findAll().toString());
	    return authRepo.findAll()
	            .stream()
	            .map(title -> {
	            	AuthorDto dto = modelMapper.map(title, AuthorDto.class);
	                List<String> bookNames =
	                		title.getBooks()
	                              .stream()
	                              .map(Book::getTitle)
	                              .toList();
	                dto.setBooks(bookNames);
	                return dto;
	            })
	            .toList();
//	    return null;
	}

	
	public Book getBookById(long id) {
		return bookRepo.findById(id).orElse(null);
	}
	
	public Author getAuthorById(long id) {
		return authRepo.findById(id).orElse(null);
	}
	
	public Book updateBook(Book book) {
		return bookRepo.save(book);
	}
	
	public Author updateAuthor(Author auth) {
		return authRepo.save(auth);
	}
	
	public void deleteBook(long id) {
		bookRepo.deleteById(id);
	}
	
	public void deleteAuthor(long id) {
		authRepo.deleteById(id);
	}
}
