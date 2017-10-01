package org.corgiking.service;

import javax.annotation.PostConstruct;

import org.corgiking.utils.CKLogger;
import org.springframework.stereotype.Service;

@Service
public class DemoService {
	private CKLogger log = CKLogger.getLogger(getClass());
	
	@PostConstruct
	public void preConstruct (){
		log.info("DemoService:","PostConstruct");
	}

}
