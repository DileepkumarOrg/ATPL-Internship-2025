package com.students.Student.Management.System.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.students.Student.Management.System.Models.Student;
import com.students.Student.Management.System.Repos.StudentRepo;

import jakarta.transaction.Transactional;

@Service
public class StudentService {
	private StudentRepo studentRepo;
	public StudentService(StudentRepo studentRepo) {
		this.studentRepo = studentRepo;
	}
	
	public List<Student> getStudents(){
		return studentRepo.findAll();
	}
	
	@Transactional
	public void saveStudent(Student student) {
		studentRepo.save(student);
	}
	
	public Student getByID(long id) {
		return studentRepo.findById(id).orElse(null);
	}
	
	public void deleteById(long id) {
		studentRepo.deleteById(id);
	}
}
