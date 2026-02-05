package com.books.LibraryManagement.BookModel;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

@Entity
@Table(name = "Book_Dileep")
@Data
public class Book {
	@Id
	@GeneratedValue( strategy = GenerationType.AUTO)
	private Long id;
	private String title;
	private String genre;
	@ToString.Exclude
	@ManyToOne
	@JoinColumn(name = "author_id")
	private Author author;
}
