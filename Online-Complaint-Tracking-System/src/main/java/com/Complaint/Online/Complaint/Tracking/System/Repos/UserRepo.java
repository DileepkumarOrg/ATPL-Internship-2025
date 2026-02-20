package com.Complaint.Online.Complaint.Tracking.System.Repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Complaint.Online.Complaint.Tracking.System.Models.User;

public interface UserRepo extends JpaRepository<User, Long>{

}
