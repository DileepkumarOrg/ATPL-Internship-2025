package com.SringBootBasics.users.UserService;

import org.springframework.stereotype.Service;

@Service
public class Greet {
	String message = "Good Morning";
	
	public String getMessage() {
		return message;
	}
}
