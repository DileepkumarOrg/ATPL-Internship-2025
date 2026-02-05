package com.books.LibraryManagement.DTOs;

import java.util.List;

import lombok.Data;

@Data
public class AuthorByIdDto {
	private long id;
	private String name;
	private List<BookDto> books;
}
