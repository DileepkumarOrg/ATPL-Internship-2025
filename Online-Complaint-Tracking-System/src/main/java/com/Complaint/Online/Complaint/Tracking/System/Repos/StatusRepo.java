package com.Complaint.Online.Complaint.Tracking.System.Repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Complaint.Online.Complaint.Tracking.System.Models.Status;

public interface StatusRepo extends JpaRepository<Status, Long>{

}
