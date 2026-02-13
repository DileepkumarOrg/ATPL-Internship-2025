package com.books.LibraryManagement.BookModel;

import java.util.List;

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.SQLRestriction;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
@Data
@Entity
@Table(name = "Author_Dileep")
@SQLDelete(sql = "UPDATE Author_Dileep SET deleted = true WHERE id=?") 
@SQLRestriction("deleted = false")
public class Author {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@NotBlank
	private String name;
	private Boolean deleted = false;
	@OneToMany(mappedBy = "author", cascade = { CascadeType.MERGE, CascadeType.PERSIST , CascadeType.REFRESH, CascadeType.DETACH}, fetch = FetchType.LAZY)
	private List<Book> books;
	
}
