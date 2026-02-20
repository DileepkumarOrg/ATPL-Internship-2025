package com.Complaint.Online.Complaint.Tracking.System.DTOs;

import java.util.List;

import com.Complaint.Online.Complaint.Tracking.System.Models.Complaint;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {

    private Long user_id;
    private String name;
    private String email;
    private String role;
    private List<Complaint> complaints;
    private List<Complaint> assignedCompaints;
}
