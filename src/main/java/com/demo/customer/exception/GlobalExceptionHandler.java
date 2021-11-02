package com.demo.customer.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import com.demo.customer.model.CustomError;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(EmailNotFoundException.class)
	public ResponseEntity<Object> handleEmailNotFoundException(EmailNotFoundException ex, WebRequest request) {
		CustomError error = new CustomError(LocalDateTime.now(), ex.getMessage(), request.getDescription(false));
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
	}

	@ExceptionHandler(Exception.class)
	public ResponseEntity<Object> handleOtherException(Exception ex, WebRequest request) {
		CustomError error = new CustomError(LocalDateTime.now(), ex.getMessage(), request.getDescription(false));
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error);
	}

	

}
