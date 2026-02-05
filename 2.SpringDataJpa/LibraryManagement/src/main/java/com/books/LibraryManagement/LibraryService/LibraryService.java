package com.books.LibraryManagement.LibraryService;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.books.LibraryManagement.BookModel.Author;
import com.books.LibraryManagement.BookModel.Book;
import com.books.LibraryManagement.DTOs.AuthorByIdDto;
import com.books.LibraryManagement.DTOs.AuthorDto;
import com.books.LibraryManagement.DTOs.BookDto;
import com.books.LibraryManagement.Exceptions.ErrorMessagePass;
import com.books.LibraryManagement.Exceptions.NotFound;
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
	}

	
	public BookDto getBookById(long id) {
		Book book = bookRepo.findById(id).orElseThrow(() ->new NotFound("Book not found"));
		return modelMapper.map(book, BookDto.class); 
	}
	
	public AuthorByIdDto getAuthorById(long id) {
		Author auth = authRepo.findById(id).orElseThrow(() -> new NotFound("Author not found"));
//		Without Using Model Mapper
//		AuthorByIdDto authorDto = new AuthorByIdDto();
//	    authorDto.setId(auth.getId());
//	    authorDto.setName(auth.getName());
//
//	    if (auth.getBooks() != null) {
//	        List<BookDto> bookDtos = auth.getBooks().stream()
//	            .map(book -> {
//	                BookDto bookDto = new BookDto();
//	                bookDto.setId(book.getId());
//	                bookDto.setTitle(book.getTitle());
//	                bookDto.setGenre(book.getGenre());
//	                bookDto.setAuthorId(book.getId());
//	                bookDto.setAuthorName(book.getAuthor().getName());
//	                return bookDto;
//	            })
//	            .collect(Collectors.toList());
//	        
//	        authorDto.setBooks(bookDtos);
//	    }

	    return modelMapper.map(auth, AuthorByIdDto.class);
	}
	
	@Transactional
	public BookDto updateBook(BookDto bookDto) {

	    Author author = authRepo.findById(bookDto.getAuthorId())
	            .orElseThrow(() ->
	                    new NotFound("Author not found with id: " + bookDto.getAuthorId())
	            );
	    Book book = bookRepo.findById(bookDto.getId())
	            .orElseThrow(() ->
	                    new NotFound("Book not found with id: " + bookDto.getId())
	            );

	    book.setTitle(bookDto.getTitle());
	    book.setGenre(bookDto.getGenre());
	    book.setAuthor(author);

	    if (bookDto.getAuthorName() != null) {
	        author.setName(bookDto.getAuthorName());
	    }

	    Book updatedBook = bookRepo.save(book);

	    return modelMapper.map(updatedBook, BookDto.class);
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
