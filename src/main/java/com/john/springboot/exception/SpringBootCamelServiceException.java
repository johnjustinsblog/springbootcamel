package com.john.springboot.exception;


public class SpringBootCamelServiceException extends SpringBootCamelException {

	private static final long serialVersionUID = -6234567836547234567L;
	
	public SpringBootCamelServiceException() {
		super();
	}
	
	public SpringBootCamelServiceException(String message, Exception cause) {
		super(message,cause);
	}
	
	public SpringBootCamelServiceException(String error, String message) {
		super(error,message);
	}
	
	public SpringBootCamelServiceException(String error, String message, Exception cause) {
		super(error,message,cause);
	}
}
