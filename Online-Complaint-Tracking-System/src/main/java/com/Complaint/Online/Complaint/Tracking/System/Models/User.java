package com.Complaint.Online.Complaint.Tracking.System.Models;

import java.util.Date;
import java.util.List;

import com.Complaint.Online.Complaint.Tracking.System.Enums.Roles;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="Dileep_User")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long user_id;
	private String name;
	private String email;
	private String password;
	private Roles role;
	private Date created_at;
	
	
	@JsonIgnore
	@OneToMany(mappedBy = "createdBy", fetch = FetchType.LAZY)
	private List<Complaint> complaints;
	
	
	@JsonIgnore
	@OneToMany(mappedBy = "assignedTo", fetch = FetchType.LAZY)
	private List<Complaint> assignedCompaints;
 }
