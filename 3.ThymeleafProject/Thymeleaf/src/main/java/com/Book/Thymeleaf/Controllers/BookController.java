package com.Book.Thymeleaf.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Book.Thymeleaf.Models.Book;
import com.Book.Thymeleaf.Repos.BookRepository;
import com.Book.Thymeleaf.Services.BookService;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService service;
    private final BookRepository repo;
    public BookController(BookRepository repo) {
    	this.repo = repo;
    }
    
    @GetMapping
    public String listBooks(Model model) {
        model.addAttribute("books", service.getAllBooks());
        return "books";
    }

    @GetMapping("/add")
    public String showForm(Model model) {
        model.addAttribute("book", new Book());
        return "book-form";
    }

    @PostMapping("/save")
    public String saveBook(@Valid @ModelAttribute Book book,
        BindingResult result) {

        if (result.hasErrors()) {
            return "book-form";
        }

        service.save(book);
        return "redirect:/books";
    }

    @GetMapping("/edit/{id}")
    public String editBook(@PathVariable Long id, Model model) {
        model.addAttribute("book", service.getById(id));
        return "book-form";
    }
    
    @DeleteMapping("/delete/{id}")
    public String deleteBook(@PathVariable Long id) {
    	System.err.println(id);
        service.delete(id);
//    	repo.deleteById(id);
        return "redirect:/books";
    }
}
