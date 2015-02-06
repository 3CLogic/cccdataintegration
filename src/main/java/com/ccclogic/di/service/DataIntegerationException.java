package com.ccclogic.di.service;

public class DataIntegerationException extends Exception {
	private static final long serialVersionUID = -7939266520843003955L;

	public DataIntegerationException(String msg) {
		super(msg);
	}

	public DataIntegerationException(Exception e) {
		super(e);
	}

}
