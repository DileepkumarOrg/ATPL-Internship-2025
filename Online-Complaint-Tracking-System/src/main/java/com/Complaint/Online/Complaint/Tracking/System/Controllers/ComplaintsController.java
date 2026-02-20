package com.Complaint.Online.Complaint.Tracking.System.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Complaint.Online.Complaint.Tracking.System.DTOs.ComplaintRequestDTO;
import com.Complaint.Online.Complaint.Tracking.System.DTOs.ComplaintResponseDTO;
import com.Complaint.Online.Complaint.Tracking.System.Services.ComplaintService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ComplaintsController {
	private ComplaintService compServ;
	public ComplaintsController(ComplaintService compServ) {
		this.compServ = compServ;
	}
	
	@GetMapping("/complaints")
	public List<ComplaintResponseDTO> getComplaints(){
		return compServ.getComplaints();
	}
	
	@GetMapping("/complaints/{id}")
	public ComplaintResponseDTO getComplaint(@PathVariable long id) {
		return compServ.getCompliant(id);
	}
	
	@PostMapping("/complaints")
	public void addComplaint(@RequestBody ComplaintRequestDTO comp) {
		compServ.saveComplaint(comp);
	}
	
	@PutMapping("/complaints")
	public void updateComplaint(@RequestBody ComplaintRequestDTO comp) {
		compServ.updateComplaint(comp);
		
	}
	
	@DeleteMapping("/complaints/{id}")
	public void deleteComplaint(@PathVariable long id) {
		compServ.deleteComplaint(id);
	}
}
