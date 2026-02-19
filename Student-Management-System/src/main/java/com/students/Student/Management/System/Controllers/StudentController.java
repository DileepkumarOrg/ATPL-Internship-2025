package com.students.Student.Management.System.Controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.students.Student.Management.System.Models.Student;
import com.students.Student.Management.System.Models.Enums.Branch;
import com.students.Student.Management.System.Services.StudentService;

import jakarta.validation.Valid;

@Controller
public class StudentController {
	
	private StudentService studentService;
	
	public StudentController(StudentService studentSer) {
		studentService = studentSer;
	}
	
	@GetMapping("/students")
	public String getStudents(Model model) {
		List<Student> students = studentService.getStudents();
		model.addAttribute("students", students);
		return "students-page";
	}
	
	@GetMapping("/addStudent")
	public String addStudent(Model model) {
		model.addAttribute("student", new Student());
		model.addAttribute("branches", Branch.values());
		return "student-form";
	}
	
	@PostMapping("/saveStudent")
	public String saveStudents(@Valid @ModelAttribute Student student, BindingResult result) {
		if(result.hasErrors()) {
			return "student-form";
		}
		studentService.saveStudent(student);
		return "redirect:/students";
	}
	
	@GetMapping("/editStudent/{id}")
	public String getById(@PathVariable long id, Model model) {
		model.addAttribute("student", studentService.getByID(id));
		model.addAttribute("branches", Branch.values());
		return "student-form";
	}
	
	
	@GetMapping("/deleteStudent/{id}")
	public String deleteById(@PathVariable long id, Model model) {
		System.err.println(id);
		studentService.deleteById(id);
		return "redirect:/students";
	}
}
