package com.ccclogic.di.service.client;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data @EqualsAndHashCode(callSuper=false)
public class AwsCredential extends Credential {
	
	private String bucket;
	
	private String username;
	private String password;
	
}
