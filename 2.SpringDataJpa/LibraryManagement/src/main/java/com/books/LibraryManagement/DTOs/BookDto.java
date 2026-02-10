package com.books.LibraryManagement.DTOs;

import java.util.List;

import com.books.LibraryManagement.BookModel.Publisher;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class BookDto {

    private long id;

    @NotBlank(message = "Title is mandatory")
    @Size(min = 2, max = 100, message = "Title must be between 2 and 100 characters")
    private String title;

    @NotBlank(message = "Genre is mandatory")
    @Size(min = 3, max = 50, message = "Genre must be between 3 and 50 characters")
    private String genre;
    
    private String imagePath;

    private Long authorId;
    
    private List<Publisher> publishers;

    @NotBlank(message = "Author name is mandatory")
    @Size(min = 2, max = 100, message = "Author name must be between 2 and 100 characters")
    private String authorName;
}