package com.colorare.spring.util.exception;

public class RoleDuplicationException extends RuntimeException {
	
	private static final long serialVersionUID = -4246979292397269539L;

	public RoleDuplicationException(String message) {
		super(message); 
	}
}
