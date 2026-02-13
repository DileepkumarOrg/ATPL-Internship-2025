package com.books.LibraryManagement.BookModel;

import java.util.List;

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.SQLRestriction;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Publisher_Dileep")
@Data
@NoArgsConstructor
@AllArgsConstructor
@SQLDelete(sql = "UPDATE publisher_dileep SET deleted = true WHERE id=?") 
@SQLRestriction("deleted = false")
public class Publisher {
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String location;
	private Boolean deleted = false;
	@JsonIgnore
	@ManyToMany(mappedBy = "publishers", fetch = FetchType.LAZY)
	private List<Book> books;
}
