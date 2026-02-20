package com.Complaint.Online.Complaint.Tracking.System.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Complaint.Online.Complaint.Tracking.System.DTOs.UserDTO;
import com.Complaint.Online.Complaint.Tracking.System.Models.Status;
import com.Complaint.Online.Complaint.Tracking.System.Models.User;
import com.Complaint.Online.Complaint.Tracking.System.Services.UserService;



@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
	private UserService userSer;
	public UserController(UserService userSer) {
		this.userSer = userSer;
	}

	@GetMapping("/users")
	public List<UserDTO> getAllUsers() {
		return userSer.allUsers();
	}

	@GetMapping("/users/{id}")
	public User getUserById(long id) {
		return userSer.getUserById(id);
	}

	@PostMapping("/users")
	public User createUser(User user) {
		return userSer.createUser(user);
	}

	@PutMapping("/users/{id}")
	public User updateUser(long id, User user) {
		return userSer.updateUser(id, user);
	}

	@DeleteMapping("/users/{id}")
	public void deleteUser(long id) {
		userSer.deleteUser(id);
	}

	@GetMapping("/statuses")
	public List<Status> getStatuses(){
		return userSer.getStatuses();
	}
	
	@GetMapping("/statuses/{id}")
	public Status getStatusById(long id) {
		return userSer.getStatusById(id);
	}

	@PostMapping("/statuses")
	public Status createStatus(Status status) {
		return userSer.createStatus(status);
	}

	@PutMapping("/statuses/{id}")
	public Status updateStatus(long id, Status status) {
		return userSer.updateStatus(id, status);
	}

	@DeleteMapping("/statuses/{id}")
	public void deleteStatus(long id) {
		userSer.deleteStatus(id);
	}
	
}
