package com.books.LibraryManagement.LibraryService;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.books.LibraryManagement.BookModel.Author;
import com.books.LibraryManagement.BookModel.Book;
import com.books.LibraryManagement.BookModel.Publisher;
import com.books.LibraryManagement.DTOs.AuthorByIdDto;
import com.books.LibraryManagement.DTOs.AuthorDto;
import com.books.LibraryManagement.DTOs.AuthorOptions;
import com.books.LibraryManagement.DTOs.BookDto;
import com.books.LibraryManagement.Exceptions.ErrorMessagePass;
import com.books.LibraryManagement.Exceptions.NotFound;
import com.books.LibraryManagement.Repos.AuthorRepo;
import com.books.LibraryManagement.Repos.BookRepo;
import com.books.LibraryManagement.Repos.PublisherRepo;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service


public class LibraryService {
	private final BookRepo bookRepo;
	private final AuthorRepo authRepo;
	private final PublisherRepo pubRep;
	private final ModelMapper modelMapper;
	
	
	@Value("${file.upload-dir}")
    private String uploadDir;
	
	
	@Transactional
	public BookDto addBook(BookDto bookDto, MultipartFile file) {
		if (file.isEmpty()) {
            throw new RuntimeException("File is empty");
        }

        if (!file.getContentType().startsWith("image/")) {
            throw new RuntimeException("Only images allowed");
        }
        
        if(file.getSize() > 307200) {
        	throw new RuntimeException("Image should be lessthan 300kb");
        }
		if(!authRepo.findByName(bookDto.getAuthorName()).isEmpty() && !bookRepo.findByTitle(bookDto.getTitle()).isEmpty()) {
			throw new ErrorMessagePass("Duplicate Entry");
		}
	    Author author = authRepo.findByName(bookDto.getAuthorName())
	            .orElseGet(() -> {
	                Author newAuthor = new Author();
	                newAuthor.setName(bookDto.getAuthorName());
	                return authRepo.save(newAuthor);
	            });
//	    Publisher publisher = pubRep.findByName(bookDto.getPublisher())
//	    		.orElseGet(() -> {
//	    			Publisher newPublisher = new Publisher();
//	    			newPublisher.setName(bookDto.getPublisher());
//	    			newPublisher.setLocation(bookDto.getLocation());
//	    			return pubRep.save(newPublisher);
//	    		});
	    
	    List<Publisher> publishers = bookDto.getPublishers()
	    	    .stream()
	    	    .map(publisher -> {
	    	    	Publisher newPub = new Publisher();
	    	    	newPub.setName(publisher.getName());
	    	        newPub.setLocation(publisher.getLocation());
	    	        return pubRep.findByName(publisher.getName())
	    	        		.orElseGet(() ->pubRep.save(newPub));
	    	    })
	    	    .collect(Collectors.toList());
	    
	    Book book = bookRepo.findByTitle(bookDto.getTitle())
	            .orElseGet(() -> {
	                Book newBook = new Book();
	                newBook.setTitle(bookDto.getTitle());
	                newBook.setGenre(bookDto.getGenre());
	                newBook.setAuthor(author); 
	                newBook.setPublishers(publishers);
	                
	                return bookRepo.save(newBook);
	            });
	    
	    String fileName =
	            book.getId() + "_" + System.currentTimeMillis()
	            + "_" + file.getOriginalFilename();
	    
	    try {
            // 3️ Save file to disk
            Path path = Paths.get(uploadDir + fileName);
            Files.copy(file.getInputStream(), path);

            // 4️ Save path in DB
            Book book1 = bookRepo.findById(book.getId())
                    .orElseThrow(() -> new RuntimeException("Book not found"));

            book1.setImagePath(fileName);
            bookRepo.save(book1);

        } catch (IOException e) {
            throw new RuntimeException("Image upload failed");
        }
	    
	    
	    
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
	public BookDto updateBook(BookDto bookDto, MultipartFile file) {
        
        
	    Author author = authRepo.findById(bookDto.getAuthorId())
	            .orElseThrow(() ->
	                    new NotFound("Author not found with id: " + bookDto.getAuthorId())
	            );
	    Book book = bookRepo.findById(bookDto.getId())
	            .orElseThrow(() ->
	                    new NotFound("Book not found with id: " + bookDto.getId())
	            );
	    List<Publisher> publishers = bookDto.getPublishers()
	    	    .stream()
	    	    .map(publisher -> {
	    	    	Publisher newPub = new Publisher();
	    	    	newPub.setName(publisher.getName());
	    	        newPub.setLocation(publisher.getLocation());
	    	        newPub.setId(publisher.getId());
	    	        System.err.println(newPub);
	    	        return pubRep.save(newPub);
	    	    })
	    	    .collect(Collectors.toList());
	    book.setTitle(bookDto.getTitle());
	    book.setGenre(bookDto.getGenre());
	    book.setAuthor(author);
	    book.setPublishers(publishers);
	    
	    
	    
	   if( file != null && !file.isEmpty()) {
		   String fileName =
	        		bookDto.getId() + "_" + System.currentTimeMillis()
		            + "_" +  file.getOriginalFilename();
		   try {
	            // 3️ Save file to disk
	            Path path = Paths.get(uploadDir + fileName);
	            Files.copy(file.getInputStream(), path);

	            // 4️ Save path in DB
	            Book book1 = bookRepo.findById(book.getId())
	                    .orElseThrow(() -> new RuntimeException("Book not found"));

	            book1.setImagePath(fileName);
	            bookRepo.save(book1);

	        } catch (IOException e) {
	            throw new RuntimeException("Image upload failed");
	        }

	   }
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

	public Page<BookDto> getPageByGenre(int pageNu, int pageSize) {
		Pageable pageable = PageRequest.of(pageNu, pageSize,Sort.by("genre"));
		Page<Book> pageBook = bookRepo.findAll(pageable);
		return pageBook.map(book -> modelMapper.map(book, BookDto.class));
	}
	@Transactional
	public void deletePublisher(long id) {
		pubRep.deleteById(id);
		
	}
	@Transactional
	public void deleteFromMapping(long publisherId) {
		Publisher publisher = pubRep.findById(publisherId)
		        .orElseThrow(() -> new NotFound("Publisher not found"));
		//		List<Book> books = publisher.getBooks();
		//	    for (Book book : books) {
		//	        book.getPublishers().remove(publisher);
		//	    }
		//		System.err.println(pubRep.findById(publisherId));
	    pubRep.deleteById(publisherId);

		System.err.println(pubRep.findById(publisherId));

	   
	}
	
	@Transactional
	public void activateFromMapping(long publisherId) {
//		Publisher publisher = pubRep.findById(publisherId)
//		        .orElseThrow(() -> new RuntimeException("Publisher not found"));
		
	    pubRep.restorePublisher(publisherId);
	    Publisher publisher = pubRep.findById(publisherId)
		        .orElseThrow(() -> new NotFound("Publisher not found"));
	}
	
	public List<AuthorOptions> getAllAuthorsoptions(){
		System.err.println(authRepo.findAll());
		return authRepo.findAll().stream()
				.map(auth -> {
                    AuthorOptions options = modelMapper.map(auth, AuthorOptions.class);
                    options.setValue(String.valueOf(auth.getId())); 
                    return options;
                })
                .collect(Collectors.toList());

	}

}
