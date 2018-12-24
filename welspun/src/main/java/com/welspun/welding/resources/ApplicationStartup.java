package com.welspun.welding.resources;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class ApplicationStartup implements ApplicationListener<ApplicationReadyEvent> {
	
	private Log LOG = LogFactory.getLog(ApplicationStartup.class);

	@Override
	public void onApplicationEvent(ApplicationReadyEvent event) {
		
	}

}
