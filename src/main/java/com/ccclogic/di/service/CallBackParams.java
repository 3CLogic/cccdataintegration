package com.ccclogic.di.service;

import java.util.List;

import com.ccclogic.di.service.client.Parameters;

import lombok.Data;

@Data
public class CallBackParams {
	private List<String> links;
	private List<Parameters> pushParams;
}
