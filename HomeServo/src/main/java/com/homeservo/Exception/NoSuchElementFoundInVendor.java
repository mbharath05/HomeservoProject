package com.homeservo.Exception;

import lombok.Data;

@Data
public class NoSuchElementFoundInVendor extends RuntimeException {
	String message="no such element is foun in vendor";

	public NoSuchElementFoundInVendor(String message) {
		super();
		this.message = message;
	}
	
}
