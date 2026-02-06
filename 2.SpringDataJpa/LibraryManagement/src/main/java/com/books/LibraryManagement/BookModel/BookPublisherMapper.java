package com.books.LibraryManagement.BookModel;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class BookPublisherMapper {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private long bookId;
	private long publisherId;
}
