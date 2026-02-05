package com.books.LibraryManagement.LibraryService;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.books.LibraryManagement.BookModel.Author;
import com.books.LibraryManagement.BookModel.Book;
import com.books.LibraryManagement.DTOs.AuthorDto;
import com.books.LibraryManagement.DTOs.BookDto;
import com.books.LibraryManagement.DTOs.ErrorMessage;
import com.books.LibraryManagement.Exceptions.ErrorMessagePass;
import com.books.LibraryManagement.Repos.AuthorRepo;
import com.books.LibraryManagement.Repos.BookRepo;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class LibraryService {
	private final BookRepo bookRepo;
	private final AuthorRepo authRepo;
	private final ModelMapper modelMapper;
	
		
	@Transactional
	public BookDto addBook(BookDto bookDto) {
		if(!authRepo.findByName(bookDto.getAuthorName()).isEmpty() && !bookRepo.findByTitle(bookDto.getTitle()).isEmpty()) {
			throw new ErrorMessagePass("Duplicate Entry");
		}
	    Author author = authRepo.findByName(bookDto.getAuthorName())
	            .orElseGet(() -> {
	                Author newAuthor = new Author();
	                newAuthor.setName(bookDto.getAuthorName());
	                return authRepo.save(newAuthor);
	            });

	    Book book = bookRepo.findByTitle(bookDto.getTitle())
	            .orElseGet(() -> {
	                Book newBook = new Book();
	                newBook.setTitle(bookDto.getTitle());
	                newBook.setGenre(bookDto.getGenre());
	                newBook.setAuthor(author); 
	                return bookRepo.save(newBook);
	            });

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
