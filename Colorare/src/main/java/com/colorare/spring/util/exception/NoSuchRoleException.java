package com.colorare.spring.util.exception;

public class NoSuchRoleException extends RuntimeException {
	
	private static final long serialVersionUID = 5867172506387382920L;

	public NoSuchRoleException(String message) {
		super(message); 
	}
}