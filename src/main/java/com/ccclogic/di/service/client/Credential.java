package com.ccclogic.di.service.client;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor
public class Credential {

	private String username;
	private String password;

	public Credential(String username, String password) {
		this.username = username;
		this.password = password;
	}

}
