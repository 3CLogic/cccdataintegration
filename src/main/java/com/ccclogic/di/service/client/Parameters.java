package com.ccclogic.di.service.client;

import java.util.List;

import org.apache.log4j.FileAppender;

import lombok.Data;

@Data
public class Parameters {
	private String host;
	private int port;
	private String uri;
	private FileAppender appender;
	private EmailParams emailParams;

	private String filename;
	private String location;

	private List<String> files;
	private List<String> links;

	private Credential credential;
	private ClientType type;
	private int sequence;
	private boolean secure;
	private int progressTimer;
	private String folder;
}
