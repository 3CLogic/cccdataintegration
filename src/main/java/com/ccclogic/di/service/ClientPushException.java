package com.ccclogic.di.service;

public class ClientPushException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1413284262026159484L;

	public ClientPushException(String msg) {
		super(msg);
	}

	public ClientPushException(Exception e) {
		super(e);
	}

}
