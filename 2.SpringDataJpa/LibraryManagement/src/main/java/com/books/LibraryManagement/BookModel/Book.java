package com.books.LibraryManagement.BookModel;


import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Book_Dileep")
@Setter
@Getter
public class Book {
	@Id
	@GeneratedValue( strategy = GenerationType.AUTO)
	private Long id;
	private String title;
	private String genre;
	private String imagePath;
	@ManyToOne
	@JoinColumn(name = "author_id")
	private Author author;
	
	@ManyToMany()
	@JoinTable(name = "Book_Publisher_Table",
		joinColumns = {
				@JoinColumn(name = "book_id", referencedColumnName = "id")
		},
		inverseJoinColumns = {
				@JoinColumn(name = "publisher_id", referencedColumnName = "id")
		}
			)
		private List<Publisher> publishers;
	
}
