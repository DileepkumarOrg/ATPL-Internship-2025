package com.Complaint.Online.Complaint.Tracking.System.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Complaint.Online.Complaint.Tracking.System.Models.Category;
import com.Complaint.Online.Complaint.Tracking.System.Repos.CategoryRepo;

@Service
public class CategoryService {
	private CategoryRepo catRepo;
	public CategoryService(CategoryRepo catRepo) {
		this.catRepo = catRepo;
	}
	
	public List<Category> getCategories(){
		return catRepo.findAll();
	}
	
	public Category getCategory(long id) {
		return catRepo.findById(id).orElse(null);
	}
	
	public Category addCategory(Category cat) {
		return catRepo.save(cat);
	}
	
	public void deleteCat(long id) {
		catRepo.deleteById(id);
	}
}
