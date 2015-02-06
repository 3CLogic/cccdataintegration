package com.ccclogic.di.service;

public class ClientPullException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1413284262026159484L;

	public ClientPullException(String msg) {
		super(msg);
	}

	public ClientPullException(Exception e) {
		super(e);
	}

}
