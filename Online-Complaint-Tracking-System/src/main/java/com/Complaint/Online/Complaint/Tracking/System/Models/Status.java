package com.Complaint.Online.Complaint.Tracking.System.Models;

import java.util.List;

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
@Table(name="Dileep_Status")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Status {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	
	
	@JsonIgnore
	@OneToMany(mappedBy = "status", fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private List<Complaint> complaints ;
}
