package com.homeservo.util;

import java.util.List;

import com.homeservo.dto.Work;

import lombok.Data;

@Data
public class ResponseStructure<T> {
	private T data;
	private String message;
	private int status;
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}

}
