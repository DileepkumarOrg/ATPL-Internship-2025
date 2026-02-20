package com.Complaint.Online.Complaint.Tracking.System.DTOs;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ComplaintRequestDTO {
	private Long complaint_id;
    private String description;
    private Long categoryId;
    private Long AssignedTo;
    private Long priorityId;
    private Long userId;
    private Long statusId;
	@Override
	public String toString() {
		return "ComplaintRequestDTO [complaint_id=" + complaint_id + ", description=" + description + ", categoryId="
				+ categoryId + ", AssignedTo=" + AssignedTo + ", priorityId=" + priorityId + ", userId=" + userId
				+ ", statusId=" + statusId + "]";
	}
}
