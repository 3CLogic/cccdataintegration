package com.ccclogic.di.service.client;

import com.ccclogic.di.service.ClientPullException;
import com.ccclogic.di.service.ClientPushException;

public interface Client {
	
	public Response pull(Parameters params) throws ClientPullException;
	
	public Response push(Parameters params) throws ClientPushException;

}
