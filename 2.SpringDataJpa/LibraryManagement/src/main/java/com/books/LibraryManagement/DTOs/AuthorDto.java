package com.books.LibraryManagement.DTOs;

import java.util.List;

import lombok.Data;

@Data
public class AuthorDto {
	private long id;
	private String name;
	private boolean deleted;
	private List<BookDto> books;
}
