package com.ccclogic.di.service;

import java.util.List;

import org.apache.log4j.FileAppender;

import lombok.Data;


@Data
public class ProcessParameters {
	private String name;
	private String type;
	private String url;
	private FileAppender appender;
	private List<String> include;
	private ProcessParams params;
	private int startIndex;
	private String folder;
}
