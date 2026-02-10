package com.books.LibraryManagement.BookModel;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class BookPublisherMapper {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id; 

    @ManyToOne
    @JoinColumn(name = "book_id")
    @JsonBackReference
    private Book book;

    @ManyToOne
    @JoinColumn(name = "publisher_id")
    @JsonBackReference
    private Publisher publisher;
}
