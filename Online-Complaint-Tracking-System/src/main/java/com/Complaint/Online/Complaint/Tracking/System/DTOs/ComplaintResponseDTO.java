package com.Complaint.Online.Complaint.Tracking.System.DTOs;


import com.Complaint.Online.Complaint.Tracking.System.Models.Category;
import com.Complaint.Online.Complaint.Tracking.System.Models.Priority;
import com.Complaint.Online.Complaint.Tracking.System.Models.Status;
import com.Complaint.Online.Complaint.Tracking.System.Models.User;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ComplaintResponseDTO {

    private Long complaint_id;
    private String description;

    private Category category;
    private Priority priority;
    private Status status;
    private User createdBy;
    private User assignedTo;

    private String created_at;
    private String updated_at;
}

