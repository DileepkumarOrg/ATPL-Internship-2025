package com.Complaint.Online.Complaint.Tracking.System.Repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Complaint.Online.Complaint.Tracking.System.Models.Complaint;

public interface ComplaintRepo extends JpaRepository<Complaint, Long>{

}
