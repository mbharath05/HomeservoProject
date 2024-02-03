	package com.homeservo.Exception;
	
	import lombok.Data;
	
	@Data
	public class NoSuchIdElementFoundInWork extends RuntimeException {
		String message="no such ID element is found in Work";
	
		public NoSuchIdElementFoundInWork(String message) {
			super();
			this.message = message;
		}
		
	}
