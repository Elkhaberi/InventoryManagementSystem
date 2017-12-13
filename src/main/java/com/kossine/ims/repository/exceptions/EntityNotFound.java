package com.kossine.ims.repository.exceptions;

@SuppressWarnings("serial")
public class EntityNotFound extends Exception {

	public EntityNotFound() {
		super("Entity was not found while retrieving from database");
	}

	public EntityNotFound(String msg) {
		super(msg);
	}
}
