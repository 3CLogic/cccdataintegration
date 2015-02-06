package com.ccclogic.di.service.client;

import lombok.Data;

@Data
public class Response {
	private String status;
	private int code;
	private String message;
	private String exception;

	private String file;
	private String path;

	private String uri;
}
