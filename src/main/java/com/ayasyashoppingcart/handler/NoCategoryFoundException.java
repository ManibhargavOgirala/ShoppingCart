package com.ayasyashoppingcart.handler;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
public class NoCategoryFoundException extends RuntimeException {

	public NoCategoryFoundException(String message) {
		super(message);
	}

}
