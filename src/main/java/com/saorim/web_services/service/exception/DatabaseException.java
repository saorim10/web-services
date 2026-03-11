package com.saorim.web_services.service.exception;

public class DatabaseException extends RuntimeException {
	private static final long serialVersionUID = -4309505610276091739L;
	
	public DatabaseException(String msg) {
		super(msg);
	}

}
