package com.Complaint.Online.Complaint.Tracking.System.Services;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.Complaint.Online.Complaint.Tracking.System.DTOs.ComplaintRequestDTO;
import com.Complaint.Online.Complaint.Tracking.System.DTOs.ComplaintResponseDTO;
import com.Complaint.Online.Complaint.Tracking.System.Models.Complaint;
import com.Complaint.Online.Complaint.Tracking.System.Repos.CategoryRepo;
import com.Complaint.Online.Complaint.Tracking.System.Repos.ComplaintRepo;
import com.Complaint.Online.Complaint.Tracking.System.Repos.PriorityRepo;
import com.Complaint.Online.Complaint.Tracking.System.Repos.StatusRepo;
import com.Complaint.Online.Complaint.Tracking.System.Repos.UserRepo;

import jakarta.transaction.Transactional;

@Service
public class ComplaintService {
	private ComplaintRepo complaintRepo;
	private UserRepo userRepo;
	private PriorityRepo priRepo;
	private StatusRepo staRepo;
	private CategoryRepo catRepo;
	private ModelMapper modelMapper;

	public ComplaintService(ComplaintRepo complaintRepo, ModelMapper modelMapper, UserRepo userRepo,
			PriorityRepo priRepo, StatusRepo staRepo, CategoryRepo catRepo) {
		this.complaintRepo = complaintRepo;
		this.modelMapper = modelMapper;
		this.userRepo = userRepo;
		this.priRepo = priRepo;
		this.staRepo = staRepo;
		this.catRepo = catRepo;
	}

	public List<ComplaintResponseDTO> getComplaints() {
		// return modelMapper.map(complaintRepo.findAll(), ComplaintResponseDTO.class);
		return complaintRepo.findAll().stream().map(comp -> {
			ComplaintResponseDTO dto = modelMapper.map(comp, ComplaintResponseDTO.class);
//			dto.setPriority(comp.getPriority() != null ? comp.getPriority().getLevel() : null);
//			dto.setCategory(comp.getCategory() != null ? comp.getCategory().getName() : null);
//			dto.setStatus(comp.getStatus() != null ? comp.getStatus().getName() : null);
//			dto.setAssignedTo(comp.getAssignedTo() != null ? comp.getAssignedTo().getName() : null);
			dto.setPriority(comp.getPriority() != null ? comp.getPriority() : null);
			dto.setCategory(comp.getCategory() != null ? comp.getCategory() : null);
			dto.setStatus(comp.getStatus() != null ? comp.getStatus() : null);
			dto.setAssignedTo(comp.getAssignedTo() != null ? comp.getAssignedTo() : null);
			return dto;
		}).toList();
	}

	// public ComplaintResponseDTO getCompliant(long id) {
	// Complaint comp = complaintRepo.findById(id).orElse(null);
	// if (comp == null) {
	// return null; // or throw an exception if complaint must exist
	// }
	//
	// System.err.println(comp.getPriority().getLevel());
	// System.err.println(comp);
	//
	// ComplaintResponseDTO dto = modelMapper.map(comp, ComplaintResponseDTO.class);
	// dto.setPriority(comp.getPriority().getLevel());
	// return dto;
	// }

	public ComplaintResponseDTO getCompliant(long id) {
		return complaintRepo.findById(id)
				.map(comp -> {
					ComplaintResponseDTO dto = modelMapper.map(comp, ComplaintResponseDTO.class);
//					dto.setPriority(comp.getPriority() != null ? comp.getPriority().getLevel() : null);
//					dto.setCategory(comp.getCategory() != null ? comp.getCategory().getName() : null);
//					dto.setStatus(comp.getStatus() != null ? comp.getStatus().getName() : null);
//					dto.setAssignedTo(comp.getAssignedTo() != null ? comp.getAssignedTo().getName() : null);
//					dto.setUser(comp.get)
					dto.setPriority(comp.getPriority() != null ? comp.getPriority() : null);
					dto.setCategory(comp.getCategory() != null ? comp.getCategory() : null);
					dto.setStatus(comp.getStatus() != null ? comp.getStatus() : null);
					dto.setAssignedTo(comp.getAssignedTo() != null ? comp.getAssignedTo() : null);
					return dto;
				})
				.orElse(null);
	}

	@Transactional
	public void saveComplaint(ComplaintRequestDTO comp) {
		Complaint comps = modelMapper.map(comp, Complaint.class);
		if(comp.getCategoryId() != null) comps.setCategory(catRepo.findById(comp.getCategoryId()).orElse(null));
		if(comp.getPriorityId() != null) comps.setPriority(priRepo.findById(comp.getPriorityId()).orElse(null));
		if(comp.getStatusId() != null) comps.setStatus(staRepo.findById(comp.getStatusId()).orElse(null));
		if(comp.getAssignedTo() != null) comps.setAssignedTo(userRepo.findById(comp.getAssignedTo()).orElse(null));
		complaintRepo.save(comps);
		System.err.println(comps.getComplaint_id());

	}

	
	@Transactional
	public void updateComplaint(ComplaintRequestDTO comp) {
		// if(comp.getPriority())
		System.err.println(comp.getCategoryId());
		Complaint comps = modelMapper.map(comp, Complaint.class);
		if(comp.getCategoryId() != null) comps.setCategory(catRepo.findById(comp.getCategoryId()).orElse(null));
		if(comp.getPriorityId() != null) comps.setPriority(priRepo.findById(comp.getPriorityId()).orElse(null));
		if(comp.getStatusId() != null) comps.setStatus(staRepo.findById(comp.getStatusId()).orElse(null));
		if(comp.getAssignedTo() != null) comps.setAssignedTo(userRepo.findById(comp.getAssignedTo()).orElse(null));
		complaintRepo.save(comps);
		
	}

	public void deleteComplaint(long id) {
		complaintRepo.deleteById(id);
	}
}
