package com.john.springboot.exception;

public class SpringBootCamelException extends RuntimeException {
	
	private static final long serialVersionUID = -6264475985783273458L;
	
	private String error;
	
	public SpringBootCamelException(String error, String message, Exception cause) {
		super(message,cause);
		this.error= error;
	}
	
	public SpringBootCamelException() {
		super();
	}

	
	public SpringBootCamelException(Exception cause) {
		super(cause);
	}

	public SpringBootCamelException( String message, Exception cause) {
		super(message,cause);
	}
	
	public SpringBootCamelException(String error, String message) {
		super(message);
		this.error= error;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
