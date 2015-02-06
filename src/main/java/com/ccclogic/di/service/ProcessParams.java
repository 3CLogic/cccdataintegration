package com.ccclogic.di.service;

import com.ccclogic.di.service.client.Credential;

import lombok.Data;

@Data
public class ProcessParams {
	private String user;
	private String file;
	private String mediaColumn;
	private int startIndex;
	private Credential credential;
	private String uri;
}
