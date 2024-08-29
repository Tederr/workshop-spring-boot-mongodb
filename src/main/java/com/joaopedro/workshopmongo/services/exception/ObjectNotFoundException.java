package com.joaopedro.workshopmongo.services.exception;

public class ObjectNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public ObjectNotFoundException(String mgs) {
		super(mgs);
	}
}
