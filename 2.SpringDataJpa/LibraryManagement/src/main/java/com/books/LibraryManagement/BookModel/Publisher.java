package com.books.LibraryManagement.BookModel;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Publisher_Dileep")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Publisher {
	@Id
	@GeneratedValue( strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private String location;
	
	@JsonIgnore
	@ManyToMany(mappedBy = "publishers", fetch = FetchType.LAZY)
	private List<Book> books;
}
