package com.ayasyashoppingcart.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(CategoryNotFoundException.class)
	public ResponseEntity<RestResponse> handleNotFoundCategoryException(CategoryNotFoundException ex,
			WebRequest webRequest) {
		RestResponse errorDetails = new RestResponse(false, ex.getMessage(), 404,
				webRequest.getDescription(false));
		return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(NoCategoryFoundException.class)
	public ResponseEntity<RestResponse> handleNoCategoryException(NoCategoryFoundException ex,
			WebRequest webRequest) {
		RestResponse errorDetails = new RestResponse(false, ex.getMessage(), 500,
				webRequest.getDescription(false));
		return new ResponseEntity<>(errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
