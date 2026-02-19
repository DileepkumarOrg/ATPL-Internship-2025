package com.students.Student.Management.System.Models;

import java.util.Date;

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.SQLRestriction;

import com.students.Student.Management.System.Models.Enums.Branch;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="Dileep_Students")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SQLDelete(sql = "UPDATE Dileep_Students SET is_active = false WHERE roll=?") 
@SQLRestriction("is_active = true")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long roll;
//	private String roll;
	@NotBlank
	@Size(min=3, max=50, message="Name should be 3 to 50 characters only")
	private String name;
	@Min(value=18, message="Minimum age should be 18+")
	@Max(value=50, message = "Maximum age 50 years")
	private int age;
	@NotBlank
	@Pattern(regexp = "[A-F]", message = "Grade must be A, B, C, D or F")
	private String grade;
	@Pattern(regexp = "\\d{10}", message = "Phone number must be exactly 10 digits")
	private String	 phone;
	@NotNull
	@Enumerated(EnumType.STRING)
	private Branch Branch;
	@NotBlank
	@Size(min = 1, max = 1, message = "Section must be a single character")
	private String section;
	private Date createdDate = new Date();
	private String createdBy;
	private Date updatedDate;
	private String updatedBy;
	private boolean isActive = true;
}
