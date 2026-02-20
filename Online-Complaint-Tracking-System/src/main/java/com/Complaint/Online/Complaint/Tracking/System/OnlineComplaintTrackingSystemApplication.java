package com.Complaint.Online.Complaint.Tracking.System;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;


@EnableJpaAuditing
@SpringBootApplication
public class OnlineComplaintTrackingSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineComplaintTrackingSystemApplication.class, args);
	}

}
