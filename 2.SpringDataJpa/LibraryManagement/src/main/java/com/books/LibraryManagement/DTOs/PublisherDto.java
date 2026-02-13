package com.books.LibraryManagement.DTOs;

import java.util.List;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class PublisherDto {
	Long id;
	String name;
	String location;
	List<BookDto> books;
}
