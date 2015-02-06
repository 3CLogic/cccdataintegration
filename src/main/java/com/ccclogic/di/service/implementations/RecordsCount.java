package com.ccclogic.di.service.implementations;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.ccclogic.di.service.CallBackParams;
import com.ccclogic.di.service.DataIntegerationException;
import com.ccclogic.di.service.DataIntegerationService;
import com.ccclogic.di.service.ProcessParameters;
import com.ccclogic.di.service.ProcessParams;
import com.ccclogic.di.service.ProcessResult;
import com.ccclogic.di.service.client.ClientType;
import com.ccclogic.di.service.client.Parameters;

public class RecordsCount implements DataIntegerationService {
	private Logger logger = Logger.getLogger(RecordsCount.class);

	public ProcessResult process(ProcessParameters params) throws DataIntegerationException {
		logger.info("Inside process of RecordsCount");
		ProcessParams jsonParams = params.getParams();
		CallBackParams cbparams = new CallBackParams();
		List<String> subList = new ArrayList<String>();
		
		String filename = jsonParams.getFile();
		
		subList.add(filename);
		cbparams.setLinks(subList);
		
		String csvFile = "";
		if(System.getProperty("os.name").toLowerCase().contains("window")){
			csvFile = System.getProperty("java.io.tmpdir") + filename;
		}else{
			csvFile = System.getProperty("java.io.tmpdir") + "/" + filename;
		}
		logger.debug("The name of the CSV file to be parse : " + csvFile);
		int totalRecords = numberOfRecords(csvFile, jsonParams.getUser()); // here getUser should return the call centerID
		
		Parameters httpParams = new Parameters();
		httpParams.setFilename(String.valueOf(totalRecords));
		httpParams.setUri(jsonParams.getUri());
		httpParams.setType(ClientType.HTTP);

		List<Parameters> pushParams = new ArrayList<Parameters>();
		pushParams.add(httpParams);
		
		cbparams.setPushParams(pushParams);
		
		ProcessResult processResult = new ProcessResult();
		processResult.setCallback(false);
		processResult.setCallBackParams(cbparams);
		
		return processResult;
	}
	
	protected int numberOfRecords(String csvFile, String ccId) {
		LineNumberReader br = null;
		int totalRecords = 0;

		try {
			br = new LineNumberReader(new FileReader(csvFile));
			
			while (br.readLine() != null) {
				totalRecords++;
			}
		} catch (Exception e) {
			logger.error("Boo-boo while parsing the file" , e);
			// throw new CsvParseException(e);
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return totalRecords;
	}

}
