package com.books.LibraryManagement.DTOs;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class BookDto {

    private long id;

    @NotBlank(message = "Title is mandatory")
    @Size(min = 2, max = 100, message = "Title must be between 2 and 100 characters")
    private String title;

    @NotBlank(message = "Genre is mandatory")
    @Size(min = 3, max = 50, message = "Genre must be between 3 and 50 characters")
    private String genre;

    private Long authorId;

    @NotBlank(message = "Author name is mandatory")
    @Size(min = 2, max = 100, message = "Author name must be between 2 and 100 characters")
    private String authorName;
}