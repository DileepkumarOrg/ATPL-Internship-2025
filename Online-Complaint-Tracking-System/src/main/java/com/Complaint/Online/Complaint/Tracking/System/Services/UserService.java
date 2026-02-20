package com.Complaint.Online.Complaint.Tracking.System.Services;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.Complaint.Online.Complaint.Tracking.System.DTOs.UserDTO;
import com.Complaint.Online.Complaint.Tracking.System.Models.Status;
import com.Complaint.Online.Complaint.Tracking.System.Models.User;
import com.Complaint.Online.Complaint.Tracking.System.Repos.StatusRepo;
import com.Complaint.Online.Complaint.Tracking.System.Repos.UserRepo;


@Service
public class UserService {
	private UserRepo userRepo;
	private StatusRepo statusRepo;
	private ModelMapper modelMapper;
	public UserService(UserRepo userRepo, StatusRepo statusRepo, ModelMapper modelMapper) {
		this.userRepo = userRepo;
		this.statusRepo = statusRepo;
		this.modelMapper = modelMapper;
	}

	public List<UserDTO> allUsers() {
		return userRepo.findAll().stream().map(user-> modelMapper.map(user, UserDTO.class)).toList();
	}

	public User getUserById(long id) {
		return userRepo.findById(id).orElse(null);
	}

	public User createUser(User user) {
		return userRepo.save(user);
	}

	public User updateUser(long id, User user) {
		User existingUser = userRepo.findById(id).orElse(null);
		if (existingUser != null) {
			existingUser.setName(user.getName());
			existingUser.setEmail(user.getEmail());
			return userRepo.save(existingUser);
		}
		return null;
	}

	public void deleteUser(long id) {
		userRepo.deleteById(id);
	}

	public List<Status> getStatuses(){
		return statusRepo.findAll();
	}

	public Status getStatusById(long id) {
		return statusRepo.findById(id).orElse(null);
	}

	public Status createStatus(Status status) {
		return statusRepo.save(status);
	}

	public Status updateStatus(long id, Status status) {
		Status existingStatus = statusRepo.findById(id).orElse(null);
		if (existingStatus != null) {
			existingStatus.setName(status.getName());
			return statusRepo.save(existingStatus);
		}
		return null;
	}

	public void deleteStatus(long id) {
		statusRepo.deleteById(id);
	}
	
}
