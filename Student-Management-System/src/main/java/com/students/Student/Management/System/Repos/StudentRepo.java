package com.students.Student.Management.System.Repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.students.Student.Management.System.Models.Student;

public interface StudentRepo extends JpaRepository<Student, Long> {

}
