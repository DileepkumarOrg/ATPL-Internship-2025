package com.books.LibraryManagement.DTOs;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
//@JsonInclude(JsonInclude.Include.NON_NULL)
public class ErrorMessage {
	private int status;
	private String message;
//	private String errorStack;
	
//	If @JsonInclude(JsonInclude.Include.NON_NULL) is there use Optiona;
//	private Optional<String> errorStack = Optional.empty();
}
