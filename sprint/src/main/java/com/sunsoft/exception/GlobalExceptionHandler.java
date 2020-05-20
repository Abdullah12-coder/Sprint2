package com.sunsoft.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler ({ticketIdException.class})
	public ResponseEntity<String> handleExceptions (Exception ex)
	{
		if (ex instanceof ticketIdException) {
			HttpStatus status = HttpStatus.NOT_FOUND;
			return new ResponseEntity ("Invalid Ticket ID",status);
		}
		else 
			return null;
	}
}
