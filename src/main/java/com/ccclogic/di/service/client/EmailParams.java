package com.ccclogic.di.service.client;

import lombok.Data;

@Data 
public class EmailParams {

	private String to;
	private String cc;
	private String bcc;
	private String from;
	private String body;
	private String subject;
	private boolean attachment;
	
	public EmailParams(){
		this.attachment = true;
	}
}
