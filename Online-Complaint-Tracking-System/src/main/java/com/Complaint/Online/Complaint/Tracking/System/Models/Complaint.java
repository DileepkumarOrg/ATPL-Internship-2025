package com.Complaint.Online.Complaint.Tracking.System.Models;

import java.util.Date;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="Dileep_Complaints")
@EntityListeners(AuditingEntityListener.class)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Complaint {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long complaint_id; 	
	private String description;
	
	@ManyToOne
	@JoinColumn(name="category_id")
	private Category category;
	
	@ManyToOne
	@JoinColumn(name = "priority_id")
	private Priority priority;
	
	@ManyToOne
	@JoinColumn(name = "status_id")
	private Status status;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private User createdBy;
	
	
	@ManyToOne
	@JoinColumn(name = "assigned_to")
	private User assignedTo;
	
	
	@CreatedDate
	@Column(updatable = false)
	private Date created_at;
	
	
	@LastModifiedDate
	private Date updated_at;
	
	private Date resolved_at;
}
