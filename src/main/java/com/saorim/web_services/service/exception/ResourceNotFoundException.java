package com.saorim.web_services.service.exception;

public class ResourceNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 4535316872992270460L;

	public ResourceNotFoundException (Object id) {
		super("Resource not found! - Id: " + id);
	}
}
