package com.books.LibraryManagement.Exceptions;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.books.LibraryManagement.DTOs.ErrorMessage;

@ControllerAdvice
public class GlobalExceptionHandling {
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String, String>> handleValidation(MethodArgumentNotValidException ex) {
        Map<String, String> errors = new HashMap<String, String>();
        ex.getBindingResult().getFieldErrors().forEach(error -> 
            errors.put(error.getField(), error.getDefaultMessage())
        );
        return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);
    }
	
	@ExceptionHandler(ErrorMessagePass.class)
	public ResponseEntity<ErrorMessage> errorMessageResponseMethod(ErrorMessagePass Ep){
		ErrorMessage err = new ErrorMessage(
				409,
				Ep.getMessage()
				
				);
		return new ResponseEntity<>(err,HttpStatus.CONFLICT);
	}
	
	@ExceptionHandler(NotFound.class)
	public ResponseEntity<ErrorMessage> notFound(NotFound nf){
		ErrorMessage err = new ErrorMessage(
				404,
				nf.getMessage()
				
				);
		return new ResponseEntity<>(err,HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(NoContent.class)
	public ResponseEntity<ErrorMessage> noContent(NoContent nc){
		ErrorMessage err = new ErrorMessage(
				204,
				nc.getMessage()
				);
		return new ResponseEntity<>(err, HttpStatus.NO_CONTENT);
	}
	
	
}
