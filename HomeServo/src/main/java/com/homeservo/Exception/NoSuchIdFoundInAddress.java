package com.homeservo.Exception;

import lombok.Data;

@Data
public class NoSuchIdFoundInAddress extends RuntimeException {
	String message="No such id is present in Address";

	public NoSuchIdFoundInAddress(String message) {
		super();
		this.message = message;
	}
	

}
