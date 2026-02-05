package com.books.LibraryManagement.DTOs;

import lombok.Data;

@Data
public class BookDto {
	private long id;
	private String title;
	private String genre;
	private long authorId;
	private String authorName;
}
