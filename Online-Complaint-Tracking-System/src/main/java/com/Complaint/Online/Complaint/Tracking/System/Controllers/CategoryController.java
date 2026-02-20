package com.Complaint.Online.Complaint.Tracking.System.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Complaint.Online.Complaint.Tracking.System.Models.Category;
import com.Complaint.Online.Complaint.Tracking.System.Services.CategoryService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CategoryController {

	private CategoryService catSer;
	public CategoryController(CategoryService catSer) {
		this.catSer = catSer;
	}
	
	@GetMapping("/categories")
	public List<Category> getCategories() {
		return catSer.getCategories();
	}
	
	// Get category by ID
    @GetMapping("/categories/{id}")
    public Category getCategory(@PathVariable long id) {
        return catSer.getCategory(id);
    }

    // Add new category
    @PostMapping("/categories")
    public Category addCategory(@RequestBody Category cat) {
        return catSer.addCategory(cat);
    }

    // Update category
    @PutMapping("/categories/{id}")
    public Category updateCategory(@PathVariable long id, @RequestBody Category cat) {
        Category existing = catSer.getCategory(id);
        if (existing != null) {
            cat.setCategory_id(id); // ensure the ID matches
            return catSer.addCategory(cat);
        }
        return null; // or throw an exception / return ResponseEntity.notFound()
    }

    // Delete category
    @DeleteMapping("/categories/{id}")
    public void deleteCategory(@PathVariable long id) {
        catSer.deleteCat(id);
    }

	
	
}
